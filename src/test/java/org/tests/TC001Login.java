package org.tests;

import org.Page.LandingPageLogin;
import org.Page.LandingPageNonLogin;
import org.Page.LoginPage;
import org.Utils.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001Login extends BaseTest {

    @Test
    public void TC0001_LoginValidation() {
        LandingPageNonLogin lpguest = new LandingPageNonLogin(driver);
        lpguest.clickOnLoginCTA();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage lp = new LoginPage(driver);
        System.out.print(lp.getPageTitle());
        lp.enterUserName("john1@mailinator.com");
        lp.enterPassword("Password@123");
        lp.clickOnLogin();
        LandingPageLogin lpuser = new LandingPageLogin(driver);
        System.out.println(lpuser.getWelcomeMessage());


    }
}
