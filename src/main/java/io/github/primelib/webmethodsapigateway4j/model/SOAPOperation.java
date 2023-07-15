package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SOAPOperation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link SOAPOperation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SOAPOperation(Consumer<SOAPOperation> spec) {
        spec.accept(this);
    }

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
    protected Map<String, MockedResponse> mockedResponses = new HashMap<>();

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


}
