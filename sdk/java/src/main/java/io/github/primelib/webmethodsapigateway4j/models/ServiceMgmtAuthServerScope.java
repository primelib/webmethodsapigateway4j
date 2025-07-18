// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtAuthServerScope
 * <p>
 * Represents the oauth scope from an authorization server
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtAuthServerScope")
@JsonPropertyOrder({
    "authServerAlias",
    "scopeName"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtAuthServerScope {

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
     * Constructs a validated instance of {@link ServiceMgmtAuthServerScope}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtAuthServerScope(Consumer<ServiceMgmtAuthServerScope> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtAuthServerScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtAuthServerScope(Consumer)} instead.
     * @param authServerAlias Name of the authorization server
     * @param scopeName OAuth scope name from authorization server definition
     */
    @ApiStatus.Internal
    public ServiceMgmtAuthServerScope(String authServerAlias, String scopeName) {
        this.authServerAlias = authServerAlias;
        this.scopeName = scopeName;
    }
}
