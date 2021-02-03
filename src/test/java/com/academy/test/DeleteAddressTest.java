package com.academy.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAddressTest extends BaseTest {
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test
    public void deleteAddressTest() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("apukhtin.artem@gmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("1594872633");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]/span")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String msg ="No addresses are available.";

        String actualMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/text()")).getText();
        Assert.assertEquals(actualMsg, msg);

    }
}
