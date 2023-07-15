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
 * PolicyDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "PolicyScope",
    "names",
    "policyActionsIds",
    "policyId",
    "stageKey"
})
@JsonTypeName("PolicyDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PolicyDetails {

    /**
     * Constructs a validated implementation of {@link PolicyDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PolicyDetails(Consumer<PolicyDetails> spec) {
        spec.accept(this);
    }

    /**
     * Policy Scope of the conflicting policy.
     */
    @JsonProperty("PolicyScope")
    protected PolicyScopeEnum policyScope;

    @JsonProperty("names")
    protected List<InternationalizedString> names;

    /**
     * List of IDs of conflicting policy enforcement of this policy
     */
    @JsonProperty("policyActionsIds")
    protected List<String> policyActionsIds;

    /**
     * Id of the conflicting policy.
     */
    @JsonProperty("policyId")
    protected String policyId;

    /**
     * Stage key of the conflicting policy enforcement of this policy
     */
    @JsonProperty("stageKey")
    protected String stageKey;


    /**
     * Policy Scope of the conflicting policy.
     */
    @AllArgsConstructor
    public enum PolicyScopeEnum {
        GLOBAL("GLOBAL"),
        METHOD("METHOD"),
        OPERATION("OPERATION"),
        RESOURCE("RESOURCE"),
        SERVICE("SERVICE"),
        PACKAGE("PACKAGE"),
        TEMPLATE("TEMPLATE"),
        SCOPE("SCOPE");

        private final String value;
    }

}
