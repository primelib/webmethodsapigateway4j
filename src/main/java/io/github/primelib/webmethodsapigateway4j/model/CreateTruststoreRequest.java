package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.
     */
    @JsonProperty("keyStoreName")
    private String keyStoreName;

    /**
     * The description for the truststore.
     */
    @JsonProperty("keyStoreDescription")
    private String keyStoreDescription;

    /**
     * The certificate file format of the truststore.
     */
    @JsonProperty("keyStoreType")
    private KeyStoreTypeEnum keyStoreType = KeyStoreTypeEnum.JKS;

    /**
     * The truststore password that is defined at the time of truststore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    private String keyStorePassword;

    /**
     * The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    private String uploadFileName;

    /**
     * The contents of the truststore file.
     */
    @JsonProperty("fileContent")
    private File fileContent;

    /**
     * Specifies whether password is base 64 encoded.
     */
    @JsonProperty("isPwdBase64Encoded")
    private String isPwdBase64Encoded;


public enum KeyStoreTypeEnum {
        JKS("JKS"); // The certificate file format of the truststore.
    
    private final String text;

    /**
     * @param text
     */
    KeyStoreTypeEnum(final String text) {
        this.text = text;
    }

}
}
