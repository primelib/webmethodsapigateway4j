package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AWSConfigurationAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "accessKey",
    "region",
    "secretKey"
})
@JsonTypeName("AWSConfigurationAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AWSConfigurationAlias extends Alias {

    /**
     * Constructs a validated implementation of {@link AWSConfigurationAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AWSConfigurationAlias(Consumer<AWSConfigurationAlias> spec) {
        spec.accept(this);
    }

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


}
