package org.Utils;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class APIBaseTest {

    @BeforeMethod
    public void beforeMethod() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
