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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPBinding
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
    "faultMessages",
    "inputMessage",
    "interFace",
    "name",
    "outputMessage",
    "specifier",
    "type"
})
@JsonTypeName("SOAPBinding")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPBinding {

    @JsonProperty("faultMessages")
    protected List<String> faultMessages;

    @JsonProperty("inputMessage")
    protected String inputMessage;

    @JsonProperty("interFace")
    protected SOAPInterface _interFace;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("outputMessage")
    protected String outputMessage;

    @JsonProperty("specifier")
    protected String specifier;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link SOAPBinding}.
     *
     * @param spec the specification to process
     */
    public SOAPBinding(Consumer<SOAPBinding> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPBinding}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPBinding(Consumer)} instead.
     * @param faultMessages faultMessages
     * @param inputMessage inputMessage
     * @param _interFace _interFace
     * @param name name
     * @param outputMessage outputMessage
     * @param specifier specifier
     * @param type type
     */
    @ApiStatus.Internal
    public SOAPBinding(List<String> faultMessages, String inputMessage, SOAPInterface _interFace, String name, String outputMessage, String specifier, String type) {
        this.faultMessages = faultMessages;
        this.inputMessage = inputMessage;
        this._interFace = _interFace;
        this.name = name;
        this.outputMessage = outputMessage;
        this.specifier = specifier;
        this.type = type;
    }

}
