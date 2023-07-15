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
 * KerberosSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "kerberosConfigContents",
    "kerberosConfigFileName",
    "kerberosKDC",
    "kerberosRealm",
    "useSubjectCreds"
})
@JsonTypeName("KerberosSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class KerberosSettings {

    /**
     * Constructs a validated implementation of {@link KerberosSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public KerberosSettings(Consumer<KerberosSettings> spec) {
        spec.accept(this);
    }

    /**
     * The contents of the Kerberos configuration file conforming to the specification. If you do not want the default KDC and realm values from this configuration file to be overridden, then do not set values for the kerberosRealm and kerberosKDC properties. It contains the Kerberos configuration information, including the Kerberos realm, locations of KDCs, defaults for the current realm and for Kerberos applications, and the host names, Kerberos realms mappings and encryption algorithms. The full specification details of the Kerberos configuration file can be found in https://linux.die.net/man/5/krb5.conf.
     */
    @JsonProperty("kerberosConfigContents")
    protected String kerberosConfigContents;

    /**
     * The name of the Kerberos configuration file to be stored and maintained in API Gateway.
     */
    @JsonProperty("kerberosConfigFileName")
    protected String kerberosConfigFileName;

    /**
     * The host name of the machine on which the Key Distribution Center (KDC) resides. If kerberosKDC is set, it overrrides the default KDC specified in the provided configuration file.
     */
    @JsonProperty("kerberosKDC")
    protected String kerberosKDC;

    /**
     * The domain name of the Kerberos server. If kerberosRealm is set, it overrides the realm specified in the provided configuration file.
     */
    @JsonProperty("kerberosRealm")
    protected String kerberosRealm;

    /**
     * Indicates whether the Kerberos v5 Generic Security Services (GSS) mechanism should be used to obtain credentials from an existing subject.
     */
    @JsonProperty("useSubjectCreds")
    protected String useSubjectCreds;


}
