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
 * GqlSDLDefinitions
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
     * GraphQL directive definitions
     */
    @JsonProperty("directiveDefinitions")
    protected Map<String, GqlDirectiveDefinition> directiveDefinitions;

    /**
     * GraphQL extended enum type definitions
     */
    @JsonProperty("enumTypeExtensions")
    protected Map<String, List<GqlEnumTypeExtensionDefinition>> enumTypeExtensions;

    /**
     * GraphQL extended input object type definitions
     */
    @JsonProperty("inputObjectTypeExtensions")
    protected Map<String, List<GqlInputObjectTypeExtensionDefinition>> inputObjectTypeExtensions;

    /**
     * GraphQL extended interface type definitions
     */
    @JsonProperty("interfaceTypeExtensions")
    protected Map<String, List<GqlInterfaceTypeExtensionDefinition>> interfaceTypeExtensions;

    /**
     * GraphQL extended object type definitions
     */
    @JsonProperty("objectTypeExtensions")
    protected Map<String, List<GqlObjectTypeExtensionDefinition>> objectTypeExtensions;

    /**
     * GraphQL extended scalar type definitions
     */
    @JsonProperty("scalarTypeExtensions")
    protected Map<String, List<GqlScalarTypeExtensionDefinition>> scalarTypeExtensions;

    /**
     * GraphQL scalar type definitions
     */
    @JsonProperty("scalarTypes")
    protected Map<String, GqlScalarTypeDefinition> scalarTypes;

    @JsonProperty("schemaDefinition")
    protected GqlSchemaDefinition schemaDefinition;

    /**
     * GraphQL type definitions such as Object type, Union, Interface, etc
     */
    @JsonProperty("types")
    protected Map<String, GqlTypeDefinition> types;

    /**
     * GraphQL extended union type definitions
     */
    @JsonProperty("unionTypeExtensions")
    protected Map<String, List<GqlUnionTypeExtensionDefinition>> unionTypeExtensions;

    /**
     * Constructs a validated instance of {@link GqlSDLDefinitions}.
     *
     * @param spec the specification to process
     */
    public GqlSDLDefinitions(Consumer<GqlSDLDefinitions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlSDLDefinitions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlSDLDefinitions(Consumer)} instead.
     * @param directiveDefinitions GraphQL directive definitions
     * @param enumTypeExtensions GraphQL extended enum type definitions
     * @param inputObjectTypeExtensions GraphQL extended input object type definitions
     * @param interfaceTypeExtensions GraphQL extended interface type definitions
     * @param objectTypeExtensions GraphQL extended object type definitions
     * @param scalarTypeExtensions GraphQL extended scalar type definitions
     * @param scalarTypes GraphQL scalar type definitions
     * @param schemaDefinition schemaDefinition
     * @param types GraphQL type definitions such as Object type, Union, Interface, etc
     * @param unionTypeExtensions GraphQL extended union type definitions
     */
    @ApiStatus.Internal
    public GqlSDLDefinitions(Map<String, GqlDirectiveDefinition> directiveDefinitions, Map<String, List<GqlEnumTypeExtensionDefinition>> enumTypeExtensions, Map<String, List<GqlInputObjectTypeExtensionDefinition>> inputObjectTypeExtensions, Map<String, List<GqlInterfaceTypeExtensionDefinition>> interfaceTypeExtensions, Map<String, List<GqlObjectTypeExtensionDefinition>> objectTypeExtensions, Map<String, List<GqlScalarTypeExtensionDefinition>> scalarTypeExtensions, Map<String, GqlScalarTypeDefinition> scalarTypes, GqlSchemaDefinition schemaDefinition, Map<String, GqlTypeDefinition> types, Map<String, List<GqlUnionTypeExtensionDefinition>> unionTypeExtensions) {
        this.directiveDefinitions = directiveDefinitions;
        this.enumTypeExtensions = enumTypeExtensions;
        this.inputObjectTypeExtensions = inputObjectTypeExtensions;
        this.interfaceTypeExtensions = interfaceTypeExtensions;
        this.objectTypeExtensions = objectTypeExtensions;
        this.scalarTypeExtensions = scalarTypeExtensions;
        this.scalarTypes = scalarTypes;
        this.schemaDefinition = schemaDefinition;
        this.types = types;
        this.unionTypeExtensions = unionTypeExtensions;
    }

}
