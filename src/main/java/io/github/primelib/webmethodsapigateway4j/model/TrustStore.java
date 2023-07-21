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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrustStore
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
     * Constructs a validated instance of {@link TrustStore}.
     *
     * @param spec the specification to process
     */
    public TrustStore(Consumer<TrustStore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TrustStore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TrustStore(Consumer)} instead.
     * @param certificateAliases The list of aliases that are available within the truststore.
     * @param fileContent The contents of the truststore file.
     * @param id The unique identifier for the truststore.
     * @param isLoaded Indicates whether the truststore is loaded or not. A truststore may not be loaded if there are errors while reading the truststore file.
     * @param isWarning Indicates whether there is a warning message from the API Gateway while the truststore was created/modified.
     * @param keyStoreDescription The description for the truststore.
     * @param keyStoreLocation The location where the truststore is saved in API Gateway.
     * @param keyStoreName The name of the truststore. It cannot contain spaces or special characters.
     * @param keyStorePassword The truststore password that is defined at the time of truststore creation using a keystore utility.
     * @param keyStoreProvider var.name
     * @param keyStoreType The certificate file format of the truststore.
     * @param message The warning message if any. Applies only if isWarning = true
     * @param uploadFileName The name of the truststore file that will be used to save the truststore internally in API Gateway.
     */
    @ApiStatus.Internal
    public TrustStore(List<String> certificateAliases, String fileContent, String id, Boolean isLoaded, Boolean isWarning, String keyStoreDescription, String keyStoreLocation, String keyStoreName, String keyStorePassword, String keyStoreProvider, KeyStoreTypeEnum keyStoreType, String message, String uploadFileName) {
        this.certificateAliases = certificateAliases;
        this.fileContent = fileContent;
        this.id = id;
        this.isLoaded = isLoaded;
        this.isWarning = isWarning;
        this.keyStoreDescription = keyStoreDescription;
        this.keyStoreLocation = keyStoreLocation;
        this.keyStoreName = keyStoreName;
        this.keyStorePassword = keyStorePassword;
        this.keyStoreProvider = keyStoreProvider;
        this.keyStoreType = keyStoreType;
        this.message = message;
        this.uploadFileName = uploadFileName;
    }

    /**
     * The certificate file format of the truststore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS");

        private final String value;
    }

}
