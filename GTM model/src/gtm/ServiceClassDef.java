
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "textId",
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
    @JsonProperty("textId")
    @JsonPropertyDescription("id of the text describing the class")
    private String textId;
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
    @JsonProperty("textId")
    public String getTextId() {
        return textId;
    }

    /**
     * id of the text describing the class
     * 
     */
    @JsonProperty("textId")
    public void setTextId(String textId) {
        this.textId = textId;
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
        sb.append("textId");
        sb.append('=');
        sb.append(((this.textId == null)?"<null>":this.textId));
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
        result = ((result* 31)+((this.textId == null)? 0 :this.textId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        return ((((this.textId == rhs.textId)||((this.textId!= null)&&this.textId.equals(rhs.textId)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.classicClass == rhs.classicClass)||((this.classicClass!= null)&&this.classicClass.equals(rhs.classicClass))));
    }

}
