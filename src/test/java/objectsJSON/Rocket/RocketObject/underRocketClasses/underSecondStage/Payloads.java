package objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage;

import com.fasterxml.jackson.annotation.JsonProperty;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage.underPayloads.CompositeFairing;

public class Payloads {
    @JsonProperty(value = "option_1")
    private String optionOne;
    @JsonProperty(value = "option_2")
    private String optionTwo;
    @JsonProperty(value = "composite_fairing")
    private CompositeFairing compositeFairing;

    public Payloads() {
    }

    public Payloads(String optionOne, String optionTwo, CompositeFairing compositeFairing) {
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.compositeFairing = compositeFairing;
    }

    public CompositeFairing getCompositeFairing() {
        return compositeFairing;
    }

    public void setCompositeFairing(CompositeFairing compositeFairing) {
        this.compositeFairing = compositeFairing;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    @Override
    public String toString() {
        return "Payloads{" +
                "optionOne='" + optionOne + '\'' +
                ", optionTwo='" + optionTwo + '\'' +
                ", compositeFairing=" + compositeFairing +
                '}';
    }
}
