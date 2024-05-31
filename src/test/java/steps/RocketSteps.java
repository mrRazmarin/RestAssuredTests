package steps;

import configurations.AllureConfiguration;
import configurations.ConfigurationForRocket;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import objectsJSON.Rocket.RocketObject.Rocket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static configurations.AllureConfiguration.allureRestAssured;
import static io.restassured.RestAssured.given;

@ExtendWith(ConfigurationForRocket.class)
public class RocketSteps {
    @Step("Open endpoint '/rocket' and return list with all rocket.")
    public List<Rocket> openRocket(String endPoint) {
        return given()
                .filter(allureRestAssured())
                .when().contentType(ContentType.JSON)
                .get(endPoint)
                .then().log().all()
                .extract().body().jsonPath().getList("",Rocket.class);
    }
    @Step("Get object from list")
    public Rocket getRocketFromListById(List<Rocket> rockets, Long id) {
        return rockets.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst().get();
    }
    @Step("Check country name of the rocket")
    public void checkCountryNameOfTheRocket(Rocket rocket, String countryName) {
        Assertions.assertEquals(rocket.getCountry(), countryName);
    }
}
