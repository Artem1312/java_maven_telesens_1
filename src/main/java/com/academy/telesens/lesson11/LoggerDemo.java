package com.academy.telesens.lesson11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
    private static final Logger LOG = LogManager.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) {
        System.out.println("Hello world! Start");
        LOG.debug("Debug message Logged !!!");
        LOG.info("Info message Logged !!!");
        LOG.error("Error message Logged !!!", new NullPointerException("NullError"));
        System.out.println("Hello world! End");
    }
}
