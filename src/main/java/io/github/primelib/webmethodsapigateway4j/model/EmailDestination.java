package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDestination
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "defaultEmailCharset",
    "fromEmail",
    "logInvocationContent",
    "logInvocationSubject",
    "monitorSLAContent",
    "monitorSLASubject",
    "monitorSPContent",
    "monitorSPSubject",
    "password",
    "port",
    "smtpServer",
    "testRecipient",
    "throttlingContent",
    "throttlingSubject",
    "transportLayerSecurity",
    "trustStoreAlias",
    "username"
})
@JsonTypeName("EmailDestination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailDestination {

    /**
     * The character set that API Gateway uses to be recognized by the system. 
     */
    @JsonProperty("defaultEmailCharset")
    private String defaultEmailCharset;

    /**
     * The email address from which you want to send the alerts.
     */
    @JsonProperty("fromEmail")
    private String fromEmail;

    /**
     * The content of the email to be sent for the Log Invocation policy action.
     */
    @JsonProperty("logInvocationContent")
    private String logInvocationContent;

    /**
     * The subject line of the email to be sent for the Log Invocation policy action.
     */
    @JsonProperty("logInvocationSubject")
    private String logInvocationSubject;

    /**
     * The content of the email to be sent for the Monitor SLA policy action.
     */
    @JsonProperty("monitorSLAContent")
    private String monitorSLAContent;

    /**
     * The subject line of the email to be sent for the Monitor SLA policy action.
     */
    @JsonProperty("monitorSLASubject")
    private String monitorSLASubject;

    /**
     * The content of the email to be sent for the Monitor SP policy action.
     */
    @JsonProperty("monitorSPContent")
    private String monitorSPContent;

    /**
     * The subject line of the email to be sent for the Monitor SP policy action.
     */
    @JsonProperty("monitorSPSubject")
    private String monitorSPSubject;

    /**
     * The password that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("password")
    private String password;

    /**
     * The port that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("port")
    private String port;

    /**
     * The server name or the IP address of the SMTP server that API Gateway uses to send the messages.
     */
    @JsonProperty("smtpServer")
    private String smtpServer;

    /**
     * The email address to which you want to send the test email.
     */
    @JsonProperty("testRecipient")
    private String testRecipient;

    /**
     * The content of the email to be sent for the Throttling Traffic Optimization policy action.
     */
    @JsonProperty("throttlingContent")
    private String throttlingContent;

    /**
     * The subject line of the email to be sent for the Throttling Traffic Optimization policy action.
     */
    @JsonProperty("throttlingSubject")
    private String throttlingSubject;

    /**
     * The SSL encryption type that API Gateway uses when communicating with an email server. 
     */
    @JsonProperty("transportLayerSecurity")
    private String transportLayerSecurity;

    /**
     * The truststore that API Gateway uses while sending the request to a native API.
     */
    @JsonProperty("trustStoreAlias")
    private String trustStoreAlias;

    /**
     * The username that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("username")
    private String username;


}
