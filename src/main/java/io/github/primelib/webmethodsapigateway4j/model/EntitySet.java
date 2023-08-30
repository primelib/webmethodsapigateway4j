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
 * EntitySet
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
    "enabled",
    "entityType",
    "parameters"
})
@JsonTypeName("EntitySet")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EntitySet {

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("entityType")
    protected String entityType;

    @JsonProperty("parameters")
    protected Map<String, List<String>> parameters;

    /**
     * Constructs a validated instance of {@link EntitySet}.
     *
     * @param spec the specification to process
     */
    public EntitySet(Consumer<EntitySet> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EntitySet}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EntitySet(Consumer)} instead.
     * @param enabled enabled
     * @param entityType entityType
     * @param parameters parameters
     */
    @ApiStatus.Internal
    public EntitySet(Boolean enabled, String entityType, Map<String, List<String>> parameters) {
        this.enabled = enabled;
        this.entityType = entityType;
        this.parameters = parameters;
    }

}
