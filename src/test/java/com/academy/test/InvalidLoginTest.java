package com.academy.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.academy.telesens.util.PropertiesProvider;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InvalidLoginTest {
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
    public void testUntitledTestCase4() throws Exception {

        //String email1,email2,email3,passw1,passw2,passw3,answer1,answer2,answer3 = null;

        File file = new File(PropertiesProvider.get("automation.auth.invalid.data.csv"));
        Reader in = new FileReader(file);

        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file));) {
            String[]values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < records.size(); i++) {
            System.out.println(records.get(i).get(0).split(";")[0]);

            String email = records.get(i).get(0).split(";")[0];
            String passw = records.get(i).get(0).split(";")[1];
            String answer = records.get(i).get(0).split(";")[2];

            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("passwd")).click();
            driver.findElement(By.id("passwd")).clear();
            driver.findElement(By.id("passwd")).sendKeys(passw);
            driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

            String eerMsgExpected1 = answer;
            String eerMsgActual1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
            Assert.assertEquals(eerMsgExpected1, eerMsgActual1);
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("passwd")).click();
            driver.findElement(By.id("passwd")).clear();
            driver.wait(3000);
        }
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
