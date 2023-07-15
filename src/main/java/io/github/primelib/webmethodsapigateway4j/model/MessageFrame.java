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
 * MessageFrame
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "messageDescription",
    "messagePayload",
    "origin",
    "type"
})
@JsonTypeName("MessageFrame")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MessageFrame {

    /**
     * Constructs a validated implementation of {@link MessageFrame}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MessageFrame(Consumer<MessageFrame> spec) {
        spec.accept(this);
    }

    @JsonProperty("messageDescription")
    protected String messageDescription;

    @JsonProperty("messagePayload")
    protected String messagePayload;

    @JsonProperty("origin")
    protected OriginEnum origin;

    @JsonProperty("type")
    protected TypeEnum type;


    @AllArgsConstructor
    public enum OriginEnum {
        SERVER("Server"),
        CLIENT("Client");

        private final String value;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        BINARY("Binary"),
        TEXT("Text");

        private final String value;
    }

}
