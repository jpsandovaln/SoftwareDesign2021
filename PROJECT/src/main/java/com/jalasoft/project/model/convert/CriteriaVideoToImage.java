package com.jalasoft.project.model.convert;

import java.io.File;

public class CriteriaVideoToImage extends CriteriaBuilder {
    private Criteria criteria;

    public CriteriaVideoToImage(File inputFile, File outputFile) {
        this.criteria = new Criteria(inputFile, outputFile);
    }

    public CriteriaVideoToImage withFfmpeg(String ffmpeg) {
        this.criteria.setFfmpeg(ffmpeg);
        return this;
    }

    @Override
    public Criteria build() {
        return this.criteria;
    }
}
