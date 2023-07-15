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
 * EmailDestination
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link EmailDestination}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EmailDestination(Consumer<EmailDestination> spec) {
        spec.accept(this);
    }

    /**
     * The character set that API Gateway uses to be recognized by the system. 
     */
    @JsonProperty("defaultEmailCharset")
    protected String defaultEmailCharset;

    /**
     * The email address from which you want to send the alerts.
     */
    @JsonProperty("fromEmail")
    protected String fromEmail;

    /**
     * The content of the email to be sent for the Log Invocation policy action.
     */
    @JsonProperty("logInvocationContent")
    protected String logInvocationContent;

    /**
     * The subject line of the email to be sent for the Log Invocation policy action.
     */
    @JsonProperty("logInvocationSubject")
    protected String logInvocationSubject;

    /**
     * The content of the email to be sent for the Monitor SLA policy action.
     */
    @JsonProperty("monitorSLAContent")
    protected String monitorSLAContent;

    /**
     * The subject line of the email to be sent for the Monitor SLA policy action.
     */
    @JsonProperty("monitorSLASubject")
    protected String monitorSLASubject;

    /**
     * The content of the email to be sent for the Monitor SP policy action.
     */
    @JsonProperty("monitorSPContent")
    protected String monitorSPContent;

    /**
     * The subject line of the email to be sent for the Monitor SP policy action.
     */
    @JsonProperty("monitorSPSubject")
    protected String monitorSPSubject;

    /**
     * The password that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The port that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * The server name or the IP address of the SMTP server that API Gateway uses to send the messages.
     */
    @JsonProperty("smtpServer")
    protected String smtpServer;

    /**
     * The email address to which you want to send the test email.
     */
    @JsonProperty("testRecipient")
    protected String testRecipient;

    /**
     * The content of the email to be sent for the Throttling Traffic Optimization policy action.
     */
    @JsonProperty("throttlingContent")
    protected String throttlingContent;

    /**
     * The subject line of the email to be sent for the Throttling Traffic Optimization policy action.
     */
    @JsonProperty("throttlingSubject")
    protected String throttlingSubject;

    /**
     * The SSL encryption type that API Gateway uses when communicating with an email server. 
     */
    @JsonProperty("transportLayerSecurity")
    protected String transportLayerSecurity;

    /**
     * The truststore that API Gateway uses while sending the request to a native API.
     */
    @JsonProperty("trustStoreAlias")
    protected String trustStoreAlias;

    /**
     * The username that API Gateway uses to connect to the specified SMTP server.
     */
    @JsonProperty("username")
    protected String username;


}
