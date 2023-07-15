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
 * Multipart
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contentType",
    "count",
    "parent"
})
@JsonTypeName("Multipart")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Multipart {

    /**
     * Constructs a validated implementation of {@link Multipart}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Multipart(Consumer<Multipart> spec) {
        spec.accept(this);
    }

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("count")
    protected Integer count;

    @JsonProperty("parent")
    protected Part parent;


}
