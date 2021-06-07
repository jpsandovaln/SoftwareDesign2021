package com.jalasoft.project.model.algorithm.vgg16;

import com.jalasoft.project.model.algorithm.vgg16.detectors.Classifier;
import com.jalasoft.project.model.algorithm.vgg16.detectors.TFObjectDetector;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Vgg16Model {

    private String modelFilePath;
    private String labelMapFilePath;
    private String imageFilePath;

    public Vgg16Model(String modelPath, String labelPath, String imagePath) {
        this.modelFilePath = modelPath;
        this.labelMapFilePath = labelPath;
        this.imageFilePath = imagePath;
    }

    public List<Classifier.Recognition> detectObject() throws IOException {
        Classifier classifier = TFObjectDetector.create(this.modelFilePath, labelMapFilePath);
        BufferedImage image = ImageIO.read(new File(this.imageFilePath));
        List<Classifier.Recognition> recognitionList = classifier.recognizeImage(image);
        return recognitionList;
    }
}