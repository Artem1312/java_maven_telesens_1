package com.academy.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.academy.telesens.util.PropertiesProvider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidLoginTest {
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
    public void testUntitledTestCase2() throws Exception {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("apukhtin.artem@gmail.com");
        driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("159487263");
        driver.findElement(By.xpath("//form[@id='login_form']/div/p[2]")).click();
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        //Contact us | Sign out | Artem Apukhtin
        String textButtonOneExpected = "Contact us";
        String textButtonTwoExpected = "Sign out";
        String nameExpected = "Artem Apukhtin";

        String textButtonOneActual = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).getText();
        String textButtonTwoActual = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText();
        String nameActual = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();

        Assert.assertEquals(textButtonOneExpected, textButtonOneActual);
        Assert.assertEquals(textButtonTwoExpected, textButtonTwoActual);
        Assert.assertEquals(nameExpected, nameActual);

        driver.findElement(By.linkText("Sign out")).click();
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

