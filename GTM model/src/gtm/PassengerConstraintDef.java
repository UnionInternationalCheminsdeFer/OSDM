
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
    "nameRef",
    "upperAgeLimit",
    "lowerAgeLimit",
    "ageLimitToTravelAlone",
    "ageLimitForReservation",
    "isAncilliaryItem",
    "combinationConstraint",
    "includedFreePassenger",
    "passengerWeight",
    "maxWeightedPasseners",
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameRef")
    private String nameRef;
    @JsonProperty("upperAgeLimit")
    private Double upperAgeLimit;
    @JsonProperty("lowerAgeLimit")
    private Double lowerAgeLimit;
    @JsonProperty("ageLimitToTravelAlone")
    private Double ageLimitToTravelAlone;
    @JsonProperty("ageLimitForReservation")
    private Double ageLimitForReservation;
    /**
     * to indicate dogs, bicycles,.. 
     * 
     */
    @JsonProperty("isAncilliaryItem")
    @JsonPropertyDescription("to indicate dogs, bicycles,.. ")
    private Boolean isAncilliaryItem = false;
    @JsonProperty("combinationConstraint")
    private List<CombinationConstraint> combinationConstraint = new ArrayList<CombinationConstraint>();
    @JsonProperty("includedFreePassenger")
    private List<IncludedFreePassenger> includedFreePassenger = new ArrayList<IncludedFreePassenger>();
    @JsonProperty("passengerWeight")
    private Double passengerWeight;
    /**
     * the total weighted number of passengers on the offer is restricted to be equal or smaller than this  maximum 
     * 
     */
    @JsonProperty("maxWeightedPasseners")
    @JsonPropertyDescription("the total weighted number of passengers on the offer is restricted to be equal or smaller than this  maximum ")
    private Double maxWeightedPasseners;
    /**
     * the total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    @JsonPropertyDescription("the total weighted number of passengers on the offer is restricted to equal or larger than this minimum")
    private Double minWeightedPassengers;

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
    public Double getUpperAgeLimit() {
        return upperAgeLimit;
    }

    @JsonProperty("upperAgeLimit")
    public void setUpperAgeLimit(Double upperAgeLimit) {
        this.upperAgeLimit = upperAgeLimit;
    }

    @JsonProperty("lowerAgeLimit")
    public Double getLowerAgeLimit() {
        return lowerAgeLimit;
    }

    @JsonProperty("lowerAgeLimit")
    public void setLowerAgeLimit(Double lowerAgeLimit) {
        this.lowerAgeLimit = lowerAgeLimit;
    }

    @JsonProperty("ageLimitToTravelAlone")
    public Double getAgeLimitToTravelAlone() {
        return ageLimitToTravelAlone;
    }

    @JsonProperty("ageLimitToTravelAlone")
    public void setAgeLimitToTravelAlone(Double ageLimitToTravelAlone) {
        this.ageLimitToTravelAlone = ageLimitToTravelAlone;
    }

    @JsonProperty("ageLimitForReservation")
    public Double getAgeLimitForReservation() {
        return ageLimitForReservation;
    }

    @JsonProperty("ageLimitForReservation")
    public void setAgeLimitForReservation(Double ageLimitForReservation) {
        this.ageLimitForReservation = ageLimitForReservation;
    }

    /**
     * to indicate dogs, bicycles,.. 
     * 
     */
    @JsonProperty("isAncilliaryItem")
    public Boolean getIsAncilliaryItem() {
        return isAncilliaryItem;
    }

    /**
     * to indicate dogs, bicycles,.. 
     * 
     */
    @JsonProperty("isAncilliaryItem")
    public void setIsAncilliaryItem(Boolean isAncilliaryItem) {
        this.isAncilliaryItem = isAncilliaryItem;
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
    public Double getPassengerWeight() {
        return passengerWeight;
    }

    @JsonProperty("passengerWeight")
    public void setPassengerWeight(Double passengerWeight) {
        this.passengerWeight = passengerWeight;
    }

    /**
     * the total weighted number of passengers on the offer is restricted to be equal or smaller than this  maximum 
     * 
     */
    @JsonProperty("maxWeightedPasseners")
    public Double getMaxWeightedPasseners() {
        return maxWeightedPasseners;
    }

    /**
     * the total weighted number of passengers on the offer is restricted to be equal or smaller than this  maximum 
     * 
     */
    @JsonProperty("maxWeightedPasseners")
    public void setMaxWeightedPasseners(Double maxWeightedPasseners) {
        this.maxWeightedPasseners = maxWeightedPasseners;
    }

    /**
     * the total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public Double getMinWeightedPassengers() {
        return minWeightedPassengers;
    }

    /**
     * the total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public void setMinWeightedPassengers(Double minWeightedPassengers) {
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
        sb.append("isAncilliaryItem");
        sb.append('=');
        sb.append(((this.isAncilliaryItem == null)?"<null>":this.isAncilliaryItem));
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
        sb.append("maxWeightedPasseners");
        sb.append('=');
        sb.append(((this.maxWeightedPasseners == null)?"<null>":this.maxWeightedPasseners));
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
        result = ((result* 31)+((this.passengerWeight == null)? 0 :this.passengerWeight.hashCode()));
        result = ((result* 31)+((this.isAncilliaryItem == null)? 0 :this.isAncilliaryItem.hashCode()));
        result = ((result* 31)+((this.ageLimitToTravelAlone == null)? 0 :this.ageLimitToTravelAlone.hashCode()));
        result = ((result* 31)+((this.nameRef == null)? 0 :this.nameRef.hashCode()));
        result = ((result* 31)+((this.lowerAgeLimit == null)? 0 :this.lowerAgeLimit.hashCode()));
        result = ((result* 31)+((this.maxWeightedPasseners == null)? 0 :this.maxWeightedPasseners.hashCode()));
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
        return (((((((((((((this.ageLimitForReservation == rhs.ageLimitForReservation)||((this.ageLimitForReservation!= null)&&this.ageLimitForReservation.equals(rhs.ageLimitForReservation)))&&((this.passengerWeight == rhs.passengerWeight)||((this.passengerWeight!= null)&&this.passengerWeight.equals(rhs.passengerWeight))))&&((this.isAncilliaryItem == rhs.isAncilliaryItem)||((this.isAncilliaryItem!= null)&&this.isAncilliaryItem.equals(rhs.isAncilliaryItem))))&&((this.ageLimitToTravelAlone == rhs.ageLimitToTravelAlone)||((this.ageLimitToTravelAlone!= null)&&this.ageLimitToTravelAlone.equals(rhs.ageLimitToTravelAlone))))&&((this.nameRef == rhs.nameRef)||((this.nameRef!= null)&&this.nameRef.equals(rhs.nameRef))))&&((this.lowerAgeLimit == rhs.lowerAgeLimit)||((this.lowerAgeLimit!= null)&&this.lowerAgeLimit.equals(rhs.lowerAgeLimit))))&&((this.maxWeightedPasseners == rhs.maxWeightedPasseners)||((this.maxWeightedPasseners!= null)&&this.maxWeightedPasseners.equals(rhs.maxWeightedPasseners))))&&((this.combinationConstraint == rhs.combinationConstraint)||((this.combinationConstraint!= null)&&this.combinationConstraint.equals(rhs.combinationConstraint))))&&((this.includedFreePassenger == rhs.includedFreePassenger)||((this.includedFreePassenger!= null)&&this.includedFreePassenger.equals(rhs.includedFreePassenger))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.upperAgeLimit == rhs.upperAgeLimit)||((this.upperAgeLimit!= null)&&this.upperAgeLimit.equals(rhs.upperAgeLimit))))&&((this.minWeightedPassengers == rhs.minWeightedPassengers)||((this.minWeightedPassengers!= null)&&this.minWeightedPassengers.equals(rhs.minWeightedPassengers))));
    }

}
