package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String cacheSize;

    /**
     * The number of minutes an LDAP user's credentials (userid and password) can remain in the credential cache before being purged. The default is 60 minutes.
     */
    @JsonProperty("cacheTTL")
    private String cacheTTL;

    @JsonProperty("cdsRunning")
    private Boolean cdsRunning;

    /**
     * List of LDAP directories. This field is applicable when LDAP provider is chosen.
     */
    @JsonProperty("ldapDirectoryList")
    private List<LDAPDirectory> ldapDirectoryList;

    /**
     * Choose the authentication provider. Possible values are 'local' and 'LDAP' 
     */
    @JsonProperty("provider")
    private String provider;


}
