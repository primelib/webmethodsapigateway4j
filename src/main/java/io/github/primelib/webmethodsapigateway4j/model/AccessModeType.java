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
 * AccessModeType
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
    "accessMode"
})
@JsonTypeName("AccessModeType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessModeType {

    @JsonProperty("accessMode")
    protected String accessMode;

    /**
     * Constructs a validated instance of {@link AccessModeType}.
     *
     * @param spec the specification to process
     */
    public AccessModeType(Consumer<AccessModeType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccessModeType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccessModeType(Consumer)} instead.
     * @param accessMode accessMode
     */
    @ApiStatus.Internal
    public AccessModeType(String accessMode) {
        this.accessMode = accessMode;
    }

}
