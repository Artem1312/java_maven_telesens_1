package com.academy.telesens.util;

import com.academy.telesens.lesson_16.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyProvider {

    private static Logger LOG = LoggerFactory.getLogger(PropertyProvider.class);
    private static String DEFAULT_PROP_FILE= "defult-config.properties";
    //private final String  DEFAULT_PROP_FILE = "defult-config.properties";
    private static Properties prop;

    static {
        init();
    }

    private static void init() {
        try {
            prop = new Properties();
            InputStream is = PropertyProvider.class.getClassLoader().getResourceAsStream(DEFAULT_PROP_FILE);
            prop.load(is);
        } catch (IOException | RuntimeException e) {
            LOG.error("Error prop initialization. Details: {}", e.getMessage());
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static String get(String key, String nameFileProperties) {
        DEFAULT_PROP_FILE = nameFileProperties;
        return prop.getProperty(key);
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(prop.getProperty(key));
    }
}
