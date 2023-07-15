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
 * MessageWithPortReference
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "listenerKey",
    "pkg",
    "message"
})
@JsonTypeName("MessageWithPortReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MessageWithPortReference {

    /**
     * Constructs a validated implementation of {@link MessageWithPortReference}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MessageWithPortReference(Consumer<MessageWithPortReference> spec) {
        spec.accept(this);
    }

    @JsonProperty("listenerKey")
    protected String listenerKey;

    @JsonProperty("pkg")
    protected String pkg;

    @JsonProperty("message")
    protected String message;


}
