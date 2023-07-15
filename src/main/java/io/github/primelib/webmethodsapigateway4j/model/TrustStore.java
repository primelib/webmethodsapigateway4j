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
 * TrustStore
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link TrustStore}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TrustStore(Consumer<TrustStore> spec) {
        spec.accept(this);
    }

    /**
     * The list of aliases that are available within the truststore.
     */
    @JsonProperty("certificateAliases")
    protected List<String> certificateAliases;

    /**
     * The contents of the truststore file.
     */
    @JsonProperty("fileContent")
    protected String fileContent;

    /**
     * The unique identifier for the truststore.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Indicates whether the truststore is loaded or not. A truststore may not be loaded if there are errors while reading the truststore file.
     */
    @JsonProperty("isLoaded")
    protected Boolean isLoaded;

    /**
     * Indicates whether there is a warning message from the API Gateway while the truststore was created/modified.
     */
    @JsonProperty("isWarning")
    protected Boolean isWarning;

    /**
     * The description for the truststore.
     */
    @JsonProperty("keyStoreDescription")
    protected String keyStoreDescription;

    /**
     * The location where the truststore is saved in API Gateway.
     */
    @JsonProperty("keyStoreLocation")
    protected String keyStoreLocation;

    /**
     * The name of the truststore. It cannot contain spaces or special characters.
     */
    @JsonProperty("keyStoreName")
    protected String keyStoreName;

    /**
     * The truststore password that is defined at the time of truststore creation using a keystore utility.
     */
    @JsonProperty("keyStorePassword")
    protected String keyStorePassword;

    @JsonProperty("keyStoreProvider")
    protected String keyStoreProvider;

    /**
     * The certificate file format of the truststore.
     */
    @JsonProperty("keyStoreType")
    protected KeyStoreTypeEnum keyStoreType;

    /**
     * The warning message if any. Applies only if isWarning = true
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @JsonProperty("uploadFileName")
    protected String uploadFileName;


    /**
     * The certificate file format of the truststore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS");

        private final String value;
    }

}
