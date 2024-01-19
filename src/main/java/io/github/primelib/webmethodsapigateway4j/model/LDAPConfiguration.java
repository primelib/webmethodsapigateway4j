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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LDAPConfiguration
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

    /**
     * Constructs a validated instance of {@link LDAPConfiguration}.
     *
     * @param spec the specification to process
     */
    public LDAPConfiguration(Consumer<LDAPConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LDAPConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LDAPConfiguration(Consumer)} instead.
     * @param cacheSize The maximum number of LDAP users Integration Server can keep in memory in the user cache. The default is 10.
     * @param cacheTTL The number of minutes an LDAP user's credentials (userid and password) can remain in the credential cache before being purged. The default is 60 minutes.
     * @param cdsRunning cdsRunning
     * @param ldapDirectoryList List of LDAP directories. This field is applicable when LDAP provider is chosen.
     * @param provider Choose the authentication provider. Possible values are 'local' and 'LDAP' 
     */
    @ApiStatus.Internal
    public LDAPConfiguration(String cacheSize, String cacheTTL, Boolean cdsRunning, List<LDAPDirectory> ldapDirectoryList, String provider) {
        this.cacheSize = cacheSize;
        this.cacheTTL = cacheTTL;
        this.cdsRunning = cdsRunning;
        this.ldapDirectoryList = ldapDirectoryList;
        this.provider = provider;
    }

}
