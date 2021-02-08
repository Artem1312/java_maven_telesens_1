package com.academy.automationpractice.test;

import com.academy.automationpractice.page.CategoryPage;
import com.academy.automationpractice.page.DressesPage;
import com.academy.automationpractice.page.HomePage;
import com.academy.automationpractice.page.WomenPage;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.sql.rowset.CachedRowSet;

public class DressesPageTest extends BaseTest{
    private static Logger LOG = LoggerFactory.getLogger(AutomationPracticeTest.class);
    private String baseUrl = "http://automationpractice.com/index.php";

    @Test(dataProvider = "PrintedDressPositionProvider")
    public void openDressesPageTest(String expectedName){
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        DressesPage dressesPage = homePage.goToCategoryDresses();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dressesPage.setSize("s");
        //dressesPage.setCategory("casual");
        dressesPage.setComposition("cotton");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualName = dressesPage.getNamePosition();
        Assert.assertEquals(actualName, expectedName);
    }
    /*
		- Перейти на карточку товара, кликнув по картинке
		- Проверить, что Size имеет значение S, а 'Composition' имеет значение'Cotton'
     */

    @Test(dataProvider = "expectedValueOnPageProvider")
    public void checkPageOfProduct(String expectedSize, String expectedComposition){
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        DressesPage dressesPage = homePage.goToCategoryDresses();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dressesPage.setSize("s");
        dressesPage.setCategory("casual");
        dressesPage.setComposition("cotton");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CategoryPage categoryPage =  dressesPage.goToPageProduct();
        String actualSize = categoryPage.getSize();
        String actualComposition = categoryPage.getComposition();

        Assert.assertEquals(actualSize, expectedSize);
        Assert.assertEquals(actualComposition, expectedComposition);

    }

    @Test(dataProvider = "testValuePrizeProvider")
    public void Test(double minTestPrize, double maxTestPrize, double minTestPrizeExpected, double maxTestPrizeExpected){
        HomePage homePage = new HomePage(driver, baseUrl);
        homePage = homePage.goToHome();
        DressesPage dressesPage = homePage.goToCategoryDresses();
        dressesPage.setMinPrize(minTestPrize);
        dressesPage.setMaxPrize(maxTestPrize);
        //dressesPage.getListPrize();
        /*

		- Выполнить проверку: 1) все позиции имеют цену заданного диапазона (напр. 30.00 до 40.00)
		(точные значения границ цен не важны)
         */
    }

    @DataProvider(name = "PrintedDressPositionProvider")
    public Object[][] PrintedDressPositionProvider() {
        return new Object[][]{
                {"Printed Dress"}
        };
    }

    @DataProvider(name = "expectedValueOnPageProvider")
    public Object[][] expectedValueOnPageProvider() {
        return new Object[][]{
                {"S", "Cotton"}
        };
    }

    @DataProvider(name = "testValuePrizeProvider")
    public Object[][] testValuePrizeProvider() {
        return new Object[][]{
                {30.00, 40.00, 30.00, 40.00}
        };
    }


}
