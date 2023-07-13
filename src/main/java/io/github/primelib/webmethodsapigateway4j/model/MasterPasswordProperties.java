package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordProperties
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "daysTilExpire",
    "expireDate",
    "expireInterval",
    "expireMessage",
    "lastChangeDate",
    "statusMessage"
})
@JsonTypeName("MasterPasswordProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordProperties {

    /**
     * The remaining number of days for the master password expiration
     */
    @JsonProperty("daysTilExpire")
    private String daysTilExpire;

    /**
     * The expiry date of the master password.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     */
    @JsonProperty("expireDate")
    private String expireDate;

    /**
     * The interval(in days) after which the master password would expire
     */
    @JsonProperty("expireInterval")
    private String expireInterval;

    /**
     * The message which will be returned once the master password is expired
     */
    @JsonProperty("expireMessage")
    private String expireMessage;

    /**
     * The latest date when the master password was updated.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     */
    @JsonProperty("lastChangeDate")
    private String lastChangeDate;

    /**
     * The current status of the master password
     */
    @JsonProperty("statusMessage")
    private String statusMessage;


}
