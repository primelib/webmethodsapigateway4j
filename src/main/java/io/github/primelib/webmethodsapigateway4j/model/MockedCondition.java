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
 * MockedCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditionName",
    "mockedConditionParameter",
    "mockedLevel1Operator",
    "mockedLevel2Operator",
    "value1",
    "value2"
})
@JsonTypeName("MockedCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockedCondition {

    /**
     * Constructs a validated implementation of {@link MockedCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MockedCondition(Consumer<MockedCondition> spec) {
        spec.accept(this);
    }

    @JsonProperty("conditionName")
    protected String conditionName;

    @JsonProperty("mockedConditionParameter")
    protected MockedConditionParameterEnum mockedConditionParameter;

    @JsonProperty("mockedLevel1Operator")
    protected MockedLevel1OperatorEnum mockedLevel1Operator;

    @JsonProperty("mockedLevel2Operator")
    protected MockedLevel2OperatorEnum mockedLevel2Operator;

    @JsonProperty("value1")
    protected String value1;

    @JsonProperty("value2")
    protected String value2;


    @AllArgsConstructor
    public enum MockedConditionParameterEnum {
        BODY("Body"),
        HEADER("Header"),
        QUERYPARAMETER("QueryParameter");

        private final String value;
    }

    @AllArgsConstructor
    public enum MockedLevel1OperatorEnum {
        EQUALS("Equals"),
        NOTEQUALS("NotEquals"),
        CONTAINSKEY("ContainsKey"),
        CONTAINSKEYVALUE("ContainsKeyValue");

        private final String value;
    }

    @AllArgsConstructor
    public enum MockedLevel2OperatorEnum {
        EQUALS("Equals"),
        NOTEQUALS("NotEquals"),
        CONTAINS("Contains"),
        STARTSWITH("StartsWith"),
        ENDSWITH("EndsWith");

        private final String value;
    }

}
