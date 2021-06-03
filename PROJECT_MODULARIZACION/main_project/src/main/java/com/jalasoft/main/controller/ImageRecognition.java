package com.jalasoft.main.controller;

import com.jalasoft.main.component.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@RestController
public class ImageRecognition {

    @Autowired
    private Properties properties;

    @PostMapping("/api/v1/image-recognition")
    public String imageRecognition(@RequestParam MultipartFile video, @RequestParam String word,
                                   @RequestParam String percentage, @RequestParam String algorithm) {

        return "hello";
    }
}
