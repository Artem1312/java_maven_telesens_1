package com.academy.trueconf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProfileSettingsPage {

    private static Logger LOG = LoggerFactory.getLogger(com.academy.trueconf.page.AccountPage.class);

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div/button")
    private WebElement EditButton;

    @FindBy(xpath = "//*[@id=\"tc-button-102\"]/span")
    private WebElement SaveButton;

    @FindBy(xpath = "//*[@id=\"tc-button-117\"]/span")
    private WebElement CancelButton;

    @FindBy(xpath = "//*[@id=\"tc-button-77\"]/span")
    private WebElement MakePhotoButton;

    @FindBy(xpath = "//*[@id=\"tc-button-80\"]/span")
    private WebElement UploadImageButton;

    @FindBy(xpath = "//*[@id=\"tc-button-83\"]/span")
    private WebElement RemoveButton;

    @FindBy(xpath = "//*[@id=\"tc-text-field-86\"]")
    private WebElement DisplayNameFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-90\"]")
    private WebElement FirstNameFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-94\"]")
    private WebElement CompanyFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-96\"]")
    private WebElement MobilePhoneFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-98\"]")
    private WebElement WorkPhoneFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-100\"]")
    private WebElement HomePhoneFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-88\"]")
    private WebElement TrueconfIDFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-92\"]")
    private WebElement LastNameFiled;

    @FindBy(xpath = "//*[@id=\"mdc-tab-1\"]")
    private WebElement PersonalDate;

    @FindBy(xpath = "//*[@id=\"mdc-tab-2\"]")
    private WebElement EmailAndPassword;

    @FindBy(xpath = "//*[@id=\"mdc-tab-3\"]")
    private WebElement OtherSettings;

    @FindBy(xpath = "//*[@id=\"tc-button-132\"]/span")
    private WebElement DeletePhotoButton;

    @FindBy(xpath = "//*[@id=\"tc-button-130\"]/span]")
    private WebElement AbortDeletePhotoButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[3]/div/div/div/div[1]/button/span")
    private WebElement CloseWindowMakePhoto;

    @FindBy(xpath = "//*[@id=\"tc-select-179\"]/div[1]/div[1]/div/div[1]")
    private WebElement SelectCamera;

    @FindBy(xpath = "//*[@id=\"tc-button-184\"]/span")
    private WebElement MakePhotoButtonUseCamera;

    @FindBy(xpath = "//*[@id=\"tc-button-188\"]/span")
    private WebElement SaveMadePhoto;

    @FindBy(xpath = "//*[@id=\"tc-button-186\"]/span")
    private WebElement DoNotSavePhoto;

    @FindBy(xpath = "//*[@id=\"tc-button-194\"]/span")
    private WebElement UploadProfilePhotoButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[3]/div/div/div/div[1]/button")
    private WebElement CloseWindowUploadPhoto;

    @FindBy(xpath = "//*[@id=\"tc-button-197\"]/span")
    private WebElement AbortUploadPhoto;

    @FindBy(xpath = "//*[@id=\"tc-button-199\"]")
    private WebElement SaveUploadPhoto;

    @FindBy(xpath = "//*[@id=\"tc-button-61\"]/span")
    private WebElement ChangeEmail;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[3]/div/div[1]/div[2]/label")
    private WebElement Email;

    @FindBy(xpath = "//*[@id=\"tc-button-269\"]/span")
    private WebElement SaveNewEmailButton;

    @FindBy(xpath = "//*[@id=\"tc-button-61\"]/span")
    private WebElement DoNotSaveNewEmailButton;

    @FindBy(xpath = "//*[@id=\"tc-text-field-271\"]")
    private WebElement EmailFiled;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div")
    private WebElement ErrorAboutEmail;

    @FindBy(xpath = "//*[@id=\"tc-button-63\"]/span")
    private WebElement ChangePassword;

    @FindBy(xpath = "//*[@id=\"tc-button-273\"]/span")
    private WebElement SaveNewPassword;

    @FindBy(xpath = "//*[@id=\"tc-button-63\"]/span")
    private WebElement DoNotSavePassword;

    @FindBy(xpath = "//*[@id=\"tc-text-field-275\"]")
    private WebElement NewPasswordFiled;

    @FindBy(xpath = "//*[@id=\"tc-text-field-277\"]")
    private WebElement ConfirmNewPasswordFiled;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div")
    private WebElement ErrorAboutPassword;

    public ProfileSettingsPage(WebDriver driver) {
        super();
    }

    public ProfileSettingsPage editProfile(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EditButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ProfileSettingsPage saveEditProfile(){
        SaveButton.click();
        return this;
    }

    public ProfileSettingsPage abortEditProfile(){
        CancelButton.click();
        return this;
    }

    public ProfileSettingsPage deletePhoto(boolean save){
        RemoveButton.click();
        if (save == true)
            DeletePhotoButton.click();
        else
            AbortDeletePhotoButton.click();
        return this;
    }

    //дописать позже
    public ProfileSettingsPage selectCamera(String numberCamera){
        SelectCamera.click();
        //выбираем камеру
        return this;
    }

    public ProfileSettingsPage makePhoto(String numberCamera, boolean save){
        MakePhotoButton.click();
        SelectCamera.click();
        selectCamera(numberCamera);
        MakePhotoButtonUseCamera.click();
        if (save == true)
            SaveMadePhoto.click();
        else
            DoNotSavePhoto.click();
        return this;
    }

    //дописать позже
    public ProfileSettingsPage uploadPhoto(boolean save){
        UploadImageButton.click();
        UploadProfilePhotoButton.click();
        /*
        как то надо выбрать изображение
         */
        if (save == true)
            SaveUploadPhoto.click();
        else
            AbortUploadPhoto.click();
        return this;
    }

    public void setDisplayName(String displayName){
        DisplayNameFiled.click();
        DisplayNameFiled.clear();
        DisplayNameFiled.sendKeys(displayName);
    }

    public void setFirstName(String firstName){
        FirstNameFiled.click();
        FirstNameFiled.clear();
        FirstNameFiled.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        LastNameFiled.click();
        LastNameFiled.clear();
        LastNameFiled.sendKeys(lastName);
    }

    public void setCompany(String companyName){
        CompanyFiled.click();
        CompanyFiled.clear();
        CompanyFiled.sendKeys(companyName);
    }

    public void setMobilePhone(String mobilePhone){
        MobilePhoneFiled.click();
        MobilePhoneFiled.clear();
        MobilePhoneFiled.sendKeys(mobilePhone);
    }

    public void setWorkPhone(String workPhone){
        WorkPhoneFiled.click();
        WorkPhoneFiled.clear();
        WorkPhoneFiled.sendKeys(workPhone);
    }

    public void setHomePhone(String homePhone){
        HomePhoneFiled.click();
        HomePhoneFiled.clear();
        HomePhoneFiled.sendKeys(homePhone);
    }

    public ProfileSettingsPage setDataProfile(String displayName,
                                              String firstName,
                                              String lastName,
                                              String companyName,
                                              String mobilePhone,
                                              String workPhone,
                                              String homePhone,
                                              boolean save){
        editProfile();

        setDisplayName(displayName);
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(companyName);
        setMobilePhone(mobilePhone);
        setWorkPhone(workPhone);
        setHomePhone(homePhone);

        if (save == true)
            saveEditProfile();
        else
            abortEditProfile();
        return this;
    }

    public String getDisplayName(){
        return DisplayNameFiled.getText();
    }

    public String getFirstName(){
        return FirstNameFiled.getText();
    }

    public String getLastName(){
        return LastNameFiled.getText();
    }

    public String getCompanyName(){
        return CompanyFiled.getText();
    }

    public String getMobilePhone(){
        return MobilePhoneFiled.getText();
    }

    public String getWorkPhone(){
        return WorkPhoneFiled.getText();
    }

    public String getHomePhone(){
        return HomePhoneFiled.getText();
    }

    public String getTrueConfID(){
        return TrueconfIDFiled.getText();
    }

    public String getEmail(){
        EmailAndPassword.click();
        return Email.getText();//вернуть почту через регулярку надо отрезать "Email address: "
    }

    public ProfileSettingsPage setEmail(String email, boolean save){
        EmailAndPassword.click();
        ChangeEmail.click();
        EmailFiled.click();
        EmailFiled.clear();
        EmailFiled.sendKeys(email);
        if (save == true)
            SaveNewEmailButton.click();
        else
            DoNotSaveNewEmailButton.click();
        return this;
    }

    public ProfileSettingsPage setPassword(String password, String confirmPassword, boolean save){
        EmailAndPassword.click();
        ChangePassword.click();
        NewPasswordFiled.click();
        NewPasswordFiled.clear();
        NewPasswordFiled.sendKeys(password);
        ConfirmNewPasswordFiled.click();
        ConfirmNewPasswordFiled.clear();
        ConfirmNewPasswordFiled.sendKeys(confirmPassword);
        if (save == true)
            SaveNewPassword.click();
        else
            DoNotSavePassword.click();
        return this;
    }
}
