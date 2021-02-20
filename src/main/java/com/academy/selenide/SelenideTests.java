package com.academy.selenide;

import com.academy.selenide.page.HomePage;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTests {
    private String baseUrl = "http://localhost:8081";

    @BeforeClass
    public void beforeClass() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10;
        Configuration.startMaximized = true;
    }

    @Test
    public void testAddSubscriber() {
        HomePage homePage = open(baseUrl, HomePage.class);
        homePage.goToSubscriber();
        $(By.id("add")).click();
        $(By.id("fname")).setValue("test2");
        $(By.id("lname")).setValue("test2");
        $(By.id("FEMALE")).click();
        $(By.id("age")).setValue("24");
        $("body > div > form > button").click();
    }

    @AfterClass
    public void afterClass() {
        closeWindow();
    }
}