
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fareType",
    "nameRef",
    "priceRef",
    "regionalConstraintRef",
    "serviceConstraintRef",
    "carrierConstraintRef",
    "serviceClassRef",
    "serviceLevelRef",
    "passengerConstraintRef",
    "afterSalesRulesRef",
    "combinationConstraintRef",
    "fullfillmentConstraintRef",
    "reductionConstraintRef",
    "reservationParameterRef",
    "personalDataConstraintRef",
    "legacyAccountingIdentifier",
    "fareDetailDescriptionRef",
    "salesAvailabilityConstraintRef",
    "travelValidityConstraintRef",
    "legacyConversion"
})
public class FareDef {

    /**
     * unique id of the fare item to be included in accountings
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("unique id of the fare item to be included in accountings")
    private String id;
    /**
     * IRT,NRT,RES,ANX
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    @JsonPropertyDescription("IRT,NRT,RES,ANX")
    private String fareType;
    /**
     * reference to the offer name
     * 
     */
    @JsonProperty("nameRef")
    @JsonPropertyDescription("reference to the offer name")
    private String nameRef;
    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    @JsonPropertyDescription("reference to the price ")
    private String priceRef;
    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    @JsonPropertyDescription("reference to the regional validity")
    private String regionalConstraintRef;
    @JsonProperty("serviceConstraintRef")
    private String serviceConstraintRef;
    @JsonProperty("carrierConstraintRef")
    private String carrierConstraintRef;
    @JsonProperty("serviceClassRef")
    private String serviceClassRef;
    @JsonProperty("serviceLevelRef")
    private String serviceLevelRef;
    @JsonProperty("passengerConstraintRef")
    private String passengerConstraintRef;
    @JsonProperty("afterSalesRulesRef")
    private String afterSalesRulesRef;
    @JsonProperty("combinationConstraintRef")
    private String combinationConstraintRef;
    @JsonProperty("fullfillmentConstraintRef")
    private String fullfillmentConstraintRef;
    @JsonProperty("reductionConstraintRef")
    private String reductionConstraintRef;
    @JsonProperty("reservationParameterRef")
    private String reservationParameterRef;
    @JsonProperty("personalDataConstraintRef")
    private String personalDataConstraintRef;
    /**
     * identifier of the fare in the current 301 accounting file data
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    @JsonPropertyDescription("identifier of the fare in the current 301 accounting file data")
    private LegacyAccountingIdentifier legacyAccountingIdentifier;
    /**
     * reference to a text with the details of the fare 
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    @JsonPropertyDescription("reference to a text with the details of the fare ")
    private String fareDetailDescriptionRef;
    @JsonProperty("salesAvailabilityConstraintRef")
    private String salesAvailabilityConstraintRef;
    @JsonProperty("travelValidityConstraintRef")
    private String travelValidityConstraintRef;
    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    @JsonPropertyDescription("options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise ")
    private String legacyConversion = "NO";

    
    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    @JsonPropertyDescription("indicates that the after sales of this fare can be treated independently per person.")
    private Boolean individualContracts = false;
    
    /**
     * unique id of the fare item to be included in accountings
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * unique id of the fare item to be included in accountings
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * IRT,NRT,RES,ANX
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    public String getFareType() {
        return fareType;
    }

    /**
     * IRT,NRT,RES,ANX
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    /**
     * reference to the offer name
     * 
     */
    @JsonProperty("nameRef")
    public String getNameRef() {
        return nameRef;
    }

