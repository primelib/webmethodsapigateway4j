package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ThirdPartyOAuth2Alias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "authInfo",
    "endpointDetails",
    "metadata",
    "providerName"
})
@JsonTypeName("ThirdPartyOAuth2Alias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ThirdPartyOAuth2Alias extends Alias {

    /**
     * Constructs a validated implementation of {@link ThirdPartyOAuth2Alias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ThirdPartyOAuth2Alias(Consumer<ThirdPartyOAuth2Alias> spec) {
        spec.accept(this);
    }

    @JsonProperty("authInfo")
    protected Object authInfo;

    @JsonProperty("endpointDetails")
    protected OAuth2Endpoints endpointDetails;

    @JsonProperty("metadata")
    protected Metadata metadata;

    @JsonProperty("providerName")
    protected String providerName;


}
