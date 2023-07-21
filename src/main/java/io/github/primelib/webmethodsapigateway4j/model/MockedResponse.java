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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MockedResponse
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
    "responseBody",
    "responseHeaders",
    "statusCode"
})
@JsonTypeName("MockedResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockedResponse {

    @JsonProperty("responseBody")
    protected Map<String, Object> responseBody;

    @JsonProperty("responseHeaders")
    protected Map<String, Object> responseHeaders;

    @JsonProperty("statusCode")
    protected String statusCode;

    /**
     * Constructs a validated instance of {@link MockedResponse}.
     *
     * @param spec the specification to process
     */
    public MockedResponse(Consumer<MockedResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MockedResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MockedResponse(Consumer)} instead.
     * @param responseBody var.name
     * @param responseHeaders var.name
     * @param statusCode var.name
     */
    @ApiStatus.Internal
    public MockedResponse(Map<String, Object> responseBody, Map<String, Object> responseHeaders, String statusCode) {
        this.responseBody = responseBody;
        this.responseHeaders = responseHeaders;
        this.statusCode = statusCode;
    }

}
