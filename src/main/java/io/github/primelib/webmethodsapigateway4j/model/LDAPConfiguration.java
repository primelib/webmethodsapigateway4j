package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LDAPConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "cacheSize",
    "cacheTTL",
    "cdsRunning",
    "ldapDirectoryList",
    "provider"
})
@JsonTypeName("LDAPConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LDAPConfiguration {

    /**
     * Constructs a validated implementation of {@link LDAPConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LDAPConfiguration(Consumer<LDAPConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The maximum number of LDAP users Integration Server can keep in memory in the user cache. The default is 10.
     */
    @JsonProperty("cacheSize")
    protected String cacheSize;

    /**
     * The number of minutes an LDAP user's credentials (userid and password) can remain in the credential cache before being purged. The default is 60 minutes.
     */
    @JsonProperty("cacheTTL")
    protected String cacheTTL;

    @JsonProperty("cdsRunning")
    protected Boolean cdsRunning;

    /**
     * List of LDAP directories. This field is applicable when LDAP provider is chosen.
     */
    @JsonProperty("ldapDirectoryList")
    protected List<LDAPDirectory> ldapDirectoryList;

    /**
     * Choose the authentication provider. Possible values are 'local' and 'LDAP' 
     */
    @JsonProperty("provider")
    protected String provider;


}
