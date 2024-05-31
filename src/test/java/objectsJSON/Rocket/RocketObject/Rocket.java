package objectsJSON.Rocket.RocketObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import objectsJSON.Rocket.RocketObject.underRocketClasses.*;

import java.util.List;

public class Rocket {
    private Long id;
    private Boolean active;
    private Long stages;
    private Long boosters;
    @JsonProperty(value = "cost_per_launch")
    private Long costPerLaunch;
    @JsonProperty(value = "success_rate_pct")
    private Long successRatePct;
    @JsonProperty(value = "first_flight")
    private String firstFlight;
    private String country;
    private String company;
    private Height height;
    private Diameter diameter;
    private Mass mass;
    @JsonProperty(value = "payload_weights")
    private List<PayLoadWeights> payLoadWeights;
    @JsonProperty(value = "first_stage")
    private FirstStage firstStage;
    @JsonProperty(value = "second_stage")
    private SecondStage secondStage;
    private Engines engines;
    @JsonProperty(value = "landing_legs")
    private LandingLegs landingLegs;
    @JsonProperty(value = "flickr_images")
    private List<String> flickImages;
    private String wikipedia;
    private String description;
    @JsonProperty(value = "rocket_id")
    private String rocketId;
    @JsonProperty(value = "rocket_name")
    private String rocketName;
    @JsonProperty(value = "rocket_type")
    private String rocketType;

    public Rocket() {
    }

    public Rocket(Long id, Boolean active, Long stages, Long boosters, Long costPerLaunch, Long successRatePct, String firstFlight, String country, String company, Height height, Diameter diameter, Mass mass, List<PayLoadWeights> payLoadWeights, FirstStage firstStage, SecondStage secondStage, Engines engines, LandingLegs landingLegs, List<String> flickImages, String wikipedia, String description, String rocketId, String rocketName, String rocketType) {
        this.id = id;
        this.active = active;
        this.stages = stages;
        this.boosters = boosters;
        this.costPerLaunch = costPerLaunch;
        this.successRatePct = successRatePct;
        this.firstFlight = firstFlight;
        this.country = country;
        this.company = company;
        this.height = height;
        this.diameter = diameter;
        this.mass = mass;
        this.payLoadWeights = payLoadWeights;
        this.firstStage = firstStage;
        this.secondStage = secondStage;
        this.engines = engines;
        this.landingLegs = landingLegs;
        this.flickImages = flickImages;
        this.wikipedia = wikipedia;
        this.description = description;
        this.rocketId = rocketId;
        this.rocketName = rocketName;
        this.rocketType = rocketType;
    }

    public LandingLegs getLandingLegs() {
        return landingLegs;
    }

    public List<PayLoadWeights> getPayLoadWeights() {
        return payLoadWeights;
    }

    public void setPayLoadWeights(List<PayLoadWeights> payLoadWeights) {
        this.payLoadWeights = payLoadWeights;
    }

    public void setLandingLegs(LandingLegs landingLegs) {
        this.landingLegs = landingLegs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getStages() {
        return stages;
    }

    public void setStages(Long stages) {
        this.stages = stages;
    }

    public Long getBoosters() {
        return boosters;
    }

    public void setBoosters(Long boosters) {
        this.boosters = boosters;
    }

    public Long getCostPerLaunch() {
        return costPerLaunch;
    }

    public void setCostPerLaunch(Long costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    public Long getSuccessRatePct() {
        return successRatePct;
    }

    public void setSuccessRatePct(Long successRatePct) {
        this.successRatePct = successRatePct;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public FirstStage getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public List<String> getFlickImages() {
        return flickImages;
    }

    public void setFlickImages(List<String> flickImages) {
        this.flickImages = flickImages;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "id=" + id +
                ", active=" + active +
                ", stages=" + stages +
                ", boosters=" + boosters +
                ", costPerLaunch=" + costPerLaunch +
                ", successRatePct=" + successRatePct +
                ", firstFlight='" + firstFlight + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", height=" + height +
                ", diameter=" + diameter +
                ", mass=" + mass +
                ", payLoadWeights=" + payLoadWeights +
                ", firstStage=" + firstStage +
                ", secondStage=" + secondStage +
                ", engines=" + engines +
                ", landingLegs=" + landingLegs +
                ", flickImages=" + flickImages +
                ", wikipedia='" + wikipedia + '\'' +
                ", description='" + description + '\'' +
                ", rocketId='" + rocketId + '\'' +
                ", rocketName='" + rocketName + '\'' +
                ", rocketType='" + rocketType + '\'' +
                '}';
    }
}
