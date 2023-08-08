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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RefProperty
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "get$ref",
    "refFormat",
    "simpleRef"
})
@JsonTypeName("RefProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RefProperty extends Property {

    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("refFormat")
    protected RefFormatEnum refFormat;

    @JsonProperty("simpleRef")
    protected String simpleRef;

    /**
     * Constructs a validated instance of {@link RefProperty}.
     *
     * @param spec the specification to process
     */
    public RefProperty(Consumer<RefProperty> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RefProperty}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RefProperty(Consumer)} instead.
     * @param get$ref get$ref
     * @param refFormat refFormat
     * @param simpleRef simpleRef
     */
    @ApiStatus.Internal
    public RefProperty(String get$ref, RefFormatEnum refFormat, String simpleRef) {
        this.get$ref = get$ref;
        this.refFormat = refFormat;
        this.simpleRef = simpleRef;
    }

    @AllArgsConstructor
    public enum RefFormatEnum {
        URL("URL"),
        RELATIVE("RELATIVE"),
        INTERNAL("INTERNAL");

        private static final RefFormatEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RefFormatEnum of(String input) {
            if (input != null) {
                for (RefFormatEnum v : VALUES) {
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
