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
 * ProxyBypass
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
    "proxyBypassAddresses"
})
@JsonTypeName("ProxyBypass")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProxyBypass {

    /**
     * proxyBypass constance Fixed unique identifier value is proxyBypass
     */
    @JsonProperty("entityId")
    protected String entityId;

    /**
     * The host name or IP address of the server. In the Addresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas. You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type: localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     */
    @JsonProperty("proxyBypassAddresses")
    protected List<String> proxyBypassAddresses;

    /**
     * Constructs a validated instance of {@link ProxyBypass}.
     *
     * @param spec the specification to process
     */
    public ProxyBypass(Consumer<ProxyBypass> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProxyBypass}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProxyBypass(Consumer)} instead.
     * @param entityId proxyBypass constance Fixed unique identifier value is proxyBypass
     * @param proxyBypassAddresses The host name or IP address of the server. In the Addresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas. You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type: localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     */
    @ApiStatus.Internal
    public ProxyBypass(String entityId, List<String> proxyBypassAddresses) {
        this.entityId = entityId;
        this.proxyBypassAddresses = proxyBypassAddresses;
    }

}
