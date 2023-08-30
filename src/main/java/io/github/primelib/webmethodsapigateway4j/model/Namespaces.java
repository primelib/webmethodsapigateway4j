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
 * Namespaces
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
    "prefix",
    "uri"
})
@JsonTypeName("Namespaces")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Namespaces {

    @JsonProperty("prefix")
    protected String prefix;

    @JsonProperty("uri")
    protected String uri;

    /**
     * Constructs a validated instance of {@link Namespaces}.
     *
     * @param spec the specification to process
     */
    public Namespaces(Consumer<Namespaces> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Namespaces}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Namespaces(Consumer)} instead.
     * @param prefix prefix
     * @param uri uri
     */
    @ApiStatus.Internal
    public Namespaces(String prefix, String uri) {
        this.prefix = prefix;
        this.uri = uri;
    }

}
