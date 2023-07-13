package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordUpdate
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "newPassword",
    "oldPassword"
})
@JsonTypeName("MasterPasswordUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordUpdate {

    /**
     * This is the base64 encoded value of the new master password
     */
    @JsonProperty("newPassword")
    private String newPassword;

    /**
     * This is the base64 encoded value of the old master password
     */
    @JsonProperty("oldPassword")
    private String oldPassword;


}
