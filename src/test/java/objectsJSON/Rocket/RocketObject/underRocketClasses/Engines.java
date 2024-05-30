package objectsJSON.Rocket.RocketObject.underRocketClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underEngines.Isp;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage.ThrustSeaLevel;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage.ThrustVacuum;

public class Engines {
    private Long number;
    private String type;
    private String version;
    private String layout;
    private Isp isp;
    @JsonProperty(value = "engine_loss_max")
    private Long engineLossMax;
    @JsonProperty(value = "propellant_1")
    private String propellantOne;
    @JsonProperty(value = "propellant_2")
    private String propellantTwo;
    @JsonProperty(value = "thrust_sea_level")
    private ThrustSeaLevel thrustSeaLevel;
    @JsonProperty(value = "thrust_vacuum")
    private ThrustVacuum thrustVacuum;
    @JsonProperty(value = "thrust_to_weight")
    private Double thrustToWeight;

    public Engines() {
    }

    public Engines(Long number, String type, String version, String layout, Isp isp, Long engineLossMax, String propellantOne, String propellantTwo, ThrustSeaLevel thrustSeaLevel, ThrustVacuum thrustVacuum, Double thrustToWeight) {
        this.number = number;
        this.type = type;
        this.version = version;
        this.layout = layout;
        this.isp = isp;
        this.engineLossMax = engineLossMax;
        this.propellantOne = propellantOne;
        this.propellantTwo = propellantTwo;
        this.thrustSeaLevel = thrustSeaLevel;
        this.thrustVacuum = thrustVacuum;
        this.thrustToWeight = thrustToWeight;
    }

    public Isp getIsp() {
        return isp;
    }

    public void setIsp(Isp isp) {
        this.isp = isp;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Long getEngineLossMax() {
        return engineLossMax;
    }

    public void setEngineLossMax(Long engineLossMax) {
        this.engineLossMax = engineLossMax;
    }

    public String getPropellantOne() {
        return propellantOne;
    }

    public void setPropellantOne(String propellantOne) {
        this.propellantOne = propellantOne;
    }

    public String getPropellantTwo() {
        return propellantTwo;
    }

    public void setPropellantTwo(String propellantTwo) {
        this.propellantTwo = propellantTwo;
    }

    public ThrustSeaLevel getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(ThrustSeaLevel thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustVacuum getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(ThrustVacuum thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public Double getThrustToWeight() {
        return thrustToWeight;
    }

    public void setThrustToWeight(Double thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
    }
}
