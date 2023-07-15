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
 * RemotePortConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "host",
    "nodeName",
    "port"
})
@JsonTypeName("RemotePortConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemotePortConfig {

    /**
     * Constructs a validated implementation of {@link RemotePortConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemotePortConfig(Consumer<RemotePortConfig> spec) {
        spec.accept(this);
    }

    /**
     * Host name or ip address
     */
    @JsonProperty("host")
    protected String host;

    /**
     * An uuid to uniquely identify a node/cluster
     */
    @JsonProperty("nodeName")
    protected String nodeName;

    /**
     * GRPC port number
     */
    @JsonProperty("port")
    protected Integer port;


}
