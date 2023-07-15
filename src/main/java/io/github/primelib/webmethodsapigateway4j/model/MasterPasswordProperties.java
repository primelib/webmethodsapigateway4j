package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordProperties
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link MasterPasswordProperties}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordProperties(Consumer<MasterPasswordProperties> spec) {
        spec.accept(this);
    }

    /**
     * The remaining number of days for the master password expiration
     */
    @JsonProperty("daysTilExpire")
    protected String daysTilExpire;

    /**
     * The expiry date of the master password.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     */
    @JsonProperty("expireDate")
    protected String expireDate;

    /**
     * The interval(in days) after which the master password would expire
     */
    @JsonProperty("expireInterval")
    protected String expireInterval;

    /**
     * The message which will be returned once the master password is expired
     */
    @JsonProperty("expireMessage")
    protected String expireMessage;

    /**
     * The latest date when the master password was updated.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     */
    @JsonProperty("lastChangeDate")
    protected String lastChangeDate;

    /**
     * The current status of the master password
     */
    @JsonProperty("statusMessage")
    protected String statusMessage;


}
