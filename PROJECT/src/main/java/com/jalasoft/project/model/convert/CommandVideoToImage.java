package com.jalasoft.project.model.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandVideoToImage extends AbstractCommand {
    private static final String FFMPEG_PATH = "D:/ffmpeg/ffmpeg ";
    private static final String INPUT_PARAM = "-i ";
    private static final String VIDEO_FRAME_PARAM = " -vf ";
    private static final String VIDEO_FRAME_VALUE = "fps=1 ";
    private static final  String OUTPUT_IMAGE_NAME = "/%d.jpg";

    public String build(File video, File output) {
        //String command = "D:/ffmpeg/ffmpeg -i " + video.getAbsolutePath() + " -vf fps=1 " + output.getAbsolutePath() + "/%d.jpg";
        StringBuilder command = new StringBuilder();
        command.append(FFMPEG_PATH)
                .append(INPUT_PARAM)
                .append(video.getAbsolutePath())
                .append(VIDEO_FRAME_PARAM)
                .append(VIDEO_FRAME_VALUE)
                .append(output.getAbsolutePath() + OUTPUT_IMAGE_NAME);
        execute = new Execute();
        return command.toString();
    }
}
