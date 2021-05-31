package com.jalasoft.main;

import com.jalasoft.convert.TestConvert;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello...");
        TestConvert testConvert = new TestConvert();
        System.out.println(testConvert.getConvertData());
    }
}
