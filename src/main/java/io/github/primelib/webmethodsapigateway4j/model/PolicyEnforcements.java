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
 * PolicyEnforcements
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enforcements",
    "stageKey"
})
@JsonTypeName("PolicyEnforcements")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyEnforcements {

    /**
     * Constructs a validated implementation of {@link PolicyEnforcements}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyEnforcements(Consumer<PolicyEnforcements> spec) {
        spec.accept(this);
    }

    @JsonProperty("enforcements")
    protected List<Enforcement> enforcements;

    /**
     * Policy stage. User can refer resource /policyStages to get the list stages can be added here
     */
    @JsonProperty("stageKey")
    protected String stageKey;


}
