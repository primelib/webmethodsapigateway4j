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
 * AccessModeType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessMode"
})
@JsonTypeName("AccessModeType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessModeType {

    /**
     * Constructs a validated implementation of {@link AccessModeType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AccessModeType(Consumer<AccessModeType> spec) {
        spec.accept(this);
    }

    @JsonProperty("accessMode")
    protected String accessMode;


}
