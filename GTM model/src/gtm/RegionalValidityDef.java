
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SeqNb"
})
public class RegionalValidityDef {

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("SeqNb")
    @JsonPropertyDescription("order number of the list item")
    private Integer seqNb;

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("SeqNb")
    public Integer getSeqNb() {
        return seqNb;
    }

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("SeqNb")
    public void setSeqNb(Integer seqNb) {
        this.seqNb = seqNb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegionalValidityDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seqNb");
        sb.append('=');
        sb.append(((this.seqNb == null)?"<null>":this.seqNb));
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
        result = ((result* 31)+((this.seqNb == null)? 0 :this.seqNb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegionalValidityDef) == false) {
            return false;
        }
        RegionalValidityDef rhs = ((RegionalValidityDef) other);
        return ((this.seqNb == rhs.seqNb)||((this.seqNb!= null)&&this.seqNb.equals(rhs.seqNb)));
    }

}
