package objectsJSON.Rocket.RocketObject.underRocketClasses;

public class Height {
    private Double meters;
    private Double feet;

    public Height() {
    }

    public Height(Double meters, Double feet) {
        this.meters = meters;
        this.feet = feet;
    }

    public Double getMeters() {
        return meters;
    }

    public void setMeters(Double meters) {
        this.meters = meters;
    }

    public Double getFeet() {
        return feet;
    }

    public void setFeet(Double feet) {
        this.feet = feet;
    }
}
