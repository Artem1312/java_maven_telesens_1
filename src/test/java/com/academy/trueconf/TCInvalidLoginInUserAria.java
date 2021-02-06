package com.academy.trueconf;

import com.academy.telesens.util.PropertiesProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TCInvalidLoginInUserAria {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", PropertiesProvider.get("driver.chrome"));
        //System.setProperty("webdriver.gecko.driver", PropertiesProvider.get("driver.firefox"));
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void invalidLoginInUserAria1(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("apukhtin3");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("1111");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Неверный логин или пароль.";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test
    public void invalidLoginInUserAria2(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("apukhtin13");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("11");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Неверный логин или пароль.";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test
    public void invalidLoginInUserAria3(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("apukhtin13");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("1133");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Неверный логин или пароль.";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test
    public void invalidLoginInUserAria4(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("11");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Пожалуйста, заполните это поле";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test
    public void invalidLoginInUserAria5(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("apukhtin1");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Пожалуйста, заполните это поле";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Test
    public void invalidLoginInUserAria6(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();

        String textActualMsg ="/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/p";
        while ((driver.findElement(By.xpath(textActualMsg)).getText())==""){
            driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
        }
        String expectedMsg = "Пожалуйста, заполните это поле";
        String actualMsg = driver.findElement(By.xpath(textActualMsg)).getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
