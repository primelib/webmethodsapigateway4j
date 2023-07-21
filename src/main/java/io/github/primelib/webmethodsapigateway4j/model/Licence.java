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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Licence
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
    "name",
    "url",
    "vendorExtensions"
})
@JsonTypeName("Licence")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Licence {

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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Licence}.
     *
     * @param spec the specification to process
     */
    public Licence(Consumer<Licence> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Licence}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Licence(Consumer)} instead.
     * @param name The license name used for the API
     * @param url A URL to the license used for the API
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public Licence(String name, String url, Map<String, Object> vendorExtensions) {
        this.name = name;
        this.url = url;
        this.vendorExtensions = vendorExtensions;
    }

}
