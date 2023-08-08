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
 * ServerInfo
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

    /**
     * Constructs a validated instance of {@link ServerInfo}.
     *
     * @param spec the specification to process
     */
    public ServerInfo(Consumer<ServerInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServerInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServerInfo(Consumer)} instead.
     * @param licenseDetails licenseDetails
     * @param allSvcsMinusShuts allSvcsMinusShuts
     * @param allSvcsMinusStarts allSvcsMinusStarts
     * @param build build
     * @param code code
     * @param description description
     * @param jvmVersion jvmVersion
     * @param listACL listACL
     * @param loaderr loaderr
     * @param loadok loadok
     * @param loadwarning loadwarning
     * @param message message
     * @param _package _package
     * @param patchNums patchNums
     * @param publisher publisher
     * @param services services
     * @param shutdownServices shutdownServices
     * @param startupServices startupServices
     * @param systemInfo systemInfo
     * @param time time
     * @param version version
     */
    @ApiStatus.Internal
    public ServerInfo(List<LicenseDetail> licenseDetails, List<String> allSvcsMinusShuts, List<String> allSvcsMinusStarts, String build, String code, String description, String jvmVersion, String listACL, String loaderr, String loadok, String loadwarning, String message, String _package, Object patchNums, String publisher, List<String> services, List<String> shutdownServices, List<String> startupServices, SystemInfo systemInfo, Object time, String version) {
        this.licenseDetails = licenseDetails;
        this.allSvcsMinusShuts = allSvcsMinusShuts;
        this.allSvcsMinusStarts = allSvcsMinusStarts;
        this.build = build;
        this.code = code;
        this.description = description;
        this.jvmVersion = jvmVersion;
        this.listACL = listACL;
        this.loaderr = loaderr;
        this.loadok = loadok;
        this.loadwarning = loadwarning;
        this.message = message;
        this._package = _package;
        this.patchNums = patchNums;
        this.publisher = publisher;
        this.services = services;
        this.shutdownServices = shutdownServices;
        this.startupServices = startupServices;
        this.systemInfo = systemInfo;
        this.time = time;
        this.version = version;
    }

}
