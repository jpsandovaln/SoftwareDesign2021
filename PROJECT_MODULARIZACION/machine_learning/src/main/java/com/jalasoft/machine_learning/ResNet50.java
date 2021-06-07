package com.jalasoft.machine_learning;

import ai.djl.Application;
import ai.djl.ModelException;
import ai.djl.modality.Classifications;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;
import com.jalasoft.machine_learning.exception.AlgorithmException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ResNet50 implements IAlgorithm {
    public List<PredictionResult> predict(File file) throws AlgorithmException {
        try {
            var img = ImageFactory.getInstance().fromFile(file.toPath());
            var predictionResults = new ArrayList<PredictionResult>();

            String backboneImgClass = "resnet50";
            var criteria =
                    Criteria.builder()
                            .optApplication(Application.CV.OBJECT_DETECTION)
                            .setTypes(Image.class, DetectedObjects.class)
                            .optFilter("backbone", backboneImgClass)
                            .optProgress(new ProgressBar())
                            .build();

            try (var DetectedObjectModel = ModelZoo.loadModel(criteria)) {
                try (var predictor = DetectedObjectModel.newPredictor()) {
                    var detection = predictor.predict(img);
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
