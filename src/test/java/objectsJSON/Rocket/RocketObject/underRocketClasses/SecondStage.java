package objectsJSON.Rocket.RocketObject.underRocketClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage.Payloads;
import objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage.Thrust;

public class SecondStage {
    private Boolean reusable;
    private Long engines;
    @JsonProperty(value = "fuel_amount_tons")
    private Double fuelAmountTons;
    @JsonProperty(value = "burn_time_sec")
    private Long burnTimeSec;
    private Thrust thrust;
    private Payloads payloads;

    public SecondStage() {
    }

    public SecondStage(Boolean reusable, Long engines, Double fuelAmountTons, Long burnTimeSec, Thrust thrust, Payloads payloads) {
        this.reusable = reusable;
        this.engines = engines;
        this.fuelAmountTons = fuelAmountTons;
        this.burnTimeSec = burnTimeSec;
        this.thrust = thrust;
        this.payloads = payloads;
    }

    public Payloads getPayloads() {
        return payloads;
    }

    public void setPayloads(Payloads payloads) {
        this.payloads = payloads;
    }

    public Thrust getThrust() {
        return thrust;
    }

    public void setThrust(Thrust thrust) {
        this.thrust = thrust;
    }

    public Long getBurnTimeSec() {
        return burnTimeSec;
    }

    public void setBurnTimeSec(Long burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

    public Double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setFuelAmountTons(Double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public Long getEngines() {
        return engines;
    }

    public void setEngines(Long engines) {
        this.engines = engines;
    }

    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }
}
