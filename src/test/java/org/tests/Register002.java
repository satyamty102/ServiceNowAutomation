package org.tests;

import org.Page.LandingPageNonLogin;
import org.Page.RegistrationPage;
import org.Page.RegistrationResultPage;
import org.Utils.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register002 extends BaseTest {

    /**
     * This test case validates the registation flow
     * two objects are created
     * 1. LandingPageNonLogin
     * 2. Registation Page
     */
    @Test
    public void completeRegistration() {
        LandingPageNonLogin lp = new LandingPageNonLogin(driver);
        lp.clickOnRegister();

        RegistrationPage rp = new RegistrationPage(driver);
        rp.selectMale();
        rp.enterFirstName("John");
        rp.enterLastName("Doh");
        rp.enterEmail("john6@mailinator.com");
        rp.setPassword("Password@123");
        rp.setConfirmPassword("Password@123");
        rp.clickOnRegister();

        RegistrationResultPage rpR = new RegistrationResultPage(driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        String resultMessage = rpR.confirmationMessage();
        System.out.println(resultMessage);
    }

}
