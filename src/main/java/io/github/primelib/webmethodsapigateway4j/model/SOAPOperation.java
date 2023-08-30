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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPOperation
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
    "bindings",
    "defined",
    "enabled",
    "headers",
    "isRESTInvokeEnabled",
    "mockedConditionsBasedCustomResponsesList",
    "mockedResponses",
    "name",
    "namespace",
    "restEnabledPath",
    "scopes",
    "soapAction",
    "tags"
})
@JsonTypeName("SOAPOperation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SOAPOperation {

    @JsonProperty("bindings")
    protected List<SOAPBinding> bindings;

    @JsonProperty("defined")
    protected Boolean defined;

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("headers")
    protected List<String> headers;

    @JsonProperty("isRESTInvokeEnabled")
    protected Boolean isRESTInvokeEnabled;

    @JsonProperty("mockedConditionsBasedCustomResponsesList")
    protected List<MockedConditionsBasedCustomResponse> mockedConditionsBasedCustomResponsesList;

    @JsonProperty("mockedResponses")
    protected Map<String, MockedResponse> mockedResponses;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("namespace")
    protected String namespace;

    @JsonProperty("restEnabledPath")
    protected RestEnabledPath restEnabledPath;

    @JsonProperty("scopes")
    protected List<String> scopes;

    @JsonProperty("soapAction")
    protected String soapAction;

    @JsonProperty("tags")
    protected List<String> tags;

    /**
     * Constructs a validated instance of {@link SOAPOperation}.
     *
     * @param spec the specification to process
     */
    public SOAPOperation(Consumer<SOAPOperation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SOAPOperation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SOAPOperation(Consumer)} instead.
     * @param bindings bindings
     * @param defined defined
     * @param enabled enabled
     * @param headers headers
     * @param isRESTInvokeEnabled isRESTInvokeEnabled
     * @param mockedConditionsBasedCustomResponsesList mockedConditionsBasedCustomResponsesList
     * @param mockedResponses mockedResponses
     * @param name name
     * @param namespace namespace
     * @param restEnabledPath restEnabledPath
     * @param scopes scopes
     * @param soapAction soapAction
     * @param tags tags
     */
    @ApiStatus.Internal
    public SOAPOperation(List<SOAPBinding> bindings, Boolean defined, Boolean enabled, List<String> headers, Boolean isRESTInvokeEnabled, List<MockedConditionsBasedCustomResponse> mockedConditionsBasedCustomResponsesList, Map<String, MockedResponse> mockedResponses, String name, String namespace, RestEnabledPath restEnabledPath, List<String> scopes, String soapAction, List<String> tags) {
        this.bindings = bindings;
        this.defined = defined;
        this.enabled = enabled;
        this.headers = headers;
        this.isRESTInvokeEnabled = isRESTInvokeEnabled;
        this.mockedConditionsBasedCustomResponsesList = mockedConditionsBasedCustomResponsesList;
        this.mockedResponses = mockedResponses;
        this.name = name;
        this.namespace = namespace;
        this.restEnabledPath = restEnabledPath;
        this.scopes = scopes;
        this.soapAction = soapAction;
        this.tags = tags;
    }

}
