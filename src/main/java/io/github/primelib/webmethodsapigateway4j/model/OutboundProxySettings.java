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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OutboundProxySettings
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
    protected String entityId;

    /**
     * The type of the FTP proxy server. Applicable only if protocol value is FTP. Indicated by a number in the range 0 to 7. 0 - No proxy, 1 - ftp_user@ftp_host no proxy auth, 2 - ftp_user@ftp_host proxy auth, 3 - site command, 4 - open command, 5 - ftp_user@proxy_user@ftp_host, 6 - proxy_user@ftp_host, 7 - ftp_user@ftp_host proxy_user
     */
    @JsonProperty("ftpType")
    protected FtpTypeEnum ftpType;

    /**
     * The host name or IP address of the proxy server.
     */
    @JsonProperty("host")
    protected String host;

    /**
     * Indicates whether this proxy server alias is the default for the corresponding protocol. There can be only one default proxy server alias for a given protocol. Y denotes Yes and N denotes No.
     */
    @JsonProperty("isDefault")
    protected IsDefaultEnum isDefault;

    /**
     * The password required to authenticate if authentication is enabled for the proxy server.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The password handle which is used to store the password (if specified) in a secure manner in API Gateway.
     */
    @JsonProperty("passwordHandle")
    protected String passwordHandle;

    /**
     * The port number of the proxy server.
     */
    @JsonProperty("port")
    protected String port;

    /**
     * The protocol for which the proxy server is created.
     */
    @JsonProperty("protocol")
    protected ProtocolEnum protocol;

    /**
     * The outbound proxy server alias name. It must be unique across all outbound proxy server aliases defined in API Gateway. Once a proxy server alias is defined with a given name, it cannot be modified further.
     */
    @JsonProperty("proxyAlias")
    protected String proxyAlias;

    /**
     * The SOCKS version of the proxy server. Applicable only if protocol value is SOCKS. A value of 4 indicates SOCKS protocol version 4 and a value of 5 indicates SOCKS protocol version 5. SOCKS protocol version 4 does not support authentication and hence username/password cannot be specified if socksVersion = 4.
     */
    @JsonProperty("socksVersion")
    protected SocksVersionEnum socksVersion;

    /**
     * Indicates whether the particular proxy server alias is enabled or disabled.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The user name required to authenticate against if authentication is enabled for the proxy server.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link OutboundProxySettings}.
     *
     * @param spec the specification to process
     */
    public OutboundProxySettings(Consumer<OutboundProxySettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OutboundProxySettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OutboundProxySettings(Consumer)} instead.
     * @param entityId The proxy server alias used to identify the entity in API Gateway.
     * @param ftpType The type of the FTP proxy server. Applicable only if protocol value is FTP. Indicated by a number in the range 0 to 7. 0 - No proxy, 1 - ftp_user@ftp_host no proxy auth, 2 - ftp_user@ftp_host proxy auth, 3 - site command, 4 - open command, 5 - ftp_user@proxy_user@ftp_host, 6 - proxy_user@ftp_host, 7 - ftp_user@ftp_host proxy_user
     * @param host The host name or IP address of the proxy server.
     * @param isDefault Indicates whether this proxy server alias is the default for the corresponding protocol. There can be only one default proxy server alias for a given protocol. Y denotes Yes and N denotes No.
     * @param password The password required to authenticate if authentication is enabled for the proxy server.
     * @param passwordHandle The password handle which is used to store the password (if specified) in a secure manner in API Gateway.
     * @param port The port number of the proxy server.
     * @param protocol The protocol for which the proxy server is created.
     * @param proxyAlias The outbound proxy server alias name. It must be unique across all outbound proxy server aliases defined in API Gateway. Once a proxy server alias is defined with a given name, it cannot be modified further.
     * @param socksVersion The SOCKS version of the proxy server. Applicable only if protocol value is SOCKS. A value of 4 indicates SOCKS protocol version 4 and a value of 5 indicates SOCKS protocol version 5. SOCKS protocol version 4 does not support authentication and hence username/password cannot be specified if socksVersion = 4.
     * @param status Indicates whether the particular proxy server alias is enabled or disabled.
     * @param username The user name required to authenticate against if authentication is enabled for the proxy server.
     */
    @ApiStatus.Internal
    public OutboundProxySettings(String entityId, FtpTypeEnum ftpType, String host, IsDefaultEnum isDefault, String password, String passwordHandle, String port, ProtocolEnum protocol, String proxyAlias, SocksVersionEnum socksVersion, StatusEnum status, String username) {
        this.entityId = entityId;
        this.ftpType = ftpType;
        this.host = host;
        this.isDefault = isDefault;
        this.password = password;
        this.passwordHandle = passwordHandle;
        this.port = port;
        this.protocol = protocol;
        this.proxyAlias = proxyAlias;
        this.socksVersion = socksVersion;
        this.status = status;
        this.username = username;
    }

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

        private static final FtpTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FtpTypeEnum of(String input) {
            if (input != null) {
                for (FtpTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * Indicates whether this proxy server alias is the default for the corresponding protocol. There can be only one default proxy server alias for a given protocol. Y denotes Yes and N denotes No.
     */
    @AllArgsConstructor
    public enum IsDefaultEnum {
        Y("Y"),
        N("N");

        private static final IsDefaultEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static IsDefaultEnum of(String input) {
            if (input != null) {
                for (IsDefaultEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
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

        private static final ProtocolEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ProtocolEnum of(String input) {
            if (input != null) {
                for (ProtocolEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The SOCKS version of the proxy server. Applicable only if protocol value is SOCKS. A value of 4 indicates SOCKS protocol version 4 and a value of 5 indicates SOCKS protocol version 5. SOCKS protocol version 4 does not support authentication and hence username/password cannot be specified if socksVersion = 4.
     */
    @AllArgsConstructor
    public enum SocksVersionEnum {
        _4("4"),
        _5("5");

        private static final SocksVersionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SocksVersionEnum of(String input) {
            if (input != null) {
                for (SocksVersionEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * Indicates whether the particular proxy server alias is enabled or disabled.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ENABLED("Enabled"),
        DISABLED("Disabled");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
