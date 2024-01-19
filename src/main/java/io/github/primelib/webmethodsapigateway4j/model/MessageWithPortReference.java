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
 * MessageWithPortReference
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
    "listenerKey",
    "message",
    "pkg"
})
@JsonTypeName("MessageWithPortReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MessageWithPortReference {

    @JsonProperty("listenerKey")
    protected String listenerKey;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("pkg")
    protected String pkg;

    /**
     * Constructs a validated instance of {@link MessageWithPortReference}.
     *
     * @param spec the specification to process
     */
    public MessageWithPortReference(Consumer<MessageWithPortReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MessageWithPortReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MessageWithPortReference(Consumer)} instead.
     * @param listenerKey listenerKey
     * @param message message
     * @param pkg pkg
     */
    @ApiStatus.Internal
    public MessageWithPortReference(String listenerKey, String message, String pkg) {
        this.listenerKey = listenerKey;
        this.message = message;
        this.pkg = pkg;
    }

}
