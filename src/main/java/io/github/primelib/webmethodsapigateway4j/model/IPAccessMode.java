package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * IPAccessMode
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ipAccessModeType",
    "ipAccessModeHostsList"
})
@JsonTypeName("IPAccessMode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessMode {

    /**
     * Constructs a validated implementation of {@link IPAccessMode}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IPAccessMode(Consumer<IPAccessMode> spec) {
        spec.accept(this);
    }

    @JsonProperty("ipAccessModeType")
    protected IPAccessModeType ipAccessModeType;

    @JsonProperty("ipAccessModeHostsList")
    protected IPAccessModeHostsList ipAccessModeHostsList;


}
