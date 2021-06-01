package com.jalasoft.convert;

public class CommandFactory extends AbstractConvert {
    @Override
    public ICommand getInstance(String convertType) {
        if (VIDEO_TO_IMAGE.equals(convertType)){
            return  new CommandVideoToImage();
        }
        return new CommandPdfToImage();
    }
}
