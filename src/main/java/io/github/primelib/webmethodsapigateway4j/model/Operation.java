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
 * Operation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Operation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Operation(Consumer<Operation> spec) {
        spec.accept(this);
    }

    /**
     * An optional, string description, intended to apply to all operations in this path
     */
    @JsonProperty("callbacks")
    protected Map<String, Callback> callbacks = new HashMap<>();

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
    protected Map<String, MockedResponse> mockedResponses = new HashMap<>();

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
    protected Map<String, Response> responses = new HashMap<>();

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
