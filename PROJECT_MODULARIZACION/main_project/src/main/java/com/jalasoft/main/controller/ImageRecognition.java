package com.jalasoft.main.controller;

import com.jalasoft.convert.convert_file.Criteria;
import com.jalasoft.machine_learning.object_recognition.PredictionResult;
import com.jalasoft.main.component.Properties;
import com.jalasoft.main.service.ImageRecognitionFacade;
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

    @Autowired
    private ImageRecognitionFacade imageRecognitionFacade;

    @PostMapping("/api/v1/image-recognition")
    public List<PredictionResult> imageRecognition(@RequestParam MultipartFile video, @RequestParam String word,
                                                   @RequestParam String percentage, @RequestParam String algorithm) {

        try {
            Files.createDirectories(Paths.get("images/"));
            var imagesPath = Paths.get("images/");

            Files.createDirectories(Paths.get("inputVideo/"));
            var path = Paths.get("inputVideo/" + video.getOriginalFilename());
            Files.copy(video.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            var videoFile = path.toFile();
            return imageRecognitionFacade.getPredictions(new Criteria(videoFile, imagesPath.toFile(), properties.getFfmpeg()),algorithm, imagesPath.toFile(), percentage, word);
        } catch (IOException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
}
