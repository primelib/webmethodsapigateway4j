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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LockedAccounts
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
    "lockedAccounts"
})
@JsonTypeName("LockedAccounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LockedAccounts {

    /**
     * Comma separated list of user accounts which are locked.
     */
    @JsonProperty("lockedAccounts")
    protected List<String> lockedAccounts;

    /**
     * Constructs a validated instance of {@link LockedAccounts}.
     *
     * @param spec the specification to process
     */
    public LockedAccounts(Consumer<LockedAccounts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LockedAccounts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LockedAccounts(Consumer)} instead.
     * @param lockedAccounts Comma separated list of user accounts which are locked.
     */
    @ApiStatus.Internal
    public LockedAccounts(List<String> lockedAccounts) {
        this.lockedAccounts = lockedAccounts;
    }

}
