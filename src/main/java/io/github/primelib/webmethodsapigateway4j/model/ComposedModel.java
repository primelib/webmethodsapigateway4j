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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComposedModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "allOf",
    "anyOf",
    "child",
    "interfaces",
    "oneOf",
    "parent"
})
@JsonTypeName("ComposedModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComposedModel extends Model {

    /**
     * Constructs a validated implementation of {@link ComposedModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComposedModel(Consumer<ComposedModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("allOf")
    protected List<Model> allOf;

    @JsonProperty("anyOf")
    protected List<Model> anyOf;

    @JsonProperty("child")
    protected Model child;

    @JsonProperty("interfaces")
    protected List<Model> interfaces;

    @JsonProperty("oneOf")
    protected List<Model> oneOf;

    @JsonProperty("parent")
    protected Model parent;


}
