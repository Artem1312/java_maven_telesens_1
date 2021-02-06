package com.academy.automationpractice.page;

import org.openqa.selenium.WebDriver;

public class TShirtsPage extends BasePage{

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
