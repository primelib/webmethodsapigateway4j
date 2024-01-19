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
 * PolicyEnforcementStage
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
    "descriptions",
    "names",
    "policyActionTempaltes",
    "sequence",
    "stageKey"
})
@JsonTypeName("PolicyEnforcementStage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyEnforcementStage {

    /**
     * Stage description with corresponding locale
     */
    @JsonProperty("descriptions")
    protected List<InternationalizedString> descriptions;

    /**
     * Stage name with corresponding locale
     */
    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * The list of policy enforcements can be applied on the respective stage.
     */
    @JsonProperty("policyActionTempaltes")
    protected List<String> policyActionTempaltes;

    /**
     * Sequence of the stage.
     * 1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.
     *  2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.
     *  3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error.
     */
    @JsonProperty("sequence")
    protected SequenceEnum sequence;

    /**
     * The unique key for the stage.
     */
    @JsonProperty("stageKey")
    protected String stageKey;

    /**
     * Constructs a validated instance of {@link PolicyEnforcementStage}.
     *
     * @param spec the specification to process
     */
    public PolicyEnforcementStage(Consumer<PolicyEnforcementStage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyEnforcementStage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyEnforcementStage(Consumer)} instead.
     * @param descriptions Stage description with corresponding locale
     * @param names Stage name with corresponding locale
     * @param policyActionTempaltes The list of policy enforcements can be applied on the respective stage.
     * @param sequence Sequence of the stage.  1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.   2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.   3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error.
     * @param stageKey The unique key for the stage.
     */
    @ApiStatus.Internal
    public PolicyEnforcementStage(List<InternationalizedString> descriptions, List<InternationalizedString> names, List<String> policyActionTempaltes, SequenceEnum sequence, String stageKey) {
        this.descriptions = descriptions;
        this.names = names;
        this.policyActionTempaltes = policyActionTempaltes;
        this.sequence = sequence;
        this.stageKey = stageKey;
    }

    /**
     * Sequence of the stage.
     * 1. insequence - Stages or policies marked with this sequence will be executed when the request comes to API Gateway and before the request dispatched to native service.
     *  2. outsequence - Stages or policies marked with this sequence will be executed when the request goes out of API Gateway to the invoker.
     *  3. faultsequence - Stages or policies marked with this sequence will be executed when native service return any error.
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
