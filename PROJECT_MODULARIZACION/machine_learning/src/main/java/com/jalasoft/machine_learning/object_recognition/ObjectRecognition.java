package com.jalasoft.machine_learning.object_recognition;

import com.jalasoft.machine_learning.algorithm.AbstractAlgorithm;
import com.jalasoft.machine_learning.algorithm.AlgorithmFactory;
import com.jalasoft.machine_learning.algorithm.IAlgorithm;
import com.jalasoft.machine_learning.exception.AlgorithmException;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ObjectRecognition {
    public List<PredictionResult> getPredictionList(String algorithm, File imagesPath,
                                                    String percentage, String word) throws AlgorithmException {
        AbstractAlgorithm abstractAlgorithm = new AlgorithmFactory();
        IAlgorithm currentAlgorithm = abstractAlgorithm.getInstance(algorithm);

        var predictionResultList = new ArrayList<PredictionResult>();
        for (File file : imagesPath.listFiles()) {
            var resultList = currentAlgorithm.predict(file);
            var perInt = Double.parseDouble(percentage);
            var fileName = FilenameUtils.getBaseName(file.getName());
            resultList.stream()
                    .filter(value -> value.getObject().contains(word))
                    .filter(value -> value.getPercentage() * 100 >= perInt)
                    .forEach(predictionResult -> {
                        predictionResult.setTime(LocalTime.ofSecondOfDay(Long.parseLong(fileName)));
                        predictionResult.setAlgorithm(algorithm);
                        predictionResultList.add(predictionResult);
                    });
        }
        return predictionResultList;
    }
}
