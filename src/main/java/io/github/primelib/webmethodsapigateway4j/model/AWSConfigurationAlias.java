package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AWSConfigurationAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * The access key ID for the AWS instance. This is used to sign the requests
     */
    @JsonProperty("accessKey")
    private String accessKey;

    /**
     * The configured AWS instance region detail
     */
    @JsonProperty("region")
    private String region;

    /**
     * The secret access key for the AWS instance. This is used to sign the requests
     */
    @JsonProperty("secretKey")
    private String secretKey;


}
