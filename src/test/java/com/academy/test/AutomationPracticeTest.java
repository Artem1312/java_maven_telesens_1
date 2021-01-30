package com.academy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.academy.telesens.util.PropertiesProvider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) throws Exception {
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", PropertiesProvider.get("driver.chrome"));
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", PropertiesProvider.get("driver.firefox"));
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException(String.format("Browser %s not supported", browser ));
        }

        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "authDataProvider")
    public void testUntitledTestCase(String userName, String password, String errExpected) throws Exception {
        driver.get("http://automationpractice.com/index.php");
        //driver.findElement(By.linkText("Sign in")).click();
        WebElement elSignIn = driver.findElement(By.linkText("Sign in"));
        elSignIn.click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        String eerMsgExpected = errExpected;
        String eerMsgActual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(eerMsgExpected, eerMsgActual);
    }

    @Test
    public void testWomenCategory(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Women")).click();

        String expectedTitleBlockName = "WOMEN";
        String actualTitleBlockName = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/h2")).getText();
        Assert.assertEquals(expectedTitleBlockName, actualTitleBlockName);

        String expectedCategoryName = "Women";
        String actualCategoryName = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/span")).getText();
        Assert.assertEquals(expectedCategoryName, actualCategoryName);

        String expectedClassName = "WOMEN ";
        String actualClassName = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
        Assert.assertEquals(expectedClassName, actualClassName);

        String expectedProductCount = "Showing 1 - 7 of 7 items";
        String actualProductCount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[4]/div/div[2]")).getText();
        Assert.assertEquals(expectedProductCount, actualProductCount);
    }

    @Test
    public void testMove(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Women")).click();
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]"));
        Actions webelement = new Actions(driver);
        webelement.clickAndHold(slider).moveByOffset(50,0);

//        do{
//
//        } while();


        String expSum = "$16.00 - $53.00";
        String actSun = driver.findElement(By.xpath("//*[@id=\"layered_price_range\"]")).getText();
        Assert.assertEquals(expSum, actSun);

    }

    @DataProvider(name ="authDataProvider")
    public Object[][] authDataProvider(){
        Object[] case1 ={"apukhtin.artem@gmail.com","111111","Authentication failed."};
        Object[] case2 ={"apukhtin.artem@gmail.com","","Password is required."};

        List<Object[]> cases = new ArrayList<>();
        cases.add(case1);
        cases.add(case2);

        // 1 способ создание массива из списка
//        Object[][] tmp = new Object[0][0];
//        Object[][] result = cases.toArray(tmp);

        // 2 способ создание массива из списка
        Object[][] result = cases.toArray(Object[][]::new);
        return result;

//        return new Object[][]{
//            case1, case2
//        };
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        if (driver != null)
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
    }
}
