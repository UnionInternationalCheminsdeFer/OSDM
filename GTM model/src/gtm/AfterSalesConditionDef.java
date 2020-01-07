
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionType",
    "fee",
    "applicationTime",
    "carrierFee",
    "individualContracts"
})
public class AfterSalesConditionDef {

    /**
     * REXCHANGE, UPGRADE,..
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    @JsonPropertyDescription("REXCHANGE, UPGRADE,..")
    private String transactionType;
    /**
     * optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("fee")
    @JsonPropertyDescription("optional in case there is no fee but the after sales transaction is allowed")
    private List<CurrencyPriceDef> fee = new ArrayList<CurrencyPriceDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    private ApplicationTime applicationTime;
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
     * REXCHANGE, UPGRADE,..
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * REXCHANGE, UPGRADE,..
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("fee")
    public List<CurrencyPriceDef> getFee() {
        return fee;
    }

    /**
     * optional in case there is no fee but the after sales transaction is allowed
     * 
     */
    @JsonProperty("fee")
    public void setFee(List<CurrencyPriceDef> fee) {
        this.fee = fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    public ApplicationTime getApplicationTime() {
        return applicationTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("applicationTime")
    public void setApplicationTime(ApplicationTime applicationTime) {
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
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
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
        result = ((result* 31)+((this.applicationTime == null)? 0 :this.applicationTime.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
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
        return ((((((this.transactionType == rhs.transactionType)||((this.transactionType!= null)&&this.transactionType.equals(rhs.transactionType)))&&((this.carrierFee == rhs.carrierFee)||((this.carrierFee!= null)&&this.carrierFee.equals(rhs.carrierFee))))&&((this.individualContracts == rhs.individualContracts)||((this.individualContracts!= null)&&this.individualContracts.equals(rhs.individualContracts))))&&((this.applicationTime == rhs.applicationTime)||((this.applicationTime!= null)&&this.applicationTime.equals(rhs.applicationTime))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))));
    }

}
