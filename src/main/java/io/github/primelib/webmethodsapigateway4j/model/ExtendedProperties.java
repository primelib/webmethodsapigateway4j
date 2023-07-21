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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtendedProperties
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
    "key",
    "value"
})
@JsonTypeName("ExtendedProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedProperties {

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link ExtendedProperties}.
     *
     * @param spec the specification to process
     */
    public ExtendedProperties(Consumer<ExtendedProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExtendedProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExtendedProperties(Consumer)} instead.
     * @param key var.name
     * @param value var.name
     */
    @ApiStatus.Internal
    public ExtendedProperties(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
