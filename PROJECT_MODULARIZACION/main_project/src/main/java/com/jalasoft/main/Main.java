package com.jalasoft.main;

import com.jalasoft.convert.convert_file.ConvertFile;
import com.jalasoft.convert.convert_file.Criteria;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello...");
        ConvertFile convertFile = new ConvertFile();
        //convertFile.convert(new Criteria(null, null, ""));
        SpringApplication.run(Main.class, args);
    }
}
