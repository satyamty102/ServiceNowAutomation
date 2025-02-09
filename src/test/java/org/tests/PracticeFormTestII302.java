package org.tests;

import org.Page.PracticeForm;
import org.Utils.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeFormTestII302 extends BaseTest {

    @Test
    @Parameters({"firstName", "lastName", "email", "gender", "number", "DOB", "subject", "hobby", "address"})
    public void FillForm(String firstName, String lastName, String email, String gender, String number, String DOB, @Optional("Subject Here") String subject, @Optional("Hobby Here") String hobby, @Optional("Address Here") String address) {
        PracticeForm pf = new PracticeForm(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pf.enterFirstName(firstName);
        pf.enterLastName(lastName);
        pf.enterEmail(email);
        pf.selectGender(gender);
        pf.enterMobNumber(number);
        pf.enterDOB(DOB);
        pf.enterSubject(subject);
        pf.selectHobby(hobby);
        pf.enterCurrAddress(address);

    }
}
