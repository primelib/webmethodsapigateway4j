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
 * MockedCondition
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

    /**
     * Constructs a validated instance of {@link MockedCondition}.
     *
     * @param spec the specification to process
     */
    public MockedCondition(Consumer<MockedCondition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MockedCondition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MockedCondition(Consumer)} instead.
     * @param conditionName conditionName
     * @param mockedConditionParameter mockedConditionParameter
     * @param mockedLevel1Operator mockedLevel1Operator
     * @param mockedLevel2Operator mockedLevel2Operator
     * @param value1 value1
     * @param value2 value2
     */
    @ApiStatus.Internal
    public MockedCondition(String conditionName, MockedConditionParameterEnum mockedConditionParameter, MockedLevel1OperatorEnum mockedLevel1Operator, MockedLevel2OperatorEnum mockedLevel2Operator, String value1, String value2) {
        this.conditionName = conditionName;
        this.mockedConditionParameter = mockedConditionParameter;
        this.mockedLevel1Operator = mockedLevel1Operator;
        this.mockedLevel2Operator = mockedLevel2Operator;
        this.value1 = value1;
        this.value2 = value2;
    }

    @AllArgsConstructor
    public enum MockedConditionParameterEnum {
        BODY("Body"),
        HEADER("Header"),
        QUERYPARAMETER("QueryParameter");

        private static final MockedConditionParameterEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MockedConditionParameterEnum of(String input) {
            if (input != null) {
                for (MockedConditionParameterEnum v : VALUES) {
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

    @AllArgsConstructor
    public enum MockedLevel1OperatorEnum {
        EQUALS("Equals"),
        NOTEQUALS("NotEquals"),
        CONTAINSKEY("ContainsKey"),
        CONTAINSKEYVALUE("ContainsKeyValue");

        private static final MockedLevel1OperatorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MockedLevel1OperatorEnum of(String input) {
            if (input != null) {
                for (MockedLevel1OperatorEnum v : VALUES) {
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

    @AllArgsConstructor
    public enum MockedLevel2OperatorEnum {
        EQUALS("Equals"),
        NOTEQUALS("NotEquals"),
        CONTAINS("Contains"),
        STARTSWITH("StartsWith"),
        ENDSWITH("EndsWith");

        private static final MockedLevel2OperatorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MockedLevel2OperatorEnum of(String input) {
            if (input != null) {
                for (MockedLevel2OperatorEnum v : VALUES) {
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
