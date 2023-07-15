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
 * EntityType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link EntityType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EntityType(Consumer<EntityType> spec) {
        spec.accept(this);
    }

    @JsonProperty("getmIDs")
    protected List<String> getmIDs;

    @JsonProperty("methods")
    protected Map<String, MethodParameters> methods = new HashMap<>();

    @JsonProperty("navigationProperties")
    protected Map<String, EntitySet> navigationProperties = new HashMap<>();

    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();

    @JsonProperty("props")
    protected List<String> props;


}
