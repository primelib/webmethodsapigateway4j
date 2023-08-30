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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MessageFrame
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
    "messageDescription",
    "messagePayload",
    "origin",
    "type"
})
@JsonTypeName("MessageFrame")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MessageFrame {

    @JsonProperty("messageDescription")
    protected String messageDescription;

    @JsonProperty("messagePayload")
    protected String messagePayload;

    @JsonProperty("origin")
    protected OriginEnum origin;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link MessageFrame}.
     *
     * @param spec the specification to process
     */
    public MessageFrame(Consumer<MessageFrame> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MessageFrame}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MessageFrame(Consumer)} instead.
     * @param messageDescription messageDescription
     * @param messagePayload messagePayload
     * @param origin origin
     * @param type type
     */
    @ApiStatus.Internal
    public MessageFrame(String messageDescription, String messagePayload, OriginEnum origin, TypeEnum type) {
        this.messageDescription = messageDescription;
        this.messagePayload = messagePayload;
        this.origin = origin;
        this.type = type;
    }

    @AllArgsConstructor
    public enum OriginEnum {
        SERVER("Server"),
        CLIENT("Client");

        private static final OriginEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OriginEnum of(String input) {
            if (input != null) {
                for (OriginEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum TypeEnum {
        BINARY("Binary"),
        TEXT("Text");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
