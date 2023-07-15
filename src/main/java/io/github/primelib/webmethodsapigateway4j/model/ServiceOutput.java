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
 * ServiceOutput
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessToken",
    "expiresIn",
    "scopes",
    "tokenType"
})
@JsonTypeName("ServiceOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOutput {

    /**
     * Constructs a validated implementation of {@link ServiceOutput}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOutput(Consumer<ServiceOutput> spec) {
        spec.accept(this);
    }

    /**
     * generated access token
     */
    @JsonProperty("accessToken")
    protected String accessToken;

    /**
     * token expiry
     */
    @JsonProperty("expiresIn")
    protected Long expiresIn;

    /**
     * scopes for which the access token is issued
     */
    @JsonProperty("scopes")
    protected String scopes;

    @JsonProperty("tokenType")
    protected String tokenType;


}
