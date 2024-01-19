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
 * RemotePortConfig
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
    "host",
    "nodeName",
    "port"
})
@JsonTypeName("RemotePortConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemotePortConfig {

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

    /**
     * Constructs a validated instance of {@link RemotePortConfig}.
     *
     * @param spec the specification to process
     */
    public RemotePortConfig(Consumer<RemotePortConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemotePortConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemotePortConfig(Consumer)} instead.
     * @param host Host name or ip address
     * @param nodeName An uuid to uniquely identify a node/cluster
     * @param port GRPC port number
     */
    @ApiStatus.Internal
    public RemotePortConfig(String host, String nodeName, Integer port) {
        this.host = host;
        this.nodeName = nodeName;
        this.port = port;
    }

}
