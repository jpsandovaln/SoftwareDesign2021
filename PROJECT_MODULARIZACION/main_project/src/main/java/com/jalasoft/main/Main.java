package com.jalasoft.main;

import com.jalasoft.convert.TestConvert;
import com.jalasoft.machine_learning.TestMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello...");
        TestConvert testConvert = new TestConvert();
        System.out.println(testConvert.getConvertData());
        TestMachine da = new TestMachine();
        System.out.println(da.getData());
    }
}
