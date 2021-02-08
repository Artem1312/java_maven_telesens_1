package com.academy.automationpractice.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = "//*[@id=\"layered_price_range\"]")
    private WebElement PrizeValues;

    @FindBy(xpath = "//*[@id=\"layered_price_slider\"]/a[1]")
    private WebElement minPrizeBtmSlider;

    @FindBy(xpath = "//*[@id=\"layered_price_slider\"]/a[2]")
    private WebElement maxPrizeBtnSlider;

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

    public double getMinPrizeSlide(){
        double minPrizeValue = Double.parseDouble(PrizeValues.getText().substring(1,5));
        return minPrizeValue;
    }

    public double getMaxPrizeSlide(){
        double maxPrizeValue = Double.parseDouble(PrizeValues.getText().substring(10,14));
        return maxPrizeValue;
    }

    public void setMinPrize(double minPrize){
        double value = 0.0;
        //WebElement slider = minPrizeBtmSlider
        Actions webelement = new Actions(driver);

        do{
            value = getMinPrizeSlide();
            webelement.clickAndHold(minPrizeBtmSlider).moveByOffset(1,0);
        } while(value != minPrize);
    }

    public void setMaxPrize(double maxPrize){
        double value = 0.0;
        //WebElement slider = minPrizeBtmSlider
        Actions webelement = new Actions(driver);

        do{
            value = getMaxPrizeSlide();
            webelement.clickAndHold(maxPrizeBtnSlider).moveByOffset(-1,0);
        } while(value != maxPrize);
    }

//    public Double getListPrize(){
//        Double prizeList;
//        //return prizeList;
//    }
//

}
