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
 * AuthServerScope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "authServerAlias",
    "scopeName"
})
@JsonTypeName("AuthServerScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuthServerScope {

    /**
     * Constructs a validated implementation of {@link AuthServerScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuthServerScope(Consumer<AuthServerScope> spec) {
        spec.accept(this);
    }

    /**
     * Name of the authorization server
     */
    @JsonProperty("authServerAlias")
    protected String authServerAlias;

    /**
     * OAuth scope name from authorization server definition
     */
    @JsonProperty("scopeName")
    protected String scopeName;


}
