
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * reservation parameter to support the UIC 90918-1 interface for booking
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "travelClass",
    "serviceLevelCode",
    "serviceCode",
    "berthType",
    "coachTypeCode",
    "compartmentTypeCode",
    "tariff"
})
public class LegacyReservationParameterDef {

    /**
     *  90918-1 class code in reservation
     * (Required)
     * 
     */
    @JsonProperty("travelClass")
    @JsonPropertyDescription("90918-1 class code in reservation")
    private String travelClass;
    /**
     * service level code defined in UIC 90918-1
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    @JsonPropertyDescription("service level code defined in UIC 90918-1")
    private String serviceLevelCode;
    /**
     * service code to be used in reservation
     * (Required)
     * 
     */
    @JsonProperty("serviceCode")
    @JsonPropertyDescription("service code to be used in reservation")
    private String serviceCode;
    @JsonProperty("berthType")
    private String berthType;
    @JsonProperty("coachTypeCode")
    private String coachTypeCode;
    @JsonProperty("compartmentTypeCode")
    private String compartmentTypeCode;
    @JsonProperty("tariff")
    private String tariff;

    /**
     *  90918-1 class code in reservation
     * (Required)
     * 
     */
    @JsonProperty("travelClass")
    public String getTravelClass() {
        return travelClass;
    }

    /**
     *  90918-1 class code in reservation
     * (Required)
     * 
     */
    @JsonProperty("travelClass")
    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    /**
     * service level code defined in UIC 90918-1
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    /**
     * service level code defined in UIC 90918-1
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    /**
     * service code to be used in reservation
     * (Required)
     * 
     */
    @JsonProperty("serviceCode")
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * service code to be used in reservation
     * (Required)
     * 
     */
    @JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @JsonProperty("berthType")
    public String getBerthType() {
        return berthType;
    }

    @JsonProperty("berthType")
    public void setBerthType(String berthType) {
        this.berthType = berthType;
    }

    @JsonProperty("coachTypeCode")
    public String getCoachTypeCode() {
        return coachTypeCode;
    }

    @JsonProperty("coachTypeCode")
    public void setCoachTypeCode(String coachTypeCode) {
        this.coachTypeCode = coachTypeCode;
    }

    @JsonProperty("compartmentTypeCode")
    public String getCompartmentTypeCode() {
        return compartmentTypeCode;
    }

    @JsonProperty("compartmentTypeCode")
    public void setCompartmentTypeCode(String compartmentTypeCode) {
        this.compartmentTypeCode = compartmentTypeCode;
    }

    @JsonProperty("tariff")
    public String getTariff() {
        return tariff;
    }

    @JsonProperty("tariff")
    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LegacyReservationParameterDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("travelClass");
        sb.append('=');
        sb.append(((this.travelClass == null)?"<null>":this.travelClass));
        sb.append(',');
        sb.append("serviceLevelCode");
        sb.append('=');
        sb.append(((this.serviceLevelCode == null)?"<null>":this.serviceLevelCode));
        sb.append(',');
        sb.append("serviceCode");
        sb.append('=');
        sb.append(((this.serviceCode == null)?"<null>":this.serviceCode));
        sb.append(',');
        sb.append("berthType");
        sb.append('=');
        sb.append(((this.berthType == null)?"<null>":this.berthType));
        sb.append(',');
        sb.append("coachTypeCode");
        sb.append('=');
        sb.append(((this.coachTypeCode == null)?"<null>":this.coachTypeCode));
        sb.append(',');
        sb.append("compartmentTypeCode");
        sb.append('=');
        sb.append(((this.compartmentTypeCode == null)?"<null>":this.compartmentTypeCode));
        sb.append(',');
        sb.append("tariff");
        sb.append('=');
        sb.append(((this.tariff == null)?"<null>":this.tariff));
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
        result = ((result* 31)+((this.coachTypeCode == null)? 0 :this.coachTypeCode.hashCode()));
        result = ((result* 31)+((this.serviceCode == null)? 0 :this.serviceCode.hashCode()));
        result = ((result* 31)+((this.serviceLevelCode == null)? 0 :this.serviceLevelCode.hashCode()));
        result = ((result* 31)+((this.compartmentTypeCode == null)? 0 :this.compartmentTypeCode.hashCode()));
        result = ((result* 31)+((this.tariff == null)? 0 :this.tariff.hashCode()));
        result = ((result* 31)+((this.berthType == null)? 0 :this.berthType.hashCode()));
        result = ((result* 31)+((this.travelClass == null)? 0 :this.travelClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LegacyReservationParameterDef) == false) {
            return false;
        }
        LegacyReservationParameterDef rhs = ((LegacyReservationParameterDef) other);
        return ((((((((this.coachTypeCode == rhs.coachTypeCode)||((this.coachTypeCode!= null)&&this.coachTypeCode.equals(rhs.coachTypeCode)))&&((this.serviceCode == rhs.serviceCode)||((this.serviceCode!= null)&&this.serviceCode.equals(rhs.serviceCode))))&&((this.serviceLevelCode == rhs.serviceLevelCode)||((this.serviceLevelCode!= null)&&this.serviceLevelCode.equals(rhs.serviceLevelCode))))&&((this.compartmentTypeCode == rhs.compartmentTypeCode)||((this.compartmentTypeCode!= null)&&this.compartmentTypeCode.equals(rhs.compartmentTypeCode))))&&((this.tariff == rhs.tariff)||((this.tariff!= null)&&this.tariff.equals(rhs.tariff))))&&((this.berthType == rhs.berthType)||((this.berthType!= null)&&this.berthType.equals(rhs.berthType))))&&((this.travelClass == rhs.travelClass)||((this.travelClass!= null)&&this.travelClass.equals(rhs.travelClass))));
    }

}
