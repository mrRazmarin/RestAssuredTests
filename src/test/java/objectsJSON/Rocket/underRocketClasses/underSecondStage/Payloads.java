package objectsJSON.Rocket.underRocketClasses.underSecondStage;

import objectsJSON.Rocket.underRocketClasses.underSecondStage.underPayloads.CompositeFairing;

public class Payloads {
    private String optionOne;

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

    private CompositeFairing compositeFairing;
}
