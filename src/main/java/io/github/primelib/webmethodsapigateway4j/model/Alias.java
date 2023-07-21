package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alias
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
     * Constructs a validated instance of {@link Alias}.
     *
     * @param spec the specification to process
     */
    public Alias(Consumer<Alias> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Alias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Alias(Consumer)} instead.
     * @param description A description about the alias
     * @param id A unique ID for the alias
     * @param name A unique name for the assertion
     * @param owner Owner of the alias
     * @param stage Stage for which this alias needs to be used
     * @param type Type of the alias
     */
    @ApiStatus.Internal
    public Alias(String description, String id, String name, String owner, String stage, TypeEnum type) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.stage = stage;
        this.type = type;
    }

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
