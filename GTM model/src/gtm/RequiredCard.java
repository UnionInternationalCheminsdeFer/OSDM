
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardId",
    "cardName",
    "cardClassId"
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
    /**
     * reference to the service class of the card
     * 
     */
    @JsonProperty("cardClassId")
    @JsonPropertyDescription("reference to the service class of the card")
    private String cardClassId;

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

    /**
     * reference to the service class of the card
     * 
     */
    @JsonProperty("cardClassId")
    public String getCardClassId() {
        return cardClassId;
    }

    /**
     * reference to the service class of the card
     * 
     */
    @JsonProperty("cardClassId")
    public void setCardClassId(String cardClassId) {
        this.cardClassId = cardClassId;
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
        sb.append("cardClassId");
        sb.append('=');
        sb.append(((this.cardClassId == null)?"<null>":this.cardClassId));
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
        result = ((result* 31)+((this.cardClassId == null)? 0 :this.cardClassId.hashCode()));
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
        return ((((this.cardName == rhs.cardName)||((this.cardName!= null)&&this.cardName.equals(rhs.cardName)))&&((this.cardClassId == rhs.cardClassId)||((this.cardClassId!= null)&&this.cardClassId.equals(rhs.cardClassId))))&&((this.cardId == rhs.cardId)||((this.cardId!= null)&&this.cardId.equals(rhs.cardId))));
    }

}
