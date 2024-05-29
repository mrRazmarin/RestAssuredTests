package objectsJSON.Rocket;

import objectsJSON.Rocket.underRocketClasses.*;

import java.util.Date;
import java.util.List;

public class Rocket {
    private Long id;
    private Boolean active;
    private Long stages;
    private Long boosters;
    private Long costPerLaunch;
    private Long successRatePct;
    private Date firstFlight;
    private String country;
    private String company;
    private Height height;
    private Diameter diameter;
    private Mass mass;
    private List<PayLoadWeights> payLoadWeights;
    private FirstStage firstStage;
    private SecondStage secondStage;
    private Engines engines;
    private LandingLegs landingLegs;
    private List<String> flickImages;
    private String wikipedia;
    private String description;
    private String rocketId;
    private String rocketName;
    private String rocketType;

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

    public Date getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(Date firstFlight) {
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
}
