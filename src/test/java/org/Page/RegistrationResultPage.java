package org.Page;

import org.Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationResultPage extends BasePage {


    @FindBy(className = "Result")
    WebElement resultMessage;
    @FindBy(className = "validation-summary-errors")
    WebElement failedRegistrationMessage;

    public RegistrationResultPage(WebDriver driver) {
        super(driver);
    }

    public String confirmationMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(resultMessage));

            return resultMessage.getText();
        } catch (Exception e) {
            System.out.print("Page is not loaded or element not found: " + e.getMessage());
            return null; // Return null or handle it as needed
        }
    }

    public String failedRegistration() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(failedRegistrationMessage));
            return failedRegistrationMessage.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }

}
