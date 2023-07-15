package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Licence
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "url",
    "vendorExtensions"
})
@JsonTypeName("Licence")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Licence {

    /**
     * Constructs a validated implementation of {@link Licence}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Licence(Consumer<Licence> spec) {
        spec.accept(this);
    }

    /**
     * The license name used for the API
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A URL to the license used for the API
     */
    @JsonProperty("url")
    protected String url;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
