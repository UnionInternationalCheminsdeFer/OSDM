
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
    "ticketHolderOnly"
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
        result = ((result* 31)+((this.transfer == null)? 0 :this.transfer.hashCode()));
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
        return ((((this.dataItem == rhs.dataItem)||((this.dataItem!= null)&&this.dataItem.equals(rhs.dataItem)))&&((this.ticketHolderOnly == rhs.ticketHolderOnly)||((this.ticketHolderOnly!= null)&&this.ticketHolderOnly.equals(rhs.ticketHolderOnly))))&&((this.transfer == rhs.transfer)||((this.transfer!= null)&&this.transfer.equals(rhs.transfer))));
    }

}
