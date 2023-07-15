package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyActionOrder
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "isCustomOrderSupported",
    "orderPosition",
    "policyTemplateIDs",
    "sequence"
})
@JsonTypeName("PolicyActionOrder")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyActionOrder {

    /**
     * Constructs a validated implementation of {@link PolicyActionOrder}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyActionOrder(Consumer<PolicyActionOrder> spec) {
        spec.accept(this);
    }

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

        private final String value;
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

        private final String value;
    }

}
