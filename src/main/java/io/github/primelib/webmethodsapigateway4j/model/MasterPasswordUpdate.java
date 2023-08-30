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
 * MasterPasswordUpdate
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
    protected String newPassword;

    /**
     * This is the base64 encoded value of the old master password
     */
    @JsonProperty("oldPassword")
    protected String oldPassword;

    /**
     * Constructs a validated instance of {@link MasterPasswordUpdate}.
     *
     * @param spec the specification to process
     */
    public MasterPasswordUpdate(Consumer<MasterPasswordUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MasterPasswordUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MasterPasswordUpdate(Consumer)} instead.
     * @param newPassword This is the base64 encoded value of the new master password
     * @param oldPassword This is the base64 encoded value of the old master password
     */
    @ApiStatus.Internal
    public MasterPasswordUpdate(String newPassword, String oldPassword) {
        this.newPassword = newPassword;
        this.oldPassword = oldPassword;
    }

}
