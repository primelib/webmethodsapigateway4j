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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClientMetadataMapping
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected Map<String, String> implNames;

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

    /**
     * Constructs a validated instance of {@link ClientMetadataMapping}.
     *
     * @param spec the specification to process
     */
    public ClientMetadataMapping(Consumer<ClientMetadataMapping> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ClientMetadataMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ClientMetadataMapping(Consumer)} instead.
     * @param extendedValuesV2 List of headers that needs to be sent along with the client management request
     * @param generateCredentials Specifies whether API Gateway should generate clientId and client secret
     * @param implNames Map of specification names to the implementation names of the service provider
     * @param providerName Name of the provider
     * @param supportedApplicationTypes List of application_type values supported by the authorization server provider
     */
    @ApiStatus.Internal
    public ClientMetadataMapping(List<ExtendedValue> extendedValuesV2, Boolean generateCredentials, Map<String, String> implNames, String providerName, List<String> supportedApplicationTypes) {
        this.extendedValuesV2 = extendedValuesV2;
        this.generateCredentials = generateCredentials;
        this.implNames = implNames;
        this.providerName = providerName;
        this.supportedApplicationTypes = supportedApplicationTypes;
    }

}
