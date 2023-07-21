package io.github.primelib.webmethodsapigateway4j.model;

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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebserviceEndpointAlias
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

    /**
     * Constructs a validated instance of {@link WebserviceEndpointAlias}.
     *
     * @param spec the specification to process
     */
    public WebserviceEndpointAlias(Consumer<WebserviceEndpointAlias> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebserviceEndpointAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebserviceEndpointAlias(Consumer)} instead.
     * @param webserviceEndpointAliasId A unique ID for the WebserviceEndpointAlias
     * @param alias The name of the WebserviceEndpointAlias
     * @param aliasType The property specifies the aliasType, Either it should be Provider or Consumer
     * @param description The description of the WebserviceEndpointAlias
     * @param keyAlias this property specifies the keyalias name
     * @param keyStoreAlias this property specifies the keystorealias name
     * @param timestampMaximumSkew this property specifies the timestampMaximumSkew value
     * @param timestampPrecisionInMillis this property specifies the timestampPrecisionInMillis
     * @param timestampTimeToLive this property specifies the timestampTimeToLive value
     * @param transportType this defines the transport type. The supported transport type is JMS
     * @param trustStoreAlias this property specifies the trustStoreAlias name
     */
    @ApiStatus.Internal
    public WebserviceEndpointAlias(String webserviceEndpointAliasId, String alias, String aliasType, String description, String keyAlias, String keyStoreAlias, String timestampMaximumSkew, String timestampPrecisionInMillis, String timestampTimeToLive, String transportType, String trustStoreAlias) {
        this.webserviceEndpointAliasId = webserviceEndpointAliasId;
        this.alias = alias;
        this.aliasType = aliasType;
        this.description = description;
        this.keyAlias = keyAlias;
        this.keyStoreAlias = keyStoreAlias;
        this.timestampMaximumSkew = timestampMaximumSkew;
        this.timestampPrecisionInMillis = timestampPrecisionInMillis;
        this.timestampTimeToLive = timestampTimeToLive;
        this.transportType = transportType;
        this.trustStoreAlias = trustStoreAlias;
    }

}
