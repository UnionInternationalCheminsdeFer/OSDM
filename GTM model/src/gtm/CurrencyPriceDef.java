
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "amount",
    "vatDetail"
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("vatDetail")
    private List<VatDetail> vatDetail = new ArrayList<VatDetail>();

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
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("vatDetail")
    public List<VatDetail> getVatDetail() {
        return vatDetail;
    }

    @JsonProperty("vatDetail")
    public void setVatDetail(List<VatDetail> vatDetail) {
        this.vatDetail = vatDetail;
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
        sb.append("vatDetail");
        sb.append('=');
        sb.append(((this.vatDetail == null)?"<null>":this.vatDetail));
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
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.vatDetail == null)? 0 :this.vatDetail.hashCode()));
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
        return ((((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.vatDetail == rhs.vatDetail)||((this.vatDetail!= null)&&this.vatDetail.equals(rhs.vatDetail))));
    }

}
