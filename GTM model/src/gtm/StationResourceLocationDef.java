
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "onlineResource",
    "stations",
    "connectionPoints"
})
public class StationResourceLocationDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    private List<OnlineResourceDef> onlineResource = new ArrayList<OnlineResourceDef>();
    @JsonProperty("stations")
    private List<StationDef> stations = new ArrayList<StationDef>();
    @JsonProperty("connectionPoints")
    private List<List<StationDef>> connectionPoints = new ArrayList<List<StationDef>>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    public List<OnlineResourceDef> getOnlineResource() {
        return onlineResource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    public void setOnlineResource(List<OnlineResourceDef> onlineResource) {
        this.onlineResource = onlineResource;
    }

    @JsonProperty("stations")
    public List<StationDef> getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(List<StationDef> stations) {
        this.stations = stations;
    }

    @JsonProperty("connectionPoints")
    public List<List<StationDef>> getConnectionPoints() {
        return connectionPoints;
    }

    @JsonProperty("connectionPoints")
    public void setConnectionPoints(List<List<StationDef>> connectionPoints) {
        this.connectionPoints = connectionPoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationResourceLocationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("onlineResource");
        sb.append('=');
        sb.append(((this.onlineResource == null)?"<null>":this.onlineResource));
        sb.append(',');
        sb.append("stations");
        sb.append('=');
        sb.append(((this.stations == null)?"<null>":this.stations));
        sb.append(',');
        sb.append("connectionPoints");
        sb.append('=');
        sb.append(((this.connectionPoints == null)?"<null>":this.connectionPoints));
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
        result = ((result* 31)+((this.onlineResource == null)? 0 :this.onlineResource.hashCode()));
        result = ((result* 31)+((this.stations == null)? 0 :this.stations.hashCode()));
        result = ((result* 31)+((this.connectionPoints == null)? 0 :this.connectionPoints.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationResourceLocationDef) == false) {
            return false;
        }
        StationResourceLocationDef rhs = ((StationResourceLocationDef) other);
        return ((((this.onlineResource == rhs.onlineResource)||((this.onlineResource!= null)&&this.onlineResource.equals(rhs.onlineResource)))&&((this.stations == rhs.stations)||((this.stations!= null)&&this.stations.equals(rhs.stations))))&&((this.connectionPoints == rhs.connectionPoints)||((this.connectionPoints!= null)&&this.connectionPoints.equals(rhs.connectionPoints))));
    }

}
