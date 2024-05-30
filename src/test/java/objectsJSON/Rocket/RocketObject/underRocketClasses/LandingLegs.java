package objectsJSON.Rocket.RocketObject.underRocketClasses;

public class LandingLegs {
    private Long number;
    private String material;

    public LandingLegs() {
    }

    public LandingLegs(Long number, String material) {
        this.number = number;
        this.material = material;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
