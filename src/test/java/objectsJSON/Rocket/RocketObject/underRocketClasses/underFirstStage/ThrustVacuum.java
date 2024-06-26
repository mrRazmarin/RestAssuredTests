package objectsJSON.Rocket.RocketObject.underRocketClasses.underFirstStage;

public class ThrustVacuum {
    private Long kN;
    private Long lbf;

    public ThrustVacuum() {
    }

    public ThrustVacuum(Long kN, Long lbf) {
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

    @Override
    public String toString() {
        return "ThrustVacuum{" +
                "kN=" + kN +
                ", lbf=" + lbf +
                '}';
    }
}
