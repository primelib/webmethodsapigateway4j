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

/**
 * Shutdown
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
    "bounce",
    "option",
    "quiesce",
    "timeout"
})
@JsonTypeName("Shutdown")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Shutdown {

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
     * Constructs a validated instance of {@link Shutdown}.
     *
     * @param spec the specification to process
     */
    public Shutdown(Consumer<Shutdown> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Shutdown}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Shutdown(Consumer)} instead.
     * @param bounce Specifies whether to restart API Gateway server after shutdown. A value of true would restart the server. Default value is false.
     * @param option Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
     * @param quiesce A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. Note: In a cluster, the flushing of in memory data would happen only on one of the nodes and hence on other nodes the API call would return immediately by eliminating the flush time. The default value is false.
     * @param timeout Specifies the maximum wait time in minutes before API Gateway server is shutdown when option drain is specified.
     */
    @ApiStatus.Internal
    public Shutdown(Boolean bounce, OptionEnum option, Boolean quiesce, Integer timeout) {
        this.bounce = bounce;
        this.option = option;
        this.quiesce = quiesce;
        this.timeout = timeout;
    }

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
