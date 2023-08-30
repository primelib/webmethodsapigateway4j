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
 * UpdateTruststoreRequest
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
     * The provider that is used for the truststore type.
     */
    @JsonProperty("keyStoreProvider")
    protected KeyStoreProviderEnum keyStoreProvider;

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
     * Constructs a validated instance of {@link UpdateTruststoreRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateTruststoreRequest(Consumer<UpdateTruststoreRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateTruststoreRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateTruststoreRequest(Consumer)} instead.
     * @param keyStoreDescription The description for the truststore.
     * @param keyStoreType The certificate file format of the truststore.
     * @param keyStoreProvider The provider that is used for the truststore type.
     * @param keyStorePassword The truststore password that is defined at the time of truststore creation using a keystore utility.
     * @param uploadFileName The name of the truststore file that will be used to save the truststore internally in API Gateway.
     * @param fileContent The contents of the truststore file.
     * @param isPwdBase64Encoded Specifies whether password is base 64 encoded.
     */
    @ApiStatus.Internal
    public UpdateTruststoreRequest(String keyStoreDescription, KeyStoreTypeEnum keyStoreType, KeyStoreProviderEnum keyStoreProvider, String keyStorePassword, String uploadFileName, File fileContent, String isPwdBase64Encoded) {
        this.keyStoreDescription = keyStoreDescription;
        this.keyStoreType = keyStoreType;
        this.keyStoreProvider = keyStoreProvider;
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

    /**
     * The provider that is used for the truststore type.
     */
    @AllArgsConstructor
    public enum KeyStoreProviderEnum {
        SUN("SUN");

        private static final KeyStoreProviderEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static KeyStoreProviderEnum of(String input) {
            if (input != null) {
                for (KeyStoreProviderEnum v : VALUES) {
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
