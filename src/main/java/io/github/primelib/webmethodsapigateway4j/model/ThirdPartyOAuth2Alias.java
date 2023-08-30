package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * ThirdPartyOAuth2Alias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "authInfo",
    "endpointDetails",
    "metadata",
    "providerName"
})
@JsonTypeName("ThirdPartyOAuth2Alias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ThirdPartyOAuth2Alias extends Alias {

    @JsonProperty("authInfo")
    protected Object authInfo;

    @JsonProperty("endpointDetails")
    protected OAuth2Endpoints endpointDetails;

    @JsonProperty("metadata")
    protected Metadata metadata;

    @JsonProperty("providerName")
    protected String providerName;

    /**
     * Constructs a validated instance of {@link ThirdPartyOAuth2Alias}.
     *
     * @param spec the specification to process
     */
    public ThirdPartyOAuth2Alias(Consumer<ThirdPartyOAuth2Alias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ThirdPartyOAuth2Alias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ThirdPartyOAuth2Alias(Consumer)} instead.
     * @param authInfo authInfo
     * @param endpointDetails endpointDetails
     * @param metadata metadata
     * @param providerName providerName
     */
    @ApiStatus.Internal
    public ThirdPartyOAuth2Alias(Object authInfo, OAuth2Endpoints endpointDetails, Metadata metadata, String providerName) {
        this.authInfo = authInfo;
        this.endpointDetails = endpointDetails;
        this.metadata = metadata;
        this.providerName = providerName;
    }

}
