package com.jalasoft.main.service;


import com.jalasoft.convert.convert_file.ConvertFile;
import com.jalasoft.convert.convert_file.Criteria;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ImageRecognitionFacade {
    public boolean getPredictions(Criteria criteria, String algorithm, File imagesPath,
                                  String percentage, String word)  {
        ConvertFile convertFile = new ConvertFile();
        boolean isConverted = convertFile.convert(criteria);
        return isConverted;
    }
}
