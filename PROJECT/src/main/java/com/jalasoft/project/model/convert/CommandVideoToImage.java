package com.jalasoft.project.model.convert;

public class CommandVideoToImage implements ICommand  {
    private static final String INPUT_PARAM = " -i ";
    private static final String VIDEO_FRAME_PARAM = " -vf ";
    private static final String VIDEO_FRAME_VALUE = "fps=1 ";
    private static final  String OUTPUT_IMAGE_NAME = "/%d.jpg";

    public String build(Criteria criteria) {
        StringBuilder command = new StringBuilder();
        command.append(criteria.getFfmpeg())
                .append(INPUT_PARAM)
                .append(criteria.getInputFile().getAbsolutePath())
                .append(VIDEO_FRAME_PARAM)
                .append(VIDEO_FRAME_VALUE)
                .append(criteria.getOutputFile().getAbsolutePath() + OUTPUT_IMAGE_NAME);
        return command.toString();
    }
}
