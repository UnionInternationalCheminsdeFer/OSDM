
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startOfSale",
    "endOfSale",
    "salesDatesRef"
})
public class SalesRestriction {

    @JsonProperty("startOfSale")
    private RelativeTimeDef startOfSale;
    @JsonProperty("endOfSale")
    private RelativeTimeDef endOfSale;
    /**
     * reference to the calendar woith valid sales dates
     * 
     */
    @JsonProperty("salesDatesRef")
    @JsonPropertyDescription("reference to the calendar woith valid sales dates")
    private String salesDatesRef;

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

    /**
     * reference to the calendar woith valid sales dates
     * 
     */
    @JsonProperty("salesDatesRef")
    public String getSalesDatesRef() {
        return salesDatesRef;
    }

    /**
     * reference to the calendar woith valid sales dates
     * 
     */
    @JsonProperty("salesDatesRef")
    public void setSalesDatesRef(String salesDatesRef) {
        this.salesDatesRef = salesDatesRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesRestriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startOfSale");
        sb.append('=');
        sb.append(((this.startOfSale == null)?"<null>":this.startOfSale));
        sb.append(',');
        sb.append("endOfSale");
        sb.append('=');
        sb.append(((this.endOfSale == null)?"<null>":this.endOfSale));
        sb.append(',');
        sb.append("salesDatesRef");
        sb.append('=');
        sb.append(((this.salesDatesRef == null)?"<null>":this.salesDatesRef));
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
        result = ((result* 31)+((this.endOfSale == null)? 0 :this.endOfSale.hashCode()));
        result = ((result* 31)+((this.salesDatesRef == null)? 0 :this.salesDatesRef.hashCode()));
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
        return ((((this.endOfSale == rhs.endOfSale)||((this.endOfSale!= null)&&this.endOfSale.equals(rhs.endOfSale)))&&((this.salesDatesRef == rhs.salesDatesRef)||((this.salesDatesRef!= null)&&this.salesDatesRef.equals(rhs.salesDatesRef))))&&((this.startOfSale == rhs.startOfSale)||((this.startOfSale!= null)&&this.startOfSale.equals(rhs.startOfSale))));
    }

}
