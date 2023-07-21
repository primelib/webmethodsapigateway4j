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
 * Operation
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
    "callbacks",
    "deprecated",
    "description",
    "enabled",
    "externalDocs",
    "mockedConditionsBasedCustomResponsesList",
    "mockedResponses",
    "operationId",
    "parameters",
    "requestBody",
    "responses",
    "scopes",
    "summary",
    "tags",
    "vendorExtensions"
})
@JsonTypeName("Operation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Operation {

    /**
     * An optional, string description, intended to apply to all operations in this path
     */
    @JsonProperty("callbacks")
    protected Map<String, Callback> callbacks;

    /**
     * Declares this operation to be deprecated. Consumers SHOULD refrain from usage of the declared operation. Default value is false
     */
    @JsonProperty("deprecated")
    protected Boolean deprecated;

    /**
     * A verbose explanation of the operation behavior
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("externalDocs")
    protected ExternalDocs externalDocs;

    /**
     * The list of mocked conditions and it's applicable only for mocked APIs
     */
    @JsonProperty("mockedConditionsBasedCustomResponsesList")
    protected List<MockedConditionsBasedCustomResponse> mockedConditionsBasedCustomResponsesList;

    /**
     * The list of possible mocked responses as they are returned from executing this operation and it's applicable only for mocked APIs
     */
    @JsonProperty("mockedResponses")
    protected Map<String, MockedResponse> mockedResponses;

    /**
     * Unique string used to identify the operation. The id MUST be unique among all operations described in the API. The operationId value is case-sensitive
     */
    @JsonProperty("operationId")
    protected String operationId;

    /**
     * A list of parameters that are applicable for this operation. If a parameter is already defined at the Path Item, the new definition will override it but can never remove it
     */
    @JsonProperty("parameters")
    protected List<Parameter> parameters;

    @JsonProperty("requestBody")
    protected RequestBody requestBody;

    /**
     * The list of possible responses as they are returned from executing this operation
     */
    @JsonProperty("responses")
    protected Map<String, Response> responses;

    @JsonProperty("scopes")
    protected List<String> scopes;

    /**
     * A short summary of what the operation does
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A list of tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     */
    @JsonProperty("tags")
    protected List<String> tags;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Operation}.
     *
     * @param spec the specification to process
     */
    public Operation(Consumer<Operation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Operation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Operation(Consumer)} instead.
     * @param callbacks An optional, string description, intended to apply to all operations in this path
     * @param deprecated Declares this operation to be deprecated. Consumers SHOULD refrain from usage of the declared operation. Default value is false
     * @param description A verbose explanation of the operation behavior
     * @param enabled var.name
     * @param externalDocs var.name
     * @param mockedConditionsBasedCustomResponsesList The list of mocked conditions and it's applicable only for mocked APIs
     * @param mockedResponses The list of possible mocked responses as they are returned from executing this operation and it's applicable only for mocked APIs
     * @param operationId Unique string used to identify the operation. The id MUST be unique among all operations described in the API. The operationId value is case-sensitive
     * @param parameters A list of parameters that are applicable for this operation. If a parameter is already defined at the Path Item, the new definition will override it but can never remove it
     * @param requestBody var.name
     * @param responses The list of possible responses as they are returned from executing this operation
     * @param scopes var.name
     * @param summary A short summary of what the operation does
     * @param tags A list of tags for API documentation control. Tags can be used for logical grouping of operations by resources or any other qualifier
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public Operation(Map<String, Callback> callbacks, Boolean deprecated, String description, Boolean enabled, ExternalDocs externalDocs, List<MockedConditionsBasedCustomResponse> mockedConditionsBasedCustomResponsesList, Map<String, MockedResponse> mockedResponses, String operationId, List<Parameter> parameters, RequestBody requestBody, Map<String, Response> responses, List<String> scopes, String summary, List<String> tags, Map<String, Object> vendorExtensions) {
        this.callbacks = callbacks;
        this.deprecated = deprecated;
        this.description = description;
        this.enabled = enabled;
        this.externalDocs = externalDocs;
        this.mockedConditionsBasedCustomResponsesList = mockedConditionsBasedCustomResponsesList;
        this.mockedResponses = mockedResponses;
        this.operationId = operationId;
        this.parameters = parameters;
        this.requestBody = requestBody;
        this.responses = responses;
        this.scopes = scopes;
        this.summary = summary;
        this.tags = tags;
        this.vendorExtensions = vendorExtensions;
    }

}
