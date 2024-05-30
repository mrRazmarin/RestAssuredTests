package objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage.underPayloads;

import objectsJSON.Rocket.RocketObject.underRocketClasses.Diameter;
import objectsJSON.Rocket.RocketObject.underRocketClasses.Height;

public class CompositeFairing {
    private Height height;
    private Diameter diameter;

    public CompositeFairing() {
    }

    public CompositeFairing(Height height, Diameter diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }
}
