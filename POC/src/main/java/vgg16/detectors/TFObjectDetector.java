package vgg16.detectors;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

import vgg16.Util.Utils;
import org.tensorflow.*;

/**
 * Wrapper for frozen detection models trained using the Tensorflow Object Detection API:
 * github.com/tensorflow/models/tree/master/research/object_detection
 */
public class TFObjectDetector implements Classifier {
    private TensorFlowInferenceInterface inference;
    private static final int MAX_RESULTS = 1001;
    private String inputName;
    private Vector<String> labels = new Vector<>();
    private float[] outputLocations;
    private float[] outputScores;
    private float[] outputClasses;
    private float[] outputNumDetections;
    private String[] outputNames;

    /**
     * Initializes a native TensorFlow session for classifying images.
     *
     * @param modelFilePath The filepath of the model GraphDef protocol buffer.
     * @param labelFilePath The filepath of label file for classes.
     */
    public static Classifier create(
            final String modelFilePath,
            final String labelFilePath) throws IOException {
        final TFObjectDetector d = new TFObjectDetector();
        InputStream labelsInput = new FileInputStream(new File(labelFilePath));
        try (BufferedReader br = new BufferedReader(new InputStreamReader(labelsInput))) {
            String line;
            while ((line = br.readLine()) != null) {
                d.labels.add(line);
            }
        }
        byte[] graphDef = Utils.readAllBytesOrExit(Paths.get(modelFilePath));
        try (Graph g = new Graph()) {
            g.importGraphDef(graphDef);
            d.inputName = "image_tensor";
            final Operation inputOp = g.operation(d.inputName);
            if (inputOp == null) {
                throw new RuntimeException("Failed to find input Node '" + d.inputName + "'");
            }
            final Operation outputOp1 = g.operation("detection_scores");
            if (outputOp1 == null) {
                throw new RuntimeException("Failed to find output Node 'detection_scores'");
            }
            final Operation outputOp2 = g.operation("detection_boxes");
            if (outputOp2 == null) {
                throw new RuntimeException("Failed to find output Node 'detection_boxes'");
            }
            final Operation outputOp3 = g.operation("detection_classes");
            if (outputOp3 == null) {
                throw new RuntimeException("Failed to find output Node 'detection_classes'");
            }
            d.outputNames = new String[]{"detection_boxes", "detection_scores",
                    "detection_classes", "num_detections"};
            d.outputScores = new float[MAX_RESULTS];
            d.outputLocations = new float[MAX_RESULTS * 4];
            d.outputClasses = new float[MAX_RESULTS];
            d.outputNumDetections = new float[1];
            d.inference = new TensorFlowInferenceInterface(graphDef);
            return d;
        }
    }

    @Override
    public List<Recognition> recognizeImage(final BufferedImage image) {
        inference.feedImage(inputName, getPixelBytes(image));

        inference.run(outputNames, false);
        outputLocations = new float[MAX_RESULTS * 4];
        outputScores = new float[MAX_RESULTS];
        outputClasses = new float[MAX_RESULTS];
        outputNumDetections = new float[1];

        inference.fetch(outputNames[0], outputLocations);
        inference.fetch(outputNames[1], outputScores);
        inference.fetch(outputNames[2], outputClasses);
        inference.fetch(outputNames[3], outputNumDetections);

        // Find the best detections.
        final PriorityQueue<Recognition> pq =
                new PriorityQueue<Recognition>(
                        1,
                        new Comparator<Recognition>() {
                            @Override
                            public int compare(final Recognition lhs, final Recognition rhs) {
                                return Float.compare(rhs.getConfidence(), lhs.getConfidence());
                            }
                        });
        for (int i = 0; i < outputScores.length; ++i) {
            if (outputScores[i] > 0.5) {
                pq.add(new Recognition("" + i, labels.get((int) outputClasses[i]), "", outputScores[i]));
            }
        }

        final ArrayList<Recognition> recognitions = new ArrayList<Recognition>();
        for (int i = 0; i < Math.min(pq.size(), MAX_RESULTS); ++i) {
            recognitions.add(pq.poll());
        }
        return recognitions;
    }

    private byte[][][][] getPixelBytes(BufferedImage image) {
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();

        byte[][][][] featuresTensorData = new byte[1][imageHeight][imageWidth][3];

        int[][] imageArray = new int[imageHeight][imageWidth];
        for (int row = 0; row < imageHeight; row++) {
            for (int column = 0; column < imageWidth; column++) {
                imageArray[row][column] = image.getRGB(column, row);
                int pixel = image.getRGB(column, row);

                byte red = (byte)((pixel >> 16) & 0xff);
                byte green = (byte)((pixel >> 8) & 0xff);
                byte blue = (byte)(pixel & 0xff);
                featuresTensorData[0][row][column][0] = red;
                featuresTensorData[0][row][column][1] = green;
                featuresTensorData[0][row][column][2] = blue;
            }
        }
        return featuresTensorData;
    }
}