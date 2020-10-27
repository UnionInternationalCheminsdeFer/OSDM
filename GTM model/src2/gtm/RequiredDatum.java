
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataItem",
    "transfer",
    "ticketHolderOnly",
    "crossBorder",
    "fulfillmentType"
})
public class RequiredDatum {

    /**
     * see code list IRS 90918-10
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    @JsonPropertyDescription("see code list IRS 90918-10")
    private String dataItem;
    /**
     * Transfer mode: BOOKING, SIS_CONTROL, SID_CONTROL.
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    @JsonPropertyDescription("Transfer mode: BOOKING, SIS_CONTROL, SID_CONTROL.")
    private List<Transfer> transfer = new ArrayList<Transfer>();
    @JsonProperty("ticketHolderOnly")
    private Boolean ticketHolderOnly = false;
    /**
     * the data are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    @JsonPropertyDescription("the data are required only in case one of the cross border conditions apply")
    private List<CrossBorderConditionDef> crossBorder = new ArrayList<CrossBorderConditionDef>();
    /**
     * type of fulfillment in case the personal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    @JsonPropertyDescription("type of fulfillment in case the personal data are required for that type only")
    private List<ControlSecurityTypeDef> fulfillmentType = new ArrayList<ControlSecurityTypeDef>();

    /**
     * see code list IRS 90918-10
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    public String getDataItem() {
        return dataItem;
    }

    /**
     * see code list IRS 90918-10
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    /**
     * Transfer mode: BOOKING, SIS_CONTROL, SID_CONTROL.
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    public List<Transfer> getTransfer() {
        return transfer;
    }

    /**
     * Transfer mode: BOOKING, SIS_CONTROL, SID_CONTROL.
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    public void setTransfer(List<Transfer> transfer) {
        this.transfer = transfer;
    }

    @JsonProperty("ticketHolderOnly")
    public Boolean getTicketHolderOnly() {
        return ticketHolderOnly;
    }

    @JsonProperty("ticketHolderOnly")
    public void setTicketHolderOnly(Boolean ticketHolderOnly) {
        this.ticketHolderOnly = ticketHolderOnly;
    }

    /**
     * the data are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    public List<CrossBorderConditionDef> getCrossBorder() {
        return crossBorder;
    }

    /**
     * the data are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    public void setCrossBorder(List<CrossBorderConditionDef> crossBorder) {
        this.crossBorder = crossBorder;
    }

    /**
     * type of fulfillment in case the personal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    public List<ControlSecurityTypeDef> getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * type of fulfillment in case the personal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    public void setFulfillmentType(List<ControlSecurityTypeDef> fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequiredDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataItem");
        sb.append('=');
        sb.append(((this.dataItem == null)?"<null>":this.dataItem));
        sb.append(',');
        sb.append("transfer");
        sb.append('=');
        sb.append(((this.transfer == null)?"<null>":this.transfer));
        sb.append(',');
        sb.append("ticketHolderOnly");
        sb.append('=');
        sb.append(((this.ticketHolderOnly == null)?"<null>":this.ticketHolderOnly));
        sb.append(',');
        sb.append("crossBorder");
        sb.append('=');
        sb.append(((this.crossBorder == null)?"<null>":this.crossBorder));
        sb.append(',');
        sb.append("fulfillmentType");
        sb.append('=');
        sb.append(((this.fulfillmentType == null)?"<null>":this.fulfillmentType));
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
        result = ((result* 31)+((this.dataItem == null)? 0 :this.dataItem.hashCode()));
        result = ((result* 31)+((this.ticketHolderOnly == null)? 0 :this.ticketHolderOnly.hashCode()));
        result = ((result* 31)+((this.crossBorder == null)? 0 :this.crossBorder.hashCode()));
        result = ((result* 31)+((this.transfer == null)? 0 :this.transfer.hashCode()));
        result = ((result* 31)+((this.fulfillmentType == null)? 0 :this.fulfillmentType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequiredDatum) == false) {
            return false;
        }
        RequiredDatum rhs = ((RequiredDatum) other);
        return ((((((this.dataItem == rhs.dataItem)||((this.dataItem!= null)&&this.dataItem.equals(rhs.dataItem)))&&((this.ticketHolderOnly == rhs.ticketHolderOnly)||((this.ticketHolderOnly!= null)&&this.ticketHolderOnly.equals(rhs.ticketHolderOnly))))&&((this.crossBorder == rhs.crossBorder)||((this.crossBorder!= null)&&this.crossBorder.equals(rhs.crossBorder))))&&((this.transfer == rhs.transfer)||((this.transfer!= null)&&this.transfer.equals(rhs.transfer))))&&((this.fulfillmentType == rhs.fulfillmentType)||((this.fulfillmentType!= null)&&this.fulfillmentType.equals(rhs.fulfillmentType))));
    }

}
