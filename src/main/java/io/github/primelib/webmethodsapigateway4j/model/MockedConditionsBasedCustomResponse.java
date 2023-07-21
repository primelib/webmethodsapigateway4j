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
 * MockedConditionsBasedCustomResponse
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
    "mockedConditionList",
    "mockedResponse"
})
@JsonTypeName("MockedConditionsBasedCustomResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockedConditionsBasedCustomResponse {

    @JsonProperty("mockedConditionList")
    protected List<MockedCondition> mockedConditionList;

    @JsonProperty("mockedResponse")
    protected MockedResponse mockedResponse;

    /**
     * Constructs a validated instance of {@link MockedConditionsBasedCustomResponse}.
     *
     * @param spec the specification to process
     */
    public MockedConditionsBasedCustomResponse(Consumer<MockedConditionsBasedCustomResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MockedConditionsBasedCustomResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MockedConditionsBasedCustomResponse(Consumer)} instead.
     * @param mockedConditionList var.name
     * @param mockedResponse var.name
     */
    @ApiStatus.Internal
    public MockedConditionsBasedCustomResponse(List<MockedCondition> mockedConditionList, MockedResponse mockedResponse) {
        this.mockedConditionList = mockedConditionList;
        this.mockedResponse = mockedResponse;
    }

}
