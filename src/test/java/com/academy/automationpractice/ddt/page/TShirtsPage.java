package com.academy.automationpractice.ddt.page;

import com.academy.automationpractice.ddt.core.BasePage;
import org.openqa.selenium.WebDriver;

public class TShirtsPage extends BasePage {

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
