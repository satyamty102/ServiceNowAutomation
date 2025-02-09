package org.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.Utils.APIBaseTest;
import org.testng.annotations.Test;

public class postAPIRequest extends APIBaseTest {


    @Test
    public void createBooking() {
        JSONObject booking = new JSONObject();
        JSONObject bookingdate = new JSONObject();

        booking.put("firstname", "John");
        booking.put("lastname", "Doe");
        booking.put("totalprice", 250);
        booking.put("depositpaid", true);
        booking.put("bookingdates", bookingdate);
        booking.put("additionalneeds", "Breakfast");

        bookingdate.put("checkin", "2022-02-21");
        bookingdate.put("checkout", "2022-02-25");

        Response response =
                RestAssured
                        .given()
                        .contentType(ContentType.JSON)
                        .baseUri("https://restful-booker.herokuapp.com/booking")
                        .body(booking.toString())
                        //.log().uri()
                        //.log().all()
                        .when()
                        .post()
                        .then()
                        .assertThat()
                        //.log().headers()
                        .statusCode(200)
                        .extract().response();

        //assigning the value if API reasponse to a variable
        int id = response.path("bookingid");
        System.out.print(id);

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .pathParam("bookingID", id)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get("{bookingID}")
                .then()
                .assertThat()
                .statusCode(200);


    }


}
