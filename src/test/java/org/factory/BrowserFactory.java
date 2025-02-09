package org.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BrowserFactory {

    /**
     * @param browserName
     * @param appURL
     * @param driver
     * @return WebDriver
     */
    public static WebDriver startApp(String browserName, String appURL, WebDriver driver) {
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        else if (browserName.equalsIgnoreCase("EDGE")) {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("We do not support this browser");
        }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get(appURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    /**
     * Quits the browser and cleans up resources.
     *
     * @param driver The WebDriver instance.
     */
    public static void quitBrowser(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }

    }

}
