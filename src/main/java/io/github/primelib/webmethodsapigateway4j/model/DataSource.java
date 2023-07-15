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
 * DataSource
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contentType",
    "inputStream",
    "name",
    "outputStream"
})
@JsonTypeName("DataSource")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataSource {

    /**
     * Constructs a validated implementation of {@link DataSource}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DataSource(Consumer<DataSource> spec) {
        spec.accept(this);
    }

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("outputStream")
    protected Object outputStream;


}
