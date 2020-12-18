
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "currency",
    "amount",
    "scale",
    "vatDetails"
})
public class CurrencyPriceDef {

    /**
     * ISO4217 currency codes
     * (Required)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("ISO4217 currency codes")
    private String currency;
    /**
     * by default of the scale the amount in cents
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("by default of the scale the amount in cents")
    private Integer amount;
    /**
     * scale of the amount - the number of positions after the comma
     * 
     */
    @JsonProperty("scale")
    @JsonPropertyDescription("scale of the amount - the number of positions after the comma")
    private Integer scale = 2;
    @JsonProperty("vatDetails")
    private List<VatDetailDef> vatDetails = new ArrayList<VatDetailDef>();

    /**
     * ISO4217 currency codes
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * ISO4217 currency codes
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * by default of the scale the amount in cents
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * by default of the scale the amount in cents
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * scale of the amount - the number of positions after the comma
     * 
     */
    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    /**
     * scale of the amount - the number of positions after the comma
     * 
     */
    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @JsonProperty("vatDetails")
    public List<VatDetailDef> getVatDetails() {
        return vatDetails;
    }

    @JsonProperty("vatDetails")
    public void setVatDetails(List<VatDetailDef> vatDetails) {
        this.vatDetails = vatDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrencyPriceDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("vatDetails");
        sb.append('=');
        sb.append(((this.vatDetails == null)?"<null>":this.vatDetails));
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
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.vatDetails == null)? 0 :this.vatDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrencyPriceDef) == false) {
            return false;
        }
        CurrencyPriceDef rhs = ((CurrencyPriceDef) other);
        return (((((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale)))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.vatDetails == rhs.vatDetails)||((this.vatDetails!= null)&&this.vatDetails.equals(rhs.vatDetails))));
    }

}
