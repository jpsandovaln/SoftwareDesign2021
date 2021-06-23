package com.jalasoft.project.model.algorithm;

import com.jalasoft.project.model.exception.AlgorithmException;

import java.io.File;
import java.util.Calendar;
import java.util.List;

public class RestNet50Proxy implements IAlgorithm{

    private IAlgorithm resNet50;
    private final static int HOUR = 17;

    public RestNet50Proxy() {
        this.resNet50 = new ResNet50();
    }

    @Override
    public List<PredictionResult> predict(File file) throws AlgorithmException {
        Calendar now = Calendar.getInstance();
        int current = now.get(Calendar.HOUR_OF_DAY);
        System.out.println(current);
        if (HOUR <= current) {
            // throw new AlgorithmException("Invalid Hour");
        }
       return this.resNet50.predict(file);
    }
}
