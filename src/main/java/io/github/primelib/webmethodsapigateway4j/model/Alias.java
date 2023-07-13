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


public enum TypeEnum {
        SIMPLE("simple"), // Type of the alias
        ENDPOINT("endpoint"), // Type of the alias
        HTTPTRANSPORTSECURITYALIAS("httpTransportSecurityAlias"), // Type of the alias
        SOAPMESSAGESECURITYALIAS("soapMessageSecurityAlias"), // Type of the alias
        SAMLISSUERALIAS("samlIssuerAlias"), // Type of the alias
        AUTHSERVERALIAS("authServerAlias"), // Type of the alias
        WEBMETHODSALIAS("webmethodsAlias"), // Type of the alias
        TRANSFORMATIONALIAS("transformationAlias"), // Type of the alias
        SERVICEREGISTRYALIAS("serviceRegistryAlias"), // Type of the alias
        CLIENTMETADATAMAPPING("clientMetadataMapping"), // Type of the alias
        AWSCONFIGURATIONALIAS("awsConfigurationAlias"), // Type of the alias
        ISCONFIGURATIONALIAS("isConfigurationAlias"); // Type of the alias
    
    private final String text;

    /**
     * @param text
     */
    TypeEnum(final String text) {
        this.text = text;
    }

}
}
