package objectsJSON.Rocket.RocketObject.underRocketClasses.underEngines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Isp {
    @JsonProperty(value = "sea_level")
    private Long seaLevel;
    private Long vacuum;

    public Isp() {
    }

    public Isp(Long seaLevel, Long vacuum) {
        this.seaLevel = seaLevel;
        this.vacuum = vacuum;
    }

    public Long getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Long seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Long getVacuum() {
        return vacuum;
    }

    public void setVacuum(Long vacuum) {
        this.vacuum = vacuum;
    }
}
