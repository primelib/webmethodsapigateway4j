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
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ODataAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "actionImports",
    "actions",
    "entitySets",
    "entityTypes",
    "functionImports",
    "functions",
    "metaDataDocument",
    "odataVersion",
    "serviceDocument",
    "serviceRegistryDisplayName",
    "serviceRoot",
    "singletons"
})
@JsonTypeName("ODataAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ODataAPI extends API {

    /**
     * Constructs a validated implementation of {@link ODataAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ODataAPI(Consumer<ODataAPI> spec) {
        spec.accept(this);
    }

    @JsonProperty("actionImports")
    protected Map<String, ActionImport> actionImports = new HashMap<>();

    @JsonProperty("actions")
    protected Map<String, EntityType> actions = new HashMap<>();

    @JsonProperty("entitySets")
    protected Map<String, EntitySet> entitySets = new HashMap<>();

    @JsonProperty("entityTypes")
    protected Map<String, EntityType> entityTypes = new HashMap<>();

    @JsonProperty("functionImports")
    protected Map<String, FunctionImport> functionImports = new HashMap<>();

    @JsonProperty("functions")
    protected Map<String, EntityType> functions = new HashMap<>();

    @JsonProperty("metaDataDocument")
    protected String metaDataDocument;

    @JsonProperty("odataVersion")
    protected String odataVersion;

    @JsonProperty("serviceDocument")
    protected String serviceDocument;

    /**
     * The name of the API in service registry when the API is published to a service registry.
     */
    @JsonProperty("serviceRegistryDisplayName")
    protected String serviceRegistryDisplayName;

    @JsonProperty("serviceRoot")
    protected String serviceRoot;

    @JsonProperty("singletons")
    protected Map<String, EntitySet> singletons = new HashMap<>();


}
