package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OutboundProxySettings
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "entityId",
    "ftpType",
    "host",
    "isDefault",
    "password",
    "passwordHandle",
    "port",
    "protocol",
    "proxyAlias",
    "socksVersion",
    "status",
    "username"
})
@JsonTypeName("OutboundProxySettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OutboundProxySettings {

    /**
     * The proxy server alias used to identify the entity in API Gateway.
     */
    @JsonProperty("entityId")
    private String entityId;

    /**
     * The type of the FTP proxy server. Applicable only if protocol value is FTP. Indicated by a number in the range 0 to 7. 0 - No proxy, 1 - ftp_user@ftp_host no proxy auth, 2 - ftp_user@ftp_host proxy auth, 3 - site command, 4 - open command, 5 - ftp_user@proxy_user@ftp_host, 6 - proxy_user@ftp_host, 7 - ftp_user@ftp_host proxy_user
     */
    @JsonProperty("ftpType")
    private FtpTypeEnum ftpType;

    /**
     * The host name or IP address of the proxy server.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Indicates whether this proxy server alias is the default for the corresponding protocol. There can be only one default proxy server alias for a given protocol. Y denotes Yes and N denotes No.
     */
    @JsonProperty("isDefault")
    private IsDefaultEnum isDefault;

    /**
     * The password required to authenticate if authentication is enabled for the proxy server.
     */
    @JsonProperty("password")
    private String password;

    /**
     * The password handle which is used to store the password (if specified) in a secure manner in API Gateway.
     */
    @JsonProperty("passwordHandle")
    private String passwordHandle;

    /**
     * The port number of the proxy server.
     */
    @JsonProperty("port")
    private String port;

    /**
     * The protocol for which the proxy server is created.
     */
    @JsonProperty("protocol")
    private ProtocolEnum protocol;

    /**
     * The outbound proxy server alias name. It must be unique across all outbound proxy server aliases defined in API Gateway. Once a proxy server alias is defined with a given name, it cannot be modified further.
     */
    @JsonProperty("proxyAlias")
    private String proxyAlias;

    /**
     * The SOCKS version of the proxy server. Applicable only if protocol value is SOCKS. A value of 4 indicates SOCKS protocol version 4 and a value of 5 indicates SOCKS protocol version 5. SOCKS protocol version 4 does not support authentication and hence username/password cannot be specified if socksVersion = 4.
     */
    @JsonProperty("socksVersion")
    private SocksVersionEnum socksVersion;

    /**
     * Indicates whether the particular proxy server alias is enabled or disabled.
     */
    @JsonProperty("status")
    private StatusEnum status;

    /**
     * The user name required to authenticate against if authentication is enabled for the proxy server.
     */
    @JsonProperty("username")
    private String username;


    /**
     * The type of the FTP proxy server. Applicable only if protocol value is FTP. Indicated by a number in the range 0 to 7. 0 - No proxy, 1 - ftp_user@ftp_host no proxy auth, 2 - ftp_user@ftp_host proxy auth, 3 - site command, 4 - open command, 5 - ftp_user@proxy_user@ftp_host, 6 - proxy_user@ftp_host, 7 - ftp_user@ftp_host proxy_user
     */
    @AllArgsConstructor
    public enum FtpTypeEnum {
        _0("0"),
        _1("1"),
        _2("2"),
        _3("3"),
        _4("4"),
        _5("5"),
        _6("6"),
        _7("7");

        private final String value;
    }

    /**
     * Indicates whether this proxy server alias is the default for the corresponding protocol. There can be only one default proxy server alias for a given protocol. Y denotes Yes and N denotes No.
     */
    @AllArgsConstructor
    public enum IsDefaultEnum {
        Y("Y"),
        N("N");

        private final String value;
    }

    /**
     * The protocol for which the proxy server is created.
     */
    @AllArgsConstructor
    public enum ProtocolEnum {
        HTTP("HTTP"),
        HTTPS("HTTPS"),
        SOCKS("SOCKS"),
        FTP("FTP");

        private final String value;
    }

    /**
     * The SOCKS version of the proxy server. Applicable only if protocol value is SOCKS. A value of 4 indicates SOCKS protocol version 4 and a value of 5 indicates SOCKS protocol version 5. SOCKS protocol version 4 does not support authentication and hence username/password cannot be specified if socksVersion = 4.
     */
    @AllArgsConstructor
    public enum SocksVersionEnum {
        _4("4"),
        _5("5");

        private final String value;
    }

    /**
     * Indicates whether the particular proxy server alias is enabled or disabled.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ENABLED("Enabled"),
        DISABLED("Disabled");

        private final String value;
    }

}
