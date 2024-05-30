package objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage;

public class ThrustSeaLevel {
    private Long kN;
    private Long lbf;

    public ThrustSeaLevel() {
    }

    public ThrustSeaLevel(Long kN, Long lbf) {
        this.kN = kN;
        this.lbf = lbf;
    }

    public Long getkN() {
        return kN;
    }

    public void setkN(Long kN) {
        this.kN = kN;
    }

    public Long getLbf() {
        return lbf;
    }

    public void setLbf(Long lbf) {
        this.lbf = lbf;
    }

}
