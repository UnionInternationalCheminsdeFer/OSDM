
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "codeList",
    "code",
    "country",
    "name",
    "geoCoordinate"
})
public class StationDef {

    /**
     * Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    @JsonPropertyDescription("Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code")
    private String codeList = "UIC";
    /**
     * the code representing the station in the specified code-list
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("the code representing the station in the specified code-list")
    private String code;
    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("ISO 3166 2A codes")
    private String country;
    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef name;
    /**
     * Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.
     * 
     */
    @JsonProperty("geoCoordinate")
    @JsonPropertyDescription("Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.")
    private GeoCoordinate geoCoordinate;

    /**
     * Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    public String getCodeList() {
        return codeList;
    }

    /**
     * Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    /**
     * the code representing the station in the specified code-list
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * the code representing the station in the specified code-list
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("name")
    public TextDef getName() {
        return name;
    }

    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("name")
    public void setName(TextDef name) {
        this.name = name;
    }

    /**
     * Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.
     * 
     */
    @JsonProperty("geoCoordinate")
    public GeoCoordinate getGeoCoordinate() {
        return geoCoordinate;
    }

    /**
     * Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.
     * 
     */
    @JsonProperty("geoCoordinate")
    public void setGeoCoordinate(GeoCoordinate geoCoordinate) {
        this.geoCoordinate = geoCoordinate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codeList");
        sb.append('=');
        sb.append(((this.codeList == null)?"<null>":this.codeList));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("geoCoordinate");
        sb.append('=');
        sb.append(((this.geoCoordinate == null)?"<null>":this.geoCoordinate));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.codeList == null)? 0 :this.codeList.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.geoCoordinate == null)? 0 :this.geoCoordinate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationDef) == false) {
            return false;
        }
        StationDef rhs = ((StationDef) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.codeList == rhs.codeList)||((this.codeList!= null)&&this.codeList.equals(rhs.codeList))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.geoCoordinate == rhs.geoCoordinate)||((this.geoCoordinate!= null)&&this.geoCoordinate.equals(rhs.geoCoordinate))));
    }

}
