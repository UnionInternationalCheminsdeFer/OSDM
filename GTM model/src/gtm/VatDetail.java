
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Country",
    "Amount",
    "Percentage",
    "taxId",
    "scope"
})
public class VatDetail {

    /**
     * ISO 3166 2A codes, optional in case of web sales
     * (Required)
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("ISO 3166 2A codes, optional in case of web sales")
    private String country;
    @JsonProperty("Amount")
    private Float amount;
    @JsonProperty("Percentage")
    private Float percentage;
    @JsonProperty("taxId")
    private String taxId;
    /**
     * scope where the VAT applies: INTERNALTIONAL, NATIONAL, SHORT_DISTANCE, LONG_DISTANCE
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("scope where the VAT applies: INTERNALTIONAL, NATIONAL, SHORT_DISTANCE, LONG_DISTANCE")
    private String scope;

    /**
     * ISO 3166 2A codes, optional in case of web sales
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    /**
     * ISO 3166 2A codes, optional in case of web sales
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Amount")
    public Float getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @JsonProperty("Percentage")
    public Float getPercentage() {
        return percentage;
    }

    @JsonProperty("Percentage")
    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * scope where the VAT applies: INTERNALTIONAL, NATIONAL, SHORT_DISTANCE, LONG_DISTANCE
     * 
     */
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * scope where the VAT applies: INTERNALTIONAL, NATIONAL, SHORT_DISTANCE, LONG_DISTANCE
     * 
     */
    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VatDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("taxId");
        sb.append('=');
        sb.append(((this.taxId == null)?"<null>":this.taxId));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.taxId == null)? 0 :this.taxId.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VatDetail) == false) {
            return false;
        }
        VatDetail rhs = ((VatDetail) other);
        return ((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.taxId == rhs.taxId)||((this.taxId!= null)&&this.taxId.equals(rhs.taxId))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))));
    }

}
