package com.academy.other;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.academy.telesens.util.PropertyProvider;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class InvalidLoginTest {
    private WebDriver driver;
    private String baseUrl;
    private String baseTestUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    List<List<String>> records;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", PropertyProvider.get("driver.chrome"));
        //System.setProperty("webdriver.gecko.driver", PropertiesProvider.get("driver.firefox"));
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        File file = new File(PropertyProvider.get("automation.auth.invalid.data.csv"));
        Reader in = new FileReader(file);

        baseTestUrl = PropertyProvider.get("BaseAutomationPracticeUrl");

        records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file));) {
            String[]values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUntitledTestCase1() throws Exception {

        // test 1
        String email = records.get(0).get(0).split(";")[0];
        String passw = records.get(0).get(0).split(";")[1];
        String answer = records.get(0).get(0).split(";")[2];

        driver.get(baseTestUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(passw);
        driver.findElement(By.xpath("//form[@id='login_form']/div/p[2]")).click();
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        String eerMsgExpected1 = answer;
        String eerMsgActual1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(eerMsgExpected1, eerMsgActual1);
    }

    @Test
    public void testUntitledTestCase2() throws Exception {

        //test2
        String email = records.get(1).get(0).split(";")[0];
        String passw = records.get(1).get(0).split(";")[1];
        String answer = records.get(1).get(0).split(";")[2];

        driver.get(baseTestUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(passw);
        driver.findElement(By.xpath("//form[@id='login_form']/div/p[2]")).click();
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        String eerMsgExpected2 = answer;
        String eerMsgActual2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(eerMsgExpected2, eerMsgActual2);

    }

    @Test
    public void testUntitledTestCase3() throws Exception {

        //test3
        String email = records.get(2).get(0).split(";")[0];
        String passw = records.get(2).get(0).split(";")[1];
        String answer = records.get(2).get(0).split(";")[2];

        driver.get(baseTestUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(passw);
        driver.findElement(By.xpath("//form[@id='login_form']/div/p[2]")).click();
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        String eerMsgExpected3 = answer;
        String eerMsgActual3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(eerMsgExpected3, eerMsgActual3);
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
