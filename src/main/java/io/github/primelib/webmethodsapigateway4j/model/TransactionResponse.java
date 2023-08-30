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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionResponse
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
    "apiId",
    "apiName",
    "apiVersion",
    "count"
})
@JsonTypeName("TransactionResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransactionResponse {

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

    /**
     * Constructs a validated instance of {@link TransactionResponse}.
     *
     * @param spec the specification to process
     */
    public TransactionResponse(Consumer<TransactionResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransactionResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransactionResponse(Consumer)} instead.
     * @param apiId API Id
     * @param apiName API name
     * @param apiVersion API version
     * @param count The total number of invocations based on the provided filter criteria
     */
    @ApiStatus.Internal
    public TransactionResponse(String apiId, String apiName, String apiVersion, Long count) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.count = count;
    }

}
