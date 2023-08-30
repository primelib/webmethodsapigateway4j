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
 * CommandInfo
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
    "commandClass",
    "commandName"
})
@JsonTypeName("CommandInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommandInfo {

    @JsonProperty("commandClass")
    protected String commandClass;

    @JsonProperty("commandName")
    protected String commandName;

    /**
     * Constructs a validated instance of {@link CommandInfo}.
     *
     * @param spec the specification to process
     */
    public CommandInfo(Consumer<CommandInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommandInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommandInfo(Consumer)} instead.
     * @param commandClass commandClass
     * @param commandName commandName
     */
    @ApiStatus.Internal
    public CommandInfo(String commandClass, String commandName) {
        this.commandClass = commandClass;
        this.commandName = commandName;
    }

}
