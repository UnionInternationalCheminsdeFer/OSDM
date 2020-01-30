
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionType",
    "feeId",
    "applicationTime",
    "carrierFee",
    "individualContracts"
})
public class AfterSalesConditionDef {

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    @JsonPropertyDescription("code list Reason for after sale")
    private String transactionType;
    /**
     * reference to a price data item defining the fee; optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("feeId")
    @JsonPropertyDescription("reference to a price data item defining the fee; optional in case there is no fee but the after sales transaction is allowed")
    private String feeId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    private RelativeTimeDef applicationTime;
    /**
     * indicates that the fee belongs to the carrier
     * 
     */
    @JsonProperty("carrierFee")
    @JsonPropertyDescription("indicates that the fee belongs to the carrier")
    private Boolean carrierFee = true;
    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    @JsonPropertyDescription("indicates that the after sales of this fare can be treated independently per person.")
    private Boolean individualContracts = false;

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * reference to a price data item defining the fee; optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("feeId")
    public String getFeeId() {
        return feeId;
    }

    /**
     * reference to a price data item defining the fee; optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("feeId")
    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    public RelativeTimeDef getApplicationTime() {
        return applicationTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    public void setApplicationTime(RelativeTimeDef applicationTime) {
        this.applicationTime = applicationTime;
    }

    /**
     * indicates that the fee belongs to the carrier
     * 
     */
    @JsonProperty("carrierFee")
    public Boolean getCarrierFee() {
        return carrierFee;
    }

    /**
     * indicates that the fee belongs to the carrier
     * 
     */
    @JsonProperty("carrierFee")
    public void setCarrierFee(Boolean carrierFee) {
        this.carrierFee = carrierFee;
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
        sb.append(AfterSalesConditionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionType");
        sb.append('=');
        sb.append(((this.transactionType == null)?"<null>":this.transactionType));
        sb.append(',');
        sb.append("feeId");
        sb.append('=');
        sb.append(((this.feeId == null)?"<null>":this.feeId));
        sb.append(',');
        sb.append("applicationTime");
        sb.append('=');
        sb.append(((this.applicationTime == null)?"<null>":this.applicationTime));
        sb.append(',');
        sb.append("carrierFee");
        sb.append('=');
        sb.append(((this.carrierFee == null)?"<null>":this.carrierFee));
        sb.append(',');
        sb.append("individualContracts");
        sb.append('=');
        sb.append(((this.individualContracts == null)?"<null>":this.individualContracts));
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
        result = ((result* 31)+((this.transactionType == null)? 0 :this.transactionType.hashCode()));
        result = ((result* 31)+((this.carrierFee == null)? 0 :this.carrierFee.hashCode()));
        result = ((result* 31)+((this.individualContracts == null)? 0 :this.individualContracts.hashCode()));
        result = ((result* 31)+((this.feeId == null)? 0 :this.feeId.hashCode()));
        result = ((result* 31)+((this.applicationTime == null)? 0 :this.applicationTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AfterSalesConditionDef) == false) {
            return false;
        }
        AfterSalesConditionDef rhs = ((AfterSalesConditionDef) other);
        return ((((((this.transactionType == rhs.transactionType)||((this.transactionType!= null)&&this.transactionType.equals(rhs.transactionType)))&&((this.carrierFee == rhs.carrierFee)||((this.carrierFee!= null)&&this.carrierFee.equals(rhs.carrierFee))))&&((this.individualContracts == rhs.individualContracts)||((this.individualContracts!= null)&&this.individualContracts.equals(rhs.individualContracts))))&&((this.feeId == rhs.feeId)||((this.feeId!= null)&&this.feeId.equals(rhs.feeId))))&&((this.applicationTime == rhs.applicationTime)||((this.applicationTime!= null)&&this.applicationTime.equals(rhs.applicationTime))));
    }

}
