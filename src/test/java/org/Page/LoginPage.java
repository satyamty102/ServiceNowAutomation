package org.Page;

import org.Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//div[@class=\"page-title\"]//h1")
    private WebElement pageTitle;
    @FindBy(className = "email")
    private WebElement emailTextBox;
    @FindBy(className = "password")
    private WebElement passwordTextBox;
    @FindBy(id = "RememberMe")
    private WebElement remCheckbox;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement loginCTA;
    @FindBy(linkText = "Forgot password?")
    private WebElement forgotPass;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * This method will get the title text of the page
     *
     * @return title
     */
    public String getPageTitle() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement titleElement = wait.until(ExpectedConditions.visibilityOf(pageTitle));
            return titleElement.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * This method will enter username
     *
     * @param uname
     */
    public void enterUserName(String uname) {
        try {
            enterValue(emailTextBox, uname);
        } catch (Exception e) {
            System.out.println("Failed to enter username" + e.getMessage());
        }

    }

    /**
     * This method will enter password
     *
     * @param password
     */
    public void enterPassword(String password) {
        try {
            enterValue(passwordTextBox, password);
        } catch (Exception e) {
            System.out.println("Failed to enter Password: " + e.getMessage());
        }
    }

    /**
     * This method will check the Remember Me Checkbox
     */
    public void selectCheckBox() {
        if (!remCheckbox.isSelected()) {
            clickElement(remCheckbox);
        }
    }

    /**
     * This method will click on login
     */
    public void clickOnLogin() {
        clickElement(loginCTA);
    }

    /**
     * This method will click on Forgot Password
     */
    public void clickOnForgotPassword() {
        clickElement(forgotPass);
    }
}
