package com.academy.automationpractice.ddt.page;

import com.academy.automationpractice.ddt.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CategoryPage extends BasePage {
    private static Logger LOG = LoggerFactory.getLogger(HomePage.class);
    private String baseUrl;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[1]/td[2]")
    private WebElement composition;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[1]")
    private WebElement size;


    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getSize(){
        return size.getText();
    }

    public String getComposition(){
        return composition.getText();
    }

}
