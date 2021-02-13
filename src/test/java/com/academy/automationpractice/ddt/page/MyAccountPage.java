package com.academy.automationpractice.ddt.page;

import com.academy.automationpractice.ddt.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//a[contains(@class, 'account')]/span")
    private WebElement userNameEl;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement sighOut;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage logout() {
        sighOut.click();
        return new LoginPage(driver);
    }


    public String getUserName() {
        return userNameEl.getText();
    }
}
