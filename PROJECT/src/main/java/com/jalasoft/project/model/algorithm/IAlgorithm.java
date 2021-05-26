package com.jalasoft.project.model.algorithm;

import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.util.List;

public interface IAlgorithm {
    List<PredictionResult> predict(File file) throws AlgorithmException;

    static IAlgorithm getAlgorithm(String algorithm) {
        if (algorithm.equals("resnet50")) {
            return new ResNet50();
        }
        return null;
    }
}
