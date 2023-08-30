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
 * InputLdapConfiguration
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
    "ldapConfig"
})
@JsonTypeName("InputLdapConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputLdapConfiguration {

    @JsonProperty("ldapConfig")
    protected LDAPConfiguration ldapConfig;

    /**
     * Constructs a validated instance of {@link InputLdapConfiguration}.
     *
     * @param spec the specification to process
     */
    public InputLdapConfiguration(Consumer<InputLdapConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputLdapConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputLdapConfiguration(Consumer)} instead.
     * @param ldapConfig ldapConfig
     */
    @ApiStatus.Internal
    public InputLdapConfiguration(LDAPConfiguration ldapConfig) {
        this.ldapConfig = ldapConfig;
    }

}
