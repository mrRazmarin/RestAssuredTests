package objectsJSON.Rocket.RocketObject.underRocketClasses;

public class Mass {
    private Long kg;
    private Long lb;

    public Mass() {
    }

    public Mass(Long kg, Long lb) {
        this.kg = kg;
        this.lb = lb;
    }

    public Long getLb() {
        return lb;
    }

    public void setLb(Long lb) {
        this.lb = lb;
    }

    public Long getKg() {
        return kg;
    }

    public void setKg(Long kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Mass{" +
                "kg=" + kg +
                ", lb=" + lb +
                '}';
    }
}
