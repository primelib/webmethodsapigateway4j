package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IAggregation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fields",
    "name",
    "type"
})
@JsonTypeName("IAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IAggregation {

    /**
     * Constructs a validated implementation of {@link IAggregation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IAggregation(Consumer<IAggregation> spec) {
        spec.accept(this);
    }

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
     * Type of the aggregation.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * Type of the aggregation.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        METRICS("metrics"),
        TIMESERIES("timeseries"),
        GROUP("group");

        private final String value;
    }

}
