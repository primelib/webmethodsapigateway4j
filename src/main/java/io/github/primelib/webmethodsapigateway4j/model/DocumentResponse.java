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
 * DocumentResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("DocumentResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DocumentResponse {

    /**
     * Constructs a validated implementation of {@link DocumentResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DocumentResponse(Consumer<DocumentResponse> spec) {
        spec.accept(this);
    }

    /**
     * The unique identifier of the document as stored in API Gateway.
     */
    @JsonProperty("id")
    protected String id;


}
