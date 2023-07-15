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
 * EntitySet
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enabled",
    "entityType",
    "parameters"
})
@JsonTypeName("EntitySet")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntitySet {

    /**
     * Constructs a validated implementation of {@link EntitySet}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EntitySet(Consumer<EntitySet> spec) {
        spec.accept(this);
    }

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("entityType")
    protected String entityType;

    @JsonProperty("parameters")
    protected Map<String, List<String>> parameters = new HashMap<>();


}
