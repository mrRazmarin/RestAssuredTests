package objectsJSON.Rocket.underRocketClasses;

public class PayLoadWeights {
    private Long id;
    private String name;
    private Long kg;
    private Long lb;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
