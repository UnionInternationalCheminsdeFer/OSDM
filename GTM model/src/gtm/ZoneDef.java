
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * carrier - carrier responsible for the transport. entryStation - Station to enter the zone in case the product requires to enter the zone via a specific station (e.g. local zone ticket to start from the main rail station). terminalStation - Terminal station in case the product requires a destination within the zone (e.g. local ticket to go to the main rail station).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "binaryZoneId",
    "carrier",
    "city",
    "entryStation",
    "terminalStation",
    "zoneIds",
    "nutsCode"
})
public class ZoneDef {

    /**
     * Id to support local traffic standards (e.g. VDV,...)
     * 
     */
    @JsonProperty("binaryZoneId")
    @JsonPropertyDescription("Id to support local traffic standards (e.g. VDV,...)")
    private String binaryZoneId;
    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    @JsonProperty("city")
    private Integer city;
    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("entryStation")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef entryStation;
    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("terminalStation")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef terminalStation;
    /**
     * to be used in bar codes
     * 
     */
    @JsonProperty("zoneIds")
    @JsonPropertyDescription("to be used in bar codes")
    private List<Integer> zoneIds = new ArrayList<Integer>();
    /**
     * Nomenclature des units territoriales statistiques COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    @JsonPropertyDescription("Nomenclature des units territoriales statistiques COMMISSION REGULATION (EU) No 31/2011")
    private String nutsCode;

    /**
     * Id to support local traffic standards (e.g. VDV,...)
     * 
     */
    @JsonProperty("binaryZoneId")
    public String getBinaryZoneId() {
        return binaryZoneId;
    }

    /**
     * Id to support local traffic standards (e.g. VDV,...)
     * 
     */
    @JsonProperty("binaryZoneId")
    public void setBinaryZoneId(String binaryZoneId) {
        this.binaryZoneId = binaryZoneId;
    }

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

    @JsonProperty("city")
    public Integer getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("entryStation")
    public StationDef getEntryStation() {
        return entryStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("entryStation")
    public void setEntryStation(StationDef entryStation) {
        this.entryStation = entryStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("terminalStation")
    public StationDef getTerminalStation() {
        return terminalStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("terminalStation")
    public void setTerminalStation(StationDef terminalStation) {
        this.terminalStation = terminalStation;
    }

    /**
     * to be used in bar codes
     * 
     */
    @JsonProperty("zoneIds")
    public List<Integer> getZoneIds() {
        return zoneIds;
    }

    /**
     * to be used in bar codes
     * 
     */
    @JsonProperty("zoneIds")
    public void setZoneIds(List<Integer> zoneIds) {
        this.zoneIds = zoneIds;
    }

    /**
     * Nomenclature des units territoriales statistiques COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    public String getNutsCode() {
        return nutsCode;
    }

    /**
     * Nomenclature des units territoriales statistiques COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    public void setNutsCode(String nutsCode) {
        this.nutsCode = nutsCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ZoneDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("binaryZoneId");
        sb.append('=');
        sb.append(((this.binaryZoneId == null)?"<null>":this.binaryZoneId));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("entryStation");
        sb.append('=');
        sb.append(((this.entryStation == null)?"<null>":this.entryStation));
        sb.append(',');
        sb.append("terminalStation");
        sb.append('=');
        sb.append(((this.terminalStation == null)?"<null>":this.terminalStation));
        sb.append(',');
        sb.append("zoneIds");
        sb.append('=');
        sb.append(((this.zoneIds == null)?"<null>":this.zoneIds));
        sb.append(',');
        sb.append("nutsCode");
        sb.append('=');
        sb.append(((this.nutsCode == null)?"<null>":this.nutsCode));
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
        result = ((result* 31)+((this.nutsCode == null)? 0 :this.nutsCode.hashCode()));
        result = ((result* 31)+((this.zoneIds == null)? 0 :this.zoneIds.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.entryStation == null)? 0 :this.entryStation.hashCode()));
        result = ((result* 31)+((this.terminalStation == null)? 0 :this.terminalStation.hashCode()));
        result = ((result* 31)+((this.binaryZoneId == null)? 0 :this.binaryZoneId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZoneDef) == false) {
            return false;
        }
        ZoneDef rhs = ((ZoneDef) other);
        return ((((((((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier)))&&((this.nutsCode == rhs.nutsCode)||((this.nutsCode!= null)&&this.nutsCode.equals(rhs.nutsCode))))&&((this.zoneIds == rhs.zoneIds)||((this.zoneIds!= null)&&this.zoneIds.equals(rhs.zoneIds))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.entryStation == rhs.entryStation)||((this.entryStation!= null)&&this.entryStation.equals(rhs.entryStation))))&&((this.terminalStation == rhs.terminalStation)||((this.terminalStation!= null)&&this.terminalStation.equals(rhs.terminalStation))))&&((this.binaryZoneId == rhs.binaryZoneId)||((this.binaryZoneId!= null)&&this.binaryZoneId.equals(rhs.binaryZoneId))));
    }

}
