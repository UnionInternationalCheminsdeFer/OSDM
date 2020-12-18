
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * station names included temporarily until MERITS can provide the names
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "country",
    "localCode",
    "name",
    "nameUtf8",
    "legacyBorderPointCode"
})
public class StationNamesDef {

    /**
     * uic country code
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("uic country code")
    private Integer country;
    /**
     * local code 
     * 
     */
    @JsonProperty("localCode")
    @JsonPropertyDescription("local code ")
    private Integer localCode;
    /**
     * station name with upper and lower case letters in ASCII
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("station name with upper and lower case letters in ASCII")
    private String name;
    /**
     * station name with upper and lower case letters in UTF8
     * 
     */
    @JsonProperty("nameUtf8")
    @JsonPropertyDescription("station name with upper and lower case letters in UTF8")
    private String nameUtf8;
    @JsonProperty("legacyBorderPointCode")
    private Integer legacyBorderPointCode;

    /**
     * uic country code
     * 
     */
    @JsonProperty("country")
    public Integer getCountry() {
        return country;
    }

    /**
     * uic country code
     * 
     */
    @JsonProperty("country")
    public void setCountry(Integer country) {
        this.country = country;
    }

    /**
     * local code 
     * 
     */
    @JsonProperty("localCode")
    public Integer getLocalCode() {
        return localCode;
    }

    /**
     * local code 
     * 
     */
    @JsonProperty("localCode")
    public void setLocalCode(Integer localCode) {
        this.localCode = localCode;
    }

    /**
     * station name with upper and lower case letters in ASCII
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * station name with upper and lower case letters in ASCII
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * station name with upper and lower case letters in UTF8
     * 
     */
    @JsonProperty("nameUtf8")
    public String getNameUtf8() {
        return nameUtf8;
    }

    /**
     * station name with upper and lower case letters in UTF8
     * 
     */
    @JsonProperty("nameUtf8")
    public void setNameUtf8(String nameUtf8) {
        this.nameUtf8 = nameUtf8;
    }

    @JsonProperty("legacyBorderPointCode")
    public Integer getLegacyBorderPointCode() {
        return legacyBorderPointCode;
    }

    @JsonProperty("legacyBorderPointCode")
    public void setLegacyBorderPointCode(Integer legacyBorderPointCode) {
        this.legacyBorderPointCode = legacyBorderPointCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationNamesDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("localCode");
        sb.append('=');
        sb.append(((this.localCode == null)?"<null>":this.localCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameUtf8");
        sb.append('=');
        sb.append(((this.nameUtf8 == null)?"<null>":this.nameUtf8));
        sb.append(',');
        sb.append("legacyBorderPointCode");
        sb.append('=');
        sb.append(((this.legacyBorderPointCode == null)?"<null>":this.legacyBorderPointCode));
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
        result = ((result* 31)+((this.nameUtf8 == null)? 0 :this.nameUtf8 .hashCode()));
        result = ((result* 31)+((this.localCode == null)? 0 :this.localCode.hashCode()));
        result = ((result* 31)+((this.legacyBorderPointCode == null)? 0 :this.legacyBorderPointCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationNamesDef) == false) {
            return false;
        }
        StationNamesDef rhs = ((StationNamesDef) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.nameUtf8 == rhs.nameUtf8)||((this.nameUtf8 != null)&&this.nameUtf8 .equals(rhs.nameUtf8))))&&((this.localCode == rhs.localCode)||((this.localCode!= null)&&this.localCode.equals(rhs.localCode))))&&((this.legacyBorderPointCode == rhs.legacyBorderPointCode)||((this.legacyBorderPointCode!= null)&&this.legacyBorderPointCode.equals(rhs.legacyBorderPointCode))));
    }

}
