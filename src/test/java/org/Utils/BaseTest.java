package org.Utils;

import io.restassured.RestAssured;
import org.factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})  // Get values from TestNG XML
    public void openURL(String browser, String url) {
        driver = BrowserFactory.startApp(browser, url, driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @AfterClass
    public void closeBrowser() {
        BrowserFactory.quitBrowser(driver);
    }
}
