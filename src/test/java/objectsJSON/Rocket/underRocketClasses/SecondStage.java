package objectsJSON.Rocket.underRocketClasses;

import objectsJSON.Rocket.underRocketClasses.underSecondStage.Payloads;
import objectsJSON.Rocket.underRocketClasses.underSecondStage.Thrust;

public class SecondStage {
    private Boolean reusable;
    private Long engines;
    private Double fuelAmountTons;
    private Long burnTimeSec;
    private Thrust thrust;
    private Payloads payloads;

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
