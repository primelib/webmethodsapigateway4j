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
 * TransactionResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "apiName",
    "apiVersion",
    "count"
})
@JsonTypeName("TransactionResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransactionResponse {

    /**
     * Constructs a validated implementation of {@link TransactionResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TransactionResponse(Consumer<TransactionResponse> spec) {
        spec.accept(this);
    }

    /**
     * API Id
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * API name
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * API version
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    /**
     * The total number of invocations based on the provided filter criteria
     */
    @JsonProperty("count")
    protected Long count;


}
