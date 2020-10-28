
package gtm;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * set of stations used in the fare equivalentely. E.g. Brussels-Region). The set is identified by the fare provicer and a code unique within the fare provider.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareProvider",
    "code",
    "stations",
    "legacyCode",
    "name",
    "nameUTF8"
})
public class FareReferenceStationSetDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String fareProvider;
    /**
     * code of the fare reference station set used in regional validity. Unique within the fare provider.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("code of the fare reference station set used in regional validity. Unique within the fare provider.")
    private String code;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<StationDef> stations = new LinkedHashSet<StationDef>();
    /**
     * id used in 108 as local station code 
     * (Required)
     * 
     */
    @JsonProperty("legacyCode")
    @JsonPropertyDescription("id used in 108 as local station code ")
    private Integer legacyCode;
    /**
     * name to be used in route descriptions
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name to be used in route descriptions")
    private String name;
    @JsonProperty("nameUTF8")
    private String nameUTF8;

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    public String getFareProvider() {
        return fareProvider;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    public void setFareProvider(String fareProvider) {
        this.fareProvider = fareProvider;
    }

    /**
     * code of the fare reference station set used in regional validity. Unique within the fare provider.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * code of the fare reference station set used in regional validity. Unique within the fare provider.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stations")
    public Set<StationDef> getStations() {
        return stations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stations")
    public void setStations(Set<StationDef> stations) {
        this.stations = stations;
    }

    /**
     * id used in 108 as local station code 
     * (Required)
     * 
     */
    @JsonProperty("legacyCode")
    public Integer getLegacyCode() {
        return legacyCode;
    }

    /**
     * id used in 108 as local station code 
     * (Required)
     * 
     */
    @JsonProperty("legacyCode")
    public void setLegacyCode(Integer legacyCode) {
        this.legacyCode = legacyCode;
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

    @JsonProperty("nameUTF8")
    public String getNameUTF8() {
        return nameUTF8;
    }

    @JsonProperty("nameUTF8")
    public void setNameUTF8(String nameUTF8) {
        this.nameUTF8 = nameUTF8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareReferenceStationSetDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fareProvider");
        sb.append('=');
        sb.append(((this.fareProvider == null)?"<null>":this.fareProvider));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("stations");
        sb.append('=');
        sb.append(((this.stations == null)?"<null>":this.stations));
        sb.append(',');
        sb.append("legacyCode");
        sb.append('=');
        sb.append(((this.legacyCode == null)?"<null>":this.legacyCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameUTF8");
        sb.append('=');
        sb.append(((this.nameUTF8 == null)?"<null>":this.nameUTF8));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nameUTF8 == null)? 0 :this.nameUTF8 .hashCode()));
        result = ((result* 31)+((this.stations == null)? 0 :this.stations.hashCode()));
        result = ((result* 31)+((this.legacyCode == null)? 0 :this.legacyCode.hashCode()));
        result = ((result* 31)+((this.fareProvider == null)? 0 :this.fareProvider.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareReferenceStationSetDef) == false) {
            return false;
        }
        FareReferenceStationSetDef rhs = ((FareReferenceStationSetDef) other);
        return (((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nameUTF8 == rhs.nameUTF8)||((this.nameUTF8 != null)&&this.nameUTF8 .equals(rhs.nameUTF8))))&&((this.stations == rhs.stations)||((this.stations!= null)&&this.stations.equals(rhs.stations))))&&((this.legacyCode == rhs.legacyCode)||((this.legacyCode!= null)&&this.legacyCode.equals(rhs.legacyCode))))&&((this.fareProvider == rhs.fareProvider)||((this.fareProvider!= null)&&this.fareProvider.equals(rhs.fareProvider))));
    }

}
