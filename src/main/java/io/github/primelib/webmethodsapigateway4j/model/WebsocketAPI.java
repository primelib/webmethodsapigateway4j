package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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

    /**
     * Constructs a validated implementation of {@link WebsocketAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebsocketAPI(Consumer<WebsocketAPI> spec) {
        spec.accept(this);
    }

    @JsonProperty("externalDocs")
    protected List<ExternalDocs> externalDocs;

    @JsonProperty("messages")
    protected List<MessageFrame> messages;

    @JsonProperty("nativeUri")
    protected Set<String> nativeUri;

    @JsonProperty("parameters")
    protected Map<String, AbstractParameter> parameters = new HashMap<>();

    @JsonProperty("supportedSubProtocols")
    protected List<String> supportedSubProtocols;


}
