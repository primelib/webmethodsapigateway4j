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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StringSchemaModel
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "schema"
})
@JsonTypeName("StringSchemaModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StringSchemaModel extends Model {

    @JsonProperty("schema")
    protected String schema;

    /**
     * Constructs a validated instance of {@link StringSchemaModel}.
     *
     * @param spec the specification to process
     */
    public StringSchemaModel(Consumer<StringSchemaModel> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StringSchemaModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StringSchemaModel(Consumer)} instead.
     * @param schema schema
     */
    @ApiStatus.Internal
    public StringSchemaModel(String schema) {
        this.schema = schema;
    }

}
