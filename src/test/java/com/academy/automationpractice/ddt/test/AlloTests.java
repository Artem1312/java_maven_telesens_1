package com.academy.automationpractice.ddt.test;

import com.academy.automationpractice.ddt.core.AssertWrapper;
import com.academy.automationpractice.ddt.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlloTests extends BaseTest {
    private String baseUrl = "https://allo.ua";

    @Test
    public void testPriceGadget() {
        driver.get(baseUrl);
        WebElement gadget = driver.findElement(By.cssSelector("span.sum"));
        String priceRawText = gadget.getText();
        String digits = priceRawText.replaceAll(" ", "");
        int priceActual = Integer.parseInt(digits);
        int priceExpected = 7899;
        AssertWrapper.assertEquals(priceActual, priceExpected);

    }
}
