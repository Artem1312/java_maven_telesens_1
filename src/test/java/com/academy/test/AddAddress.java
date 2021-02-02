package com.academy.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddAddress extends BaseTest{
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test
    public void addAddressTest() throws Exception {
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
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"address1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("kharkiv ");

        driver.findElement(By.xpath("//*[@id=\"address2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"address2\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("borzenko");

        driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"city\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"city\"]]")).sendKeys("kharkiv");

        driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("00050");

        driver.findElement(By.xpath("//*[@id=\"id_country\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"id_country\"]/option")).click();

        driver.findElement(By.xpath("//*[@id=\"phone\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("+380967561965");

        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("+380991815444");

        driver.findElement(By.xpath("//*[@id=\"other\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"other\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("test test test");

        driver.findElement(By.xpath("//*[@id=\"alias\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("testtesttest");

        driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span")).click();



    }
}
