
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
    "connectionPointIds"
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
    @JsonProperty("connectionPointIds")
    private List<String> connectionPointIds = new ArrayList<String>();

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

    @JsonProperty("connectionPointIds")
    public List<String> getConnectionPointIds() {
        return connectionPointIds;
    }

    @JsonProperty("connectionPointIds")
    public void setConnectionPointIds(List<String> connectionPointIds) {
        this.connectionPointIds = connectionPointIds;
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
        sb.append("connectionPointIds");
        sb.append('=');
        sb.append(((this.connectionPointIds == null)?"<null>":this.connectionPointIds));
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
        result = ((result* 31)+((this.connectionPointIds == null)? 0 :this.connectionPointIds.hashCode()));
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
        return ((((this.onlineResource == rhs.onlineResource)||((this.onlineResource!= null)&&this.onlineResource.equals(rhs.onlineResource)))&&((this.stations == rhs.stations)||((this.stations!= null)&&this.stations.equals(rhs.stations))))&&((this.connectionPointIds == rhs.connectionPointIds)||((this.connectionPointIds!= null)&&this.connectionPointIds.equals(rhs.connectionPointIds))));
    }

}
