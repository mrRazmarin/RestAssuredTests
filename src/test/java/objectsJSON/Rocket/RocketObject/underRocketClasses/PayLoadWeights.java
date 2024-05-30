package objectsJSON.Rocket.RocketObject.underRocketClasses;

public class PayLoadWeights {
    private String id;
    private String name;
    private Long kg;
    private Long lb;

    public PayLoadWeights() {
    }

    public PayLoadWeights(String id, String name, Long kg, Long lb) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
