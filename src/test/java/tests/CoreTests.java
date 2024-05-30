package tests;

import configurations.ConfigurationForCore;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import objectsJSON.Core.CoreObject.Core;
import objectsJSON.Core.CoreObject.underCore.Mission;
import objectsJSON.Rocket.RocketObject.Rocket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

@ExtendWith(ConfigurationForCore.class)
public class CoreTests {
    @Test
    @DisplayName("Assert core serial")
    public void checkCore() {
        String endPointSerialNumberCore = "/B1032";

        Core core = given().when().contentType(ContentType.JSON)
                .get(endPointSerialNumberCore)
                .then().log().all()
                .extract().body().as(Core.class);
        String coreSerialFromObject = core.getCoreSerial();
        System.out.println(coreSerialFromObject);
        Assertions.assertEquals("B1032", coreSerialFromObject);
    }
    @Test
    @DisplayName("Get first object from json-request and checking Mission.name")
    public void getFirstObjectFromJsonRequestAndCheckMissionName() {
        String endpoint = "";
        String actualMissionName = "FalconSat";
        Response coresResponse = given().when().contentType(ContentType.JSON)
                .get(endpoint)
                .then().log().all()
                .extract().response();
        List<Mission> missions = Arrays.asList(coresResponse.as(Core[].class))
                .stream()
                .findFirst()
                .get()
                .getMissions();
        String nameMission = missions.get(0).getName();
        Assertions.assertEquals(nameMission, actualMissionName);
    }
}
