package com.academy.automationpractice.ddt.page;

import com.academy.automationpractice.ddt.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="email")
    private WebElement loginField;

    @FindBy(id="passwd")
    private WebElement passwordField;

    //    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
    private WebElement errMessageEl;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage inputLogin(String userName) {
//        loginField.click();
//        loginField.clear();
//        loginField.sendKeys(userName);
        inputField(loginField, userName);
        return this;
    }

    public LoginPage inputPassword(String password) {
//        passwordField.click();
//        passwordField.clear();
//        passwordField.sendKeys(password);
        inputField(passwordField, password);
        return this;
    }

    @Step("submit")
    public LoginPage submit() {
        submitButton.click();
        return this;
    }

    @Step("submit")
    public MyAccountPage submitSuccess() {
        submitButton.click();
        return new MyAccountPage(driver);
    }

    @Step("getErrorMessage")
    public String getErrorMessage() {
        return errMessageEl.getText();
    }
}
