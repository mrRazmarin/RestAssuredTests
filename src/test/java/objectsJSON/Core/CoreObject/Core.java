package objectsJSON.Core.CoreObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import objectsJSON.Core.CoreObject.underCore.Mission;

import java.util.List;

public class Core {
    @JsonProperty(value = "core_serial")
    private String coreSerial;
    private Integer block;
    private String status;
    @JsonProperty(value = "original_launch")
    private String originalLaunch;
    @JsonProperty(value = "original_launch_unix")
    private Long originalLaunchUnix;
    private List<Mission> missions;
    @JsonProperty(value = "reuse_count")
    private Integer reuseCount;
    @JsonProperty(value = "rtls_attempts")
    private Integer rtlsAttempts;
    @JsonProperty(value = "rtls_landings")
    private Integer rtlsLandings;
    @JsonProperty(value = "asds_attempts")
    private Integer asdsAttempts;
    @JsonProperty(value = "asds_landings")
    private Integer asdsLandings;
    @JsonProperty(value = "water_landing")
    private Boolean waterLanding;
    private String details;

    public Core() {
    }

    public Core(String coreSerial, Integer block, String status, String originalLaunch, Long originalLaunchUnix, List<Mission> missions, Integer reuseCount, Integer rtlsAttempts, Integer rtlsLandings, Integer asdsAttempts, Integer asdsLandings, Boolean waterLanding, String details) {
        this.coreSerial = coreSerial;
        this.block = block;
        this.status = status;
        this.originalLaunch = originalLaunch;
        this.originalLaunchUnix = originalLaunchUnix;
        this.missions = missions;
        this.reuseCount = reuseCount;
        this.rtlsAttempts = rtlsAttempts;
        this.rtlsLandings = rtlsLandings;
        this.asdsAttempts = asdsAttempts;
        this.asdsLandings = asdsLandings;
        this.waterLanding = waterLanding;
        this.details = details;
    }

    public String getCoreSerial() {
        return coreSerial;
    }

    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginalLaunch() {
        return originalLaunch;
    }

    public void setOriginalLaunch(String originalLaunch) {
        this.originalLaunch = originalLaunch;
    }

    public Long getOriginalLaunchUnix() {
        return originalLaunchUnix;
    }

    public void setOriginalLaunchUnix(Long originalLaunchUnix) {
        this.originalLaunchUnix = originalLaunchUnix;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public Integer getReuseCount() {
        return reuseCount;
    }

    public void setReuseCount(Integer reuseCount) {
        this.reuseCount = reuseCount;
    }

    public Integer getRtlsAttempts() {
        return rtlsAttempts;
    }

    public void setRtlsAttempts(Integer rtlsAttempts) {
        this.rtlsAttempts = rtlsAttempts;
    }

    public Integer getRtlsLandings() {
        return rtlsLandings;
    }

    public void setRtlsLandings(Integer rtlsLandings) {
        this.rtlsLandings = rtlsLandings;
    }

    public Integer getAsdsAttempts() {
        return asdsAttempts;
    }

    public void setAsdsAttempts(Integer asdsAttempts) {
        this.asdsAttempts = asdsAttempts;
    }

    public Integer getAsdsLandings() {
        return asdsLandings;
    }

    public void setAsdsLandings(Integer asdsLandings) {
        this.asdsLandings = asdsLandings;
    }

    public Boolean getWaterLanding() {
        return waterLanding;
    }

    public void setWaterLanding(Boolean waterLanding) {
        this.waterLanding = waterLanding;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
