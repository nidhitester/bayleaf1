package com.tagma.datagardner;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Basepage {
    public static WebDriver driver;

    static Properties properties;
    static FileInputStream fs;
    static String filename="Config.properties";
    static String filelocation="src\\test\\Resourses\\Propertyfile\\";

    public String getProperty(String key)  {
        properties = new Properties();
        try {
            fs=new FileInputStream(filelocation+filename);
            properties.load(fs);
            fs.close();

        }
        catch (IOException io){
            io.printStackTrace();
        }
        return properties.getProperty(key);

    }
}
