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
 * PasswordRestrictions
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
    "enablePasswordChange",
    "historyLength",
    "maxIdenticalCharsInARow",
    "maxLength",
    "minDigits",
    "minLength",
    "minLowerChars",
    "minSpecialChars",
    "minUpperChars",
    "mode"
})
@JsonTypeName("PasswordRestrictions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PasswordRestrictions {

    /**
     * Specifies whether users are allowed to change their passwords. These users must have developer privileges. Possible values are 'true' and 'false'. Default value is 'true'
     */
    @JsonProperty("enablePasswordChange")
    protected String enablePasswordChange;

    /**
     * Maximum number of previously set passwords that API Gateway saves for a user (excluding the current password). You cannot choose a password that matches any of the stored passwords. Maximum value allowed for this field is 12. Default value is 0.
     */
    @JsonProperty("historyLength")
    protected String historyLength;

    /**
     * Maximum number of identical characters in a row a password can contain. Default value is 3
     */
    @JsonProperty("maxIdenticalCharsInARow")
    protected String maxIdenticalCharsInARow;

    /**
     * Maximum number of characters (alphabetic characters, digits, and special characters combined) the password can contain. Default value is 64. Maximum value allowed for this field is 128
     */
    @JsonProperty("maxLength")
    protected String maxLength;

    /**
     * Minimum number of digits the password must contain. Default value is 0
     */
    @JsonProperty("minDigits")
    protected String minDigits;

    /**
     * Minimum number of characters (alphabetic characters, digits, and special characters combined) the password must contain.Default value is 8
     */
    @JsonProperty("minLength")
    protected String minLength;

    /**
     * Minimum number of lowercase alphabetic characters the password must contain. Default value is 0
     */
    @JsonProperty("minLowerChars")
    protected String minLowerChars;

    /**
     * Minimum number of special characters, such as asterisk (*), period (.), and question mark (?) the password must contain. Default value is 0
     */
    @JsonProperty("minSpecialChars")
    protected String minSpecialChars;

    /**
     * Minimum number of uppercase alphabetic characters the password must contain. Default value is 0
     */
    @JsonProperty("minUpperChars")
    protected String minUpperChars;

    /**
     * Specifies whether Administrator users are allowed to choose passwords that are not impacted by the password restriction settings. Possible values are 'strict' and 'lax'. Default value is 'lax'. For Administrator users, when this property is set to 'strict', API Gateway enforces the password restrictions. When set to 'lax', the password restrictions are not enforced. For non-administrators the restrictions are always enforced.
     */
    @JsonProperty("mode")
    protected String mode;

    /**
     * Constructs a validated instance of {@link PasswordRestrictions}.
     *
     * @param spec the specification to process
     */
    public PasswordRestrictions(Consumer<PasswordRestrictions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PasswordRestrictions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PasswordRestrictions(Consumer)} instead.
     * @param enablePasswordChange Specifies whether users are allowed to change their passwords. These users must have developer privileges. Possible values are 'true' and 'false'. Default value is 'true'
     * @param historyLength Maximum number of previously set passwords that API Gateway saves for a user (excluding the current password). You cannot choose a password that matches any of the stored passwords. Maximum value allowed for this field is 12. Default value is 0.
     * @param maxIdenticalCharsInARow Maximum number of identical characters in a row a password can contain. Default value is 3
     * @param maxLength Maximum number of characters (alphabetic characters, digits, and special characters combined) the password can contain. Default value is 64. Maximum value allowed for this field is 128
     * @param minDigits Minimum number of digits the password must contain. Default value is 0
     * @param minLength Minimum number of characters (alphabetic characters, digits, and special characters combined) the password must contain.Default value is 8
     * @param minLowerChars Minimum number of lowercase alphabetic characters the password must contain. Default value is 0
     * @param minSpecialChars Minimum number of special characters, such as asterisk (*), period (.), and question mark (?) the password must contain. Default value is 0
     * @param minUpperChars Minimum number of uppercase alphabetic characters the password must contain. Default value is 0
     * @param mode Specifies whether Administrator users are allowed to choose passwords that are not impacted by the password restriction settings. Possible values are 'strict' and 'lax'. Default value is 'lax'. For Administrator users, when this property is set to 'strict', API Gateway enforces the password restrictions. When set to 'lax', the password restrictions are not enforced. For non-administrators the restrictions are always enforced.
     */
    @ApiStatus.Internal
    public PasswordRestrictions(String enablePasswordChange, String historyLength, String maxIdenticalCharsInARow, String maxLength, String minDigits, String minLength, String minLowerChars, String minSpecialChars, String minUpperChars, String mode) {
        this.enablePasswordChange = enablePasswordChange;
        this.historyLength = historyLength;
        this.maxIdenticalCharsInARow = maxIdenticalCharsInARow;
        this.maxLength = maxLength;
        this.minDigits = minDigits;
        this.minLength = minLength;
        this.minLowerChars = minLowerChars;
        this.minSpecialChars = minSpecialChars;
        this.minUpperChars = minUpperChars;
        this.mode = mode;
    }

}
