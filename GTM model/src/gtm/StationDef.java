
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CodeList",
    "Country",
    "LocalCode",
    "Name"
})
public class StationDef {

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("CodeList")
    @JsonPropertyDescription("code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code")
    private String codeList = "UIC";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LocalCode")
    private String localCode;
    @JsonProperty("Name")
    private String name;

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("CodeList")
    public String getCodeList() {
        return codeList;
    }

    /**
     * code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default// UIC-R = UIC codes for reservation (UIC country code + local code reservation) // ERA = future ERA station code
     * 
     */
    @JsonProperty("CodeList")
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LocalCode")
    public String getLocalCode() {
        return localCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LocalCode")
    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
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
