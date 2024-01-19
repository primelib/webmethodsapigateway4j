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
 * DocumentResponse
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
    "id"
})
@JsonTypeName("DocumentResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DocumentResponse {

    /**
     * The unique identifier of the document as stored in API Gateway.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link DocumentResponse}.
     *
     * @param spec the specification to process
     */
    public DocumentResponse(Consumer<DocumentResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DocumentResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DocumentResponse(Consumer)} instead.
     * @param id The unique identifier of the document as stored in API Gateway.
     */
    @ApiStatus.Internal
    public DocumentResponse(String id) {
        this.id = id;
    }

}
