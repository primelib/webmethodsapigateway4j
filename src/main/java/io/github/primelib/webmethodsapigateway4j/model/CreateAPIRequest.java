package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAPIRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CreateAPIRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAPIRequest(Consumer<CreateAPIRequest> spec) {
        spec.accept(this);
    }

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
