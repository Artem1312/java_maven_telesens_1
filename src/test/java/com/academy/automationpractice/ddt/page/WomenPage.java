package com.academy.automationpractice.ddt.page;

import com.academy.automationpractice.ddt.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage {

    @FindBy(xpath = "/html/head/title")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    private WebElement navigationPage;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/h2")
    private WebElement titleBlock;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a")
    private WebElement elementOfFooter;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement headingCounter;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/span")
    private WebElement categoryName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/div/p[1]/strong")
    private WebElement firstLineFromCategoryName;



    public WomenPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getNavigatorName(){
        return navigationPage.getText();
    }

    public String getTitleBlockName() {
        return titleBlock.getText();
    }

    public String getNameOfCategoryElement() {
        return elementOfFooter.getText();
    }

    public String getHeadingCounter() {
        return headingCounter.getText();
    }

    public String getCategoryName() {
        return categoryName.getText();
    }

    public String getFirstLineFromCategoryName() {
        return firstLineFromCategoryName.getText();
    }



}
