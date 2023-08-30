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
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebsocketAPI
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "externalDocs",
    "messages",
    "nativeUri",
    "parameters",
    "supportedSubProtocols"
})
@JsonTypeName("WebsocketAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebsocketAPI extends API {

    @JsonProperty("externalDocs")
    protected List<ExternalDocs> externalDocs;

    @JsonProperty("messages")
    protected List<MessageFrame> messages;

    @JsonProperty("nativeUri")
    protected Set<String> nativeUri;

    @JsonProperty("parameters")
    protected Map<String, AbstractParameter> parameters;

    @JsonProperty("supportedSubProtocols")
    protected List<String> supportedSubProtocols;

    /**
     * Constructs a validated instance of {@link WebsocketAPI}.
     *
     * @param spec the specification to process
     */
    public WebsocketAPI(Consumer<WebsocketAPI> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebsocketAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebsocketAPI(Consumer)} instead.
     * @param externalDocs externalDocs
     * @param messages messages
     * @param nativeUri nativeUri
     * @param parameters parameters
     * @param supportedSubProtocols supportedSubProtocols
     */
    @ApiStatus.Internal
    public WebsocketAPI(List<ExternalDocs> externalDocs, List<MessageFrame> messages, Set<String> nativeUri, Map<String, AbstractParameter> parameters, List<String> supportedSubProtocols) {
        this.externalDocs = externalDocs;
        this.messages = messages;
        this.nativeUri = nativeUri;
        this.parameters = parameters;
        this.supportedSubProtocols = supportedSubProtocols;
    }

}
