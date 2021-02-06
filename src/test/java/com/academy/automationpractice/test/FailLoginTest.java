package com.academy.automationpractice.test;

import com.academy.automationpractice.page.HomePage;
import com.academy.automationpractice.page.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FailLoginTest extends BaseTest{
    private static Logger LOG = LoggerFactory.getLogger(FailLoginTest.class);
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test(dataProvider = "authFailDataProvider")
    public void testFailLogin(String login, String password, String expectedError){
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        LoginPage loginPage = homePage.login();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        loginPage.submit();

        // Проверка
        String errMsgActual = loginPage.getErrorMessage();
        Assert.assertEquals(errMsgActual, expectedError);
    }

    @DataProvider(name = "authFailDataProvider")
    public Object[][] authSuccessDataProvider() {
        return new Object[][] {
                {"apukhtin.artem@gmail.com", "1594872631", "Authentication failed."},
                {"apukhtin1.artem@gmail.com", "1594872633", "Authentication failed."},
                {"apukhtin2.artem@gmail.com", "15948726333", "Authentication failed."},
                {"", "", "An email address required."},
                {"apukhtin.artem@gmail.com", "", "Password is required."},
                {"", "1594872633", "An email address required."},
                {"123zxc", "", "Invalid email address."}
        };
    }
}
