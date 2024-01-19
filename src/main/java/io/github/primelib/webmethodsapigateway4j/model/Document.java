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
 * Document
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
    "displayName",
    "fileContent",
    "fileName",
    "id"
})
@JsonTypeName("Document")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Document {

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

    /**
     * Constructs a validated instance of {@link Document}.
     *
     * @param spec the specification to process
     */
    public Document(Consumer<Document> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Document}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Document(Consumer)} instead.
     * @param displayName The display name of the attached document.
     * @param fileContent The complete file content in data URL format.
     * @param fileName The original name of the file uploaded to API Gateway.
     * @param id The unique identifier of the document as stored in API Gateway.
     */
    @ApiStatus.Internal
    public Document(String displayName, String fileContent, String fileName, String id) {
        this.displayName = displayName;
        this.fileContent = fileContent;
        this.fileName = fileName;
        this.id = id;
    }

}
