package objectsJSON.Core.CoreObject.underCore;

public class Mission {
    private String name;
    private Long flight;

    public Mission() {
    }

    public Mission(String name, Long flight) {
        this.name = name;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFlight() {
        return flight;
    }

    public void setFlight(Long flight) {
        this.flight = flight;
    }
}
