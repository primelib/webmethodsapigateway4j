package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AWSConfigurationAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accessKey",
    "region",
    "secretKey"
})
@JsonTypeName("AWSConfigurationAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AWSConfigurationAlias extends Alias {

    /**
     * The access key ID for the AWS instance. This is used to sign the requests
     */
    @JsonProperty("accessKey")
    protected String accessKey;

    /**
     * The configured AWS instance region detail
     */
    @JsonProperty("region")
    protected String region;

    /**
     * The secret access key for the AWS instance. This is used to sign the requests
     */
    @JsonProperty("secretKey")
    protected String secretKey;

    /**
     * Constructs a validated instance of {@link AWSConfigurationAlias}.
     *
     * @param spec the specification to process
     */
    public AWSConfigurationAlias(Consumer<AWSConfigurationAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AWSConfigurationAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AWSConfigurationAlias(Consumer)} instead.
     * @param accessKey The access key ID for the AWS instance. This is used to sign the requests
     * @param region The configured AWS instance region detail
     * @param secretKey The secret access key for the AWS instance. This is used to sign the requests
     */
    @ApiStatus.Internal
    public AWSConfigurationAlias(String accessKey, String region, String secretKey) {
        this.accessKey = accessKey;
        this.region = region;
        this.secretKey = secretKey;
    }

}
