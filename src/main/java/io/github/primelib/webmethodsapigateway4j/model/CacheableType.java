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
 * CacheableType
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
    "type"
})
@JsonTypeName("CacheableType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CacheableType {

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CacheableType}.
     *
     * @param spec the specification to process
     */
    public CacheableType(Consumer<CacheableType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CacheableType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CacheableType(Consumer)} instead.
     * @param type type
     */
    @ApiStatus.Internal
    public CacheableType(String type) {
        this.type = type;
    }

}
