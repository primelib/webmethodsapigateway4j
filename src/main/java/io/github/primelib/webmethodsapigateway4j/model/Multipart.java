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
 * Multipart
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
    "contentType",
    "count",
    "parent"
})
@JsonTypeName("Multipart")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Multipart {

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("count")
    protected Integer count;

    @JsonProperty("parent")
    protected Part parent;

    /**
     * Constructs a validated instance of {@link Multipart}.
     *
     * @param spec the specification to process
     */
    public Multipart(Consumer<Multipart> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Multipart}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Multipart(Consumer)} instead.
     * @param contentType contentType
     * @param count count
     * @param parent parent
     */
    @ApiStatus.Internal
    public Multipart(String contentType, Integer count, Part parent) {
        this.contentType = contentType;
        this.count = count;
        this.parent = parent;
    }

}
