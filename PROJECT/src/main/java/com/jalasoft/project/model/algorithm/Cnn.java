package com.jalasoft.project.model.algorithm;

import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Cnn implements IAlgorithm {
    @Override
    public List<PredictionResult> predict(File file) throws AlgorithmException {
        return new ArrayList<>();
    }
}
