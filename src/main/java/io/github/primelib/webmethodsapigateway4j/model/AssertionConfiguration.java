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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AssertionConfiguration
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
    "Assertion element",
    "Assertion name",
    "Assertion type",
    "assertionId"
})
@JsonTypeName("AssertionConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssertionConfiguration {

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
     * Constructs a validated instance of {@link AssertionConfiguration}.
     *
     * @param spec the specification to process
     */
    public AssertionConfiguration(Consumer<AssertionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssertionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssertionConfiguration(Consumer)} instead.
     * @param assertionElement XML element which represents the assertion
     * @param assertionName Name of the assertion
     * @param assertionType Type of assertion(tokenAssertion/bindingAssertion)
     * @param assertionId A unique ID for the assertion
     */
    @ApiStatus.Internal
    public AssertionConfiguration(String assertionElement, String assertionName, AssertionTypeEnum assertionType, String assertionId) {
        this.assertionElement = assertionElement;
        this.assertionName = assertionName;
        this.assertionType = assertionType;
        this.assertionId = assertionId;
    }

    /**
     * Type of assertion(tokenAssertion/bindingAssertion)
     */
    @AllArgsConstructor
    public enum AssertionTypeEnum {
        TOKENASSERTION("tokenAssertion"),
        BINDINGASSERTION("bindingAssertion"),
        POLICYASSERTION("policyAssertion");

        private static final AssertionTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AssertionTypeEnum of(String input) {
            if (input != null) {
                for (AssertionTypeEnum v : VALUES) {
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
