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
 * DataSource
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
    "inputStream",
    "name",
    "outputStream"
})
@JsonTypeName("DataSource")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataSource {

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("outputStream")
    protected Object outputStream;

    /**
     * Constructs a validated instance of {@link DataSource}.
     *
     * @param spec the specification to process
     */
    public DataSource(Consumer<DataSource> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DataSource}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DataSource(Consumer)} instead.
     * @param contentType contentType
     * @param inputStream inputStream
     * @param name name
     * @param outputStream outputStream
     */
    @ApiStatus.Internal
    public DataSource(String contentType, Object inputStream, String name, Object outputStream) {
        this.contentType = contentType;
        this.inputStream = inputStream;
        this.name = name;
        this.outputStream = outputStream;
    }

}
