package com.jalasoft.project.model.convert;

public class ConvertFile {
    public boolean convert(Criteria criteria) {
        AbstractCommand convertCommand = new CommandVideoToImage();
        System.out.println(criteria.getFfmpeg());
        var command = convertCommand.build(criteria);
        IExecuter execute = new Execute();
        boolean isConverted = execute.run(command);
        return isConverted;
    }
}
