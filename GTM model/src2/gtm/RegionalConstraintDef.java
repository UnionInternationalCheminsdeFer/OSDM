
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * regional constraint of the fare-offline bulk data use the id of connection points whereas in an online environment the connection point is included
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "entryConnectionPointId",
    "entryConnectionPoint",
    "exitConnectionPointId",
    "exitConnectionPoint",
    "regionalValidity",
    "distance"
})
public class RegionalConstraintDef {

    @JsonProperty("id")
    private String id;
    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("entryConnectionPointId")
    @JsonPropertyDescription("connection point connecting two fare regimes")
    private String entryConnectionPointId;
    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("entryConnectionPoint")
    @JsonPropertyDescription("connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.")
    private ConnectionPointDef entryConnectionPoint;
    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPointId")
    @JsonPropertyDescription("connection point connecting two fare regimes")
    private String exitConnectionPointId;
    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("exitConnectionPoint")
    @JsonPropertyDescription("connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.")
    private ConnectionPointDef exitConnectionPoint;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalValidity")
    private List<RegionalValidityDef> regionalValidity = new ArrayList<RegionalValidityDef>();
    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    @JsonPropertyDescription("distance in km for statistics ")
    private Integer distance;

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
    @JsonProperty("entryConnectionPointId")
    public String getEntryConnectionPointId() {
        return entryConnectionPointId;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("entryConnectionPointId")
    public void setEntryConnectionPointId(String entryConnectionPointId) {
        this.entryConnectionPointId = entryConnectionPointId;
    }

    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("entryConnectionPoint")
    public ConnectionPointDef getEntryConnectionPoint() {
        return entryConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("entryConnectionPoint")
    public void setEntryConnectionPoint(ConnectionPointDef entryConnectionPoint) {
        this.entryConnectionPoint = entryConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPointId")
    public String getExitConnectionPointId() {
        return exitConnectionPointId;
    }

    /**
     * connection point connecting two fare regimes
     * 
     */
    @JsonProperty("exitConnectionPointId")
    public void setExitConnectionPointId(String exitConnectionPointId) {
        this.exitConnectionPointId = exitConnectionPointId;
    }

    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("exitConnectionPoint")
    public ConnectionPointDef getExitConnectionPoint() {
        return exitConnectionPoint;
    }

    /**
     * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
     * 
     */
    @JsonProperty("exitConnectionPoint")
    public void setExitConnectionPoint(ConnectionPointDef exitConnectionPoint) {
        this.exitConnectionPoint = exitConnectionPoint;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalValidity")
    public List<RegionalValidityDef> getRegionalValidity() {
        return regionalValidity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalValidity")
    public void setRegionalValidity(List<RegionalValidityDef> regionalValidity) {
        this.regionalValidity = regionalValidity;
    }

    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    /**
     * distance in km for statistics 
     * 
     */
    @JsonProperty("distance")
    public void setDistance(Integer distance) {
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
        sb.append("entryConnectionPointId");
        sb.append('=');
        sb.append(((this.entryConnectionPointId == null)?"<null>":this.entryConnectionPointId));
        sb.append(',');
        sb.append("entryConnectionPoint");
        sb.append('=');
        sb.append(((this.entryConnectionPoint == null)?"<null>":this.entryConnectionPoint));
        sb.append(',');
        sb.append("exitConnectionPointId");
        sb.append('=');
        sb.append(((this.exitConnectionPointId == null)?"<null>":this.exitConnectionPointId));
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
        result = ((result* 31)+((this.distance == null)? 0 :this.distance.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.exitConnectionPointId == null)? 0 :this.exitConnectionPointId.hashCode()));
        result = ((result* 31)+((this.entryConnectionPointId == null)? 0 :this.entryConnectionPointId.hashCode()));
        result = ((result* 31)+((this.entryConnectionPoint == null)? 0 :this.entryConnectionPoint.hashCode()));
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
        return ((((((((this.regionalValidity == rhs.regionalValidity)||((this.regionalValidity!= null)&&this.regionalValidity.equals(rhs.regionalValidity)))&&((this.distance == rhs.distance)||((this.distance!= null)&&this.distance.equals(rhs.distance))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.exitConnectionPointId == rhs.exitConnectionPointId)||((this.exitConnectionPointId!= null)&&this.exitConnectionPointId.equals(rhs.exitConnectionPointId))))&&((this.entryConnectionPointId == rhs.entryConnectionPointId)||((this.entryConnectionPointId!= null)&&this.entryConnectionPointId.equals(rhs.entryConnectionPointId))))&&((this.entryConnectionPoint == rhs.entryConnectionPoint)||((this.entryConnectionPoint!= null)&&this.entryConnectionPoint.equals(rhs.entryConnectionPoint))))&&((this.exitConnectionPoint == rhs.exitConnectionPoint)||((this.exitConnectionPoint!= null)&&this.exitConnectionPoint.equals(rhs.exitConnectionPoint))));
    }

}
