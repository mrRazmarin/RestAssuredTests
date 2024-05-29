package objectsJSON.Rocket.underRocketClasses.underSecondStage.underPayloads;

import objectsJSON.Rocket.underRocketClasses.Diameter;
import objectsJSON.Rocket.underRocketClasses.Height;

public class CompositeFairing {
    private Height height;
    private Diameter diameter;

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
