package com.jalasoft.machine_learning.algorithm;

public class AlgorithmFactory extends AbstractAlgorithm {
    private final static  String RESNET50 = "resnet50";
    @Override
    public IAlgorithm getInstance(String algorithm) {
        if(algorithm.equals(RESNET50)) {
            return new ResNet50();
        }
        return new Cnn();
    }
}
