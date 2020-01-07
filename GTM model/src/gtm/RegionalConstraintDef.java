
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "entryConnectionPoint",
    "exitConnectionPoint",
    "RegionalValidity",
    "distance"
})
public class RegionalConstraintDef {

    @JsonProperty("id")
    private String id;
    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("entryConnectionPoint")
    @JsonPropertyDescription("connection point connecting two fare regimes")
    private List<StationDef> entryConnectionPoint = new ArrayList<StationDef>();
    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPoint")
    @JsonPropertyDescription("connection point connecting two fare regimes")
    private List<StationDef> exitConnectionPoint = new ArrayList<StationDef>();
    @JsonProperty("RegionalValidity")
    private List<RegionalValidityDef> regionalValidity = new ArrayList<RegionalValidityDef>();
    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    @JsonPropertyDescription("distance in km for statistics ")
    private Double distance;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("entryConnectionPoint")
    public List<StationDef> getEntryConnectionPoint() {
        return entryConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("entryConnectionPoint")
    public void setEntryConnectionPoint(List<StationDef> entryConnectionPoint) {
        this.entryConnectionPoint = entryConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPoint")
    public List<StationDef> getExitConnectionPoint() {
        return exitConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPoint")
    public void setExitConnectionPoint(List<StationDef> exitConnectionPoint) {
        this.exitConnectionPoint = exitConnectionPoint;
    }

    @JsonProperty("RegionalValidity")
    public List<RegionalValidityDef> getRegionalValidity() {
        return regionalValidity;
    }

    @JsonProperty("RegionalValidity")
    public void setRegionalValidity(List<RegionalValidityDef> regionalValidity) {
        this.regionalValidity = regionalValidity;
    }

    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegionalConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("entryConnectionPoint");
        sb.append('=');
        sb.append(((this.entryConnectionPoint == null)?"<null>":this.entryConnectionPoint));
        sb.append(',');
        sb.append("exitConnectionPoint");
        sb.append('=');
        sb.append(((this.exitConnectionPoint == null)?"<null>":this.exitConnectionPoint));
        sb.append(',');
        sb.append("regionalValidity");
        sb.append('=');
        sb.append(((this.regionalValidity == null)?"<null>":this.regionalValidity));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.regionalValidity == null)? 0 :this.regionalValidity.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.entryConnectionPoint == null)? 0 :this.entryConnectionPoint.hashCode()));
        result = ((result* 31)+((this.distance == null)? 0 :this.distance.hashCode()));
        result = ((result* 31)+((this.exitConnectionPoint == null)? 0 :this.exitConnectionPoint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegionalConstraintDef) == false) {
            return false;
        }
        RegionalConstraintDef rhs = ((RegionalConstraintDef) other);
        return ((((((this.regionalValidity == rhs.regionalValidity)||((this.regionalValidity!= null)&&this.regionalValidity.equals(rhs.regionalValidity)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.entryConnectionPoint == rhs.entryConnectionPoint)||((this.entryConnectionPoint!= null)&&this.entryConnectionPoint.equals(rhs.entryConnectionPoint))))&&((this.distance == rhs.distance)||((this.distance!= null)&&this.distance.equals(rhs.distance))))&&((this.exitConnectionPoint == rhs.exitConnectionPoint)||((this.exitConnectionPoint!= null)&&this.exitConnectionPoint.equals(rhs.exitConnectionPoint))));
    }

}
