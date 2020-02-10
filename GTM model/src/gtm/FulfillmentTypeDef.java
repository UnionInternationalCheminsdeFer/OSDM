
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FulfillmentTypeDef {

    SIP("SIP"),
    SID("SID"),
    SIS("SIS");
    private final String value;
    private final static Map<String, FulfillmentTypeDef> CONSTANTS = new HashMap<String, FulfillmentTypeDef>();

    static {
        for (FulfillmentTypeDef c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FulfillmentTypeDef(String value) {
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
    public static FulfillmentTypeDef fromValue(String value) {
        FulfillmentTypeDef constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
