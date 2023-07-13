package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WssCredentials
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "password",
    "passwordType",
    "userName"
})
@JsonTypeName("WssCredentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WssCredentials {

    /**
     * Specify a base64 encoded password for the username
     */
    @JsonProperty("password")
    private String password;

    /**
     * type of password
     */
    @JsonProperty("passwordType")
    private PasswordTypeEnum passwordType;

    /**
     * a username used to generate the WSS username token
     */
    @JsonProperty("userName")
    private String userName;


public enum PasswordTypeEnum {
        NONE("NONE"), // type of password
        TEXT("TEXT"), // type of password
        DIGEST("DIGEST"); // type of password
    
    private final String text;

    /**
     * @param text
     */
    PasswordTypeEnum(final String text) {
        this.text = text;
    }

}
}
