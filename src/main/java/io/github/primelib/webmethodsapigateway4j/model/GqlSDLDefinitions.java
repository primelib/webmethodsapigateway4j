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
 * GqlSDLDefinitions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "directiveDefinitions",
    "enumTypeExtensions",
    "inputObjectTypeExtensions",
    "interfaceTypeExtensions",
    "objectTypeExtensions",
    "scalarTypeExtensions",
    "scalarTypes",
    "schemaDefinition",
    "types",
    "unionTypeExtensions"
})
@JsonTypeName("GqlSDLDefinitions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlSDLDefinitions {

    /**
     * Constructs a validated implementation of {@link GqlSDLDefinitions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlSDLDefinitions(Consumer<GqlSDLDefinitions> spec) {
        spec.accept(this);
    }

    /**
     * GraphQL directive definitions
     */
    @JsonProperty("directiveDefinitions")
    protected Map<String, GqlDirectiveDefinition> directiveDefinitions = new HashMap<>();

    /**
     * GraphQL extended enum type definitions
     */
    @JsonProperty("enumTypeExtensions")
    protected Map<String, List<GqlEnumTypeExtensionDefinition>> enumTypeExtensions = new HashMap<>();

    /**
     * GraphQL extended input object type definitions
     */
    @JsonProperty("inputObjectTypeExtensions")
    protected Map<String, List<GqlInputObjectTypeExtensionDefinition>> inputObjectTypeExtensions = new HashMap<>();

    /**
     * GraphQL extended interface type definitions
     */
    @JsonProperty("interfaceTypeExtensions")
    protected Map<String, List<GqlInterfaceTypeExtensionDefinition>> interfaceTypeExtensions = new HashMap<>();

    /**
     * GraphQL extended object type definitions
     */
    @JsonProperty("objectTypeExtensions")
    protected Map<String, List<GqlObjectTypeExtensionDefinition>> objectTypeExtensions = new HashMap<>();

    /**
     * GraphQL extended scalar type definitions
     */
    @JsonProperty("scalarTypeExtensions")
    protected Map<String, List<GqlScalarTypeExtensionDefinition>> scalarTypeExtensions = new HashMap<>();

    /**
     * GraphQL scalar type definitions
     */
    @JsonProperty("scalarTypes")
    protected Map<String, GqlScalarTypeDefinition> scalarTypes = new HashMap<>();

    @JsonProperty("schemaDefinition")
    protected GqlSchemaDefinition schemaDefinition;

    /**
     * GraphQL type definitions such as Object type, Union, Interface, etc
     */
    @JsonProperty("types")
    protected Map<String, GqlTypeDefinition> types = new HashMap<>();

    /**
     * GraphQL extended union type definitions
     */
    @JsonProperty("unionTypeExtensions")
    protected Map<String, List<GqlUnionTypeExtensionDefinition>> unionTypeExtensions = new HashMap<>();


}
