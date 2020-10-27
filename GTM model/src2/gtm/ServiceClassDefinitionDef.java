
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "textRef",
    "text",
    "comfortClass"
})
public class ServiceClassDefinitionDef {

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Level of quality, finer grained than the comfort class.")
    private ServiceClassDefinitionDef.ServiceClassIdDef id;
    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    @JsonPropertyDescription("id of the text describing the class within the offline data text list")
    private String textRef;
    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef text;
    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    @JsonPropertyDescription("Generic class classification, mostly used to harmonize choice and representation across multiple carriers")
    private ServiceClassDefinitionDef.ComfortClassDef comfortClass;

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public ServiceClassDefinitionDef.ServiceClassIdDef getId() {
        return id;
    }

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(ServiceClassDefinitionDef.ServiceClassIdDef id) {
        this.id = id;
    }

    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    public String getTextRef() {
        return textRef;
    }

    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    public void setTextRef(String textRef) {
        this.textRef = textRef;
    }

    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("text")
    public TextDef getText() {
        return text;
    }

    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("text")
    public void setText(TextDef text) {
        this.text = text;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    public ServiceClassDefinitionDef.ComfortClassDef getComfortClass() {
        return comfortClass;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    public void setComfortClass(ServiceClassDefinitionDef.ComfortClassDef comfortClass) {
        this.comfortClass = comfortClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceClassDefinitionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("textRef");
        sb.append('=');
        sb.append(((this.textRef == null)?"<null>":this.textRef));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("comfortClass");
        sb.append('=');
        sb.append(((this.comfortClass == null)?"<null>":this.comfortClass));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.textRef == null)? 0 :this.textRef.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.comfortClass == null)? 0 :this.comfortClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceClassDefinitionDef) == false) {
            return false;
        }
        ServiceClassDefinitionDef rhs = ((ServiceClassDefinitionDef) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.textRef == rhs.textRef)||((this.textRef!= null)&&this.textRef.equals(rhs.textRef))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.comfortClass == rhs.comfortClass)||((this.comfortClass!= null)&&this.comfortClass.equals(rhs.comfortClass))));
    }

    public enum ComfortClassDef {

        FIRST("FIRST"),
        SECOND("SECOND");
        private final String value;
        private final static Map<String, ServiceClassDefinitionDef.ComfortClassDef> CONSTANTS = new HashMap<String, ServiceClassDefinitionDef.ComfortClassDef>();

        static {
            for (ServiceClassDefinitionDef.ComfortClassDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ComfortClassDef(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ServiceClassDefinitionDef.ComfortClassDef fromValue(String value) {
            ServiceClassDefinitionDef.ComfortClassDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ServiceClassIdDef {

        BEST("BEST"),
        HIGH("HIGH"),
        STANDARD("STANDARD"),
        BASIC("BASIC");
        private final String value;
        private final static Map<String, ServiceClassDefinitionDef.ServiceClassIdDef> CONSTANTS = new HashMap<String, ServiceClassDefinitionDef.ServiceClassIdDef>();

        static {
            for (ServiceClassDefinitionDef.ServiceClassIdDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ServiceClassIdDef(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ServiceClassDefinitionDef.ServiceClassIdDef fromValue(String value) {
            ServiceClassDefinitionDef.ServiceClassIdDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
