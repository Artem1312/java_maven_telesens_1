package com.academy.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage{
    private static Logger LOG = LoggerFactory.getLogger(HomePage.class);
    private String baseUrl;

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    @FindBy(linkText = "Women")
    private WebElement Women;

    @FindBy(linkText = "Dresses")
    private WebElement Dresses;

    @FindBy(linkText = "T-shirts")
    private WebElement TShirts;


    public HomePage(WebDriver driver, String baseUrl){
        super(driver);
        this.baseUrl = baseUrl;
    }

    public HomePage goToHome() {
        LOG.debug("HomePage. goToHome {}", baseUrl);
        driver.get(baseUrl);
        return this;
    }

    public LoginPage login() {
        signInLink.click();
        return new LoginPage(driver);
    }

    public WomenPage goToCategoryWomen(){
        Women.click();
        return new WomenPage(driver);
    }
    public DressesPage goToCategoryDresses(){
        Dresses.click();
        return new DressesPage(driver);
    }
    public TShirtsPage goToCategoryTShirts(){
        TShirts.click();
        return new TShirtsPage(driver);
    }

}
