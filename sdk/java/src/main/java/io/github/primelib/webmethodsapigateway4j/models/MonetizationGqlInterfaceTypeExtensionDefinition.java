// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * MonetizationGqlInterfaceTypeExtensionDefinition
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationGqlInterfaceTypeExtensionDefinition")
@JsonPropertyOrder({
    "comments",
    "description",
    "directives",
    "directivesByName",
    "fieldDefinitions",
    "implementsProp",
    "name"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationGqlInterfaceTypeExtensionDefinition {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<MonetizationGqlComment> comments;

    @JsonProperty("description")
    protected MonetizationGqlDescription description;

    /**
     * List of directives
     */
    @JsonProperty("directives")
    protected List<MonetizationGqlDirective> directives;

    @JsonProperty("directivesByName")
    protected Map<String, ServiceMgmtGqlDirective> directivesByName;

    /**
     * List of field definitions
     */
    @JsonProperty("fieldDefinitions")
    protected List<MonetizationGqlFieldDefinition> fieldDefinitions;

    @JsonProperty("implements")
    protected List<MonetizationGqlType> implementsProp;

    /**
     * Name of the interface type definition
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link MonetizationGqlInterfaceTypeExtensionDefinition}.
     *
     * @param spec the specification to process
     */
    public MonetizationGqlInterfaceTypeExtensionDefinition(Consumer<MonetizationGqlInterfaceTypeExtensionDefinition> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationGqlInterfaceTypeExtensionDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationGqlInterfaceTypeExtensionDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description description
     * @param directives List of directives
     * @param directivesByName directivesByName
     * @param fieldDefinitions List of field definitions
     * @param implementsProp implementsProp
     * @param name Name of the interface type definition
     */
    @ApiStatus.Internal
    public MonetizationGqlInterfaceTypeExtensionDefinition(List<MonetizationGqlComment> comments, MonetizationGqlDescription description, List<MonetizationGqlDirective> directives, Map<String, ServiceMgmtGqlDirective> directivesByName, List<MonetizationGqlFieldDefinition> fieldDefinitions, List<MonetizationGqlType> implementsProp, String name) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.fieldDefinitions = fieldDefinitions;
        this.implementsProp = implementsProp;
        this.name = name;
    }
}
