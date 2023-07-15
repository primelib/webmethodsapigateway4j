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
 * Namespaces
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "prefix",
    "uri"
})
@JsonTypeName("Namespaces")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Namespaces {

    /**
     * Constructs a validated implementation of {@link Namespaces}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Namespaces(Consumer<Namespaces> spec) {
        spec.accept(this);
    }

    @JsonProperty("prefix")
    protected String prefix;

    @JsonProperty("uri")
    protected String uri;


}
