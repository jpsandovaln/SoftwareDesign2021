package com.jalasoft.project.model.algorithm;

import java.time.LocalTime;

public class PredictionResult {
    private String algorithm;
    private String object;
    private Double percentage;
    private LocalTime time;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public PredictionResult(String object, Double percentage) {
        this.object = object;
        this.percentage = percentage;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
