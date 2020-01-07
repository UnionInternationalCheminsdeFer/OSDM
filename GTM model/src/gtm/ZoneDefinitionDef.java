
package gtm;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "Stations",
    "zoneId",
    "name"
})
public class ZoneDefinitionDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Stations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<StationDef> stations = new LinkedHashSet<StationDef>();
    /**
     * short zone id to be used in bar codes
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    @JsonPropertyDescription("short zone id to be used in bar codes")
    private String zoneId;
    /**
     * name to be used in route descriptions
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name to be used in route descriptions")
    private String name;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Stations")
    public Set<StationDef> getStations() {
        return stations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Stations")
    public void setStations(Set<StationDef> stations) {
        this.stations = stations;
    }

    /**
     * short zone id to be used in bar codes
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    public String getZoneId() {
        return zoneId;
    }

    /**
     * short zone id to be used in bar codes
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * name to be used in route descriptions
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name to be used in route descriptions
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ZoneDefinitionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stations");
        sb.append('=');
        sb.append(((this.stations == null)?"<null>":this.stations));
        sb.append(',');
        sb.append("zoneId");
        sb.append('=');
        sb.append(((this.zoneId == null)?"<null>":this.zoneId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.zoneId == null)? 0 :this.zoneId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stations == null)? 0 :this.stations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZoneDefinitionDef) == false) {
            return false;
        }
        ZoneDefinitionDef rhs = ((ZoneDefinitionDef) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.zoneId == rhs.zoneId)||((this.zoneId!= null)&&this.zoneId.equals(rhs.zoneId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stations == rhs.stations)||((this.stations!= null)&&this.stations.equals(rhs.stations))));
    }

}
