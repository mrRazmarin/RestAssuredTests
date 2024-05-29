package objectsJSON.Rocket.underRocketClasses;

import objectsJSON.Rocket.underRocketClasses.underFirstStage.ThrustSeaLevel;
import objectsJSON.Rocket.underRocketClasses.underFirstStage.ThrustVacuum;

public class FirstStage {
    private Boolean reusable;
    private Long engines;
    private Double fuelAmountTons;
    private Long burnTimeSec;
    private ThrustSeaLevel thrustSeaLevel;
    private ThrustVacuum thrustVacuum;
    private Long cores;

    public Long getCores() {
        return cores;
    }

    public void setCores(Long cores) {
        this.cores = cores;
    }

    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }

    public Long getEngines() {
        return engines;
    }

    public void setEngines(Long engines) {
        this.engines = engines;
    }

    public Double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setFuelAmountTons(Double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public Long getBurnTimeSec() {
        return burnTimeSec;
    }

    public void setBurnTimeSec(Long burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
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
}