    /**
     * reference to the offer name
     * 
     */
    @JsonProperty("nameRef")
    public void setNameRef(String nameRef) {
        this.nameRef = nameRef;
    }

    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    public String getPriceRef() {
        return priceRef;
    }

    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    public void setPriceRef(String priceRef) {
        this.priceRef = priceRef;
    }

    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    public String getRegionalConstraintRef() {
        return regionalConstraintRef;
    }

    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    public void setRegionalConstraintRef(String regionalConstraintRef) {
        this.regionalConstraintRef = regionalConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public String getServiceConstraintRef() {
        return serviceConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public void setServiceConstraintRef(String serviceConstraintRef) {
        this.serviceConstraintRef = serviceConstraintRef;
    }

    @JsonProperty("carrierConstraintRef")
    public String getCarrierConstraintRef() {
        return carrierConstraintRef;
    }

    @JsonProperty("carrierConstraintRef")
    public void setCarrierConstraintRef(String carrierConstraintRef) {
        this.carrierConstraintRef = carrierConstraintRef;
    }

    @JsonProperty("serviceClassRef")
    public String getServiceClassRef() {
        return serviceClassRef;
    }

    @JsonProperty("serviceClassRef")
    public void setServiceClassRef(String serviceClassRef) {
        this.serviceClassRef = serviceClassRef;
    }

    @JsonProperty("serviceLevelRef")
    public String getServiceLevelRef() {
        return serviceLevelRef;
    }

    @JsonProperty("serviceLevelRef")
    public void setServiceLevelRef(String serviceLevelRef) {
        this.serviceLevelRef = serviceLevelRef;
    }

    @JsonProperty("passengerConstraintRef")
    public String getPassengerConstraintRef() {
        return passengerConstraintRef;
    }

    @JsonProperty("passengerConstraintRef")
    public void setPassengerConstraintRef(String passengerConstraintRef) {
        this.passengerConstraintRef = passengerConstraintRef;
    }

    @JsonProperty("afterSalesRulesRef")
    public String getAfterSalesRulesRef() {
        return afterSalesRulesRef;
    }

    @JsonProperty("afterSalesRulesRef")
    public void setAfterSalesRulesRef(String afterSalesRulesRef) {
        this.afterSalesRulesRef = afterSalesRulesRef;
    }

    @JsonProperty("combinationConstraintRef")
    public String getCombinationConstraintRef() {
        return combinationConstraintRef;
    }

    @JsonProperty("combinationConstraintRef")
    public void setCombinationConstraintRef(String combinationConstraintRef) {
        this.combinationConstraintRef = combinationConstraintRef;
    }

    @JsonProperty("fullfillmentConstraintRef")
    public String getFullfillmentConstraintRef() {
        return fullfillmentConstraintRef;
    }

    @JsonProperty("fullfillmentConstraintRef")
    public void setFullfillmentConstraintRef(String fullfillmentConstraintRef) {
        this.fullfillmentConstraintRef = fullfillmentConstraintRef;
    }

    @JsonProperty("reductionConstraintRef")
    public String getReductionConstraintRef() {
        return reductionConstraintRef;
    }

    @JsonProperty("reductionConstraintRef")
    public void setReductionConstraintRef(String reductionConstraintRef) {
        this.reductionConstraintRef = reductionConstraintRef;
    }

    @JsonProperty("reservationParameterRef")
    public String getReservationParameterRef() {
        return reservationParameterRef;
    }

    @JsonProperty("reservationParameterRef")
    public void setReservationParameterRef(String reservationParameterRef) {
        this.reservationParameterRef = reservationParameterRef;
    }

    @JsonProperty("personalDataConstraintRef")
    public String getPersonalDataConstraintRef() {
        return personalDataConstraintRef;
    }

    @JsonProperty("personalDataConstraintRef")
    public void setPersonalDataConstraintRef(String personalDataConstraintRef) {
        this.personalDataConstraintRef = personalDataConstraintRef;
    }

    /**
     * identifier of the fare in the current 301 accounting file data
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    public LegacyAccountingIdentifier getLegacyAccountingIdentifier() {
        return legacyAccountingIdentifier;
    }

    /**
     * identifier of the fare in the current 301 accounting file data
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    public void setLegacyAccountingIdentifier(LegacyAccountingIdentifier legacyAccountingIdentifier) {
        this.legacyAccountingIdentifier = legacyAccountingIdentifier;
    }

    /**
     * reference to a text with the details of the fare 
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    public String getFareDetailDescriptionRef() {
        return fareDetailDescriptionRef;
    }

    /**
     * reference to a text with the details of the fare 
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    public void setFareDetailDescriptionRef(String fareDetailDescriptionRef) {
        this.fareDetailDescriptionRef = fareDetailDescriptionRef;
    }

    @JsonProperty("salesAvailabilityConstraintRef")
    public String getSalesAvailabilityConstraintRef() {
        return salesAvailabilityConstraintRef;
    }

    @JsonProperty("salesAvailabilityConstraintRef")
    public void setSalesAvailabilityConstraintRef(String salesAvailabilityConstraintRef) {
        this.salesAvailabilityConstraintRef = salesAvailabilityConstraintRef;
    }

    @JsonProperty("travelValidityConstraintRef")
    public String getTravelValidityConstraintRef() {
        return travelValidityConstraintRef;
    }

    @JsonProperty("travelValidityConstraintRef")
    public void setTravelValidityConstraintRef(String travelValidityConstraintRef) {
        this.travelValidityConstraintRef = travelValidityConstraintRef;
    }

    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    public String getLegacyConversion() {
        return legacyConversion;
    }

    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    public void setLegacyConversion(String legacyConversion) {
        this.legacyConversion = legacyConversion;
    }
    
    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    public Boolean getIndividualContracts() {
        return individualContracts;
    }
    
    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    public void setIndividualContracts(Boolean individualContracts) {
        this.individualContracts = individualContracts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fareType");
        sb.append('=');
        sb.append(((this.fareType == null)?"<null>":this.fareType));
        sb.append(',');
        sb.append("nameRef");
        sb.append('=');
        sb.append(((this.nameRef == null)?"<null>":this.nameRef));
        sb.append(',');
        sb.append("priceRef");
        sb.append('=');
        sb.append(((this.priceRef == null)?"<null>":this.priceRef));
        sb.append(',');
        sb.append("regionalConstraintRef");
        sb.append('=');
        sb.append(((this.regionalConstraintRef == null)?"<null>":this.regionalConstraintRef));
        sb.append(',');
        sb.append("serviceConstraintRef");
        sb.append('=');
        sb.append(((this.serviceConstraintRef == null)?"<null>":this.serviceConstraintRef));
        sb.append(',');
        sb.append("carrierConstraintRef");
        sb.append('=');
        sb.append(((this.carrierConstraintRef == null)?"<null>":this.carrierConstraintRef));
        sb.append(',');
        sb.append("serviceClassRef");
        sb.append('=');
        sb.append(((this.serviceClassRef == null)?"<null>":this.serviceClassRef));
        sb.append(',');
        sb.append("serviceLevelRef");
        sb.append('=');
        sb.append(((this.serviceLevelRef == null)?"<null>":this.serviceLevelRef));
        sb.append(',');
        sb.append("passengerConstraintRef");
        sb.append('=');
        sb.append(((this.passengerConstraintRef == null)?"<null>":this.passengerConstraintRef));
        sb.append(',');
        sb.append("afterSalesRulesRef");
        sb.append('=');
        sb.append(((this.afterSalesRulesRef == null)?"<null>":this.afterSalesRulesRef));
        sb.append(',');
        sb.append("combinationConstraintRef");
        sb.append('=');
        sb.append(((this.combinationConstraintRef == null)?"<null>":this.combinationConstraintRef));
        sb.append(',');
        sb.append("fullfillmentConstraintRef");
        sb.append('=');
        sb.append(((this.fullfillmentConstraintRef == null)?"<null>":this.fullfillmentConstraintRef));
        sb.append(',');
        sb.append("reductionConstraintRef");
        sb.append('=');
        sb.append(((this.reductionConstraintRef == null)?"<null>":this.reductionConstraintRef));
        sb.append(',');
        sb.append("reservationParameterRef");
        sb.append('=');
        sb.append(((this.reservationParameterRef == null)?"<null>":this.reservationParameterRef));
        sb.append(',');
        sb.append("personalDataConstraintRef");
        sb.append('=');
        sb.append(((this.personalDataConstraintRef == null)?"<null>":this.personalDataConstraintRef));
        sb.append(',');
        sb.append("legacyAccountingIdentifier");
        sb.append('=');
        sb.append(((this.legacyAccountingIdentifier == null)?"<null>":this.legacyAccountingIdentifier));
        sb.append(',');
        sb.append("fareDetailDescriptionRef");
        sb.append('=');
        sb.append(((this.fareDetailDescriptionRef == null)?"<null>":this.fareDetailDescriptionRef));
        sb.append(',');
        sb.append("salesAvailabilityConstraintRef");
        sb.append('=');
        sb.append(((this.salesAvailabilityConstraintRef == null)?"<null>":this.salesAvailabilityConstraintRef));
        sb.append(',');
        sb.append("travelValidityConstraintRef");
        sb.append('=');
        sb.append(((this.travelValidityConstraintRef == null)?"<null>":this.travelValidityConstraintRef));
        sb.append(',');
        sb.append("legacyConversion");
        sb.append('=');
        sb.append(((this.legacyConversion == null)?"<null>":this.legacyConversion));
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
        result = ((result* 31)+((this.fareDetailDescriptionRef == null)? 0 :this.fareDetailDescriptionRef.hashCode()));
        result = ((result* 31)+((this.travelValidityConstraintRef == null)? 0 :this.travelValidityConstraintRef.hashCode()));
        result = ((result* 31)+((this.afterSalesRulesRef == null)? 0 :this.afterSalesRulesRef.hashCode()));
        result = ((result* 31)+((this.serviceConstraintRef == null)? 0 :this.serviceConstraintRef.hashCode()));
        result = ((result* 31)+((this.serviceLevelRef == null)? 0 :this.serviceLevelRef.hashCode()));
        result = ((result* 31)+((this.nameRef == null)? 0 :this.nameRef.hashCode()));
        result = ((result* 31)+((this.carrierConstraintRef == null)? 0 :this.carrierConstraintRef.hashCode()));
        result = ((result* 31)+((this.personalDataConstraintRef == null)? 0 :this.personalDataConstraintRef.hashCode()));
        result = ((result* 31)+((this.reductionConstraintRef == null)? 0 :this.reductionConstraintRef.hashCode()));
        result = ((result* 31)+((this.serviceClassRef == null)? 0 :this.serviceClassRef.hashCode()));
        result = ((result* 31)+((this.passengerConstraintRef == null)? 0 :this.passengerConstraintRef.hashCode()));
        result = ((result* 31)+((this.priceRef == null)? 0 :this.priceRef.hashCode()));
        result = ((result* 31)+((this.combinationConstraintRef == null)? 0 :this.combinationConstraintRef.hashCode()));
        result = ((result* 31)+((this.fullfillmentConstraintRef == null)? 0 :this.fullfillmentConstraintRef.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.regionalConstraintRef == null)? 0 :this.regionalConstraintRef.hashCode()));
        result = ((result* 31)+((this.fareType == null)? 0 :this.fareType.hashCode()));
        result = ((result* 31)+((this.legacyAccountingIdentifier == null)? 0 :this.legacyAccountingIdentifier.hashCode()));
        result = ((result* 31)+((this.reservationParameterRef == null)? 0 :this.reservationParameterRef.hashCode()));
        result = ((result* 31)+((this.salesAvailabilityConstraintRef == null)? 0 :this.salesAvailabilityConstraintRef.hashCode()));
        result = ((result* 31)+((this.legacyConversion == null)? 0 :this.legacyConversion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareDef) == false) {
            return false;
        }
        FareDef rhs = ((FareDef) other);
        return ((((((((((((((((((((((this.fareDetailDescriptionRef == rhs.fareDetailDescriptionRef)||((this.fareDetailDescriptionRef!= null)&&this.fareDetailDescriptionRef.equals(rhs.fareDetailDescriptionRef)))&&((this.travelValidityConstraintRef == rhs.travelValidityConstraintRef)||((this.travelValidityConstraintRef!= null)&&this.travelValidityConstraintRef.equals(rhs.travelValidityConstraintRef))))&&((this.afterSalesRulesRef == rhs.afterSalesRulesRef)||((this.afterSalesRulesRef!= null)&&this.afterSalesRulesRef.equals(rhs.afterSalesRulesRef))))&&((this.serviceConstraintRef == rhs.serviceConstraintRef)||((this.serviceConstraintRef!= null)&&this.serviceConstraintRef.equals(rhs.serviceConstraintRef))))&&((this.serviceLevelRef == rhs.serviceLevelRef)||((this.serviceLevelRef!= null)&&this.serviceLevelRef.equals(rhs.serviceLevelRef))))&&((this.nameRef == rhs.nameRef)||((this.nameRef!= null)&&this.nameRef.equals(rhs.nameRef))))&&((this.carrierConstraintRef == rhs.carrierConstraintRef)||((this.carrierConstraintRef!= null)&&this.carrierConstraintRef.equals(rhs.carrierConstraintRef))))&&((this.personalDataConstraintRef == rhs.personalDataConstraintRef)||((this.personalDataConstraintRef!= null)&&this.personalDataConstraintRef.equals(rhs.personalDataConstraintRef))))&&((this.reductionConstraintRef == rhs.reductionConstraintRef)||((this.reductionConstraintRef!= null)&&this.reductionConstraintRef.equals(rhs.reductionConstraintRef))))&&((this.serviceClassRef == rhs.serviceClassRef)||((this.serviceClassRef!= null)&&this.serviceClassRef.equals(rhs.serviceClassRef))))&&((this.passengerConstraintRef == rhs.passengerConstraintRef)||((this.passengerConstraintRef!= null)&&this.passengerConstraintRef.equals(rhs.passengerConstraintRef))))&&((this.priceRef == rhs.priceRef)||((this.priceRef!= null)&&this.priceRef.equals(rhs.priceRef))))&&((this.combinationConstraintRef == rhs.combinationConstraintRef)||((this.combinationConstraintRef!= null)&&this.combinationConstraintRef.equals(rhs.combinationConstraintRef))))&&((this.fullfillmentConstraintRef == rhs.fullfillmentConstraintRef)||((this.fullfillmentConstraintRef!= null)&&this.fullfillmentConstraintRef.equals(rhs.fullfillmentConstraintRef))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.regionalConstraintRef == rhs.regionalConstraintRef)||((this.regionalConstraintRef!= null)&&this.regionalConstraintRef.equals(rhs.regionalConstraintRef))))&&((this.fareType == rhs.fareType)||((this.fareType!= null)&&this.fareType.equals(rhs.fareType))))&&((this.legacyAccountingIdentifier == rhs.legacyAccountingIdentifier)||((this.legacyAccountingIdentifier!= null)&&this.legacyAccountingIdentifier.equals(rhs.legacyAccountingIdentifier))))&&((this.reservationParameterRef == rhs.reservationParameterRef)||((this.reservationParameterRef!= null)&&this.reservationParameterRef.equals(rhs.reservationParameterRef))))&&((this.salesAvailabilityConstraintRef == rhs.salesAvailabilityConstraintRef)||((this.salesAvailabilityConstraintRef!= null)&&this.salesAvailabilityConstraintRef.equals(rhs.salesAvailabilityConstraintRef))))&&((this.legacyConversion == rhs.legacyConversion)||((this.legacyConversion!= null)&&this.legacyConversion.equals(rhs.legacyConversion))));
    }

}
