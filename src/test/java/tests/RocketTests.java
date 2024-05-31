package tests;


import configurations.AllureConfiguration;
import configurations.ConfigurationForRocket;
import helpers.EndPointsForTests;
import io.qameta.allure.*;
import objectsJSON.Rocket.RocketObject.Rocket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import steps.RocketSteps;

import java.util.List;

@ExtendWith({ConfigurationForRocket.class})
@DisplayName("Rocket's tests")
public class RocketTests {
    private final RocketSteps rocketSteps = new RocketSteps();
    private final EndPointsForTests endPointsForTests = new EndPointsForTests();


    @ParameterizedTest(name = "Check name country {0} in the list rockets, with id = {1}")
    @MethodSource("helpers.DataForTests#getNamesItems")
    @Epic("API")
    @Story("API-SpaceX")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Mikhail Salnikov")
    @Issue("Rocket's")
    public void getRockets(String countryName, Long id) {
        List<Rocket> listWithAllRocket = rocketSteps.openRocket(endPointsForTests.getEndPointAllRocket());
        Rocket rocket = rocketSteps.getRocketFromListById(listWithAllRocket, id);
        rocketSteps.checkCountryNameOfTheRocket(rocket, countryName);
    }
}
