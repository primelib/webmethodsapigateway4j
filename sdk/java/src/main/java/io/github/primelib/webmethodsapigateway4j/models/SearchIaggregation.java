// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * SearchIaggregation
 * <p>
 * This defines the aggregation structure to search across API Gateway
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("SearchIaggregation")
@JsonPropertyOrder({
    "fields",
    "name",
    "type"
})
@Generated(value = "io.github.primelib.primecodegen")
public class SearchIaggregation {

    /**
     * Input aggregation fields
     */
    @JsonProperty("fields")
    protected String fields;

    /**
     * Name of the aggregation in the search aggregation response
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Input file type
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link SearchIaggregation}.
     *
     * @param spec the specification to process
     */
    public SearchIaggregation(Consumer<SearchIaggregation> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchIaggregation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchIaggregation(Consumer)} instead.
     * @param fields Input aggregation fields
     * @param name Name of the aggregation in the search aggregation response
     * @param type Input file type
     */
    @ApiStatus.Internal
    public SearchIaggregation(String fields, String name, String type) {
        this.fields = fields;
        this.name = name;
        this.type = type;
    }
}
