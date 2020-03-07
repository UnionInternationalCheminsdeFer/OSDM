
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "edge"
})
public class PolygoneDef {

    @JsonProperty("edge")
    private List<GeoCoordinateDef> edge = new ArrayList<GeoCoordinateDef>();

    @JsonProperty("edge")
    public List<GeoCoordinateDef> getEdge() {
        return edge;
    }

    @JsonProperty("edge")
    public void setEdge(List<GeoCoordinateDef> edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PolygoneDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof PolygoneDef) == false) {
            return false;
        }
        PolygoneDef rhs = ((PolygoneDef) other);
        return ((this.edge == rhs.edge)||((this.edge!= null)&&this.edge.equals(rhs.edge)));
    }

}
