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
 * EmailConfiguration
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
    "emailContent",
    "emailSubject",
    "enabled",
    "requestType"
})
@JsonTypeName("EmailConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailConfiguration {

    /**
     * Email Content
     */
    @JsonProperty("emailContent")
    protected String emailContent;

    /**
     * Email Subject
     */
    @JsonProperty("emailSubject")
    protected String emailSubject;

    /**
     * true/false. Email would be sent to user only when enabled value is true.
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * Request Type. Value would be any of initiated, approved or rejected.
     */
    @JsonProperty("requestType")
    protected String requestType;

    /**
     * Constructs a validated instance of {@link EmailConfiguration}.
     *
     * @param spec the specification to process
     */
    public EmailConfiguration(Consumer<EmailConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmailConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmailConfiguration(Consumer)} instead.
     * @param emailContent Email Content
     * @param emailSubject Email Subject
     * @param enabled true/false. Email would be sent to user only when enabled value is true.
     * @param requestType Request Type. Value would be any of initiated, approved or rejected.
     */
    @ApiStatus.Internal
    public EmailConfiguration(String emailContent, String emailSubject, Boolean enabled, String requestType) {
        this.emailContent = emailContent;
        this.emailSubject = emailSubject;
        this.enabled = enabled;
        this.requestType = requestType;
    }

}
