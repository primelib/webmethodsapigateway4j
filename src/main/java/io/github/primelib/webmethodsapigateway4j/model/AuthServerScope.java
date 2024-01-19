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
 * AuthServerScope
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
    "authServerAlias",
    "scopeName"
})
@JsonTypeName("AuthServerScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuthServerScope {

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

    /**
     * Constructs a validated instance of {@link AuthServerScope}.
     *
     * @param spec the specification to process
     */
    public AuthServerScope(Consumer<AuthServerScope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuthServerScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuthServerScope(Consumer)} instead.
     * @param authServerAlias Name of the authorization server
     * @param scopeName OAuth scope name from authorization server definition
     */
    @ApiStatus.Internal
    public AuthServerScope(String authServerAlias, String scopeName) {
        this.authServerAlias = authServerAlias;
        this.scopeName = scopeName;
    }

}
