package com.academy.trueconf.page;

import com.academy.trueconf.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AccountPage extends BasePage {
    private static Logger LOG = LoggerFactory.getLogger(com.academy.trueconf.page.AccountPage.class);

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/section/div/div/div[1]/div[1]/div/div[2]/div[1]")
    private WebElement UserName;

    @FindBy(xpath = "//*[@id=\"tc-menu-54\"]/ul/li[2]")
    private WebElement logout;

   @FindBy(xpath = "//*[@id=\"tc-menu-54\"]/ul/li[1]")
    private WebElement profileSettingsButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/header/div/div[3]/div/div[1]")
    //@FindBy(name = "keyboard_arrow_down")
    private WebElement showMenu;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/section/div[1]/div/div[1]/div[1]/div/div[2]/div[2]")
    private WebElement idUser;

    @FindBy(xpath = "//*[@id=\"tc-button-196\"]/span")
    private WebElement features;

    //@FindBy(id = "tc-button-34")
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/section/div/div/div[1]/div[2]/div[2]/button/span")
    private WebElement profileSettings;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/section/aside/div/div/div[2]")
    private WebElement yourAccountPermissions;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[1]/ul/li[1]/a/div/div")
    private WebElement goHomeUserAria;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[1]/ul/li[2]/a/div/div[2]/ul/li[1]/a/span")
    private WebElement meetings;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[1]/ul/li[2]/a/div/div[2]/ul/li[2]/a/span")
    private WebElement virtualRoom;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[1]/ul/li[2]/a/div/div[2]/ul/li[3]/a/span")
    private WebElement template;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[1]/ul/li[3]/a/div/div/span")
    private WebElement contacts;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[2]/ul/li[1]/a")
    private WebElement downloadAppLinkPage;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[2]/ul/li[2]/a")
    private WebElement userManualLink;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/aside/div/div[2]/ul/li[3]/a")
    private WebElement goToGuestPageLink;

    @FindBy(xpath = "//*[@id=\"tc-button-231\"]/span")
    private WebElement newConference;

    @FindBy(xpath = "//*[@id=\"tc-button-236\"]/span")
    private WebElement newRoom;

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
        //logout.submit();
        Actions actions = new Actions(driver);
        actions.click(logout);
        return new HomePage(driver);
    }

    public String getUserId(){
        return idUser.getText();
    }

//    public String getUserPermissions(){
//        String[] rights = new String[5];
//
//        return rights;
//    }

//    public AccountPage showFeatures(){
//        return this;
//    }

    public ProfileSettingsPage goToProfileSettings(){
        Actions actions = new Actions(driver);
        actions.click(profileSettings);
        profileSettings.click();
        return new ProfileSettingsPage(driver);
    }

    public ProfileSettingsPage goToProfileSettingsByMenu(){
        profileSettingsButton.click();
        return new ProfileSettingsPage(driver);
    }

    public AccountPage showConferences(){
        meetings.click();
        return this;
    }

    public AccountPage showRooms(){
        virtualRoom.click();
        return this;
    }

    public AccountPage showTemplates(){
        template.click();
        return this;
    }

    public AccountPage showContacts(){
        contacts.click();
        return this;
    }

    public ClientsPage goToDownloadAppPage(){
        downloadAppLinkPage.click();
        return new ClientsPage(driver);
    }

    public ManualPage goToUserManualPage(){
        goHomeUserAria.click();
        return new ManualPage(driver);
    }

    public HomePage goToGuestPage(){
        goToGuestPageLink.click();
        return new HomePage(driver);
    }

    public AccountPage goToHomeUserAria(){
        goHomeUserAria.click();
        return this;
    }
}
