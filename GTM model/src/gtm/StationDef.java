
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codeList",
    "country",
    "localCode",
    "name"
})
public class StationDef {

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    @JsonPropertyDescription("code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code")
    private String codeList = "UIC";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("localCode")
    private String localCode;
    @JsonProperty("name")
    private String name;

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    public String getCodeList() {
        return codeList;
    }

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("localCode")
    public String getLocalCode() {
        return localCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("localCode")
    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codeList");
        sb.append('=');
        sb.append(((this.codeList == null)?"<null>":this.codeList));
        sb.append(',');
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
        result = ((result* 31)+((this.localCode == null)? 0 :this.localCode.hashCode()));
        result = ((result* 31)+((this.codeList == null)? 0 :this.codeList.hashCode()));
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
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.localCode == rhs.localCode)||((this.localCode!= null)&&this.localCode.equals(rhs.localCode))))&&((this.codeList == rhs.codeList)||((this.codeList!= null)&&this.codeList.equals(rhs.codeList))));
    }

}
