package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * ServerLogInfo
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "logs"
})
@JsonTypeName("ServerLogInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerLogInfo extends TraceInfo {

    @JsonProperty("logs")
    protected List<String> logs;

    /**
     * Constructs a validated instance of {@link ServerLogInfo}.
     *
     * @param spec the specification to process
     */
    public ServerLogInfo(Consumer<ServerLogInfo> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServerLogInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServerLogInfo(Consumer)} instead.
     * @param logs logs
     */
    @ApiStatus.Internal
    public ServerLogInfo(List<String> logs) {
        this.logs = logs;
    }

}
