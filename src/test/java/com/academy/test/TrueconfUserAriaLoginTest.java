package com.academy.test;

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

public class TrueconfUserAriaLoginTest {
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
    public void testUserLoginInPersonalAria(){
        driver.get("https://qa3.trueconf.net");
        driver.findElement(By.xpath("//*[@id=\"main-header__buttons-login\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-trueconfId\"]")).sendKeys("apukhtin3");

        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"authorization__input-password\"]")).sendKeys("11");

        driver.findElement(By.xpath("//*[@id=\"authorization__button-sing-in\"]/span")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expEmail = "Artem {[{{/*-+!@#$%^&*()_+}}]}";
        String actualEmail = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/section/div/div/div[1]/div[1]/div/div[2]/div[1]")).getText();
        Assert.assertEquals(actualEmail, expEmail);
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
