package com.jalasoft.project.model.convert;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CommandVideoToImageTest {

    @Test
    void build() {
        // Arrange
        File video = new File("D:/paseo.mp4");
        File output = new File("D:/output/");
        String ffmpeg = "D:/ffmpeg/ffmpeg";
        String expected = "D:/ffmpeg/ffmpeg -i D:\\paseo.mp4 -vf fps=1 D:\\output/%d.jpg";

        // Act
        Criteria criteria = new Criteria(video, output, ffmpeg);
        CommandVideoToImage command = new CommandVideoToImage();
        String result = command.build(criteria);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void buildPattern() {
        String expected = "D:/ffmpeg/ffmpeg -i D:\\paseo.mp4 -vf fps=1 D:\\output/%d.jpg";

        Criteria criteria = new CriteriaBuilder()
                .withVideo("D:/paseo.mp4")
                .withOutput("D:/output/")
                .withFffmpeg("D:/ffmpeg/ffmpeg")
                .build();
        CommandVideoToImage command = new CommandVideoToImage();
        String result = command.build(criteria);

        assertEquals(expected, result);
    }

    @Test
    void buildCreationMethod() {
        String expected = "D:/ffmpeg/ffmpeg -i D:\\paseo.mp4 -vf fps=1 D:\\output/%d.jpg";

        CommandVideoToImage command = new CommandVideoToImage();
        String result = command.build(this.getCriteria());

        assertEquals(expected, result);
    }

    private Criteria getCriteria() {
        return new CriteriaBuilder()
                .withVideo("D:/paseo.mp4")
                .withOutput("D:/output/")
                .withFffmpeg("D:/ffmpeg/ffmpeg")
                .build();
    }
}