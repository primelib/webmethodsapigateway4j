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
 * AccessMode
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessModeSevices",
    "accessModeType"
})
@JsonTypeName("AccessMode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessMode {

    /**
     * Constructs a validated implementation of {@link AccessMode}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AccessMode(Consumer<AccessMode> spec) {
        spec.accept(this);
    }

    @JsonProperty("accessModeSevices")
    protected AccessModeServices accessModeSevices;

    @JsonProperty("accessModeType")
    protected AccessModeType accessModeType;


}
