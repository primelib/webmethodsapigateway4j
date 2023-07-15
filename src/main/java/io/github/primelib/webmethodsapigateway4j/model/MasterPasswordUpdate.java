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
 * MasterPasswordUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "newPassword",
    "oldPassword"
})
@JsonTypeName("MasterPasswordUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordUpdate {

    /**
     * Constructs a validated implementation of {@link MasterPasswordUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordUpdate(Consumer<MasterPasswordUpdate> spec) {
        spec.accept(this);
    }

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


}
