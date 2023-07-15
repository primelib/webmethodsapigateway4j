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
 * ServerInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "LicenseDetails",
    "allSvcsMinusShuts",
    "allSvcsMinusStarts",
    "build",
    "code",
    "description",
    "jvm_version",
    "listACL",
    "loaderr",
    "loadok",
    "loadwarning",
    "message",
    "package",
    "patch_nums",
    "publisher",
    "services",
    "shutdownServices",
    "startupServices",
    "systemInfo",
    "time",
    "version"
})
@JsonTypeName("ServerInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerInfo {

    /**
     * Constructs a validated implementation of {@link ServerInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServerInfo(Consumer<ServerInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("LicenseDetails")
    protected List<LicenseDetail> licenseDetails;

    @JsonProperty("allSvcsMinusShuts")
    protected List<String> allSvcsMinusShuts;

    @JsonProperty("allSvcsMinusStarts")
    protected List<String> allSvcsMinusStarts;

    @JsonProperty("build")
    protected String build;

    @JsonProperty("code")
    protected String code;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("jvm_version")
    protected String jvmVersion;

    @JsonProperty("listACL")
    protected String listACL;

    @JsonProperty("loaderr")
    protected String loaderr;

    @JsonProperty("loadok")
    protected String loadok;

    @JsonProperty("loadwarning")
    protected String loadwarning;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("package")
    protected String _package;

    @JsonProperty("patch_nums")
    protected Object patchNums;

    @JsonProperty("publisher")
    protected String publisher;

    @JsonProperty("services")
    protected List<String> services;

    @JsonProperty("shutdownServices")
    protected List<String> shutdownServices;

    @JsonProperty("startupServices")
    protected List<String> startupServices;

    @JsonProperty("systemInfo")
    protected SystemInfo systemInfo;

    @JsonProperty("time")
    protected Object time;

    @JsonProperty("version")
    protected String version;


}
