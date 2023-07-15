package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MockedResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "responseBody",
    "responseHeaders",
    "statusCode"
})
@JsonTypeName("MockedResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockedResponse {

    /**
     * Constructs a validated implementation of {@link MockedResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MockedResponse(Consumer<MockedResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("responseBody")
    protected Map<String, Object> responseBody = new HashMap<>();

    @JsonProperty("responseHeaders")
    protected Map<String, Object> responseHeaders = new HashMap<>();

    @JsonProperty("statusCode")
    protected String statusCode;


}
