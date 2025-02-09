package org.Page;


import org.Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage {

    //Locators
    @FindBy(className = "page-title")
    WebElement title;
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(id = "ConfirmPassword")
    WebElement confPassword;
    @FindBy(id = "register-button")
    WebElement RegisterCTA;
    @FindBy(xpath = "//label[@for=\"FirstName\"]")
    WebElement firstNameLabel;
    @FindBy(xpath = "//label[@for=\"LastName\"]")
    WebElement lastNameLabel;
    /**
     * @param driver this driver will come from the test class when the pages are initialized
     */
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    //Methods

    /**
     * this method will return Current URL
     *
     * @return current URL
     */
    public String getURL() {
        return driver.getCurrentUrl();
    }

    public String pageTitle() {
        return title.getText();
    }


    public void selectMale() {
        clickElement(genderMale);
    }

    public void selectFemale() {
        clickElement(genderFemale);
    }


    public void enterFirstName(String name) {
        enterValue(firstName, name);
    }


    public void enterLastName(String lname) {
        enterValue(lastName, lname);
    }


    public void enterEmail(String cemail) {
        enterValue(email, cemail);
    }


    public void setPassword(String pass) {
        enterValue(password, pass);
    }


    public void setConfirmPassword(String pass) {
        enterValue(confPassword, pass);
    }


    public void clickOnRegister() {
        clickElement(RegisterCTA);
    }


    public String getLabel(WebElement element) {
        return element.getText();
    }


}
