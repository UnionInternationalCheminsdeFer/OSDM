
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * reference to a list of stations included in the fare
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier",
    "code",
    "name"
})
public class FareReferenceStationSet {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
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
        sb.append(FareReferenceStationSet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareReferenceStationSet) == false) {
            return false;
        }
        FareReferenceStationSet rhs = ((FareReferenceStationSet) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))));
    }

}
