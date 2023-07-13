package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordExpiryIntervalResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "message",
    "result"
})
@JsonTypeName("MasterPasswordExpiryIntervalResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordExpiryIntervalResponse {

    /**
     * The response message from the server when the master password expiry interval is updated
     */
    @JsonProperty("message")
    private String message;

    /**
     * This is the updated master password expiry interval(in days)
     */
    @JsonProperty("result")
    private String result;


}
