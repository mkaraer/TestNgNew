package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        //this the path to the location of the file
        String path = "Configuration.properties";
        try {
            //java connot read files directly,in needs inputstream to read files
            //inputstreams takes tke location of the file as a consstructor
            FileInputStream fileInputStream = new FileInputStream(path);
            //file contents are load to properties fron the inputsstream
            properties = new Properties();
            //all inputstreams must be closes
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getProperty(String property) {

        return properties.getProperty(property);
    }
}