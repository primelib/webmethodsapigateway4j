// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ApprovalMgmtEmailConfiguration
 * <p>
 * This model contains details about an EmailConfiguration configured in Approvals of API Gateway
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ApprovalMgmtEmailConfiguration")
@JsonPropertyOrder({
    "emailContent",
    "emailSubject",
    "enabled",
    "requestType"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ApprovalMgmtEmailConfiguration {

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
     * Constructs a validated instance of {@link ApprovalMgmtEmailConfiguration}.
     *
     * @param spec the specification to process
     */
    public ApprovalMgmtEmailConfiguration(Consumer<ApprovalMgmtEmailConfiguration> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApprovalMgmtEmailConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApprovalMgmtEmailConfiguration(Consumer)} instead.
     * @param emailContent Email Content
     * @param emailSubject Email Subject
     * @param enabled true/false. Email would be sent to user only when enabled value is true.
     * @param requestType Request Type. Value would be any of initiated, approved or rejected.
     */
    @ApiStatus.Internal
    public ApprovalMgmtEmailConfiguration(String emailContent, String emailSubject, Boolean enabled, String requestType) {
        this.emailContent = emailContent;
        this.emailSubject = emailSubject;
        this.enabled = enabled;
        this.requestType = requestType;
    }
}
