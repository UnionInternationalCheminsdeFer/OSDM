
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "textRef",
    "text",
    "classicClass"
})
public class ServiceClassDef {

    /**
     * A,B,C,D
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A,B,C,D")
    private String id;
    /**
     * id of the text describing the class
     * 
     */
    @JsonProperty("textRef")
    @JsonPropertyDescription("id of the text describing the class")
    private String textRef;
    /**
     * directly included text in case of online services
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef text;
    /**
     * FIRST,SECOND
     * 
     */
    @JsonProperty("classicClass")
    @JsonPropertyDescription("FIRST,SECOND")
    private String classicClass;

    /**
     * A,B,C,D
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A,B,C,D
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * id of the text describing the class
     * 
     */
    @JsonProperty("textRef")
    public String getTextRef() {
        return textRef;
    }

    /**
     * id of the text describing the class
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
     * FIRST,SECOND
     * 
     */
    @JsonProperty("classicClass")
    public String getClassicClass() {
        return classicClass;
    }

    /**
     * FIRST,SECOND
     * 
     */
    @JsonProperty("classicClass")
    public void setClassicClass(String classicClass) {
        this.classicClass = classicClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceClassDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("classicClass");
        sb.append('=');
        sb.append(((this.classicClass == null)?"<null>":this.classicClass));
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
        result = ((result* 31)+((this.classicClass == null)? 0 :this.classicClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceClassDef) == false) {
            return false;
        }
        ServiceClassDef rhs = ((ServiceClassDef) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.textRef == rhs.textRef)||((this.textRef!= null)&&this.textRef.equals(rhs.textRef))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.classicClass == rhs.classicClass)||((this.classicClass!= null)&&this.classicClass.equals(rhs.classicClass))));
    }

}
