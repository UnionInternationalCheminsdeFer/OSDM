
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "price"
})
public class PriceDef {

    /**
     * required for bulk data transfer
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("required for bulk data transfer")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private List<CurrencyPriceDef> price = new ArrayList<CurrencyPriceDef>();

    /**
     * required for bulk data transfer
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * required for bulk data transfer
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public List<CurrencyPriceDef> getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(List<CurrencyPriceDef> price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriceDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
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
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriceDef) == false) {
            return false;
        }
        PriceDef rhs = ((PriceDef) other);
        return (((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
