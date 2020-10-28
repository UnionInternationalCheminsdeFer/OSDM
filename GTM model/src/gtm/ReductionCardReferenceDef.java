
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardValue",
    "cardValueType",
    "cardName",
    "issuer"
})
public class ReductionCardReferenceDef {

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardValue")
    @JsonPropertyDescription("code of the card type according to code list")
    private String cardValue;
    /**
     * code list for the cardValue provided
     * (Required)
     * 
     */
    @JsonProperty("cardValueType")
    @JsonPropertyDescription("code list for the cardValue provided")
    private String cardValueType;
    /**
     * card name for printing on fulfillments
     * 
     */
    @JsonProperty("cardName")
    @JsonPropertyDescription("card name for printing on fulfillments")
    private String cardName;
    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x.
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x.")
    private String issuer;

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardValue")
    public String getCardValue() {
        return cardValue;
    }

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardValue")
    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * code list for the cardValue provided
     * (Required)
     * 
     */
    @JsonProperty("cardValueType")
    public String getCardValueType() {
        return cardValueType;
    }

    /**
     * code list for the cardValue provided
     * (Required)
     * 
     */
    @JsonProperty("cardValueType")
    public void setCardValueType(String cardValueType) {
        this.cardValueType = cardValueType;
    }

    /**
     * card name for printing on fulfillments
     * 
     */
    @JsonProperty("cardName")
    public String getCardName() {
        return cardName;
    }

    /**
     * card name for printing on fulfillments
     * 
     */
    @JsonProperty("cardName")
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x.
     * 
     */
    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x.
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReductionCardReferenceDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardValue");
        sb.append('=');
        sb.append(((this.cardValue == null)?"<null>":this.cardValue));
        sb.append(',');
        sb.append("cardValueType");
        sb.append('=');
        sb.append(((this.cardValueType == null)?"<null>":this.cardValueType));
        sb.append(',');
        sb.append("cardName");
        sb.append('=');
        sb.append(((this.cardName == null)?"<null>":this.cardName));
        sb.append(',');
        sb.append("issuer");
        sb.append('=');
        sb.append(((this.issuer == null)?"<null>":this.issuer));
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
        result = ((result* 31)+((this.cardValueType == null)? 0 :this.cardValueType.hashCode()));
        result = ((result* 31)+((this.cardValue == null)? 0 :this.cardValue.hashCode()));
        result = ((result* 31)+((this.cardName == null)? 0 :this.cardName.hashCode()));
        result = ((result* 31)+((this.issuer == null)? 0 :this.issuer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReductionCardReferenceDef) == false) {
            return false;
        }
        ReductionCardReferenceDef rhs = ((ReductionCardReferenceDef) other);
        return (((((this.cardValueType == rhs.cardValueType)||((this.cardValueType!= null)&&this.cardValueType.equals(rhs.cardValueType)))&&((this.cardValue == rhs.cardValue)||((this.cardValue!= null)&&this.cardValue.equals(rhs.cardValue))))&&((this.cardName == rhs.cardName)||((this.cardName!= null)&&this.cardName.equals(rhs.cardName))))&&((this.issuer == rhs.issuer)||((this.issuer!= null)&&this.issuer.equals(rhs.issuer))));
    }

}
