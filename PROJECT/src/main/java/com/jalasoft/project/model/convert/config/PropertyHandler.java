package com.jalasoft.project.model.convert.config;

import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {
    private static PropertyHandler propertyHandler;
    private static Properties properties;
    private final static String CONFIG_FILE = "configuration.properties";

    private PropertyHandler() throws IOException {
        this.properties = new Properties();
        this.properties.load(getClass().getClassLoader().getResourceAsStream(CONFIG_FILE));
        System.out.println(this.properties.toString());
    }

    public static PropertyHandler getInstance() throws IOException{
        if (propertyHandler == null){
            propertyHandler = new PropertyHandler();
        }
        return propertyHandler;
    }

    public  String getValueAsString(String key) {
        return this.properties.getProperty(key);
    }
}
