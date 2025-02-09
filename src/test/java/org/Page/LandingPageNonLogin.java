package org.Page;

import org.Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LandingPageNonLogin extends BasePage {

    @FindBy(className = "item-box")
    List<WebElement> productList;
    private WebDriverWait wait; // Declare WebDriverWait
    @FindBy(linkText = "Register")
    private WebElement registerButton; // Changed variable name to registerButton for clarity
    @FindBy(linkText = "Log in")
    private WebElement loginButton;
    /**
     * @param driver this driver will come from the test class when the pages are initialized
     */
    public LandingPageNonLogin(WebDriver driver) {
        super(driver);
    }

    /**
     * This method will click on the Sign-Up button
     */
    public void clickOnRegister() {
        clickElement(registerButton);
    }

    /**
     * This method will click on the Login button
     */
    public void clickOnLoginCTA() {
        clickElement(loginButton);
    }

    public void getProductList() {
        for (WebElement products : productList) {
            System.out.println(products.getText());
        }
    }
}
