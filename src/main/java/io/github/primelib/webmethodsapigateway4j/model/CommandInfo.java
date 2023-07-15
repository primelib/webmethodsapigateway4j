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
 * CommandInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "commandClass",
    "commandName"
})
@JsonTypeName("CommandInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommandInfo {

    /**
     * Constructs a validated implementation of {@link CommandInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CommandInfo(Consumer<CommandInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("commandClass")
    protected String commandClass;

    @JsonProperty("commandName")
    protected String commandName;


}
