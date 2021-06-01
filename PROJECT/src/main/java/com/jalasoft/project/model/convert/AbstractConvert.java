package com.jalasoft.project.model.convert;

public abstract class AbstractConvert {
    public final static String VIDEO_TO_IMAGE = "video_to_image";
    public final static String PDF_TO_IMAGE = "pdf_to_image";

    public abstract ICommand getInstance(String convertType);
}
