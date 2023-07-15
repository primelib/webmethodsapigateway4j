package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataHandler
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "allCommands",
    "content",
    "contentType",
    "dataSource",
    "inputStream",
    "name",
    "outputStream",
    "preferredCommands",
    "transferDataFlavors"
})
@JsonTypeName("DataHandler")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DataHandler {

    /**
     * Constructs a validated implementation of {@link DataHandler}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DataHandler(Consumer<DataHandler> spec) {
        spec.accept(this);
    }

    @JsonProperty("allCommands")
    protected List<CommandInfo> allCommands;

    @JsonProperty("content")
    protected Object content;

    @JsonProperty("contentType")
    protected String contentType;

    @JsonProperty("dataSource")
    protected DataSource dataSource;

    @JsonProperty("inputStream")
    protected Object inputStream;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("outputStream")
    protected Object outputStream;

    @JsonProperty("preferredCommands")
    protected List<CommandInfo> preferredCommands;

    @JsonProperty("transferDataFlavors")
    protected List<DataFlavor> transferDataFlavors;


}
