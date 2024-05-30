package tests;

import configurations.ConfigurationForCore;
import io.restassured.http.ContentType;
import objectsJSON.Core.CoreObject.Core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

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
}
