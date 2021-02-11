package com.academy.automationpractice.test;

import com.academy.telesens.util.PropertiesProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.ErrorManager;

public class DetailWebDriverEventListener extends AbstractWebDriverEventListener {
    private static Logger LOG = LoggerFactory.getLogger(DetailWebDriverEventListener.class);

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        LOG.error("Error. Deteils: {}",throwable.getMessage());
        makeScreenshot(driver);
        super.onException(throwable, driver);
    }

    public void makeScreenshot(WebDriver driver) {
        String screenshotDir = PropertiesProvider.get("screenshot.dir");
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenName = "screen_" + System.currentTimeMillis()+".png";
        String screenPath =  screenshotDir + "/" + screenName;
        try {
            Files.copy(new FileInputStream(tmp), Path.of(screenPath));
        } catch (IOException exc) {
            LOG.error("Error copying screenshot from '{}' to '{}'. Details: {}",
                    tmp, screenPath, exc);
        }
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        LOG.info("go to url {}", url);
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("try find element  by '{}'", by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        String tagName = "";

        if (element != null)
            tagName = element.getTagName();

        LOG.debug("Found element <{}>  by '{}'", tagName, by);
    }
}
