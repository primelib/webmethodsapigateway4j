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
 * CreateTruststoreRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "keyStoreName",
    "keyStoreDescription",
    "keyStoreType",
    "keyStorePassword",
    "uploadFileName",
    "fileContent",
    "isPwdBase64Encoded"
})
@JsonTypeName("createTruststore_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTruststoreRequest {

    /**
     * Constructs a validated implementation of {@link CreateTruststoreRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateTruststoreRequest(Consumer<CreateTruststoreRequest> spec) {
        spec.accept(this);
    }

    /**
     * The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.
     */
    @JsonProperty("keyStoreName")
    protected String keyStoreName;

    /**
     * The description for the truststore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The certificate file format of the truststore.
     */
    @JsonProperty("keyStoreType")
    protected KeyStoreTypeEnum keyStoreType = KeyStoreTypeEnum.JKS;

    /**
     * The truststore password that is defined at the time of truststore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    protected String keyStorePassword;

    /**
     * The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    protected String uploadFileName;

    /**
     * The contents of the truststore file.
     */
    @JsonProperty("fileContent")
    protected File fileContent;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @JsonProperty("isPwdBase64Encoded")
    protected String isPwdBase64Encoded;


    /**
     * The certificate file format of the truststore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS");

        private final String value;
    }

}
