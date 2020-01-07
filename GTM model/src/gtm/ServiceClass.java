
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceClass"
})
public class ServiceClass {

    @JsonProperty("serviceClass")
    private ServiceClassDef serviceClass;

    @JsonProperty("serviceClass")
    public ServiceClassDef getServiceClass() {
        return serviceClass;
    }

    @JsonProperty("serviceClass")
    public void setServiceClass(ServiceClassDef serviceClass) {
        this.serviceClass = serviceClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceClass.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceClass");
        sb.append('=');
        sb.append(((this.serviceClass == null)?"<null>":this.serviceClass));
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
        result = ((result* 31)+((this.serviceClass == null)? 0 :this.serviceClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceClass) == false) {
            return false;
        }
        ServiceClass rhs = ((ServiceClass) other);
        return ((this.serviceClass == rhs.serviceClass)||((this.serviceClass!= null)&&this.serviceClass.equals(rhs.serviceClass)));
    }

}
