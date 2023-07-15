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
 * APIAccessKey
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiAccessKey",
    "expirationDate",
    "expirationInterval"
})
@JsonTypeName("APIAccessKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIAccessKey {

    /**
     * Constructs a validated implementation of {@link APIAccessKey}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIAccessKey(Consumer<APIAccessKey> spec) {
        spec.accept(this);
    }

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


}
