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
 * EmailConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link EmailConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EmailConfiguration(Consumer<EmailConfiguration> spec) {
        spec.accept(this);
    }

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


}
