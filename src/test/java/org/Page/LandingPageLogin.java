package org.Page;

import org.Utils.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LandingPageLogin extends BasePage {

    @FindBy(xpath = "//a[@class=\"account\"]")
    WebElement userEmail;
    @FindBy(xpath = "//h2[@class=\"topic-html-content-header\"]")
    WebElement welcomeMessage;
    @FindBy(className = "header-links")
    List<WebElement> HeaderLinks;

    public LandingPageLogin(WebDriver driver) {
        super(driver);
    }

    public String userEmailId() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(userEmail));
            return userEmail.getText();
        } catch (NoSuchElementException e) {
            System.out.println("Element Not found " + e.getMessage());
            return " ";
        }
    }

    public String getWelcomeMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
            return welcomeMessage.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Not found!!!";
        }
    }

    public void headerlinks() {
        for (WebElement h : HeaderLinks) {
            System.out.println(h.getText());
        }
    }
}
