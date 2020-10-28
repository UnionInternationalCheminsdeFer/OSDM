
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "amount",
    "scale",
    "percentage",
    "taxId",
    "scope"
})
public class VatDetailDef {

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("ISO 3166 2A codes")
    private String country;
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
    @JsonProperty("percentage")
    private Float percentage;
    @JsonProperty("taxId")
    private String taxId;
    /**
     * scope where the VAT applies
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("scope where the VAT applies")
    private VatDetailDef.VatScopeDef scope;

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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

    @JsonProperty("percentage")
    public Float getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
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
     * scope where the VAT applies
     * 
     */
    @JsonProperty("scope")
    public VatDetailDef.VatScopeDef getScope() {
        return scope;
    }

    /**
     * scope where the VAT applies
     * 
     */
    @JsonProperty("scope")
    public void setScope(VatDetailDef.VatScopeDef scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VatDetailDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
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
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VatDetailDef) == false) {
            return false;
        }
        VatDetailDef rhs = ((VatDetailDef) other);
        return (((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.taxId == rhs.taxId)||((this.taxId!= null)&&this.taxId.equals(rhs.taxId))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))));
    }

    public enum VatScopeDef {

        INTERNATIONAL("INTERNATIONAL"),
        NATIONAL("NATIONAL"),
        SHORT_DISTANCE("SHORT_DISTANCE"),
        LONG_DISTANCE("LONG_DISTANCE");
        private final String value;
        private final static Map<String, VatDetailDef.VatScopeDef> CONSTANTS = new HashMap<String, VatDetailDef.VatScopeDef>();

        static {
            for (VatDetailDef.VatScopeDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private VatScopeDef(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static VatDetailDef.VatScopeDef fromValue(String value) {
            VatDetailDef.VatScopeDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
