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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateTruststoreRequest
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
    protected KeyStoreTypeEnum keyStoreType;

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
     * Constructs a validated instance of {@link CreateTruststoreRequest}.
     *
     * @param spec the specification to process
     */
    public CreateTruststoreRequest(Consumer<CreateTruststoreRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateTruststoreRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateTruststoreRequest(Consumer)} instead.
     * @param keyStoreName The name of the truststore. It cannot contain spaces or special characters. The name of the trust store must be unique across all the truststores created in API Gateway.
     * @param keyStoreDescription The description for the truststore.
     * @param keyStoreType The certificate file format of the truststore.
     * @param keyStorePassword The truststore password that is defined at the time of truststore creation using a keystore utility.
     * @param uploadFileName The name of the truststore file that will be used to save the truststore internally in API Gateway.
     * @param fileContent The contents of the truststore file.
     * @param isPwdBase64Encoded Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public CreateTruststoreRequest(String keyStoreName, String keyStoreDescription, KeyStoreTypeEnum keyStoreType, String keyStorePassword, String uploadFileName, File fileContent, String isPwdBase64Encoded) {
        this.keyStoreName = keyStoreName;
        this.keyStoreDescription = keyStoreDescription;
        this.keyStoreType = keyStoreType;
        this.keyStorePassword = keyStorePassword;
        this.uploadFileName = uploadFileName;
        this.fileContent = fileContent;
        this.isPwdBase64Encoded = isPwdBase64Encoded;
    }

    /**
     * The certificate file format of the truststore.
     */
    @AllArgsConstructor
    public enum KeyStoreTypeEnum {
        JKS("JKS");

        private static final KeyStoreTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeyStoreTypeEnum of(String input) {
            if (input != null) {
                for (KeyStoreTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
