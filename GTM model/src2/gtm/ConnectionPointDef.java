
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * connection point connecting two fare regimes. The connection is possible between stations of the two provided station sets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "legacyBorderPointCode",
    "name",
    "stationSets"
})
public class ConnectionPointDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("legacyBorderPointCode")
    private String legacyBorderPointCode;
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stationSets")
    private List<List<StationDef>> stationSets = new ArrayList<List<StationDef>>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("legacyBorderPointCode")
    public String getLegacyBorderPointCode() {
        return legacyBorderPointCode;
    }

    @JsonProperty("legacyBorderPointCode")
    public void setLegacyBorderPointCode(String legacyBorderPointCode) {
        this.legacyBorderPointCode = legacyBorderPointCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stationSets")
    public List<List<StationDef>> getStationSets() {
        return stationSets;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stationSets")
    public void setStationSets(List<List<StationDef>> stationSets) {
        this.stationSets = stationSets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConnectionPointDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("legacyBorderPointCode");
        sb.append('=');
        sb.append(((this.legacyBorderPointCode == null)?"<null>":this.legacyBorderPointCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("stationSets");
        sb.append('=');
        sb.append(((this.stationSets == null)?"<null>":this.stationSets));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.stationSets == null)? 0 :this.stationSets.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.legacyBorderPointCode == null)? 0 :this.legacyBorderPointCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionPointDef) == false) {
            return false;
        }
        ConnectionPointDef rhs = ((ConnectionPointDef) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.stationSets == rhs.stationSets)||((this.stationSets!= null)&&this.stationSets.equals(rhs.stationSets))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.legacyBorderPointCode == rhs.legacyBorderPointCode)||((this.legacyBorderPointCode!= null)&&this.legacyBorderPointCode.equals(rhs.legacyBorderPointCode))));
    }

}
