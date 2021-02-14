package com.academy.trueconf.page;

import com.academy.trueconf.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    private static Logger LOG = LoggerFactory.getLogger(com.academy.trueconf.page.HomePage.class);
    private String baseUrl;

    //UA6UT-YWBC-6JTR-L3PE


    @FindBy (xpath = "//*[@id=\"main-header__buttons-login\"]/span")
    private WebElement SignIn;

    @FindBy(xpath = "//*[@id=\"tc-text-field-35\"]")
    private WebElement loginFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-37\"]")
    private WebElement passwordFiled;

    @FindBy(xpath = "//*[@id=\"tc-button-40\"]/span")
    private WebElement SignInButton;

    @FindBy(xpath = "//*[@id=\"main-header__buttons-home\"]/i")
    private WebElement HomePageLink;

    @FindBy(xpath = "//*[@id=\"main-header__buttons-clients\"]/p")
    private WebElement DownloadClientsLink;

    @FindBy(xpath = "//*[@id=\"language-selector-button\"]/span")
    private WebElement SelectLanguage;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[1]/button/span[2]")
    private WebElement DownloadClientsButton;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/button/span[2]")
    private WebElement ShowAdminsContacts;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[3]/button/span")
    private WebElement OpenManualPageLink;

    @FindBy(xpath = "//*[@id=\"main-header__buttons-equipment\"]/p")
    private WebElement RecommendedEquipmentPageLink;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div[3]/div[1]/button/span[2]")
    private WebElement ScheduleConfPage;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/button/span[2]")
    private WebElement ConnectToTheConference;

    @FindBy(xpath = "/html/body/div/div[1]/div[3]/div/div[1]/p[2]/text()[2]")
    private WebElement versionServer;

    @FindBy(xpath = "//*[@id=\"connect-to-conference__input-cid\"]")
    private WebElement filedConfID;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/button/span")
    private WebElement ConnectToConferenceButton;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i/svg")
    private WebElement CloseConnectToCOnfWindow;

    public HomePage(WebDriver driver, String baseUrl){
        super(driver);
        this.baseUrl = baseUrl;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHome() {
        LOG.debug("HomePage. goToHome {}", baseUrl);
        driver.get(baseUrl);
        return this;
    }

    public HomePage login() {
        SignIn.click();
        return this;
    }

    public HomePage inputLogin(String login){
        loginFiled.click();
        loginFiled.clear();
        loginFiled.sendKeys(login);
        return this;
    }

    public HomePage inputPassword(String password){
        passwordFiled.click();
        passwordFiled.clear();
        passwordFiled.sendKeys(password);
        return this;
    }

    public AccountPage submitSuccess(){
        SignInButton.click();
        return new AccountPage(driver);
    }

    public HomePage submitFail(){
        SignInButton.click();
        return this;
    }

    public ClientsPage goToClientsPageByLink(){
        DownloadClientsLink.click();
        return new ClientsPage(driver);
    }

    public ClientsPage goToClientsPageByButton(){
        DownloadClientsButton.click();
        return new ClientsPage(driver);
    }

    public EquipmentPage goToEquipmentPage(){
        RecommendedEquipmentPageLink.click();
        return new EquipmentPage(driver);
    }

    public GuidesPage goToGuidesPage(){
        OpenManualPageLink.click();
        return new GuidesPage(driver);
    }

    public ConferencePage goToConferencePage(String confID){
        ConnectToTheConference.click();
        filedConfID.sendKeys(confID);
        ConnectToConferenceButton.click();
        return new ConferencePage(driver);
    }


}
