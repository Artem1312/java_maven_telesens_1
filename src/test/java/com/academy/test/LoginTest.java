package com.academy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class LoginTest extends BaseTest {

    private String baseUrl = "http://automationpractice.com/index.php";

    @Test(dataProvider = "authDataProvider")
    public void testFeature1(String userName, String password, String errExpected) throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();


        String eerMsgActual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(errExpected, eerMsgActual);
    }

    @DataProvider(name ="authDataProvider")
    public Object[][] authDataProvider(){
        Object[] case1 ={"apukhtin.artem@gmail.com","111111","Authentication failed."};
        Object[] case2 ={"apukhtin.artem@gmail.com","","Password is required."};

        List<Object[]> cases = new ArrayList<>();
        cases.add(case1);
        cases.add(case2);

        // 1 способ создание массива из списка
        Object[][] tmp = new Object[0][0];
        Object[][] result = cases.toArray(tmp);

        return result;

//        return new Object[][]{
//            case1, case2
//        };
    }
}

