package com.academy.telesens.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //File file = new File("java-path.properties");
        File file = new File("src/main/resources/demo.properties");
        try (FileInputStream fis = new FileInputStream(file)){
            prop.load(fis);
            String url = prop.getProperty("url");
            String login = prop.getProperty("login");
            String password = prop.getProperty("password");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
