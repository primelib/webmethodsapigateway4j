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
 * Attribute
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributeName",
    "operation",
    "value"
})
@JsonTypeName("Attribute")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Attribute {

    /**
     * Constructs a validated implementation of {@link Attribute}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Attribute(Consumer<Attribute> spec) {
        spec.accept(this);
    }

    /**
     * The field name on which needs to be satisfied by the APIs.
     */
    @JsonProperty("attributeName")
    protected AttributeNameEnum attributeName;

    /**
     * Operation that needs to performed on the field specified.
     */
    @JsonProperty("operation")
    protected OperationEnum operation;

    /**
     * Value the needs to processed on the field and operation specified.
     */
    @JsonProperty("value")
    protected String value;


    /**
     * The field name on which needs to be satisfied by the APIs.
     */
    @AllArgsConstructor
    public enum AttributeNameEnum {
        API_NAME("API_NAME"),
        API_DESCRIPTION("API_DESCRIPTION"),
        API_VERSION("API_VERSION"),
        API_TAG("API_TAG"),
        RESOURCE_OPERATION_TAG("RESOURCE_OPERATION_TAG"),
        METHOD_TAG("METHOD_TAG"),
        GET("GET"),
        PUT("PUT"),
        POST("POST"),
        DELETE("DELETE"),
        PATCH("PATCH"),
        HEAD("HEAD");

        private final String value;
    }

    /**
     * Operation that needs to performed on the field specified.
     */
    @AllArgsConstructor
    public enum OperationEnum {
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS"),
        NOT_CONTAINS("NOT_CONTAINS"),
        STARTS_WITH("STARTS_WITH"),
        NOT_STARTS_WITH("NOT_STARTS_WITH"),
        LESS_THAN("LESS_THAN"),
        GREATER_THAN("GREATER_THAN"),
        ENDS_WITH("ENDS_WITH"),
        NOT_EQUALS("NOT_EQUALS");

        private final String value;
    }

}
