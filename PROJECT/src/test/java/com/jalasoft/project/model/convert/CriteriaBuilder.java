package com.jalasoft.project.model.convert;

import java.io.File;

public class CriteriaBuilder {
    private File video;
    private File output;
    private String ffmpeg;

    public CriteriaBuilder withVideo(String videoPath) {
        this.video = new File(videoPath);
        return this;
    }

    public CriteriaBuilder withOutput(String output) {
        this.output = new File(output);
        return this;
    }

    public CriteriaBuilder withFffmpeg(String ffmpeg) {
        this.ffmpeg = ffmpeg;
        return this;
    }

    public Criteria build() {
        return new Criteria(this.video, this.output, this.ffmpeg);
    }
}
