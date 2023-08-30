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
 * EmailDestination
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

    /**
     * Constructs a validated instance of {@link EmailDestination}.
     *
     * @param spec the specification to process
     */
    public EmailDestination(Consumer<EmailDestination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmailDestination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmailDestination(Consumer)} instead.
     * @param defaultEmailCharset The character set that API Gateway uses to be recognized by the system. 
     * @param fromEmail The email address from which you want to send the alerts.
     * @param logInvocationContent The content of the email to be sent for the Log Invocation policy action.
     * @param logInvocationSubject The subject line of the email to be sent for the Log Invocation policy action.
     * @param monitorSLAContent The content of the email to be sent for the Monitor SLA policy action.
     * @param monitorSLASubject The subject line of the email to be sent for the Monitor SLA policy action.
     * @param monitorSPContent The content of the email to be sent for the Monitor SP policy action.
     * @param monitorSPSubject The subject line of the email to be sent for the Monitor SP policy action.
     * @param password The password that API Gateway uses to connect to the specified SMTP server.
     * @param port The port that API Gateway uses to connect to the specified SMTP server.
     * @param smtpServer The server name or the IP address of the SMTP server that API Gateway uses to send the messages.
     * @param testRecipient The email address to which you want to send the test email.
     * @param throttlingContent The content of the email to be sent for the Throttling Traffic Optimization policy action.
     * @param throttlingSubject The subject line of the email to be sent for the Throttling Traffic Optimization policy action.
     * @param transportLayerSecurity The SSL encryption type that API Gateway uses when communicating with an email server. 
     * @param trustStoreAlias The truststore that API Gateway uses while sending the request to a native API.
     * @param username The username that API Gateway uses to connect to the specified SMTP server.
     */
    @ApiStatus.Internal
    public EmailDestination(String defaultEmailCharset, String fromEmail, String logInvocationContent, String logInvocationSubject, String monitorSLAContent, String monitorSLASubject, String monitorSPContent, String monitorSPSubject, String password, String port, String smtpServer, String testRecipient, String throttlingContent, String throttlingSubject, String transportLayerSecurity, String trustStoreAlias, String username) {
        this.defaultEmailCharset = defaultEmailCharset;
        this.fromEmail = fromEmail;
        this.logInvocationContent = logInvocationContent;
        this.logInvocationSubject = logInvocationSubject;
        this.monitorSLAContent = monitorSLAContent;
        this.monitorSLASubject = monitorSLASubject;
        this.monitorSPContent = monitorSPContent;
        this.monitorSPSubject = monitorSPSubject;
        this.password = password;
        this.port = port;
        this.smtpServer = smtpServer;
        this.testRecipient = testRecipient;
        this.throttlingContent = throttlingContent;
        this.throttlingSubject = throttlingSubject;
        this.transportLayerSecurity = transportLayerSecurity;
        this.trustStoreAlias = trustStoreAlias;
        this.username = username;
    }

}
