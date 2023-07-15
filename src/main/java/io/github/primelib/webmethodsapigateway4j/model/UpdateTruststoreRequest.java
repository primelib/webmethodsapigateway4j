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
 * UpdateTruststoreRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "keyStoreDescription",
    "keyStoreType",
    "keyStoreProvider",
    "keyStorePassword",
    "uploadFileName",
    "fileContent",
    "isPwdBase64Encoded"
})
@JsonTypeName("updateTruststore_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateTruststoreRequest {

    /**
     * Constructs a validated implementation of {@link UpdateTruststoreRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateTruststoreRequest(Consumer<UpdateTruststoreRequest> spec) {
        spec.accept(this);
    }

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
     * The provider that is used for the truststore type.
     */
    @JsonProperty("keyStoreProvider")
    protected KeyStoreProviderEnum keyStoreProvider = KeyStoreProviderEnum.SUN;

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

    /**
     * The provider that is used for the truststore type.
     */
    @AllArgsConstructor
    public enum KeyStoreProviderEnum {
        SUN("SUN");

        private final String value;
    }

}
