package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
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
 * Alias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "owner",
    "stage",
    "type"
})
@JsonTypeName("Alias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Alias {

    /**
     * Constructs a validated implementation of {@link Alias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Alias(Consumer<Alias> spec) {
        spec.accept(this);
    }

    /**
     * A description about the alias
     */
    @JsonProperty("description")
    protected String description;

    /**
     * A unique ID for the alias
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A unique name for the assertion
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Owner of the alias
     */
    @JsonProperty("owner")
    protected String owner;

    /**
     * Stage for which this alias needs to be used
     */
    @JsonProperty("stage")
    protected String stage;

    /**
     * Type of the alias
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * Type of the alias
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SIMPLE("simple"),
        ENDPOINT("endpoint"),
        HTTPTRANSPORTSECURITYALIAS("httpTransportSecurityAlias"),
        SOAPMESSAGESECURITYALIAS("soapMessageSecurityAlias"),
        SAMLISSUERALIAS("samlIssuerAlias"),
        AUTHSERVERALIAS("authServerAlias"),
        WEBMETHODSALIAS("webmethodsAlias"),
        TRANSFORMATIONALIAS("transformationAlias"),
        SERVICEREGISTRYALIAS("serviceRegistryAlias"),
        CLIENTMETADATAMAPPING("clientMetadataMapping"),
        AWSCONFIGURATIONALIAS("awsConfigurationAlias"),
        ISCONFIGURATIONALIAS("isConfigurationAlias");

        private final String value;
    }

}
