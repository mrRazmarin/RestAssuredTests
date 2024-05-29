package tests;

import io.restassured.RestAssured;
import io.restassured.config.DecoderConfig;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.mapper.ObjectMapperType;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class Configuration implements BeforeAllCallback {
    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        RestAssured.baseURI = "https://api.spacexdata.com";
        RestAssured.basePath = "/v3";
        RestAssured.config = RestAssuredConfig.config()
                .decoderConfig(new DecoderConfig("UTF-8"))
                .objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.JACKSON_2));

    }
}
