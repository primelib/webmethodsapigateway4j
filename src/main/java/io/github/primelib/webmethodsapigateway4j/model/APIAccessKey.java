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
 * APIAccessKey
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
    "apiAccessKey",
    "expirationDate",
    "expirationInterval"
})
@JsonTypeName("APIAccessKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIAccessKey {

    /**
     * API access key
     */
    @JsonProperty("apiAccessKey")
    protected String apiAccessKey;

    /**
     * expiration date of the api key
     */
    @JsonProperty("expirationDate")
    protected String expirationDate;

    /**
     * expiration interval of the api key
     */
    @JsonProperty("expirationInterval")
    protected String expirationInterval;

    /**
     * Constructs a validated instance of {@link APIAccessKey}.
     *
     * @param spec the specification to process
     */
    public APIAccessKey(Consumer<APIAccessKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIAccessKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIAccessKey(Consumer)} instead.
     * @param apiAccessKey API access key
     * @param expirationDate expiration date of the api key
     * @param expirationInterval expiration interval of the api key
     */
    @ApiStatus.Internal
    public APIAccessKey(String apiAccessKey, String expirationDate, String expirationInterval) {
        this.apiAccessKey = apiAccessKey;
        this.expirationDate = expirationDate;
        this.expirationInterval = expirationInterval;
    }

}
