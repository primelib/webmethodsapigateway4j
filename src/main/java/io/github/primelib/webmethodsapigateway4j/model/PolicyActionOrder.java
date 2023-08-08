package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PolicyActionOrder
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "isCustomOrderSupported",
    "orderPosition",
    "policyTemplateIDs",
    "sequence"
})
@JsonTypeName("PolicyActionOrder")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionOrder {

    @JsonProperty("isCustomOrderSupported")
    protected Boolean isCustomOrderSupported;

    /**
     * Order of the policy enforcement.
     *  1. First - policy enforcement needs to be added in its respective stage.
     *  2. Last - policy enforcement needs to be added as last in its respective stage.
     *  3. Before First occurrence - Policy needs to be added before the first occurrence of policyTemplateIds specified.
     *  4. After last occurrence - Policy needs to be added after last occurrence of policyTemplateIds specified
     */
    @JsonProperty("orderPosition")
    protected OrderPositionEnum orderPosition;

    /**
     * List of policy template ids needed to process the order before first occurrence and after last occurrence
     */
    @JsonProperty("policyTemplateIDs")
    protected List<String> policyTemplateIDs;

    /**
     * Sequence of the policy enforcement.
     * 1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.
     *  2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.
     *  3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error
     */
    @JsonProperty("sequence")
    protected List<SequenceEnum> sequence;

    /**
     * Constructs a validated instance of {@link PolicyActionOrder}.
     *
     * @param spec the specification to process
     */
    public PolicyActionOrder(Consumer<PolicyActionOrder> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyActionOrder}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyActionOrder(Consumer)} instead.
     * @param isCustomOrderSupported isCustomOrderSupported
     * @param orderPosition Order of the policy enforcement.   1. First - policy enforcement needs to be added in its respective stage.   2. Last - policy enforcement needs to be added as last in its respective stage.   3. Before First occurrence - Policy needs to be added before the first occurrence of policyTemplateIds specified.   4. After last occurrence - Policy needs to be added after last occurrence of policyTemplateIds specified
     * @param policyTemplateIDs List of policy template ids needed to process the order before first occurrence and after last occurrence
     * @param sequence Sequence of the policy enforcement.  1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.   2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.   3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error
     */
    @ApiStatus.Internal
    public PolicyActionOrder(Boolean isCustomOrderSupported, OrderPositionEnum orderPosition, List<String> policyTemplateIDs, List<SequenceEnum> sequence) {
        this.isCustomOrderSupported = isCustomOrderSupported;
        this.orderPosition = orderPosition;
        this.policyTemplateIDs = policyTemplateIDs;
        this.sequence = sequence;
    }

    /**
     * Order of the policy enforcement.
     *  1. First - policy enforcement needs to be added in its respective stage.
     *  2. Last - policy enforcement needs to be added as last in its respective stage.
     *  3. Before First occurrence - Policy needs to be added before the first occurrence of policyTemplateIds specified.
     *  4. After last occurrence - Policy needs to be added after last occurrence of policyTemplateIds specified
     */
    @AllArgsConstructor
    public enum OrderPositionEnum {
        FIRST("first"),
        LAST("last"),
        BEFOREFIRSTOCCURENCE("beforeFirstOccurence"),
        AFTERLASTOCCURENCE("afterLastOccurence");

        private static final OrderPositionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OrderPositionEnum of(String input) {
            if (input != null) {
                for (OrderPositionEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * Sequence of the policy enforcement.
     * 1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.
     *  2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.
     *  3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error
     */
    @AllArgsConstructor
    public enum SequenceEnum {
        INSEQUENCE("insequence"),
        OUTSEQUENCE("outsequence"),
        FAULTSEQUENCE("faultsequence");

        private static final SequenceEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SequenceEnum of(String input) {
            if (input != null) {
                for (SequenceEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
