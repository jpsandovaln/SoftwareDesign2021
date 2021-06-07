package com.jalasoft.project.model.algorithm;

import com.jalasoft.project.model.algorithm.vgg16.Vgg16Model;
import com.jalasoft.project.model.algorithm.vgg16.detectors.Classifier;
import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Vgg16Adapter implements IAlgorithm {
    @Override
    public List<PredictionResult> predict(File file) throws AlgorithmException {
        try {
            String modelFilePath = "src\\main\\resources\\frozen_inference_graph.pb";
            String labelMapFilePath = "src\\main\\resources\\labels.txt";

            Vgg16Model vgg16Model = new Vgg16Model(modelFilePath, labelMapFilePath, file.getAbsolutePath());
            List<Classifier.Recognition> results = vgg16Model.detectObject();

            List<PredictionResult> predictionResults = new ArrayList<>();
            for (Classifier.Recognition recognition : results) {
                predictionResults.add(
                        new PredictionResult(
                                recognition.getTitle(),
                                Double.valueOf(recognition.getConfidence().toString())
                        )
                );
            }
            return  predictionResults;

        } catch (IOException ex) {
            throw new AlgorithmException(ex);
        }
    }
}
