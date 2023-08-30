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
 * RemoteISConfig
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
    "acl",
    "host",
    "keepAlive",
    "password",
    "port",
    "timeout",
    "useSSL",
    "username"
})
@JsonTypeName("RemoteISConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteISConfig {

    /**
     * ACL that governs which user groups on your server can use this alias for the remote server. Select an ACL from the drop down list. By default, only members of groups governed by the Internal ACL can use this alias.
     */
    @JsonProperty("acl")
    protected String acl;

    /**
     * Host name or IP address of the remote server for which you are creating an alias
     */
    @JsonProperty("host")
    protected String host;

    /**
     * Sets the default number of client keep alive connections to retain for a given target endpoint. If not specified, five keep alive connections are retained.
     */
    @JsonProperty("keepAlive")
    protected Integer keepAlive;

    /**
     * Password of the corresponding user in remote IS authorization server
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Port number on which the remote server listens for incoming requests from your server
     */
    @JsonProperty("port")
    protected Integer port;

    /**
     * Specifies the length of time (in minutes) that your server maintains an idle connection to a remote server.
     */
    @JsonProperty("timeout")
    protected Integer timeout;

    /**
     * Whether you want your server to connect to the remote server using Secure Sockets Layer (SSL).
     */
    @JsonProperty("useSSL")
    protected Boolean useSSL;

    /**
     * User name for a user account on the remote server. When you invoke a service using this alias, the remote server uses this user account for authentication and access control.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link RemoteISConfig}.
     *
     * @param spec the specification to process
     */
    public RemoteISConfig(Consumer<RemoteISConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteISConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteISConfig(Consumer)} instead.
     * @param acl ACL that governs which user groups on your server can use this alias for the remote server. Select an ACL from the drop down list. By default, only members of groups governed by the Internal ACL can use this alias.
     * @param host Host name or IP address of the remote server for which you are creating an alias
     * @param keepAlive Sets the default number of client keep alive connections to retain for a given target endpoint. If not specified, five keep alive connections are retained.
     * @param password Password of the corresponding user in remote IS authorization server
     * @param port Port number on which the remote server listens for incoming requests from your server
     * @param timeout Specifies the length of time (in minutes) that your server maintains an idle connection to a remote server.
     * @param useSSL Whether you want your server to connect to the remote server using Secure Sockets Layer (SSL).
     * @param username User name for a user account on the remote server. When you invoke a service using this alias, the remote server uses this user account for authentication and access control.
     */
    @ApiStatus.Internal
    public RemoteISConfig(String acl, String host, Integer keepAlive, String password, Integer port, Integer timeout, Boolean useSSL, String username) {
        this.acl = acl;
        this.host = host;
        this.keepAlive = keepAlive;
        this.password = password;
        this.port = port;
        this.timeout = timeout;
        this.useSSL = useSSL;
        this.username = username;
    }

}
