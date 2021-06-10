package com.jalasoft.project.model.convert.config;

import java.io.IOException;

public class ConfigurationProperty {
    public static  String getFfmpegPath() throws IOException {
        return PropertyHandler.getInstance().getValueAsString("convert.ffmpeg");
    }
    public static  String getVgg16Model() throws IOException {
        return PropertyHandler.getInstance().getValueAsString("convert.vgg16-model");
    }
    public static  String getVgg16Label() throws IOException {
        return PropertyHandler.getInstance().getValueAsString("convert.vgg16-label");
    }
}
