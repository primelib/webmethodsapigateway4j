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
 * PolicyEnforcementStage
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link PolicyEnforcementStage}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyEnforcementStage(Consumer<PolicyEnforcementStage> spec) {
        spec.accept(this);
    }

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

        private final String value;
    }

}
