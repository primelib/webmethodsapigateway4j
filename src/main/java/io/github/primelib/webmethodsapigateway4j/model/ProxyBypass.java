package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProxyBypass
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String entityId;

    /**
     * The host name or IP address of the server. In the Addresses field, type the fully qualified host and domain name of each server to which you want the Integration Server to issue requests directly. Type the host name and the domain name exactly as they appear in the URLs the server uses. To enter multiple names, separate each with commas. You can use the asterisk (*) to identify several servers with similar names. The asterisk matches any number of characters. For example, if you want to bypass requests made to localhost, www.yahoo.com, home.microsoft.com, and all hosts whose names begin with NYC, you would type: localhost,www.yahoo.com,home.microsoft.com, NYC*.*
     */
    @JsonProperty("proxyBypassAddresses")
    private List<String> proxyBypassAddresses = new ArrayList<>();


}
