package org.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public ExplicitWaits(WebDriver driver) {
        this.driver = driver;
    }

    // Method to wait for an element to be clickable and then click it
    public void waitToClick(WebElement element, Duration timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            System.out.println("Successfully clicked on the element.");
        } catch (Exception e) {
            System.err.println("Failed to click on the element: " + e.getMessage());
        }
    }
}
