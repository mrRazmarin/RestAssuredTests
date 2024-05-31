package objectsJSON.Rocket.RocketObject.underRocketClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import groovyjarjarantlr4.v4.runtime.misc.Nullable;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage.ThrustSeaLevel;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage.ThrustVacuum;

public class FirstStage {
    private Boolean reusable;
    private Long engines;
    @JsonProperty(value = "fuel_amount_tons")
    private Double fuelAmountTons;
    @JsonProperty(value = "burn_time_sec")
    private Long burnTimeSec;
    @JsonProperty(value = "thrust_sea_level")
    private ThrustSeaLevel thrustSeaLevel;
    @JsonProperty(value = "thrust_vacuum")
    private ThrustVacuum thrustVacuum;
    private Long cores;

    public FirstStage() {
    }

    public FirstStage(Boolean reusable, Long engines, Double fuelAmountTons, Long burnTimeSec, ThrustSeaLevel thrustSeaLevel, ThrustVacuum thrustVacuum, Long cores) {
        this.reusable = reusable;
        this.engines = engines;
        this.fuelAmountTons = fuelAmountTons;
        this.burnTimeSec = burnTimeSec;
        this.thrustSeaLevel = thrustSeaLevel;
        this.thrustVacuum = thrustVacuum;
        this.cores = cores;
    }

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

    @Override
    public String toString() {
        return "FirstStage{" +
                "reusable=" + reusable +
                ", engines=" + engines +
                ", fuelAmountTons=" + fuelAmountTons +
                ", burnTimeSec=" + burnTimeSec +
                ", thrustSeaLevel=" + thrustSeaLevel +
                ", thrustVacuum=" + thrustVacuum +
                ", cores=" + cores +
                '}';
    }
}
