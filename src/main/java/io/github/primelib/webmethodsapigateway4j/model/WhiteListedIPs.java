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
 * WhiteListedIPs
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "privateIPs",
    "privateV6IPs"
})
@JsonTypeName("WhiteListedIPs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WhiteListedIPs {

    /**
     * List of private whitelisted IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @JsonProperty("privateIPs")
    private List<String> privateIPs;

    /**
     * List of whitelisted IPV6 private IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @JsonProperty("privateV6IPs")
    private List<String> privateV6IPs;


}
