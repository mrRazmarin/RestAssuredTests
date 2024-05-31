package configurations;

import io.qameta.allure.restassured.AllureRestAssured;

public class AllureConfiguration {
    private static final AllureRestAssured FILTER = new AllureRestAssured();

    public static AllureRestAssured allureRestAssured() {
        FILTER.setRequestTemplate("request.ftl");
        FILTER.setResponseTemplate("response.ftl");
        return FILTER;
    }
}
