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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WssCredentials
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
     * Constructs a validated instance of {@link WssCredentials}.
     *
     * @param spec the specification to process
     */
    public WssCredentials(Consumer<WssCredentials> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WssCredentials}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WssCredentials(Consumer)} instead.
     * @param password Specify a base64 encoded password for the username
     * @param passwordType type of password
     * @param userName a username used to generate the WSS username token
     */
    @ApiStatus.Internal
    public WssCredentials(String password, PasswordTypeEnum passwordType, String userName) {
        this.password = password;
        this.passwordType = passwordType;
        this.userName = userName;
    }

    /**
     * type of password
     */
    @AllArgsConstructor
    public enum PasswordTypeEnum {
        NONE("NONE"),
        TEXT("TEXT"),
        DIGEST("DIGEST");

        private static final PasswordTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PasswordTypeEnum of(String input) {
            if (input != null) {
                for (PasswordTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
