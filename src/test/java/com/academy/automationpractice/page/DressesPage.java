package com.academy.automationpractice.page;

import org.openqa.selenium.WebDriver;

public class DressesPage extends BasePage{
    public DressesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
