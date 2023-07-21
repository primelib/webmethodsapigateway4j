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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComposedModel
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated instance of {@link ComposedModel}.
     *
     * @param spec the specification to process
     */
    public ComposedModel(Consumer<ComposedModel> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComposedModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComposedModel(Consumer)} instead.
     * @param allOf var.name
     * @param anyOf var.name
     * @param child var.name
     * @param interfaces var.name
     * @param oneOf var.name
     * @param parent var.name
     */
    @ApiStatus.Internal
    public ComposedModel(List<Model> allOf, List<Model> anyOf, Model child, List<Model> interfaces, List<Model> oneOf, Model parent) {
        this.allOf = allOf;
        this.anyOf = anyOf;
        this.child = child;
        this.interfaces = interfaces;
        this.oneOf = oneOf;
        this.parent = parent;
    }

}
