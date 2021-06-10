package com.jalasoft.main.service;


import com.jalasoft.convert.convert_file.ConvertFile;
import com.jalasoft.convert.convert_file.Criteria;
import com.jalasoft.machine_learning.object_recognition.ObjectRecognition;
import com.jalasoft.machine_learning.object_recognition.PredictionResult;
import com.jalasoft.machine_learning.exception.AlgorithmException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ImageRecognitionFacade {
    public List<PredictionResult> getPredictions(Criteria criteria, String algorithm, File imagesPath,
                                                 String percentage, String word) throws AlgorithmException {
        ConvertFile convertFile = new ConvertFile();
        boolean isConverted = convertFile.convert(criteria);

        ObjectRecognition objectRecognition = new ObjectRecognition();
        var predictionResultList = objectRecognition.getPredictionList(algorithm, imagesPath, percentage, word);
        return predictionResultList;
    }
}
