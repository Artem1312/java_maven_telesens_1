package com.academy.trueconf.test;

import com.academy.trueconf.core.BaseTest;
import com.academy.trueconf.page.AccountPage;
import com.academy.trueconf.page.HomePage;
import com.academy.trueconf.page.ProfileSettingsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProfileSettingTest extends BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(LoginUserAriaTest.class);
    //private String baseUrl = "http://qa3.trueconf.net";
    private String baseUrl = "https://localhost";

    @Test(dataProvider = "TestDataEditProfileProvider")
    public void testEditProfileUser(String login,
                                    String password,
                                    String displayName,
                                    String firstName,
                                    String lastName){
        ProfileSettingsPage profilePage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess()
                .goToProfileSettings();
//        profilePage.editProfile();
//        profilePage.setDisplayName(displayName);
//        profilePage.setFirstName(firstName);
//        profilePage.setLastName(lastName);
//
//        profilePage.saveEditProfile();

        profilePage.setDataProfile(displayName,firstName,lastName,"","","","",true);

        String actualDN = profilePage.getDisplayName();
        String actualLN = profilePage.getLastName();
        String actualFN = profilePage.getFirstName();

        Assert.assertEquals(actualDN, displayName);
        Assert.assertEquals(actualLN, lastName);
        Assert.assertEquals(actualFN, firstName);

    }

    @Test(dataProvider = "TestSetPhoneProvider")
    public void testSetPhone(String login,
                             String password,
                             String mobilePhone,
                             String workPhone,
                             String homePhone){
        ProfileSettingsPage profilePage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess()
                .goToProfileSettings();

        profilePage.editProfile();
        profilePage.setMobilePhone(mobilePhone);
        profilePage.setWorkPhone(workPhone);
        profilePage.setHomePhone(homePhone);
        profilePage.saveEditProfile();

        String actualMPh = profilePage.getMobilePhone();
        String actualWPh = profilePage.getWorkPhone();
        String actualHPh = profilePage.getHomePhone();

        Assert.assertEquals(actualMPh, mobilePhone);
        Assert.assertEquals(actualWPh, workPhone);
        Assert.assertEquals(actualHPh, homePhone);

    }

    @Test(dataProvider = "TestSetAvatarProvider")
    public void setAvatar(String login,
                          String password){
        ProfileSettingsPage profilePage = new HomePage(driver, baseUrl)
                .goToHome()
                .login()
                .inputLogin(login)
                .inputPassword(password)
                .submitSuccess()
                .goToProfileSettings()
                .uploadPhoto(true);


    }

    @DataProvider(name = "TestSetAvatarProvider")
    public Object[][] TestSetAvatarProvider() {
        return new Object[][] {
                {"apukhtin1", "11"}
        };
    }

    @DataProvider(name = "TestDataEditProfileProvider")
    public Object[][] TestDataEditProfileProvider() {
        return new Object[][] {
                {"apukhtin1", "11", "Test User", "User1", "Test1"}
        };
    }

    @DataProvider(name = "TestSetPhoneProvider")
    public Object[][] TestSetPhoneProvider() {
        return new Object[][] {
                {"apukhtin1", "11", "380967561965", "380967561965", "380967561965"}
        };
    }
}
