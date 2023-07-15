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
 * WebserviceEndpointAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "WebserviceEndpointAliasId",
    "alias",
    "aliasType",
    "description",
    "keyAlias",
    "keyStoreAlias",
    "timestampMaximumSkew",
    "timestampPrecisionInMillis",
    "timestampTimeToLive",
    "transportType",
    "trustStoreAlias"
})
@JsonTypeName("WebserviceEndpointAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebserviceEndpointAlias {

    /**
     * Constructs a validated implementation of {@link WebserviceEndpointAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebserviceEndpointAlias(Consumer<WebserviceEndpointAlias> spec) {
        spec.accept(this);
    }

    /**
     * A unique ID for the WebserviceEndpointAlias
     */
    @JsonProperty("WebserviceEndpointAliasId")
    protected String webserviceEndpointAliasId;

    /**
     * The name of the WebserviceEndpointAlias
     */
    @JsonProperty("alias")
    protected String alias;

    /**
     * The property specifies the aliasType, Either it should be Provider or Consumer
     */
    @JsonProperty("aliasType")
    protected String aliasType;

    /**
     * The description of the WebserviceEndpointAlias
     */
    @JsonProperty("description")
    protected String description;

    /**
     * this property specifies the keyalias name
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * this property specifies the keystorealias name
     */
    @JsonProperty("keyStoreAlias")
    protected String keyStoreAlias;

    /**
     * this property specifies the timestampMaximumSkew value
     */
    @JsonProperty("timestampMaximumSkew")
    protected String timestampMaximumSkew;

    /**
     * this property specifies the timestampPrecisionInMillis
     */
    @JsonProperty("timestampPrecisionInMillis")
    protected String timestampPrecisionInMillis;

    /**
     * this property specifies the timestampTimeToLive value
     */
    @JsonProperty("timestampTimeToLive")
    protected String timestampTimeToLive;

    /**
     * this defines the transport type. The supported transport type is JMS
     */
    @JsonProperty("transportType")
    protected String transportType;

    /**
     * this property specifies the trustStoreAlias name
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;


}
