
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "passengerType",
    "nameRef",
    "upperAgeLimit",
    "lowerAgeLimit",
    "ageLimitToTravelAlone",
    "ageLimitForReservation",
    "isAncillaryItem",
    "combinationConstraint",
    "includedFreePassenger",
    "passengerWeight",
    "maxWeightedPassengers",
    "minWeightedPassengers"
})
public class PassengerConstraintDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * see code list travelerType
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    @JsonPropertyDescription("see code list travelerType")
    private String passengerType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameRef")
    private String nameRef;
    @JsonProperty("upperAgeLimit")
    private Integer upperAgeLimit;
    @JsonProperty("lowerAgeLimit")
    private Integer lowerAgeLimit;
    @JsonProperty("ageLimitToTravelAlone")
    private Integer ageLimitToTravelAlone;
    @JsonProperty("ageLimitForReservation")
    private Integer ageLimitForReservation;
    @JsonProperty("isAncillaryItem")
    private Boolean isAncillaryItem = false;
    @JsonProperty("combinationConstraint")
    private List<CombinationConstraint> combinationConstraint = new ArrayList<CombinationConstraint>();
    @JsonProperty("includedFreePassenger")
    private List<IncludedFreePassenger> includedFreePassenger = new ArrayList<IncludedFreePassenger>();
    @JsonProperty("passengerWeight")
    private Float passengerWeight;
    /**
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    @JsonPropertyDescription("The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum")
    private Float maxWeightedPassengers;
    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    @JsonPropertyDescription("The total weighted number of passengers on the offer is restricted to equal or larger than this minimum")
    private Float minWeightedPassengers;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * see code list travelerType
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * see code list travelerType
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameRef")
    public String getNameRef() {
        return nameRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameRef")
    public void setNameRef(String nameRef) {
        this.nameRef = nameRef;
    }

    @JsonProperty("upperAgeLimit")
    public Integer getUpperAgeLimit() {
        return upperAgeLimit;
    }

    @JsonProperty("upperAgeLimit")
    public void setUpperAgeLimit(Integer upperAgeLimit) {
        this.upperAgeLimit = upperAgeLimit;
    }

    @JsonProperty("lowerAgeLimit")
    public Integer getLowerAgeLimit() {
        return lowerAgeLimit;
    }

    @JsonProperty("lowerAgeLimit")
    public void setLowerAgeLimit(Integer lowerAgeLimit) {
        this.lowerAgeLimit = lowerAgeLimit;
    }

    @JsonProperty("ageLimitToTravelAlone")
    public Integer getAgeLimitToTravelAlone() {
        return ageLimitToTravelAlone;
    }

    @JsonProperty("ageLimitToTravelAlone")
    public void setAgeLimitToTravelAlone(Integer ageLimitToTravelAlone) {
        this.ageLimitToTravelAlone = ageLimitToTravelAlone;
    }

    @JsonProperty("ageLimitForReservation")
    public Integer getAgeLimitForReservation() {
        return ageLimitForReservation;
    }

    @JsonProperty("ageLimitForReservation")
    public void setAgeLimitForReservation(Integer ageLimitForReservation) {
        this.ageLimitForReservation = ageLimitForReservation;
    }

    @JsonProperty("isAncillaryItem")
    public Boolean getIsAncillaryItem() {
        return isAncillaryItem;
    }

    @JsonProperty("isAncillaryItem")
    public void setIsAncillaryItem(Boolean isAncillaryItem) {
        this.isAncillaryItem = isAncillaryItem;
    }

    @JsonProperty("combinationConstraint")
    public List<CombinationConstraint> getCombinationConstraint() {
        return combinationConstraint;
    }

    @JsonProperty("combinationConstraint")
    public void setCombinationConstraint(List<CombinationConstraint> combinationConstraint) {
        this.combinationConstraint = combinationConstraint;
    }

    @JsonProperty("includedFreePassenger")
    public List<IncludedFreePassenger> getIncludedFreePassenger() {
        return includedFreePassenger;
    }

    @JsonProperty("includedFreePassenger")
    public void setIncludedFreePassenger(List<IncludedFreePassenger> includedFreePassenger) {
        this.includedFreePassenger = includedFreePassenger;
    }

    @JsonProperty("passengerWeight")
    public Float getPassengerWeight() {
        return passengerWeight;
    }

    @JsonProperty("passengerWeight")
    public void setPassengerWeight(Float passengerWeight) {
        this.passengerWeight = passengerWeight;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    public Float getMaxWeightedPassengers() {
        return maxWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    public void setMaxWeightedPassengers(Float maxWeightedPassengers) {
        this.maxWeightedPassengers = maxWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public Float getMinWeightedPassengers() {
        return minWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public void setMinWeightedPassengers(Float minWeightedPassengers) {
        this.minWeightedPassengers = minWeightedPassengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PassengerConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("passengerType");
        sb.append('=');
        sb.append(((this.passengerType == null)?"<null>":this.passengerType));
        sb.append(',');
        sb.append("nameRef");
        sb.append('=');
        sb.append(((this.nameRef == null)?"<null>":this.nameRef));
        sb.append(',');
        sb.append("upperAgeLimit");
        sb.append('=');
        sb.append(((this.upperAgeLimit == null)?"<null>":this.upperAgeLimit));
        sb.append(',');
        sb.append("lowerAgeLimit");
        sb.append('=');
        sb.append(((this.lowerAgeLimit == null)?"<null>":this.lowerAgeLimit));
        sb.append(',');
        sb.append("ageLimitToTravelAlone");
        sb.append('=');
        sb.append(((this.ageLimitToTravelAlone == null)?"<null>":this.ageLimitToTravelAlone));
        sb.append(',');
        sb.append("ageLimitForReservation");
        sb.append('=');
        sb.append(((this.ageLimitForReservation == null)?"<null>":this.ageLimitForReservation));
        sb.append(',');
        sb.append("isAncillaryItem");
        sb.append('=');
        sb.append(((this.isAncillaryItem == null)?"<null>":this.isAncillaryItem));
        sb.append(',');
        sb.append("combinationConstraint");
        sb.append('=');
        sb.append(((this.combinationConstraint == null)?"<null>":this.combinationConstraint));
        sb.append(',');
        sb.append("includedFreePassenger");
        sb.append('=');
        sb.append(((this.includedFreePassenger == null)?"<null>":this.includedFreePassenger));
        sb.append(',');
        sb.append("passengerWeight");
        sb.append('=');
        sb.append(((this.passengerWeight == null)?"<null>":this.passengerWeight));
        sb.append(',');
        sb.append("maxWeightedPassengers");
        sb.append('=');
        sb.append(((this.maxWeightedPassengers == null)?"<null>":this.maxWeightedPassengers));
        sb.append(',');
        sb.append("minWeightedPassengers");
        sb.append('=');
        sb.append(((this.minWeightedPassengers == null)?"<null>":this.minWeightedPassengers));
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
        result = ((result* 31)+((this.ageLimitForReservation == null)? 0 :this.ageLimitForReservation.hashCode()));
        result = ((result* 31)+((this.maxWeightedPassengers == null)? 0 :this.maxWeightedPassengers.hashCode()));
        result = ((result* 31)+((this.passengerWeight == null)? 0 :this.passengerWeight.hashCode()));
        result = ((result* 31)+((this.isAncillaryItem == null)? 0 :this.isAncillaryItem.hashCode()));
        result = ((result* 31)+((this.ageLimitToTravelAlone == null)? 0 :this.ageLimitToTravelAlone.hashCode()));
        result = ((result* 31)+((this.nameRef == null)? 0 :this.nameRef.hashCode()));
        result = ((result* 31)+((this.lowerAgeLimit == null)? 0 :this.lowerAgeLimit.hashCode()));
        result = ((result* 31)+((this.passengerType == null)? 0 :this.passengerType.hashCode()));
        result = ((result* 31)+((this.combinationConstraint == null)? 0 :this.combinationConstraint.hashCode()));
        result = ((result* 31)+((this.includedFreePassenger == null)? 0 :this.includedFreePassenger.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.upperAgeLimit == null)? 0 :this.upperAgeLimit.hashCode()));
        result = ((result* 31)+((this.minWeightedPassengers == null)? 0 :this.minWeightedPassengers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerConstraintDef) == false) {
            return false;
        }
        PassengerConstraintDef rhs = ((PassengerConstraintDef) other);
        return ((((((((((((((this.ageLimitForReservation == rhs.ageLimitForReservation)||((this.ageLimitForReservation!= null)&&this.ageLimitForReservation.equals(rhs.ageLimitForReservation)))&&((this.maxWeightedPassengers == rhs.maxWeightedPassengers)||((this.maxWeightedPassengers!= null)&&this.maxWeightedPassengers.equals(rhs.maxWeightedPassengers))))&&((this.passengerWeight == rhs.passengerWeight)||((this.passengerWeight!= null)&&this.passengerWeight.equals(rhs.passengerWeight))))&&((this.isAncillaryItem == rhs.isAncillaryItem)||((this.isAncillaryItem!= null)&&this.isAncillaryItem.equals(rhs.isAncillaryItem))))&&((this.ageLimitToTravelAlone == rhs.ageLimitToTravelAlone)||((this.ageLimitToTravelAlone!= null)&&this.ageLimitToTravelAlone.equals(rhs.ageLimitToTravelAlone))))&&((this.nameRef == rhs.nameRef)||((this.nameRef!= null)&&this.nameRef.equals(rhs.nameRef))))&&((this.lowerAgeLimit == rhs.lowerAgeLimit)||((this.lowerAgeLimit!= null)&&this.lowerAgeLimit.equals(rhs.lowerAgeLimit))))&&((this.passengerType == rhs.passengerType)||((this.passengerType!= null)&&this.passengerType.equals(rhs.passengerType))))&&((this.combinationConstraint == rhs.combinationConstraint)||((this.combinationConstraint!= null)&&this.combinationConstraint.equals(rhs.combinationConstraint))))&&((this.includedFreePassenger == rhs.includedFreePassenger)||((this.includedFreePassenger!= null)&&this.includedFreePassenger.equals(rhs.includedFreePassenger))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.upperAgeLimit == rhs.upperAgeLimit)||((this.upperAgeLimit!= null)&&this.upperAgeLimit.equals(rhs.upperAgeLimit))))&&((this.minWeightedPassengers == rhs.minWeightedPassengers)||((this.minWeightedPassengers!= null)&&this.minWeightedPassengers.equals(rhs.minWeightedPassengers))));
    }

}
