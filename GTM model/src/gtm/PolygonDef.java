
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "edge"
})
public class PolygonDef {

    @JsonProperty("edge")
    private List<GeoCoordinate> edge = new ArrayList<GeoCoordinate>();

    @JsonProperty("edge")
    public List<GeoCoordinate> getEdge() {
        return edge;
    }

    @JsonProperty("edge")
    public void setEdge(List<GeoCoordinate> edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PolygonDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("edge");
        sb.append('=');
        sb.append(((this.edge == null)?"<null>":this.edge));
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
        result = ((result* 31)+((this.edge == null)? 0 :this.edge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolygonDef) == false) {
            return false;
        }
        PolygonDef rhs = ((PolygonDef) other);
        return ((this.edge == rhs.edge)||((this.edge!= null)&&this.edge.equals(rhs.edge)));
    }

}
