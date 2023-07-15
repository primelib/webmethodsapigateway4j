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
 * PolicyAction
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active",
    "descriptions",
    "id",
    "names",
    "parameters",
    "stageKey",
    "templateKey"
})
@JsonTypeName("PolicyAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyAction {

    /**
     * Constructs a validated implementation of {@link PolicyAction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyAction(Consumer<PolicyAction> spec) {
        spec.accept(this);
    }

    @JsonProperty("active")
    protected Boolean active;

    /**
     * List of policy action description with corresponding locale information
     */
    @JsonProperty("descriptions")
    protected List<InternationalizedString> descriptions;

    /**
     * Policy Action ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * List of policy action names with corresponding locale information
     */
    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * This is the list of values that are configured for this policy actions
     */
    @JsonProperty("parameters")
    protected List<PolicyActionParameter> parameters;

    @JsonProperty("stageKey")
    protected String stageKey;

    /**
     * Template key of the policy actions
     */
    @JsonProperty("templateKey")
    protected String templateKey;


}
