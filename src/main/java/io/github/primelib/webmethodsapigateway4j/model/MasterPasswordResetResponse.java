package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordResetResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "handleCount",
    "message"
})
@JsonTypeName("MasterPasswordResetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordResetResponse {

    /**
     * The number of passwords that are updated during master password reset
     */
    @JsonProperty("handleCount")
    private String handleCount;

    /**
     * The response message from the server when the master password is reset
     */
    @JsonProperty("message")
    private String message;


}
