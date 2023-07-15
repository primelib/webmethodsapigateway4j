package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * PasswordExpirySettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "applicableUsers",
    "emailIds",
    "expirationInterval",
    "expiryEmailBefore",
    "isEnabled"
})
@JsonTypeName("PasswordExpirySettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PasswordExpirySettings {

    /**
     * Constructs a validated implementation of {@link PasswordExpirySettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PasswordExpirySettings(Consumer<PasswordExpirySettings> spec) {
        spec.accept(this);
    }

    /**
     * List of users to whom the expiration interval setting is applicable. The users are separated by semicolon(;). For example, if you want to add user1 and user2 to the list, specify as 'user1;user2'
     */
    @JsonProperty("applicableUsers")
    protected String applicableUsers;

    /**
     * List of email addresses to which API Gateway sends an email notification informing that the user password is about to expire or has already expired. The email addresses are separated by a new line character (\\n). For example, 'u1@abc.com\\nu2@abc.com'
     */
    @JsonProperty("emailIds")
    protected String emailIds;

    /**
     * Number of days after which a password will expire, if not changed. The value should be a non-zero integer. Default value is 90.
     */
    @JsonProperty("expirationInterval")
    protected String expirationInterval;

    /**
     * Specifies the number of days prior to password expiry that API Gateway should start sending the reminder emails for password reset. The emails are sent daily until the user either updates the password or changes the expiration interval. Set the value to 0 to prevent API Gateway from sending the reminder emails for soon to expire passwords. Default value is 3.
     */
    @JsonProperty("expiryEmailBefore")
    protected String expiryEmailBefore;

    /**
     * Specifies whether to enable the password expiry settings. Possible values are 'true' (enabled) and 'false' (disabled). Default value is 'false'
     */
    @JsonProperty("isEnabled")
    protected String isEnabled;


}
