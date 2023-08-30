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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyAction
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

    /**
     * Constructs a validated instance of {@link PolicyAction}.
     *
     * @param spec the specification to process
     */
    public PolicyAction(Consumer<PolicyAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyAction(Consumer)} instead.
     * @param active active
     * @param descriptions List of policy action description with corresponding locale information
     * @param id Policy Action ID
     * @param names List of policy action names with corresponding locale information
     * @param parameters This is the list of values that are configured for this policy actions
     * @param stageKey stageKey
     * @param templateKey Template key of the policy actions
     */
    @ApiStatus.Internal
    public PolicyAction(Boolean active, List<InternationalizedString> descriptions, String id, List<InternationalizedString> names, List<PolicyActionParameter> parameters, String stageKey, String templateKey) {
        this.active = active;
        this.descriptions = descriptions;
        this.id = id;
        this.names = names;
        this.parameters = parameters;
        this.stageKey = stageKey;
        this.templateKey = templateKey;
    }

}
