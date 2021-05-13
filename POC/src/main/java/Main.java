import ai.djl.Application;
import ai.djl.ModelException;
import ai.djl.inference.Predictor;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException, ModelException, TranslateException {
        DetectedObjects detection = Main.predict();
        System.out.println(detection);
    }

    public static DetectedObjects predict() throws IOException, ModelException, TranslateException {
        // Path imageFile = Paths.get("src/test/resources/dog_bike_car.jpg");
        Path imageFile = Paths.get("src/test/resources/cbba.jpg");
        // Path imageFile = Paths.get("src/test/resources/armas.jpg");
        // Path imageFile = Paths.get("src/test/resources/bandera.jpg");
        Image img = ImageFactory.getInstance().fromFile(imageFile);

        // Image Classifier – ResNet50 - deep neural networks
        String backboneImgClass = "resnet50";
        Criteria<Image, DetectedObjects> criteria =
                Criteria.builder()
                        .optApplication(Application.CV.OBJECT_DETECTION)
                        .setTypes(Image.class, DetectedObjects.class)
                        .optFilter("backbone", backboneImgClass)
                        .optProgress(new ProgressBar())
                        .build();

        try (ZooModel<Image, DetectedObjects> DetectedObjectModel = ModelZoo.loadModel(criteria)) {
            try (Predictor<Image, DetectedObjects> predictor = DetectedObjectModel.newPredictor()) {
                DetectedObjects detection = predictor.predict(img);
                // We don't need it only to show the image with the object detected
                saveBoxImage(img, detection);
                return detection;
            }
        }
    }

    private static void saveBoxImage(Image img, DetectedObjects detection)
            throws IOException {
        Path outputDir = Paths.get("build/output");
        Files.createDirectories(outputDir);

        // Make image copy with alpha channel because original image was jpg
        Image newImage = img.duplicate(Image.Type.TYPE_INT_ARGB);
        newImage.drawBoundingBoxes(detection);

        // Path imagePath = outputDir.resolve("detected-dog_bike_car.png");
         Path imagePath = outputDir.resolve("cbba.png");
        // Path imagePath = outputDir.resolve("armas.png");
        // Path imagePath = outputDir.resolve("bandera.png");

        newImage.save(Files.newOutputStream(imagePath), "png");
        System.out.println("Detected objects image has been saved in: " + imagePath);
    }
}
