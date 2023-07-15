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
 * LogConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apigatewayLogger",
    "elasticSearchLogger",
    "enableLogAggregation",
    "enableSecurityLogger",
    "enableSessionLogger",
    "hostName",
    "indexName",
    "kibanaLogger",
    "logDestination",
    "password",
    "port",
    "protocol",
    "sagOsgiLogger",
    "userName"
})
@JsonTypeName("LogConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogConfiguration {

    /**
     * Constructs a validated implementation of {@link LogConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LogConfiguration(Consumer<LogConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The log setting of APIGateway server.Possible values are off,trace,debug,info,warn,error and fatal
     */
    @JsonProperty("apigatewayLogger")
    protected String apigatewayLogger;

    /**
     * The log setting of Internal Data Store.Possible values are off,info,debug,warn,error and fatal
     */
    @JsonProperty("elasticSearchLogger")
    protected String elasticSearchLogger;

    /**
     * Enabling log aggregation will collect logs from the different components and store in Internal Data Store or external Elasticsearch.The value can be true or false.
     */
    @JsonProperty("enableLogAggregation")
    protected String enableLogAggregation;

    /**
     * The log setting to enable APIGateway security logs.Possible values are true and false.
     */
    @JsonProperty("enableSecurityLogger")
    protected String enableSecurityLogger;

    /**
     * The log setting enable APIGateway session logs.Possible values are off,trace,debug,info,warn,error and fatal
     */
    @JsonProperty("enableSessionLogger")
    protected String enableSessionLogger;

    /**
     * Hostname of external elastic search used to send the logs.
     */
    @JsonProperty("hostName")
    protected String hostName;

    /**
     * Indexname of external elastic search to store the accumulated logs.
     */
    @JsonProperty("indexName")
    protected String indexName;

    /**
     * The log setting of APIGateway dashboard.Possible values are silent,quiet and verbose
     */
    @JsonProperty("kibanaLogger")
    protected String kibanaLogger;

    /**
     * Specifies where to store the accumulated logs from different stores. Value can be EXTERNAL_ES or INTERNAL
     */
    @JsonProperty("logDestination")
    protected String logDestination;

    /**
     * Password that is used to communicate the external elastic search.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Port to communicate the external elastic search.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * Protocol to communicate the external elastic search.
     */
    @JsonProperty("protocol")
    protected String protocol;

    /**
     * The log setting of OSGI platform.Possible values are true and false.
     */
    @JsonProperty("sagOsgiLogger")
    protected String sagOsgiLogger;

    /**
     * Username to communicate the external elastic search.
     */
    @JsonProperty("userName")
    protected String userName;


}
