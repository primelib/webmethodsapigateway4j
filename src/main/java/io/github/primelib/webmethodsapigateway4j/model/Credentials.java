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
 * Credentials
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "domain",
    "password",
    "userName"
})
@JsonTypeName("Credentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Credentials {

    /**
     * Constructs a validated implementation of {@link Credentials}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Credentials(Consumer<Credentials> spec) {
        spec.accept(this);
    }

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


}
