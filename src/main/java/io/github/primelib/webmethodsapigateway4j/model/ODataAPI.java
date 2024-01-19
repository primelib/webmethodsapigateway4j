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

import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ODataAPI
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    @JsonProperty("actionImports")
    protected Map<String, ActionImport> actionImports;

    @JsonProperty("actions")
    protected Map<String, EntityType> actions;

    @JsonProperty("entitySets")
    protected Map<String, EntitySet> entitySets;

    @JsonProperty("entityTypes")
    protected Map<String, EntityType> entityTypes;

    @JsonProperty("functionImports")
    protected Map<String, FunctionImport> functionImports;

    @JsonProperty("functions")
    protected Map<String, EntityType> functions;

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
    protected Map<String, EntitySet> singletons;

    /**
     * Constructs a validated instance of {@link ODataAPI}.
     *
     * @param spec the specification to process
     */
    public ODataAPI(Consumer<ODataAPI> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ODataAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ODataAPI(Consumer)} instead.
     * @param actionImports actionImports
     * @param actions actions
     * @param entitySets entitySets
     * @param entityTypes entityTypes
     * @param functionImports functionImports
     * @param functions functions
     * @param metaDataDocument metaDataDocument
     * @param odataVersion odataVersion
     * @param serviceDocument serviceDocument
     * @param serviceRegistryDisplayName The name of the API in service registry when the API is published to a service registry.
     * @param serviceRoot serviceRoot
     * @param singletons singletons
     */
    @ApiStatus.Internal
    public ODataAPI(Map<String, ActionImport> actionImports, Map<String, EntityType> actions, Map<String, EntitySet> entitySets, Map<String, EntityType> entityTypes, Map<String, FunctionImport> functionImports, Map<String, EntityType> functions, String metaDataDocument, String odataVersion, String serviceDocument, String serviceRegistryDisplayName, String serviceRoot, Map<String, EntitySet> singletons) {
        this.actionImports = actionImports;
        this.actions = actions;
        this.entitySets = entitySets;
        this.entityTypes = entityTypes;
        this.functionImports = functionImports;
        this.functions = functions;
        this.metaDataDocument = metaDataDocument;
        this.odataVersion = odataVersion;
        this.serviceDocument = serviceDocument;
        this.serviceRegistryDisplayName = serviceRegistryDisplayName;
        this.serviceRoot = serviceRoot;
        this.singletons = singletons;
    }

}
