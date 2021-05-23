package com.jalasoft.project.model.algorithm;

import ai.djl.Application;
import ai.djl.ModelException;
import ai.djl.inference.Predictor;
import ai.djl.modality.Classifications;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;
import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResNet50 implements IAlgorithm {
    public List<PredictionResult> predict(File file) throws AlgorithmException {
        try {
            Image img = ImageFactory.getInstance().fromFile(file.toPath());
            List<PredictionResult> predictionResults = new ArrayList<PredictionResult>();

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
                    for (Classifications.Classification classification : detection.items()) {
                        predictionResults.add(new PredictionResult(classification.getClassName(), classification.getProbability()));
                    }
                    return predictionResults;
                }
            }
        } catch (IOException | ModelException | TranslateException ex) {
            throw new AlgorithmException(ex);
        }
    }
}
