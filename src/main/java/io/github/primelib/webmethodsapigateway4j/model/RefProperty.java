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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RefProperty
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "get$ref",
    "refFormat",
    "simpleRef"
})
@JsonTypeName("RefProperty")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RefProperty extends Property {

    /**
     * Constructs a validated implementation of {@link RefProperty}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RefProperty(Consumer<RefProperty> spec) {
        spec.accept(this);
    }

    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("refFormat")
    protected RefFormatEnum refFormat;

    @JsonProperty("simpleRef")
    protected String simpleRef;


    @AllArgsConstructor
    public enum RefFormatEnum {
        URL("URL"),
        RELATIVE("RELATIVE"),
        INTERNAL("INTERNAL");

        private final String value;
    }

}
