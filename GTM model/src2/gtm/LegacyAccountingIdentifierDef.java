
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * identifier of the fare in the current 301 accounting file
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "serialId",
    "addId",
    "tariffId"
})
public class LegacyAccountingIdentifierDef {

    /**
     * sequential number of regional validities
     * 
     */
    @JsonProperty("serialId")
    @JsonPropertyDescription("sequential number of regional validities")
    private Integer serialId;
    /**
     * sequential number of regional validities (leading positions in case the series is too short
     * 
     */
    @JsonProperty("addId")
    @JsonPropertyDescription("sequential number of regional validities (leading positions in case the series is too short")
    private Integer addId;
    /**
     * sequential number of the fares for one regional validity
     * 
     */
    @JsonProperty("tariffId")
    @JsonPropertyDescription("sequential number of the fares for one regional validity")
    private Integer tariffId;

    /**
     * sequential number of regional validities
     * 
     */
    @JsonProperty("serialId")
    public Integer getSerialId() {
        return serialId;
    }

    /**
     * sequential number of regional validities
     * 
     */
    @JsonProperty("serialId")
    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    /**
     * sequential number of regional validities (leading positions in case the series is too short
     * 
     */
    @JsonProperty("addId")
    public Integer getAddId() {
        return addId;
    }

    /**
     * sequential number of regional validities (leading positions in case the series is too short
     * 
     */
    @JsonProperty("addId")
    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    /**
     * sequential number of the fares for one regional validity
     * 
     */
    @JsonProperty("tariffId")
    public Integer getTariffId() {
        return tariffId;
    }

    /**
     * sequential number of the fares for one regional validity
     * 
     */
    @JsonProperty("tariffId")
    public void setTariffId(Integer tariffId) {
        this.tariffId = tariffId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LegacyAccountingIdentifierDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serialId");
        sb.append('=');
        sb.append(((this.serialId == null)?"<null>":this.serialId));
        sb.append(',');
        sb.append("addId");
        sb.append('=');
        sb.append(((this.addId == null)?"<null>":this.addId));
        sb.append(',');
        sb.append("tariffId");
        sb.append('=');
        sb.append(((this.tariffId == null)?"<null>":this.tariffId));
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
        result = ((result* 31)+((this.addId == null)? 0 :this.addId.hashCode()));
        result = ((result* 31)+((this.tariffId == null)? 0 :this.tariffId.hashCode()));
        result = ((result* 31)+((this.serialId == null)? 0 :this.serialId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LegacyAccountingIdentifierDef) == false) {
            return false;
        }
        LegacyAccountingIdentifierDef rhs = ((LegacyAccountingIdentifierDef) other);
        return ((((this.addId == rhs.addId)||((this.addId!= null)&&this.addId.equals(rhs.addId)))&&((this.tariffId == rhs.tariffId)||((this.tariffId!= null)&&this.tariffId.equals(rhs.tariffId))))&&((this.serialId == rhs.serialId)||((this.serialId!= null)&&this.serialId.equals(rhs.serialId))));
    }

}
