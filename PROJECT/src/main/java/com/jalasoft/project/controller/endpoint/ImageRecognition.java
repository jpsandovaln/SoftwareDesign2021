package com.jalasoft.project.controller.endpoint;

import com.jalasoft.project.model.convert.ConvertVideoToImage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class ImageRecognition {

    @PostMapping("/api/v1/image-recognition")
    public String imageRecognition(@RequestParam MultipartFile video, @RequestParam String word,
                                   @RequestParam String percentage, @RequestParam String algorithm) {

        try {
            Files.createDirectories(Paths.get("images/"));
            Path imagesPath = Paths.get("images/");

            Files.createDirectories(Paths.get("inputVideo/"));
            Path path = Paths.get("inputVideo/" + video.getOriginalFilename());
            Files.copy(video.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            File videoFile = path.toFile();

            ConvertVideoToImage convertFile = new ConvertVideoToImage();
            boolean isConverted = convertFile.convert(videoFile, imagesPath.toFile());
            return isConverted ? "good" : "fail";
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
