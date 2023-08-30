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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataHandler
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

    /**
     * Constructs a validated instance of {@link DataHandler}.
     *
     * @param spec the specification to process
     */
    public DataHandler(Consumer<DataHandler> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DataHandler}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DataHandler(Consumer)} instead.
     * @param allCommands allCommands
     * @param content content
     * @param contentType contentType
     * @param dataSource dataSource
     * @param inputStream inputStream
     * @param name name
     * @param outputStream outputStream
     * @param preferredCommands preferredCommands
     * @param transferDataFlavors transferDataFlavors
     */
    @ApiStatus.Internal
    public DataHandler(List<CommandInfo> allCommands, Object content, String contentType, DataSource dataSource, Object inputStream, String name, Object outputStream, List<CommandInfo> preferredCommands, List<DataFlavor> transferDataFlavors) {
        this.allCommands = allCommands;
        this.content = content;
        this.contentType = contentType;
        this.dataSource = dataSource;
        this.inputStream = inputStream;
        this.name = name;
        this.outputStream = outputStream;
        this.preferredCommands = preferredCommands;
        this.transferDataFlavors = transferDataFlavors;
    }

}
