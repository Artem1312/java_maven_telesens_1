package com.academy.trueconf.core;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssertWrapper {
    private static Logger LOG = LoggerFactory.getLogger(com.academy.automationpractice.ddt.core.AssertWrapper.class);

    public static void assertEquals(String actual, String expected) {
        log(actual, expected);
        Assert.assertEquals(actual, expected);
    }

    public static void assertEquals(int actual, int expected) {
        log(actual, expected);
        Assert.assertEquals(actual, expected);
    }

    private static void log(Object actual, Object expected) {
        LOG.debug("Assert equals: actual {}, expected {}", actual, expected);
    }
}
