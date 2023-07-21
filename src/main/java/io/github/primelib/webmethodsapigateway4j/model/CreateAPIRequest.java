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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAPIRequest
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
    "file",
    "apiName",
    "apiDescription",
    "apiVersion",
    "type",
    "rootFileName"
})
@JsonTypeName("createAPI_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAPIRequest {

    /**
     * Input swagger / raml / wsdl file to be imported
     */
    @JsonProperty("file")
    protected File _file;

    /**
     * Name of the API
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * Description of the API
     */
    @JsonProperty("apiDescription")
    protected String apiDescription;

    /**
     * Version of the API
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    /**
     * Input file type
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Name of the main file in the zip. Required only when the input file is zip format
     */
    @JsonProperty("rootFileName")
    protected String rootFileName;

    /**
     * Constructs a validated instance of {@link CreateAPIRequest}.
     *
     * @param spec the specification to process
     */
    public CreateAPIRequest(Consumer<CreateAPIRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAPIRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAPIRequest(Consumer)} instead.
     * @param _file Input swagger / raml / wsdl file to be imported
     * @param apiName Name of the API
     * @param apiDescription Description of the API
     * @param apiVersion Version of the API
     * @param type Input file type
     * @param rootFileName Name of the main file in the zip. Required only when the input file is zip format
     */
    @ApiStatus.Internal
    public CreateAPIRequest(File _file, String apiName, String apiDescription, String apiVersion, TypeEnum type, String rootFileName) {
        this._file = _file;
        this.apiName = apiName;
        this.apiDescription = apiDescription;
        this.apiVersion = apiVersion;
        this.type = type;
        this.rootFileName = rootFileName;
    }

    /**
     * Input file type
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SWAGGER("swagger"),
        RAML("raml"),
        WSDL("wsdl"),
        OPENAPI("openapi");

        private final String value;
    }

}
