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
 * IPAccessModeType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ipAccessType"
})
@JsonTypeName("IPAccessModeType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessModeType {

    /**
     * Constructs a validated implementation of {@link IPAccessModeType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IPAccessModeType(Consumer<IPAccessModeType> spec) {
        spec.accept(this);
    }

    @JsonProperty("ipAccessType")
    protected String ipAccessType;


}
