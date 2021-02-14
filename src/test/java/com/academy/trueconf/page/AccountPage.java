package com.academy.trueconf.page;

import com.academy.trueconf.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AccountPage extends BasePage {
    private static Logger LOG = LoggerFactory.getLogger(com.academy.trueconf.page.AccountPage.class);

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/div/section/div/div/div[1]/div[1]/div/div[2]/div[1]")
    private WebElement UserName;

    @FindBy(xpath = "")
    private WebElement logout;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getUserName(){
        return UserName.getText();
    }

    public HomePage logout(){
        logout.click();
        return new HomePage(driver);
    }
}
