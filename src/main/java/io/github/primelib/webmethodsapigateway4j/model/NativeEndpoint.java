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
 * NativeEndpoint
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "url"
})
@JsonTypeName("NativeEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NativeEndpoint {

    /**
     * Constructs a validated implementation of {@link NativeEndpoint}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NativeEndpoint(Consumer<NativeEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Endpoint description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Endpoint URL value
     */
    @JsonProperty("url")
    protected String url;


}
