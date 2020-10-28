
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * definition of a zone used to define regional validity. The area of the zone can be defined via a geo-poligone, a complte list of all contained stations or area codes from the NUTS code list. The carrier is eigther the carrier or transport authority responsible for the definition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier",
    "zoneId",
    "name",
    "nameUTF8",
    "ploygon",
    "stationList",
    "nutsCodes"
})
public class ZoneDefinitionDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    private String zoneId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameUTF8")
    private String nameUTF8;
    @JsonProperty("ploygon")
    private PolygonDef ploygon;
    @JsonProperty("stationList")
    private List<StationDef> stationList = new ArrayList<StationDef>();
    @JsonProperty("nutsCodes")
    private List<String> nutsCodes = new ArrayList<String>();

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    public String getZoneId() {
        return zoneId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zoneId")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameUTF8")
    public String getNameUTF8() {
        return nameUTF8;
    }

    @JsonProperty("nameUTF8")
    public void setNameUTF8(String nameUTF8) {
        this.nameUTF8 = nameUTF8;
    }

    @JsonProperty("ploygon")
    public PolygonDef getPloygon() {
        return ploygon;
    }

    @JsonProperty("ploygon")
    public void setPloygon(PolygonDef ploygon) {
        this.ploygon = ploygon;
    }

    @JsonProperty("stationList")
    public List<StationDef> getStationList() {
        return stationList;
    }

    @JsonProperty("stationList")
    public void setStationList(List<StationDef> stationList) {
        this.stationList = stationList;
    }

    @JsonProperty("nutsCodes")
    public List<String> getNutsCodes() {
        return nutsCodes;
    }

    @JsonProperty("nutsCodes")
    public void setNutsCodes(List<String> nutsCodes) {
        this.nutsCodes = nutsCodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ZoneDefinitionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("zoneId");
        sb.append('=');
        sb.append(((this.zoneId == null)?"<null>":this.zoneId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameUTF8");
        sb.append('=');
        sb.append(((this.nameUTF8 == null)?"<null>":this.nameUTF8));
        sb.append(',');
        sb.append("ploygon");
        sb.append('=');
        sb.append(((this.ploygon == null)?"<null>":this.ploygon));
        sb.append(',');
        sb.append("stationList");
        sb.append('=');
        sb.append(((this.stationList == null)?"<null>":this.stationList));
        sb.append(',');
        sb.append("nutsCodes");
        sb.append('=');
        sb.append(((this.nutsCodes == null)?"<null>":this.nutsCodes));
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
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.nutsCodes == null)? 0 :this.nutsCodes.hashCode()));
        result = ((result* 31)+((this.stationList == null)? 0 :this.stationList.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.zoneId == null)? 0 :this.zoneId.hashCode()));
        result = ((result* 31)+((this.nameUTF8 == null)? 0 :this.nameUTF8 .hashCode()));
        result = ((result* 31)+((this.ploygon == null)? 0 :this.ploygon.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZoneDefinitionDef) == false) {
            return false;
        }
        ZoneDefinitionDef rhs = ((ZoneDefinitionDef) other);
        return ((((((((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier)))&&((this.nutsCodes == rhs.nutsCodes)||((this.nutsCodes!= null)&&this.nutsCodes.equals(rhs.nutsCodes))))&&((this.stationList == rhs.stationList)||((this.stationList!= null)&&this.stationList.equals(rhs.stationList))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.zoneId == rhs.zoneId)||((this.zoneId!= null)&&this.zoneId.equals(rhs.zoneId))))&&((this.nameUTF8 == rhs.nameUTF8)||((this.nameUTF8 != null)&&this.nameUTF8 .equals(rhs.nameUTF8))))&&((this.ploygon == rhs.ploygon)||((this.ploygon!= null)&&this.ploygon.equals(rhs.ploygon))));
    }

}
