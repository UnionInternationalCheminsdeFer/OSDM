
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardId",
    "cardName",
    "cardClass"
})
public class RequiredCard {

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardId")
    @JsonPropertyDescription("code of the card type according to code list")
    private String cardId;
    /**
     * card name for printing on tickets
     * 
     */
    @JsonProperty("cardName")
    @JsonPropertyDescription("card name for printing on tickets")
    private String cardName;
    @JsonProperty("cardClass")
    private ServiceClassDef cardClass;

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardId")
    public String getCardId() {
        return cardId;
    }

    /**
     * code of the card type according to code list
     * (Required)
     * 
     */
    @JsonProperty("cardId")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * card name for printing on tickets
     * 
     */
    @JsonProperty("cardName")
    public String getCardName() {
        return cardName;
    }

    /**
     * card name for printing on tickets
     * 
     */
    @JsonProperty("cardName")
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @JsonProperty("cardClass")
    public ServiceClassDef getCardClass() {
        return cardClass;
    }

    @JsonProperty("cardClass")
    public void setCardClass(ServiceClassDef cardClass) {
        this.cardClass = cardClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequiredCard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardId");
        sb.append('=');
        sb.append(((this.cardId == null)?"<null>":this.cardId));
        sb.append(',');
        sb.append("cardName");
        sb.append('=');
        sb.append(((this.cardName == null)?"<null>":this.cardName));
        sb.append(',');
        sb.append("cardClass");
        sb.append('=');
        sb.append(((this.cardClass == null)?"<null>":this.cardClass));
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
        result = ((result* 31)+((this.cardName == null)? 0 :this.cardName.hashCode()));
        result = ((result* 31)+((this.cardClass == null)? 0 :this.cardClass.hashCode()));
        result = ((result* 31)+((this.cardId == null)? 0 :this.cardId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequiredCard) == false) {
            return false;
        }
        RequiredCard rhs = ((RequiredCard) other);
        return ((((this.cardName == rhs.cardName)||((this.cardName!= null)&&this.cardName.equals(rhs.cardName)))&&((this.cardClass == rhs.cardClass)||((this.cardClass!= null)&&this.cardClass.equals(rhs.cardClass))))&&((this.cardId == rhs.cardId)||((this.cardId!= null)&&this.cardId.equals(rhs.cardId))));
    }

}
