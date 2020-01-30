
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "salesDates",
    "startOfSale",
    "endOfSale"
})
public class SalesRestriction {

    /**
     * valid on all days in case no calendar is provided
     * (Required)
     * 
     */
    @JsonProperty("salesDates")
    @JsonPropertyDescription("valid on all days in case no calendar is provided")
    private CalendarDef salesDates;
    @JsonProperty("startOfSale")
    private RelativeTimeDef startOfSale;
    @JsonProperty("endOfSale")
    private RelativeTimeDef endOfSale;

    /**
     * valid on all days in case no calendar is provided
     * (Required)
     * 
     */
    @JsonProperty("salesDates")
    public CalendarDef getSalesDates() {
        return salesDates;
    }

    /**
     * valid on all days in case no calendar is provided
     * (Required)
     * 
     */
    @JsonProperty("salesDates")
    public void setSalesDates(CalendarDef salesDates) {
        this.salesDates = salesDates;
    }

    @JsonProperty("startOfSale")
    public RelativeTimeDef getStartOfSale() {
        return startOfSale;
    }

    @JsonProperty("startOfSale")
    public void setStartOfSale(RelativeTimeDef startOfSale) {
        this.startOfSale = startOfSale;
    }

    @JsonProperty("endOfSale")
    public RelativeTimeDef getEndOfSale() {
        return endOfSale;
    }

    @JsonProperty("endOfSale")
    public void setEndOfSale(RelativeTimeDef endOfSale) {
        this.endOfSale = endOfSale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesRestriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("salesDates");
        sb.append('=');
        sb.append(((this.salesDates == null)?"<null>":this.salesDates));
        sb.append(',');
        sb.append("startOfSale");
        sb.append('=');
        sb.append(((this.startOfSale == null)?"<null>":this.startOfSale));
        sb.append(',');
        sb.append("endOfSale");
        sb.append('=');
        sb.append(((this.endOfSale == null)?"<null>":this.endOfSale));
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
        result = ((result* 31)+((this.salesDates == null)? 0 :this.salesDates.hashCode()));
        result = ((result* 31)+((this.endOfSale == null)? 0 :this.endOfSale.hashCode()));
        result = ((result* 31)+((this.startOfSale == null)? 0 :this.startOfSale.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesRestriction) == false) {
            return false;
        }
        SalesRestriction rhs = ((SalesRestriction) other);
        return ((((this.salesDates == rhs.salesDates)||((this.salesDates!= null)&&this.salesDates.equals(rhs.salesDates)))&&((this.endOfSale == rhs.endOfSale)||((this.endOfSale!= null)&&this.endOfSale.equals(rhs.endOfSale))))&&((this.startOfSale == rhs.startOfSale)||((this.startOfSale!= null)&&this.startOfSale.equals(rhs.startOfSale))));
    }

}
