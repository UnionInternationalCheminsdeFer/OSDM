
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BinaryZoneId",
    "Carrier",
    "City",
    "EntryStation",
    "LineId",
    "TerminalStation",
    "nutsCode"
})
public class LineDef {

    /**
     * base 64 encoded data
     * 
     */
    @JsonProperty("BinaryZoneId")
    @JsonPropertyDescription("base 64 encoded data")
    private String binaryZoneId;
    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("Carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x")
    private String carrier;
    @JsonProperty("City")
    private Integer city;
    @JsonProperty("EntryStation")
    private StationDef entryStation;
    @JsonProperty("LineId")
    private List<String> lineId = new ArrayList<String>();
    @JsonProperty("TerminalStation")
    private StationDef terminalStation;
    /**
     * Nomenclature des units territoriales statistiques  
     *  COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    @JsonPropertyDescription("Nomenclature des units territoriales statistiques  \n COMMISSION REGULATION (EU) No 31/2011")
    private String nutsCode;

    /**
     * base 64 encoded data
     * 
     */
    @JsonProperty("BinaryZoneId")
    public String getBinaryZoneId() {
        return binaryZoneId;
    }

    /**
     * base 64 encoded data
     * 
     */
    @JsonProperty("BinaryZoneId")
    public void setBinaryZoneId(String binaryZoneId) {
        this.binaryZoneId = binaryZoneId;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("Carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("Carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("City")
    public Integer getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(Integer city) {
        this.city = city;
    }

    @JsonProperty("EntryStation")
    public StationDef getEntryStation() {
        return entryStation;
    }

    @JsonProperty("EntryStation")
    public void setEntryStation(StationDef entryStation) {
        this.entryStation = entryStation;
    }

    @JsonProperty("LineId")
    public List<String> getLineId() {
        return lineId;
    }

    @JsonProperty("LineId")
    public void setLineId(List<String> lineId) {
        this.lineId = lineId;
    }

    @JsonProperty("TerminalStation")
    public StationDef getTerminalStation() {
        return terminalStation;
    }

    @JsonProperty("TerminalStation")
    public void setTerminalStation(StationDef terminalStation) {
        this.terminalStation = terminalStation;
    }

    /**
     * Nomenclature des units territoriales statistiques  
     *  COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    public String getNutsCode() {
        return nutsCode;
    }

    /**
     * Nomenclature des units territoriales statistiques  
     *  COMMISSION REGULATION (EU) No 31/2011
     * 
     */
    @JsonProperty("nutsCode")
    public void setNutsCode(String nutsCode) {
        this.nutsCode = nutsCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lineId");
        sb.append('=');
        sb.append(((this.lineId == null)?"<null>":this.lineId));
        sb.append(',');
        sb.append("terminalStation");
        sb.append('=');
        sb.append(((this.terminalStation == null)?"<null>":this.terminalStation));
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.lineId == null)? 0 :this.lineId.hashCode()));
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
        if ((other instanceof LineDef) == false) {
            return false;
        }
        LineDef rhs = ((LineDef) other);
        return ((((((((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier)))&&((this.nutsCode == rhs.nutsCode)||((this.nutsCode!= null)&&this.nutsCode.equals(rhs.nutsCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.lineId == rhs.lineId)||((this.lineId!= null)&&this.lineId.equals(rhs.lineId))))&&((this.entryStation == rhs.entryStation)||((this.entryStation!= null)&&this.entryStation.equals(rhs.entryStation))))&&((this.terminalStation == rhs.terminalStation)||((this.terminalStation!= null)&&this.terminalStation.equals(rhs.terminalStation))))&&((this.binaryZoneId == rhs.binaryZoneId)||((this.binaryZoneId!= null)&&this.binaryZoneId.equals(rhs.binaryZoneId))));
    }

}
