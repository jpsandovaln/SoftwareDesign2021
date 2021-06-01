package com.jalasoft.convert;

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
