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

/**
 * Attribute
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
    "attributeName",
    "operation",
    "value"
})
@JsonTypeName("Attribute")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Attribute {

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
     * Constructs a validated instance of {@link Attribute}.
     *
     * @param spec the specification to process
     */
    public Attribute(Consumer<Attribute> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Attribute}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Attribute(Consumer)} instead.
     * @param attributeName The field name on which needs to be satisfied by the APIs.
     * @param operation Operation that needs to performed on the field specified.
     * @param value Value the needs to processed on the field and operation specified.
     */
    @ApiStatus.Internal
    public Attribute(AttributeNameEnum attributeName, OperationEnum operation, String value) {
        this.attributeName = attributeName;
        this.operation = operation;
        this.value = value;
    }

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
