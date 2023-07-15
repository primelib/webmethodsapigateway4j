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
 * SystemInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "CPU.cores",
    "CPU.type",
    "HW.memory[GB]",
    "Hostname",
    "OS.Name",
    "OS.Release",
    "OS.Service.Pack"
})
@JsonTypeName("SystemInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SystemInfo {

    /**
     * Constructs a validated implementation of {@link SystemInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SystemInfo(Consumer<SystemInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("CPU.cores")
    protected String cpUCores;

    @JsonProperty("CPU.type")
    protected String cpUType;

    @JsonProperty("HW.memory[GB]")
    protected String hwMemoryGB;

    @JsonProperty("Hostname")
    protected String hostname;

    @JsonProperty("OS.Name")
    protected String osName;

    @JsonProperty("OS.Release")
    protected String osRelease;

    @JsonProperty("OS.Service.Pack")
    protected String osServicePack;


}
