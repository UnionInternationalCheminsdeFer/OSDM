
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * one of the elements Zone,ViaStation,TrainLink, Line, Polygone
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seqNb",
    "zone",
    "viaStations",
    "trainLink",
    "line",
    "polygone"
})
public class RegionalValidityDef {

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("seqNb")
    @JsonPropertyDescription("order number of the list item")
    private Integer seqNb;
    @JsonProperty("zone")
    private ZoneDef zone;
    @JsonProperty("viaStations")
    private ViaStationsDef viaStations;
    @JsonProperty("trainLink")
    private TrainLinkDef trainLink;
    @JsonProperty("line")
    private LineDef line;
    @JsonProperty("polygone")
    private PolygoneDef polygone;

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("seqNb")
    public Integer getSeqNb() {
        return seqNb;
    }

    /**
     * order number of the list item
     * 
     */
    @JsonProperty("seqNb")
    public void setSeqNb(Integer seqNb) {
        this.seqNb = seqNb;
    }

    @JsonProperty("zone")
    public ZoneDef getZone() {
        return zone;
    }

    @JsonProperty("zone")
    public void setZone(ZoneDef zone) {
        this.zone = zone;
    }

    @JsonProperty("viaStations")
    public ViaStationsDef getViaStations() {
        return viaStations;
    }

    @JsonProperty("viaStations")
    public void setViaStations(ViaStationsDef viaStations) {
        this.viaStations = viaStations;
    }

    @JsonProperty("trainLink")
    public TrainLinkDef getTrainLink() {
        return trainLink;
    }

    @JsonProperty("trainLink")
    public void setTrainLink(TrainLinkDef trainLink) {
        this.trainLink = trainLink;
    }

    @JsonProperty("line")
    public LineDef getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(LineDef line) {
        this.line = line;
    }

    @JsonProperty("polygone")
    public PolygoneDef getPolygone() {
        return polygone;
    }

    @JsonProperty("polygone")
    public void setPolygone(PolygoneDef polygone) {
        this.polygone = polygone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegionalValidityDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seqNb");
        sb.append('=');
        sb.append(((this.seqNb == null)?"<null>":this.seqNb));
        sb.append(',');
        sb.append("zone");
        sb.append('=');
        sb.append(((this.zone == null)?"<null>":this.zone));
        sb.append(',');
        sb.append("viaStations");
        sb.append('=');
        sb.append(((this.viaStations == null)?"<null>":this.viaStations));
        sb.append(',');
        sb.append("trainLink");
        sb.append('=');
        sb.append(((this.trainLink == null)?"<null>":this.trainLink));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("polygone");
        sb.append('=');
        sb.append(((this.polygone == null)?"<null>":this.polygone));
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
        result = ((result* 31)+((this.trainLink == null)? 0 :this.trainLink.hashCode()));
        result = ((result* 31)+((this.zone == null)? 0 :this.zone.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.seqNb == null)? 0 :this.seqNb.hashCode()));
        result = ((result* 31)+((this.polygone == null)? 0 :this.polygone.hashCode()));
        result = ((result* 31)+((this.viaStations == null)? 0 :this.viaStations.hashCode()));
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
        return (((((((this.trainLink == rhs.trainLink)||((this.trainLink!= null)&&this.trainLink.equals(rhs.trainLink)))&&((this.zone == rhs.zone)||((this.zone!= null)&&this.zone.equals(rhs.zone))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.seqNb == rhs.seqNb)||((this.seqNb!= null)&&this.seqNb.equals(rhs.seqNb))))&&((this.polygone == rhs.polygone)||((this.polygone!= null)&&this.polygone.equals(rhs.polygone))))&&((this.viaStations == rhs.viaStations)||((this.viaStations!= null)&&this.viaStations.equals(rhs.viaStations))));
    }

}
