package com.academy.trueconf.test;

import com.academy.trueconf.core.BaseTest;
import com.academy.trueconf.page.AccountPage;
import com.academy.trueconf.page.HomePage;
import com.academy.trueconf.page.ProfileSettingsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProfileSettingTest extends BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(LoginUserAriaTest.class);
    //private String baseUrl = "http://qa3.trueconf.net";
    private String baseUrl = "https://localhost";

    @Test(dataProvider = "authSuccessDataProvider")
    public void testEditProfileUser(String login, String password){
        ProfileSettingsPage profilePage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess()
                .goToProfileSettings();
    }

    @DataProvider(name = "authSuccessDataProvider")
    public Object[][] authSuccessDataProvider() {
        return new Object[][] {
                {"apukhtin1", "11"}
        };
    }
}
