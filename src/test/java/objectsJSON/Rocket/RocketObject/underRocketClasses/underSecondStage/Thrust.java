package objectsJSON.Rocket.RocketObject.underRocketClasses.underSecondStage;

public class Thrust {
    private Long kN;
    private Long lbf;

    public Thrust() {
    }

    public Thrust(Long kN, Long lbf) {
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
