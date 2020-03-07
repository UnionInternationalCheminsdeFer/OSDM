
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "localCode",
    "name",
    "nameUtf8",
    "longitude",
    "latitude"
})
public class StationDetailsDef {

    @JsonProperty("country")
    private String country;
    @JsonProperty("localCode")
    private String localCode;
    /**
     * station name in ASCII characters (a-z,A-Z,0-9,/,:,(,) )
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("station name in ASCII characters (a-z,A-Z,0-9,/,:,(,) )")
    private String name;
    /**
     * station name in local characters
     * 
     */
    @JsonProperty("nameUtf8")
    @JsonPropertyDescription("station name in local characters")
    private String nameUtf8;
    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("latitude")
    private Float latitude;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("localCode")
    public String getLocalCode() {
        return localCode;
    }

    @JsonProperty("localCode")
    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    /**
     * station name in ASCII characters (a-z,A-Z,0-9,/,:,(,) )
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * station name in ASCII characters (a-z,A-Z,0-9,/,:,(,) )
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * station name in local characters
     * 
     */
    @JsonProperty("nameUtf8")
    public String getNameUtf8() {
        return nameUtf8;
    }

    /**
     * station name in local characters
     * 
     */
    @JsonProperty("nameUtf8")
    public void setNameUtf8(String nameUtf8) {
        this.nameUtf8 = nameUtf8;
    }

    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StationDetailsDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("localCode");
        sb.append('=');
        sb.append(((this.localCode == null)?"<null>":this.localCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameUtf8");
        sb.append('=');
        sb.append(((this.nameUtf8 == null)?"<null>":this.nameUtf8));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nameUtf8 == null)? 0 :this.nameUtf8 .hashCode()));
        result = ((result* 31)+((this.localCode == null)? 0 :this.localCode.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StationDetailsDef) == false) {
            return false;
        }
        StationDetailsDef rhs = ((StationDetailsDef) other);
        return (((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nameUtf8 == rhs.nameUtf8)||((this.nameUtf8 != null)&&this.nameUtf8 .equals(rhs.nameUtf8))))&&((this.localCode == rhs.localCode)||((this.localCode!= null)&&this.localCode.equals(rhs.localCode))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
