package com.jalasoft.convert.convert_file;

import com.jalasoft.convert.command.AbstractConvert;
import com.jalasoft.convert.command.CommandFactory;
import com.jalasoft.convert.command.ICommand;
import com.jalasoft.convert.execute.Execute;
import com.jalasoft.convert.execute.IExecuter;

public class ConvertFile {
    public boolean convert(Criteria criteria) {
        // ICommand convertCommand = new CommandVideoToImage();
        AbstractConvert abstractConvert = new CommandFactory();
        ICommand convertCommand = abstractConvert.getInstance("video_to_image");
        System.out.println(criteria.getFfmpeg());
        String command = convertCommand.build(criteria);
        IExecuter execute = new Execute();
        boolean isConverted = execute.run(command);
        return isConverted;
    }
}
