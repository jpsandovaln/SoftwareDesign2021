package com.jalasoft.project.model.convert;

import java.io.File;

public abstract class AbstractCommand {
    IExecuter execute;
    public abstract String build(File video, File output);
}
