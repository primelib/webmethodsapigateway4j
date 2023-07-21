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
 * PolicyEnforcements
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
    "enforcements",
    "stageKey"
})
@JsonTypeName("PolicyEnforcements")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyEnforcements {

    @JsonProperty("enforcements")
    protected List<Enforcement> enforcements;

    /**
     * Policy stage. User can refer resource /policyStages to get the list stages can be added here
     */
    @JsonProperty("stageKey")
    protected String stageKey;

    /**
     * Constructs a validated instance of {@link PolicyEnforcements}.
     *
     * @param spec the specification to process
     */
    public PolicyEnforcements(Consumer<PolicyEnforcements> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PolicyEnforcements}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PolicyEnforcements(Consumer)} instead.
     * @param enforcements var.name
     * @param stageKey Policy stage. User can refer resource /policyStages to get the list stages can be added here
     */
    @ApiStatus.Internal
    public PolicyEnforcements(List<Enforcement> enforcements, String stageKey) {
        this.enforcements = enforcements;
        this.stageKey = stageKey;
    }

}
