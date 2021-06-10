package com.jalasoft.project.model.convert;

import com.jalasoft.project.model.convert.config.ConfigurationProperty;
import com.jalasoft.project.model.convert.config.PropertyHandler;

import java.io.IOException;

public class ConvertFile {
    public boolean convert(Criteria criteria) {
        /*AbstractConvert abstractConvert = new CommandFactory();
        ICommand convertCommand = abstractConvert.getInstance("video_to_image");
        System.out.println(criteria.getFfmpeg()); */

        /*CommandContext context = new CommandContext(new CommandVideoToImage());
        var command = context.getCommand(criteria);*/

        try {
            //String value = PropertyHandler.getInstance().getValueAsString("convert.ffmpeg");
            String value = ConfigurationProperty.getFfmpegPath();
            System.out.println(value);
        } catch (IOException ex) {
            return false;
        }

        ICommand convertCommand = new CommandVideoToImage();
        var command = convertCommand.build(criteria);

        IExecuter execute = new Execute();
        boolean isConverted = execute.run(command);
        return isConverted;
    }
}
