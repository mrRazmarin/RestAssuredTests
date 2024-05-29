package tests;


import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import objectsJSON.Rocket.Rocket;
import org.apache.http.entity.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

@ExtendWith(Configuration.class)
public class ApiTests {
    @Test
    @DisplayName("Check name country to first rocket")
    //Нихуя не работает як обычно
    public void getRockets() {
        String getEndPoint = "/rocket";
        Response response = given()
                .get(getEndPoint).then()
                .extract().response();
        List<Rocket> rocketList = Arrays.asList(response.as(Rocket[].class));
        String rocketCountryOne = rocketList.stream()
                .filter(x -> x.getId() == 1)
                .findFirst().get().getCountry();

        Assertions.assertEquals("Republic of the Marshall Islands", rocketCountryOne);
    }
}
