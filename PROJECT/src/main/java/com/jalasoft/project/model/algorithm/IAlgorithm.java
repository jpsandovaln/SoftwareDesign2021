package com.jalasoft.project.model.algorithm;

import ai.djl.ModelException;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.translate.TranslateException;
import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface IAlgorithm {
    List<PredictionResult> predict(File file) throws AlgorithmException;
}
