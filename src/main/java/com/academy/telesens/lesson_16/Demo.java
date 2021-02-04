package com.academy.telesens.lesson_16;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Demo {
    private static Logger LOG = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        LOG.info("Test logger {}","date");
        LOG.error("Test logger");
        LOG.debug("Test logger");
    }
}
