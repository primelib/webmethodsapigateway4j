package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogConfiguration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * The log setting of APIGateway server.Possible values are off,trace,debug,info,warn,error and fatal
     */
    @JsonProperty("apigatewayLogger")
    private String apigatewayLogger;

    /**
     * The log setting of Internal Data Store.Possible values are off,info,debug,warn,error and fatal
     */
    @JsonProperty("elasticSearchLogger")
    private String elasticSearchLogger;

    /**
     * Enabling log aggregation will collect logs from the different components and store in Internal Data Store or external Elasticsearch.The value can be true or false.
     */
    @JsonProperty("enableLogAggregation")
    private String enableLogAggregation;

    /**
     * The log setting to enable APIGateway security logs.Possible values are true and false.
     */
    @JsonProperty("enableSecurityLogger")
    private String enableSecurityLogger;

    /**
     * The log setting enable APIGateway session logs.Possible values are off,trace,debug,info,warn,error and fatal
     */
    @JsonProperty("enableSessionLogger")
    private String enableSessionLogger;

    /**
     * Hostname of external elastic search used to send the logs.
     */
    @JsonProperty("hostName")
    private String hostName;

    /**
     * Indexname of external elastic search to store the accumulated logs.
     */
    @JsonProperty("indexName")
    private String indexName;

    /**
     * The log setting of APIGateway dashboard.Possible values are silent,quiet and verbose
     */
    @JsonProperty("kibanaLogger")
    private String kibanaLogger;

    /**
     * Specifies where to store the accumulated logs from different stores. Value can be EXTERNAL_ES or INTERNAL
     */
    @JsonProperty("logDestination")
    private String logDestination;

    /**
     * Password that is used to communicate the external elastic search.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Port to communicate the external elastic search.
     */
    @JsonProperty("port")
    private String port;

    /**
     * Protocol to communicate the external elastic search.
     */
    @JsonProperty("protocol")
    private String protocol;

    /**
     * The log setting of OSGI platform.Possible values are true and false.
     */
    @JsonProperty("sagOsgiLogger")
    private String sagOsgiLogger;

    /**
     * Username to communicate the external elastic search.
     */
    @JsonProperty("userName")
    private String userName;


}
