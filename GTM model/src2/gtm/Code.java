
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "codeList",
    "stationCode"
})
public class Code {

    /**
     * Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code
     * 
     */
    @JsonProperty("codeList")
    @JsonPropertyDescription("Code list used for the station codes: UIC = UIC codes as used by merits (UIC country code + local code) = Default/ UIC-R = UIC codes for reservation (UIC country code + local code reservation) / ERA = future ERA station code")
    private String codeList = "UIC";
    /**
     * the code representing the station in the specified code-list
     * 
     */
    @JsonProperty("stationCode")
    @JsonPropertyDescription("the code representing the station in the specified code-list")
    private String stationCode;

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
     * 
     */
    @JsonProperty("stationCode")
    public String getStationCode() {
        return stationCode;
    }

    /**
     * the code representing the station in the specified code-list
     * 
     */
    @JsonProperty("stationCode")
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Code.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codeList");
        sb.append('=');
        sb.append(((this.codeList == null)?"<null>":this.codeList));
        sb.append(',');
        sb.append("stationCode");
        sb.append('=');
        sb.append(((this.stationCode == null)?"<null>":this.stationCode));
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
        result = ((result* 31)+((this.stationCode == null)? 0 :this.stationCode.hashCode()));
        result = ((result* 31)+((this.codeList == null)? 0 :this.codeList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Code) == false) {
            return false;
        }
        Code rhs = ((Code) other);
        return (((this.stationCode == rhs.stationCode)||((this.stationCode!= null)&&this.stationCode.equals(rhs.stationCode)))&&((this.codeList == rhs.codeList)||((this.codeList!= null)&&this.codeList.equals(rhs.codeList))));
    }

}
