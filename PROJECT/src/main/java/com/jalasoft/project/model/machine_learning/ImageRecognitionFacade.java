package com.jalasoft.project.model.machine_learning;

import com.jalasoft.project.model.algorithm.ObjectRecognition;
import com.jalasoft.project.model.algorithm.PredictionResult;
import com.jalasoft.project.model.convert.ConvertFile;
import com.jalasoft.project.model.convert.Criteria;
import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.util.List;

public class ImageRecognitionFacade {
    public static List<PredictionResult> getPredictions(Criteria criteria, String algorithm, File imagesPath,
                                                        String percentage, String word) throws AlgorithmException {
        ConvertFile convertFile = new ConvertFile();
        boolean isConverted = convertFile.convert(criteria);

        ObjectRecognition objectRecognition = new ObjectRecognition();
        var predictionResultList = objectRecognition.getPredictionList(algorithm, imagesPath, percentage, word);
        return predictionResultList;
    }
}
