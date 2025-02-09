package org.Page;

import org.Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForm extends BasePage {


    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    private WebElement FirstNameTextBox;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@id=\"userEmail\"]")
    private WebElement emailTextBox;
    @FindBy(xpath = "//input[@value=\"Male\"]")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//input[@value=\"Female\"]")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "//input[@value=\"Other\"]")
    private WebElement otherRadioButton;
    @FindBy(xpath = "//input[@placeholder=\"Mobile Number\"]")
    private WebElement mobileTextBox;
    @FindBy(xpath = "//input[@id=\"dateOfBirthInput\"]")
    private WebElement dobTextBox;
    @FindBy(xpath = "//input[@id=\"subjectsInput\"]")
    private WebElement subjectTextBox;
    @FindBy(xpath = "//input[@id=\"hobbies-checkbox-1\"]")
    private WebElement sportsCheckbox;
    @FindBy(xpath = "//input[@id=\"hobbies-checkbox-2\"]")
    private WebElement readingCheckbox;
    @FindBy(xpath = "//input[@id=\"hobbies-checkbox-3\"]")
    private WebElement musicCheckbox;
    //Uploading picture
    @FindBy(xpath = "//input[@id=\"uploadPicture\"]")
    private WebElement uploadPicture;
    @FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressTextBox;

    public PracticeForm(WebDriver driver) {
        super(driver);
    }

    //methods

    /**
     * @param firstName
     */
    public void enterFirstName(String firstName) {
        try {
            enterValue(FirstNameTextBox, firstName);
        } catch (Exception e) {
            System.out.println("Failed to enter firstname" + e.getMessage());
        }
    }


    /**
     * @param lastName
     */
    public void enterLastName(String lastName) {
        try {
            enterValue(lastNameTextBox, lastName);
        } catch (Exception e) {
            System.out.println("Failed to enter lastname" + e.getMessage());
        }
    }

    /**
     * @param email
     */
    public void enterEmail(String email) {
        try {
            enterValue(emailTextBox, email);
        } catch (Exception e) {
            System.out.println("Failed to enter email" + e.getMessage());
        }
    }

    /**
     * @param gender
     */
    public void selectGender(String gender) {
        try {
            if (gender.equalsIgnoreCase("male")) {
                maleRadioButton.click();
            } else if (gender.equalsIgnoreCase("female")) {
                femaleRadioButton.click();
            } else {
                otherRadioButton.click();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param number
     */
    public void enterMobNumber(String number) {
        try {
            enterValue(mobileTextBox, number);
        } catch (Exception e) {
            System.out.print("Unable to enter mobile number" + e.getMessage());
        }
    }

    /**
     * @param DOB
     */
    public void enterDOB(String DOB) {
        try {
            dobTextBox.clear();
            enterValue(dobTextBox, DOB);
        } catch (Exception e) {
            System.out.println("Unable to enter DOB" + e.getMessage());
        }
    }

    /**
     * @param subject
     */
    public void enterSubject(String subject) {
        try {
            enterValue(subjectTextBox, subject);
        } catch (Exception e) {
            System.out.print("Unable to enter Subject" + e.getMessage());
        }
    }

    /**
     * @param hobby
     */
    public void selectHobby(String hobby) {
        try {
            if (hobby.equals("Sports")) {
                clickElement(sportsCheckbox);
            } else if (hobby.equals("Reading")) {
                clickElement(readingCheckbox);
            } else if (hobby.equals("Music")) {
                clickElement(musicCheckbox);
            } else {
                System.out.print("Hobby not found!!!");
            }
        } catch (Exception e) {
            System.out.print("Check the hobby entered as value" + e.getMessage());
        }
    }

    /**
     * @param address
     */
    public void enterCurrAddress(String address) {
        try {
            enterValue(currentAddressTextBox, address);
        } catch (Exception e) {
            System.out.println("Address not found" + e.getMessage());
        }
    }

}
