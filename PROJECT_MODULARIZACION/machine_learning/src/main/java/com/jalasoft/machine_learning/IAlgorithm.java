package com.jalasoft.machine_learning;

import com.jalasoft.machine_learning.exception.AlgorithmException;

import java.io.File;
import java.util.List;

public interface IAlgorithm {
    List<PredictionResult> predict(File file) throws AlgorithmException;
}
