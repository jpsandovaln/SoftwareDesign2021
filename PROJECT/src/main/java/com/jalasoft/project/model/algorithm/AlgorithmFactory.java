package com.jalasoft.project.model.algorithm;

public class AlgorithmFactory extends AbstractAlgorithm {
    private final static String RESNET50 = "resnet50";
    private final static String VGG16 = "vgg16";
    @Override
    public IAlgorithm getInstance(String algorithm) {
        if(algorithm.equals(RESNET50)) {
            return new ResNet50();
        }
        if(algorithm.equals(VGG16)) {
            return new Vgg16Adapter();
        }
        return new Cnn();
    }
}
