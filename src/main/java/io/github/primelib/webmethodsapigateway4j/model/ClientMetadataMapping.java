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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClientMetadataMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "extendedValuesV2",
    "generateCredentials",
    "implNames",
    "providerName",
    "supportedApplicationTypes"
})
@JsonTypeName("ClientMetadataMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ClientMetadataMapping extends Alias {

    /**
     * Constructs a validated implementation of {@link ClientMetadataMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ClientMetadataMapping(Consumer<ClientMetadataMapping> spec) {
        spec.accept(this);
    }

    /**
     * List of headers that needs to be sent along with the client management request
     */
    @JsonProperty("extendedValuesV2")
    protected List<ExtendedValue> extendedValuesV2;

    /**
     * Specifies whether API Gateway should generate clientId and client secret
     */
    @JsonProperty("generateCredentials")
    protected Boolean generateCredentials;

    /**
     * Map of specification names to the implementation names of the service provider
     */
    @JsonProperty("implNames")
    protected Map<String, String> implNames = new HashMap<>();

    /**
     * Name of the provider
     */
    @JsonProperty("providerName")
    protected String providerName;

    /**
     * List of application_type values supported by the authorization server provider
     */
    @JsonProperty("supportedApplicationTypes")
    protected List<String> supportedApplicationTypes;


}
