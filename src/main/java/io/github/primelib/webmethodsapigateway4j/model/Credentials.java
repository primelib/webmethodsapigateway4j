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
 * Credentials
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
    "domain",
    "password",
    "userName"
})
@JsonTypeName("Credentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Credentials {

    /**
     * Specify a domain to access the native API
     */
    @JsonProperty("domain")
    protected String domain;

    /**
     * Specify a base64 encoded password to access the native API
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Specify a username to access the native API
     */
    @JsonProperty("userName")
    protected String userName;

    /**
     * Constructs a validated instance of {@link Credentials}.
     *
     * @param spec the specification to process
     */
    public Credentials(Consumer<Credentials> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Credentials}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Credentials(Consumer)} instead.
     * @param domain Specify a domain to access the native API
     * @param password Specify a base64 encoded password to access the native API
     * @param userName Specify a username to access the native API
     */
    @ApiStatus.Internal
    public Credentials(String domain, String password, String userName) {
        this.domain = domain;
        this.password = password;
        this.userName = userName;
    }

}
