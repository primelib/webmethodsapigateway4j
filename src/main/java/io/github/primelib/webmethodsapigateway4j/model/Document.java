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
 * Document
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "displayName",
    "fileContent",
    "fileName",
    "id"
})
@JsonTypeName("Document")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Document {

    /**
     * Constructs a validated implementation of {@link Document}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Document(Consumer<Document> spec) {
        spec.accept(this);
    }

    /**
     * The display name of the attached document.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The complete file content in data URL format.
     */
    @JsonProperty("fileContent")
    protected String fileContent;

    /**
     * The original name of the file uploaded to API Gateway.
     */
    @JsonProperty("fileName")
    protected String fileName;

    /**
     * The unique identifier of the document as stored in API Gateway.
     */
    @JsonProperty("id")
    protected String id;


}
