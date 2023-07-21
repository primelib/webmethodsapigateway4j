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
 * SystemInfo
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

    /**
     * Constructs a validated instance of {@link SystemInfo}.
     *
     * @param spec the specification to process
     */
    public SystemInfo(Consumer<SystemInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SystemInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SystemInfo(Consumer)} instead.
     * @param cpUCores var.name
     * @param cpUType var.name
     * @param hwMemoryGB var.name
     * @param hostname var.name
     * @param osName var.name
     * @param osRelease var.name
     * @param osServicePack var.name
     */
    @ApiStatus.Internal
    public SystemInfo(String cpUCores, String cpUType, String hwMemoryGB, String hostname, String osName, String osRelease, String osServicePack) {
        this.cpUCores = cpUCores;
        this.cpUType = cpUType;
        this.hwMemoryGB = hwMemoryGB;
        this.hostname = hostname;
        this.osName = osName;
        this.osRelease = osRelease;
        this.osServicePack = osServicePack;
    }

}
