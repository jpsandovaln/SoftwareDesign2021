package com.jalasoft.main.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "convert")
public class Properties {
    private String ffmpeg;

    public String getFfmpeg() {
        return ffmpeg;
    }

    public void setFfmpeg(String ffmpeg) {
        this.ffmpeg = ffmpeg;
    }
}
