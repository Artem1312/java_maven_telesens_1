package com.academy.trueconf.page;

import com.academy.trueconf.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AccountPage extends BasePage {
    private static Logger LOG = LoggerFactory.getLogger(com.academy.trueconf.page.AccountPage.class);

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/section/div/div/div[1]/div[1]/div/div[2]/div[1]")
    private WebElement UserName;

    @FindBy(xpath = "//*[@id=\"tc-menu-124\"]/ul/li[2]")
    private WebElement logout;

    //@FindBy(xpath = "//*[@id=\"tc-icon-127\"]")
    @FindBy(name = "keyboard_arrow_down")
    private WebElement showMenu;


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getUserName(){
        return UserName.getText();
    }

//    public AccountPage openMenu(){
//        showMenu.click();
//        return this;


    public HomePage logout(){
        showMenu.click();
        logout.click();
        return new HomePage(driver);
    }
}
