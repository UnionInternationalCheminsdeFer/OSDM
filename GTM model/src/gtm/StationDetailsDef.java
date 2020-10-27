
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details of a station. Station names are not translated but provided in some cases in multiple character sets in case stations are named in local characters and additionally in latin characters. In some countries stations have multiple names depending on the countries local languages.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "localCode",
    "country",
    "codes",
    "geoCoordinate",
    "name"
})
public class StationDetailsDef {

    /**
     * code unique with in the country only
     * 
     */
    @JsonProperty("localCode")
    @JsonPropertyDescription("code unique with in the country only")
    private String localCode;
    /**
     * ISO 3166 2A codes
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("ISO 3166 2A codes")
    private String country;
    /**
     * The codes that can be used to represent the given station on the system. There can be several codes, in which case  it is relevant to have a list of couples.
     * 
     */
    @JsonProperty("codes")
    @JsonPropertyDescription("The codes that can be used to represent the given station on the system. There can be several codes, in which case  it is relevant to have a list of couples.")
    private List<Code> codes = new ArrayList<Code>();
    /**
     * Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.
     * 
     */
    @JsonProperty("geoCoordinate")
    @JsonPropertyDescription("Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.")
    private GeoCoordinate geoCoordinate;
    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef name;

    /**
     * code unique with in the country only
     * 
     */
    @JsonProperty("localCode")
    public String getLocalCode() {
        return localCode;
    }

    /**
     * code unique with in the country only
     * 
     */
    @JsonProperty("localCode")
    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    /**
     * ISO 3166 2A codes
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * ISO 3166 2A codes
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The codes that can be used to represent the given station on the system. There can be several codes, in which case  it is relevant to have a list of couples.
     * 
     */
    @JsonProperty("codes")
    public List<Code> getCodes() {
        return codes;
    }

    /**
     * The codes that can be used to represent the given station on the system. There can be several codes, in which case  it is relevant to have a list of couples.
     * 
     */
    @JsonProperty("codes")
    public void setCodes(List<Code> codes) {
        this.codes = codes;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationDetailsDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localCode");
        sb.append('=');
        sb.append(((this.localCode == null)?"<null>":this.localCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("codes");
        sb.append('=');
        sb.append(((this.codes == null)?"<null>":this.codes));
        sb.append(',');
        sb.append("geoCoordinate");
        sb.append('=');
        sb.append(((this.geoCoordinate == null)?"<null>":this.geoCoordinate));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.codes == null)? 0 :this.codes.hashCode()));
        result = ((result* 31)+((this.localCode == null)? 0 :this.localCode.hashCode()));
        result = ((result* 31)+((this.geoCoordinate == null)? 0 :this.geoCoordinate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationDetailsDef) == false) {
            return false;
        }
        StationDetailsDef rhs = ((StationDetailsDef) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.codes == rhs.codes)||((this.codes!= null)&&this.codes.equals(rhs.codes))))&&((this.localCode == rhs.localCode)||((this.localCode!= null)&&this.localCode.equals(rhs.localCode))))&&((this.geoCoordinate == rhs.geoCoordinate)||((this.geoCoordinate!= null)&&this.geoCoordinate.equals(rhs.geoCoordinate))));
    }

}
