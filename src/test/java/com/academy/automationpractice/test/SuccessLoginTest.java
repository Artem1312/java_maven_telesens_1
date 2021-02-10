package com.academy.automationpractice.test;

import com.academy.automationpractice.page.HomePage;
import com.academy.automationpractice.page.LoginPage;
import com.academy.automationpractice.page.MyAccountPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessLoginTest extends BaseTest{
    private static Logger LOG = LoggerFactory.getLogger(SuccessLoginTest.class);
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test(dataProvider = "authSuccessDataProvider")
    public void testAuthUsingPageObject(String login, String password, String expectedUserName) {
        // Шаги
        MyAccountPage myAccountPage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess();

        String userNameActual = myAccountPage.getUserName();
        Assert.assertEquals(userNameActual, expectedUserName);

        //Просто ожидание на странице
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //разлогин
        myAccountPage.logout();
    }

    @DataProvider(name = "authSuccessDataProvider")
    public Object[][] authSuccessDataProvider() {
        return new Object[][] {
                {"apukhtin.artem@gmail.com", "1594872633", "Artem Apukhtin"}
        };
    }
}
