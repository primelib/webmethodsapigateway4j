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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MasterPasswordProperties
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

    /**
     * Constructs a validated instance of {@link MasterPasswordProperties}.
     *
     * @param spec the specification to process
     */
    public MasterPasswordProperties(Consumer<MasterPasswordProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MasterPasswordProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MasterPasswordProperties(Consumer)} instead.
     * @param daysTilExpire The remaining number of days for the master password expiration
     * @param expireDate The expiry date of the master password.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     * @param expireInterval The interval(in days) after which the master password would expire
     * @param expireMessage The message which will be returned once the master password is expired
     * @param lastChangeDate The latest date when the master password was updated.The format for this field would be YYYY-MM-DD HH:mm:ssZ
     * @param statusMessage The current status of the master password
     */
    @ApiStatus.Internal
    public MasterPasswordProperties(String daysTilExpire, String expireDate, String expireInterval, String expireMessage, String lastChangeDate, String statusMessage) {
        this.daysTilExpire = daysTilExpire;
        this.expireDate = expireDate;
        this.expireInterval = expireInterval;
        this.expireMessage = expireMessage;
        this.lastChangeDate = lastChangeDate;
        this.statusMessage = statusMessage;
    }

}
