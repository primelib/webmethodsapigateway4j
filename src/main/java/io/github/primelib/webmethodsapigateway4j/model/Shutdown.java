package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shutdown
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Boolean bounce;

    /**
     * Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
     */
    @JsonProperty("option")
    private OptionEnum option;

    /**
     * A value of true would first flush the API Gateway in memory data like performance metrics, license metrics and subscription quota to datastore before shutdown of the server. Next, when API Gateway is restarted either manually or using bounce parameter, the Integration server will be started in Quiesce mode. Note: In a cluster, the flushing of in memory data would happen only on one of the nodes and hence on other nodes the API call would return immediately by eliminating the flush time. The default value is false.
     */
    @JsonProperty("quiesce")
    private Boolean quiesce;

    /**
     * Specifies the maximum wait time in minutes before API Gateway server is shutdown when option drain is specified.
     */
    @JsonProperty("timeout")
    private Integer timeout;


public enum OptionEnum {
        FORCE("force"), // Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
        DRAIN("drain"); // Specifies whether to shutdown API Gateway server immediately or after all client sessions are ended. A value of 'force' would shutdown the server immediately and 'drain' would wait for a maximum period of time for all the client sessions to end before shutdown.
    
    private final String text;

    /**
     * @param text
     */
    OptionEnum(final String text) {
        this.text = text;
    }

}
}
