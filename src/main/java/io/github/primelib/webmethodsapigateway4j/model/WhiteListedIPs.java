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
 * WhiteListedIPs
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
    protected List<String> privateIPs;

    /**
     * List of whitelisted IPV6 private IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @JsonProperty("privateV6IPs")
    protected List<String> privateV6IPs;

    /**
     * Constructs a validated instance of {@link WhiteListedIPs}.
     *
     * @param spec the specification to process
     */
    public WhiteListedIPs(Consumer<WhiteListedIPs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WhiteListedIPs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WhiteListedIPs(Consumer)} instead.
     * @param privateIPs List of private whitelisted IPs to be considered while API is created / updated by importing a url and import an archive
     * @param privateV6IPs List of whitelisted IPV6 private IPs to be considered while API is created / updated by importing a url and import an archive
     */
    @ApiStatus.Internal
    public WhiteListedIPs(List<String> privateIPs, List<String> privateV6IPs) {
        this.privateIPs = privateIPs;
        this.privateV6IPs = privateV6IPs;
    }

}
