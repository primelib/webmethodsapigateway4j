package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrustStore
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "certificateAliases",
    "fileContent",
    "id",
    "isLoaded",
    "isWarning",
    "keyStoreDescription",
    "keyStoreLocation",
    "keyStoreName",
    "keyStorePassword",
    "keyStoreProvider",
    "keyStoreType",
    "message",
    "uploadFileName"
})
@JsonTypeName("TrustStore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TrustStore {

    /**
     * The list of aliases that are available within the truststore.
     */
    @JsonProperty("certificateAliases")
    private List<String> certificateAliases;

    /**
     * The contents of the truststore file.
     */
    @JsonProperty("fileContent")
    private String fileContent;

    /**
     * The unique identifier for the truststore.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Indicates whether the truststore is loaded or not. A truststore may not be loaded if there are errors while reading the truststore file.
     */
    @JsonProperty("isLoaded")
    private Boolean isLoaded;

    /**
     * Indicates whether there is a warning message from the API Gateway while the truststore was created/modified.
     */
    @JsonProperty("isWarning")
    private Boolean isWarning;

    /**
     * The description for the truststore.
     */
    @JsonProperty("keyStoreDescription")
    private String keyStoreDescription;

    /**
     * The location where the truststore is saved in API Gateway.
     */
    @JsonProperty("keyStoreLocation")
    private String keyStoreLocation;

    /**
     * The name of the truststore. It cannot contain spaces or special characters.
     */
    @JsonProperty("keyStoreName")
    private String keyStoreName;

    /**
     * The truststore password that is defined at the time of truststore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    private String keyStorePassword;

    @JsonProperty("keyStoreProvider")
    private String keyStoreProvider;

    /**
     * The certificate file format of the truststore.
     */
    @JsonProperty("keyStoreType")
    private KeyStoreTypeEnum keyStoreType;

    /**
     * The warning message if any. Applies only if isWarning = true
     */
    @JsonProperty("message")
    private String message;

    /**
     * The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    private String uploadFileName;


    /**
     * The certificate file format of the truststore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS");

        private final String value;
    }

}
