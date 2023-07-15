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
 * WssCredentials
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "password",
    "passwordType",
    "userName"
})
@JsonTypeName("WssCredentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WssCredentials {

    /**
     * Constructs a validated implementation of {@link WssCredentials}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WssCredentials(Consumer<WssCredentials> spec) {
        spec.accept(this);
    }

    /**
     * Specify a base64 encoded password for the username
     */
    @JsonProperty("password")
    protected String password;

    /**
     * type of password
     */
    @JsonProperty("passwordType")
    protected PasswordTypeEnum passwordType;

    /**
     * a username used to generate the WSS username token
     */
    @JsonProperty("userName")
    protected String userName;


    /**
     * type of password
     */
    @AllArgsConstructor
    public enum PasswordTypeEnum {
        NONE("NONE"),
        TEXT("TEXT"),
        DIGEST("DIGEST");

        private final String value;
    }

}
