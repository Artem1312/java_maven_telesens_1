package com.academy.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DressesPage extends BasePage{
    private static Logger LOG = LoggerFactory.getLogger(HomePage.class);
    private String baseUrl;

    @FindBy(xpath = "//*[@id=\"layered_id_attribute_group_1\"]")
    private WebElement sizeS;

    @FindBy(xpath = "//*[@id=\"layered_id_attribute_group_2\"]")
    private WebElement sizeM;

    @FindBy(xpath = "//*[@id=\"layered_id_attribute_group_3\"]")
    private WebElement sizeL;

    @FindBy(xpath = "//*[@id=\"layered_category_9\"]")
    private WebElement casualDresses;

    @FindBy(xpath = "//*[@id=\"layered_category_10\"]")
    private WebElement eveningDresses;

    @FindBy(xpath = "//*[@id=\"layered_category_11\"]")
    private WebElement summerDresses;

    @FindBy(xpath = "//*[@id=\"layered_id_feature_5\"]")
    private WebElement cotton;

    @FindBy(xpath = "//*[@id=\"layered_id_feature_1\"]")
    private WebElement polyester;

    @FindBy(xpath = "//*[@id=\"layered_id_feature_3\"]")
    private WebElement viscose;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement printedDress;

    public DressesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void setSize(String size){
        switch (size){
            case "s":
                sizeS.click();
                break;
            case "m":
                sizeM.click();
                break;
            case "l":
                sizeL.click();
                break;
            default:
                break;
        }
    }

    public void setCategory(String category){
        switch (category){
            case "casual":
                casualDresses.click();
                break;
            case "evening":
                eveningDresses.click();
                break;
            case "summer":
                summerDresses.click();
                break;
            default:
                break;
        }
    }

    public void setComposition(String composition){
        switch (composition) {
            case "cotton":
                cotton.click();
                break;
            case "polyester":
                polyester.click();
                break;
            case "viscose":
                viscose.click();
                break;
            default:
                break;
        }
    }

    public String getNamePosition(){
        return printedDress.getText();
    }

    public CategoryPage goToPageProduct(){
        printedDress.click();
        return new CategoryPage(driver);
    }
}
