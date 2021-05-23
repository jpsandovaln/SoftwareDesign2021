package com.jalasoft.project.controller.endpoint;

import com.jalasoft.project.model.algorithm.IAlgorithm;
import com.jalasoft.project.model.algorithm.PredictionResult;
import com.jalasoft.project.model.algorithm.ResNet50;
import com.jalasoft.project.model.convert.*;
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
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

@RestController
public class ImageRecognition {

    @PostMapping("/api/v1/image-recognition")
    public List<PredictionResult> imageRecognition(@RequestParam MultipartFile video, @RequestParam String word,
                                   @RequestParam String percentage, @RequestParam String algorithm) {

        try {
            Files.createDirectories(Paths.get("images/"));
            Path imagesPath = Paths.get("images/");

            Files.createDirectories(Paths.get("inputVideo/"));
            Path path = Paths.get("inputVideo/" + video.getOriginalFilename());
            Files.copy(video.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            File videoFile = path.toFile();

            AbstractCommand convertCommand = new CommandVideoToImage();
            String command = convertCommand.build(videoFile, imagesPath.toFile());
            IExecuter execute = new Execute();
            boolean isConverted = execute.run(command);

            IAlgorithm resNet50 = new ResNet50();
            List<PredictionResult> predictionResultList = new ArrayList<>();

            for (File file : imagesPath.toFile().listFiles()) {
                List<PredictionResult> resultList = resNet50.predict(file);
                for (PredictionResult predictionResult : resultList) {
                    double perOut = predictionResult.getPercentage() * 100;
                    double perInt = Double.parseDouble(percentage);
                    if (predictionResult.getObject().contains(word) && perOut >= perInt) {
                        String fileName = FilenameUtils.getBaseName(file.getName());
                        predictionResult.setTime(LocalTime.ofSecondOfDay(Long.parseLong(fileName)));
                        predictionResult.setAlgorithm(algorithm);
                        predictionResultList.add(predictionResult);
                        break;
                    }
                }
            }
            return predictionResultList;
        } catch (IOException ex) {
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
}
