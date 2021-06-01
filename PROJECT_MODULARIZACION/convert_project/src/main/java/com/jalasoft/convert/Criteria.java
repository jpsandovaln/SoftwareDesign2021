package com.jalasoft.convert;

import java.io.File;

public class Criteria {
    private File inputFile;
    private File outputFile;
    private String ffmpeg;

    public Criteria(File inputFile, File outputFile, String ffmpeg) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.ffmpeg = ffmpeg;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public String getFfmpeg() {
        return ffmpeg;
    }

    public void setFfmpeg(String ffmpeg) {
        this.ffmpeg = ffmpeg;
    }
}
