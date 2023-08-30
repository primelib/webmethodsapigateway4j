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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IAggregation
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
    "fields",
    "name",
    "type"
})
@JsonTypeName("IAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IAggregation {

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
     * Constructs a validated instance of {@link IAggregation}.
     *
     * @param spec the specification to process
     */
    public IAggregation(Consumer<IAggregation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IAggregation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IAggregation(Consumer)} instead.
     * @param fields Input aggregation fields
     * @param name Name of the aggregation in the search aggregation response
     * @param type Type of the aggregation.
     */
    @ApiStatus.Internal
    public IAggregation(String fields, String name, TypeEnum type) {
        this.fields = fields;
        this.name = name;
        this.type = type;
    }

    /**
     * Type of the aggregation.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        METRICS("metrics"),
        TIMESERIES("timeseries"),
        GROUP("group");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
