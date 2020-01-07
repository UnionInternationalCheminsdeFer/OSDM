
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CardIssuer",
    "CardName",
    "CardId",
    "serviceClasses"
})
public class ReductionCardDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("CardIssuer")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x")
    private String cardIssuer;
    /**
     * data type for texts with translations)
     * (Required)
     * 
     */
    @JsonProperty("CardName")
    @JsonPropertyDescription("data type for texts with translations)")
    private TextDef cardName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CardId")
    private String cardId;
    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    @JsonPropertyDescription("list of service classes in case this class is available for different classes")
    private List<ServiceClass> serviceClasses = new ArrayList<ServiceClass>();

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("CardIssuer")
    public String getCardIssuer() {
        return cardIssuer;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("CardIssuer")
    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    /**
     * data type for texts with translations)
     * (Required)
     * 
     */
    @JsonProperty("CardName")
    public TextDef getCardName() {
        return cardName;
    }

    /**
     * data type for texts with translations)
     * (Required)
     * 
     */
    @JsonProperty("CardName")
    public void setCardName(TextDef cardName) {
        this.cardName = cardName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CardId")
    public String getCardId() {
        return cardId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CardId")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    public List<ServiceClass> getServiceClasses() {
        return serviceClasses;
    }

    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    public void setServiceClasses(List<ServiceClass> serviceClasses) {
        this.serviceClasses = serviceClasses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReductionCardDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardIssuer");
        sb.append('=');
        sb.append(((this.cardIssuer == null)?"<null>":this.cardIssuer));
        sb.append(',');
        sb.append("cardName");
        sb.append('=');
        sb.append(((this.cardName == null)?"<null>":this.cardName));
        sb.append(',');
        sb.append("cardId");
        sb.append('=');
        sb.append(((this.cardId == null)?"<null>":this.cardId));
        sb.append(',');
        sb.append("serviceClasses");
        sb.append('=');
        sb.append(((this.serviceClasses == null)?"<null>":this.serviceClasses));
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
        result = ((result* 31)+((this.serviceClasses == null)? 0 :this.serviceClasses.hashCode()));
        result = ((result* 31)+((this.cardName == null)? 0 :this.cardName.hashCode()));
        result = ((result* 31)+((this.cardIssuer == null)? 0 :this.cardIssuer.hashCode()));
        result = ((result* 31)+((this.cardId == null)? 0 :this.cardId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReductionCardDef) == false) {
            return false;
        }
        ReductionCardDef rhs = ((ReductionCardDef) other);
        return (((((this.serviceClasses == rhs.serviceClasses)||((this.serviceClasses!= null)&&this.serviceClasses.equals(rhs.serviceClasses)))&&((this.cardName == rhs.cardName)||((this.cardName!= null)&&this.cardName.equals(rhs.cardName))))&&((this.cardIssuer == rhs.cardIssuer)||((this.cardIssuer!= null)&&this.cardIssuer.equals(rhs.cardIssuer))))&&((this.cardId == rhs.cardId)||((this.cardId!= null)&&this.cardId.equals(rhs.cardId))));
    }

}
