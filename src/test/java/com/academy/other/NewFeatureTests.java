package com.academy.other;

import com.academy.automationpractice.ddt.core.BaseTest;
import org.testng.annotations.Test;

public class NewFeatureTests extends BaseTest {

    @Test
    public void testFeature1() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}