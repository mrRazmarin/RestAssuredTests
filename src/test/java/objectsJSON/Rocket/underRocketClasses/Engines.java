package objectsJSON.Rocket.underRocketClasses;

import objectsJSON.Rocket.underRocketClasses.underEngines.Isp;
import objectsJSON.Rocket.underRocketClasses.underFirstStage.ThrustSeaLevel;
import objectsJSON.Rocket.underRocketClasses.underFirstStage.ThrustVacuum;

public class Engines {
    private Long number;
    private String type;
    private String version;
    private String layout;
    private Isp isp;
    private Long engineLossMax;
    private String propellantOne;
    private String propellantTwo;
    private ThrustSeaLevel thrustSeaLevel;
    private ThrustVacuum thrustVacuum;
    private Double thrustToWeight;

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
