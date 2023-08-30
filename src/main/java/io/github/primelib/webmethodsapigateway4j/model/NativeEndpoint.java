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
 * NativeEndpoint
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
    "description",
    "url"
})
@JsonTypeName("NativeEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NativeEndpoint {

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

    /**
     * Constructs a validated instance of {@link NativeEndpoint}.
     *
     * @param spec the specification to process
     */
    public NativeEndpoint(Consumer<NativeEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NativeEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NativeEndpoint(Consumer)} instead.
     * @param description Endpoint description
     * @param url Endpoint URL value
     */
    @ApiStatus.Internal
    public NativeEndpoint(String description, String url) {
        this.description = description;
        this.url = url;
    }

}
