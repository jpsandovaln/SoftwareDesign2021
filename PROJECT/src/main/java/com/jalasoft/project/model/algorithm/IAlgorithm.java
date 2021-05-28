package com.jalasoft.project.model.algorithm;

import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.util.List;

public interface IAlgorithm {
    List<PredictionResult> predict(File file) throws AlgorithmException;
}
