package tests;


import configurations.ConfigurationForRocket;
import io.restassured.http.ContentType;
import objectsJSON.Rocket.RocketObject.Rocket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static io.restassured.RestAssured.given;

@ExtendWith(ConfigurationForRocket.class)
public class RocketTests {
    @Test
    @DisplayName("Check name country to first rocket")
    public void getRockets() {
        String getEndPoint = "/rockets";
        List<Rocket> rocketList = given()
                .when().contentType(ContentType.JSON)
                .get(getEndPoint)
                .then().log().all()
                .extract().body().jsonPath().getList("",Rocket.class);

        String rocketCountryOne = rocketList.stream()
                .filter(x -> x.getId() == 1)
                .findFirst().get().getCountry();
        System.out.println("OUTPUT: " + rocketCountryOne);
        Assertions.assertEquals("Republic of the Marshall Islands", rocketCountryOne);
    }


}
