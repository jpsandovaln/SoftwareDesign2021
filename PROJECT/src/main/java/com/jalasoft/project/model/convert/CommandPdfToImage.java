package com.jalasoft.project.model.convert;

import java.io.File;

public class CommandPdfToImage extends AbstractCommand implements ICalculate {
    @Override
    public String build(File video, File output) {
        execute = new ExecuteTwo();
        return null;
    }

    public int calculate() {
        int val = 5;
        int val2 = 8;
        return val + val2;
    }
}
