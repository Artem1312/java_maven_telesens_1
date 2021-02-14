package com.academy.trueconf.test;

import com.academy.trueconf.page.HomePage;
import com.academy.trueconf.page.AccountPage;

import com.academy.trueconf.core.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUserAriaTest extends BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(LoginUserAriaTest.class);
    private String baseUrl = "http://qa3.trueconf.net";

    @Test(dataProvider = "authSuccessDataProvider")
    public void testAuthUsingPageObject(String login, String password, String expectedUserName) {
        // Шаги
        AccountPage accountPage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess();

        //Просто ожидание на странице
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String userNameActual = accountPage.getUserName();
        Assert.assertEquals(userNameActual, expectedUserName);

        //Просто ожидание на странице
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //разлогин
        accountPage.logout();
    }

    @DataProvider(name = "authSuccessDataProvider")
    public Object[][] authSuccessDataProvider() {
        return new Object[][] {
                {"apukhtin1", "11", "Artem Apukhtin"}
        };
    }
}
