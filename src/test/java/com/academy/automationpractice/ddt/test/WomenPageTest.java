package com.academy.automationpractice.ddt.test;

import com.academy.automationpractice.ddt.core.BaseTest;
import com.academy.automationpractice.ddt.page.HomePage;
import com.academy.automationpractice.ddt.page.WomenPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(AutomationPracticeTest.class);
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test(dataProvider = "titleWomenPageProvider")
    public void checkTitlePageTest(String expectedTitle) throws Exception {
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualTitle = womenPage.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "pointNavigatorProvider")
    public void checkPointNavigatorTest(String expectedPoint){
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();
        //womenPage.getNavigatorName();

        String actualPoint = womenPage.getNavigatorName();
        Assert.assertEquals(actualPoint, expectedPoint);
    }

    @Test(dataProvider = "titleBlockProvider")
    public void checkTitleBlockTest(String expectedTitleBlock) {
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();

        String actualTitleBlock = womenPage.getTitleBlockName();
        Assert.assertEquals(actualTitleBlock, expectedTitleBlock);
    }

    @Test(dataProvider = "CategoryProvider")
    public void checkCategoryTest(String expectedCategoryName, String expectedFirstLineFromCategoryName) {
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();

        String actualCategoryName = womenPage.getCategoryName();
        Assert.assertEquals(actualCategoryName, expectedCategoryName);

        String actualFirstLineFromCategoryName = womenPage.getFirstLineFromCategoryName();
        Assert.assertEquals(actualFirstLineFromCategoryName, expectedFirstLineFromCategoryName);
    }

    @Test(dataProvider = "headingCounterProvider")
    public void checkHeadingCounterTest(String expectedHeadingCounter) {
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();

        String actualHeadingCounter = womenPage.getHeadingCounter();
        Assert.assertEquals(actualHeadingCounter, expectedHeadingCounter);
    }

    @Test(dataProvider = "nameOfCategoryElementProvider")
    public void checkFooterTest(String expectedNameOfCategoryElement) {
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        WomenPage womenPage = homePage.goToCategoryWomen();

        String actualNameOfCategoryElement = womenPage.getNameOfCategoryElement();
        Assert.assertEquals(actualNameOfCategoryElement, expectedNameOfCategoryElement);
    }

    @DataProvider(name = "titleWomenPageProvider")
    public Object[][] titleWomenPageProvider() {
        return new Object[][]{
                {"Women - My Store"}
        };
    }

    @DataProvider(name = "pointNavigatorProvider")
    public Object[][] pointNavigatorProvider() {
        return new Object[][]{
                {"Women"}
        };
    }

    @DataProvider(name = "titleBlockProvider")
    public Object[][] titleBlockProvider() {
        return new Object[][]{
                {"WOMEN"}
        };
    }

    @DataProvider(name = "CategoryProvider")
    public Object[][] CategoryProvider() {
        return new Object[][]{
                {"Women", "You will find here all woman fashion collections."}
        };
    }

    @DataProvider(name = "headingCounterProvider")
    public Object[][] headingCounterProvider() {
        return new Object[][]{
                {"There are 7 products."}
        };
    }

    @DataProvider(name = "nameOfCategoryElementProvider")
    public Object[][] nameOfCategoryElementProvider() {
        return new Object[][]{
                {"Women"}
        };
    }
}
