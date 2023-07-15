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
 * WhiteListedIPs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "privateIPs",
    "privateV6IPs"
})
@JsonTypeName("WhiteListedIPs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WhiteListedIPs {

    /**
     * Constructs a validated implementation of {@link WhiteListedIPs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WhiteListedIPs(Consumer<WhiteListedIPs> spec) {
        spec.accept(this);
    }

    /**
     * List of private whitelisted IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @JsonProperty("privateIPs")
    protected List<String> privateIPs;

    /**
     * List of whitelisted IPV6 private IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @JsonProperty("privateV6IPs")
    protected List<String> privateV6IPs;


}
