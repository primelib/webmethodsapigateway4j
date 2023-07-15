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
 * Shutdown
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "bounce",
    "option",
    "quiesce",
    "timeout"
})
@JsonTypeName("Shutdown")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Shutdown {

    /**
     * Constructs a validated implementation of {@link Shutdown}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Shutdown(Consumer<Shutdown> spec) {
        spec.accept(this);
    }

    /**
     * Specifies whether to restart API Gateway server after shutdown. A value of true would restart the server. Default value is false.
     */
    @JsonProperty("bounce")
    protected Boolean bounce;

    /**
     * Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
     */
    @JsonProperty("option")
    protected OptionEnum option;

    /**
     * A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. Note: In a cluster, the flushing of in memory data would happen only on one of the nodes and hence on other nodes the API call would return immediately by eliminating the flush time. The default value is false.
     */
    @JsonProperty("quiesce")
    protected Boolean quiesce;

    /**
     * Specifies the maximum wait time in minutes before API Gateway server is shutdown when option drain is specified.
     */
    @JsonProperty("timeout")
    protected Integer timeout;


    /**
     * Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
     */
    @AllArgsConstructor
    public enum OptionEnum {
        FORCE("force"),
        DRAIN("drain");

        private final String value;
    }

}
