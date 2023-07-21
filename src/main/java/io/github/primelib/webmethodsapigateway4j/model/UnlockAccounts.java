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
 * UnlockAccounts
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
    "userName"
})
@JsonTypeName("UnlockAccounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnlockAccounts {

    /**
     * Username that needs to be unlocked.
     */
    @JsonProperty("userName")
    protected List<String> userName;

    /**
     * Constructs a validated instance of {@link UnlockAccounts}.
     *
     * @param spec the specification to process
     */
    public UnlockAccounts(Consumer<UnlockAccounts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UnlockAccounts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UnlockAccounts(Consumer)} instead.
     * @param userName Username that needs to be unlocked.
     */
    @ApiStatus.Internal
    public UnlockAccounts(List<String> userName) {
        this.userName = userName;
    }

}
