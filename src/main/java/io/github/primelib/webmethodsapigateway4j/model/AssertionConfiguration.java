package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssertionConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "Assertion element",
    "Assertion name",
    "Assertion type",
    "assertionId"
})
@JsonTypeName("AssertionConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssertionConfiguration {

    /**
     * Constructs a validated implementation of {@link AssertionConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssertionConfiguration(Consumer<AssertionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * XML element which represents the assertion
     */
    @JsonProperty("Assertion element")
    protected String assertionElement;

    /**
     * Name of the assertion
     */
    @JsonProperty("Assertion name")
    protected String assertionName;

    /**
     * Type of assertion(tokenAssertion/bindingAssertion)
     */
    @JsonProperty("Assertion type")
    protected AssertionTypeEnum assertionType;

    /**
     * A unique ID for the assertion
     */
    @JsonProperty("assertionId")
    protected String assertionId;


    /**
     * Type of assertion(tokenAssertion/bindingAssertion)
     */
    @AllArgsConstructor
    public enum AssertionTypeEnum {
        TOKENASSERTION("tokenAssertion"),
        BINDINGASSERTION("bindingAssertion"),
        POLICYASSERTION("policyAssertion");

        private final String value;
    }

}
