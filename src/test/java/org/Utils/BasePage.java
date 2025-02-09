package org.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    /**
     * Added constructor to initialize driver
     * Adding common methods for click, enter text
     */
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element) {
        try {
            ExplicitWaits waits = new ExplicitWaits(driver);
            waits.waitToClick(element, Duration.ofSeconds(10));
        } catch (Exception e) {
            System.out.println("Unable to click on element: " + e.getMessage());
        }
    }

    public void enterValue(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println("Unable to enter text: " + e.getMessage());
        }
    }

    public void enterValue(WebElement element, int num) {
        try {
            element.sendKeys(String.valueOf(num));
        } catch (Exception e) {
            System.out.println("Unable to enter text: " + e.getMessage());
        }
    }
}
