package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PasswordRestrictions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String enablePasswordChange;

    /**
     * Maximum number of previously set passwords that API Gateway saves for a user (excluding the current password). You cannot choose a password that matches any of the stored passwords. Maximum value allowed for this field is 12. Default value is 0.
     */
    @JsonProperty("historyLength")
    private String historyLength;

    /**
     * Maximum number of identical characters in a row a password can contain. Default value is 3
     */
    @JsonProperty("maxIdenticalCharsInARow")
    private String maxIdenticalCharsInARow;

    /**
     * Maximum number of characters (alphabetic characters, digits, and special characters combined) the password can contain. Default value is 64. Maximum value allowed for this field is 128
     */
    @JsonProperty("maxLength")
    private String maxLength;

    /**
     * Minimum number of digits the password must contain. Default value is 0
     */
    @JsonProperty("minDigits")
    private String minDigits;

    /**
     * Minimum number of characters (alphabetic characters, digits, and special characters combined) the password must contain.Default value is 8
     */
    @JsonProperty("minLength")
    private String minLength;

    /**
     * Minimum number of lowercase alphabetic characters the password must contain. Default value is 0
     */
    @JsonProperty("minLowerChars")
    private String minLowerChars;

    /**
     * Minimum number of special characters, such as asterisk (*), period (.), and question mark (?) the password must contain. Default value is 0
     */
    @JsonProperty("minSpecialChars")
    private String minSpecialChars;

    /**
     * Minimum number of uppercase alphabetic characters the password must contain. Default value is 0
     */
    @JsonProperty("minUpperChars")
    private String minUpperChars;

    /**
     * Specifies whether Administrator users are allowed to choose passwords that are not impacted by the password restriction settings. Possible values are 'strict' and 'lax'. Default value is 'lax'. For Administrator users, when this property is set to 'strict', API Gateway enforces the password restrictions. When set to 'lax', the password restrictions are not enforced. For non-administrators the restrictions are always enforced.
     */
    @JsonProperty("mode")
    private String mode;


}
