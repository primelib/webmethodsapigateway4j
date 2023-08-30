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
 * EntityType
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
    "getmIDs",
    "methods",
    "navigationProperties",
    "properties",
    "props"
})
@JsonTypeName("EntityType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntityType {

    @JsonProperty("getmIDs")
    protected List<String> getmIDs;

    @JsonProperty("methods")
    protected Map<String, MethodParameters> methods;

    @JsonProperty("navigationProperties")
    protected Map<String, EntitySet> navigationProperties;

    @JsonProperty("properties")
    protected Map<String, Object> properties;

    @JsonProperty("props")
    protected List<String> props;

    /**
     * Constructs a validated instance of {@link EntityType}.
     *
     * @param spec the specification to process
     */
    public EntityType(Consumer<EntityType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EntityType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EntityType(Consumer)} instead.
     * @param getmIDs getmIDs
     * @param methods methods
     * @param navigationProperties navigationProperties
     * @param properties properties
     * @param props props
     */
    @ApiStatus.Internal
    public EntityType(List<String> getmIDs, Map<String, MethodParameters> methods, Map<String, EntitySet> navigationProperties, Map<String, Object> properties, List<String> props) {
        this.getmIDs = getmIDs;
        this.methods = methods;
        this.navigationProperties = navigationProperties;
        this.properties = properties;
        this.props = props;
    }

}
