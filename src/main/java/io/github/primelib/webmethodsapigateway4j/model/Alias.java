package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * A description about the alias
     */
    @JsonProperty("description")
    private String description;

    /**
     * A unique ID for the alias
     */
    @JsonProperty("id")
    private String id;

    /**
     * A unique name for the assertion
     */
    @JsonProperty("name")
    private String name;

    /**
     * Owner of the alias
     */
    @JsonProperty("owner")
    private String owner;

    /**
     * Stage for which this alias needs to be used
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * Type of the alias
     */
    @JsonProperty("type")
    private TypeEnum type;


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
