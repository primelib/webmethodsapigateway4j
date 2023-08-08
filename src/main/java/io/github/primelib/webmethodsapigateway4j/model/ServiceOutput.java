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
 * ServiceOutput
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
    "accessToken",
    "expiresIn",
    "scopes",
    "tokenType"
})
@JsonTypeName("ServiceOutput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOutput {

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

    /**
     * Constructs a validated instance of {@link ServiceOutput}.
     *
     * @param spec the specification to process
     */
    public ServiceOutput(Consumer<ServiceOutput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOutput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOutput(Consumer)} instead.
     * @param accessToken generated access token
     * @param expiresIn token expiry
     * @param scopes scopes for which the access token is issued
     * @param tokenType tokenType
     */
    @ApiStatus.Internal
    public ServiceOutput(String accessToken, Long expiresIn, String scopes, String tokenType) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.scopes = scopes;
        this.tokenType = tokenType;
    }

}
