package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebserviceEndpointAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * A unique ID for the WebserviceEndpointAlias
     */
    @JsonProperty("WebserviceEndpointAliasId")
    private String webserviceEndpointAliasId;

    /**
     * The name of the WebserviceEndpointAlias
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * The property specifies the aliasType, Either it should be Provider or Consumer
     */
    @JsonProperty("aliasType")
    private String aliasType;

    /**
     * The description of the WebserviceEndpointAlias
     */
    @JsonProperty("description")
    private String description;

    /**
     * this property specifies the keyalias name
     */
    @JsonProperty("keyAlias")
    private String keyAlias;

    /**
     * this property specifies the keystorealias name
     */
    @JsonProperty("keyStoreAlias")
    private String keyStoreAlias;

    /**
     * this property specifies the timestampMaximumSkew value
     */
    @JsonProperty("timestampMaximumSkew")
    private String timestampMaximumSkew;

    /**
     * this property specifies the timestampPrecisionInMillis
     */
    @JsonProperty("timestampPrecisionInMillis")
    private String timestampPrecisionInMillis;

    /**
     * this property specifies the timestampTimeToLive value
     */
    @JsonProperty("timestampTimeToLive")
    private String timestampTimeToLive;

    /**
     * this defines the transport type. The supported transport type is JMS
     */
    @JsonProperty("transportType")
    private String transportType;

    /**
     * this property specifies the trustStoreAlias name
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;


}
