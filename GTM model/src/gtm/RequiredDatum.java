
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    private String dataItem;
    /**
     * BOOKING,SIS_CONTROL,SID_CONTROL
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    @JsonPropertyDescription("BOOKING,SIS_CONTROL,SID_CONTROL")
    private List<String> transfer = new ArrayList<String>();
    @JsonProperty("ticketHolderOnly")
    private Boolean ticketHolderOnly = false;
    /**
     * the dara are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    @JsonPropertyDescription("the dara are required only in case one of the cross border conditions apply")
    private List<CrossBorderCondition> crossBorder = new ArrayList<CrossBorderCondition>();
    /**
     * type of fulfillment in case the presonal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    @JsonPropertyDescription("type of fulfillment in case the presonal data are required for that type only")
    private List<String> fulfillmentType = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    public String getDataItem() {
        return dataItem;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataItem")
    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    /**
     * BOOKING,SIS_CONTROL,SID_CONTROL
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    public List<String> getTransfer() {
        return transfer;
    }

    /**
     * BOOKING,SIS_CONTROL,SID_CONTROL
     * (Required)
     * 
     */
    @JsonProperty("transfer")
    public void setTransfer(List<String> transfer) {
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
     * the dara are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    public List<CrossBorderCondition> getCrossBorder() {
        return crossBorder;
    }

    /**
     * the dara are required only in case one of the cross border conditions apply
     * 
     */
    @JsonProperty("crossBorder")
    public void setCrossBorder(List<CrossBorderCondition> crossBorder) {
        this.crossBorder = crossBorder;
    }

    /**
     * type of fulfillment in case the presonal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    public List<String> getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * type of fulfillment in case the presonal data are required for that type only
     * 
     */
    @JsonProperty("fulfillmentType")
    public void setFulfillmentType(List<String> fulfillmentType) {
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
