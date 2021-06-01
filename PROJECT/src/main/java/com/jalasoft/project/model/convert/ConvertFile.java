package com.jalasoft.project.model.convert;

public class ConvertFile {
    public boolean convert(Criteria criteria) {
        AbstractConvert abstractConvert = new CommandFactory();
        ICommand convertCommand = abstractConvert.getInstance("video_to_image");
        System.out.println(criteria.getFfmpeg());
        var command = convertCommand.build(criteria);
        IExecuter execute = new Execute();
        boolean isConverted = execute.run(command);
        return isConverted;
    }
}
