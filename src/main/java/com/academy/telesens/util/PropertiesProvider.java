package com.academy.telesens.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProvider {

    private static String DEFAULT_PROP_FILE= "defult-config.properties";
    //private final String  DEFAULT_PROP_FILE = "defult-config.properties";
    private static Properties prop;

    static {
        init();
    }

    private static void init() {
        try {
            prop = new Properties();
            InputStream is = PropertiesProvider.class.getClassLoader().getResourceAsStream(DEFAULT_PROP_FILE);
            prop.load(is);
        } catch (IOException e) {
            System.out.println("Error prop initialization");
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static String get(String key, String nameFileProperties) {
        DEFAULT_PROP_FILE = nameFileProperties;
        return prop.getProperty(key);
    }
}
