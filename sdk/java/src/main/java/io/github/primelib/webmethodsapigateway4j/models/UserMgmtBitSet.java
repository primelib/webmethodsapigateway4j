// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * UserMgmtBitSet
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("UserMgmtBitSet")
@JsonPropertyOrder({
    "empty"
})
@Generated(value = "io.github.primelib.primecodegen")
public class UserMgmtBitSet {

    @JsonProperty("empty")
    protected Boolean empty;

    /**
     * Constructs a validated instance of {@link UserMgmtBitSet}.
     *
     * @param spec the specification to process
     */
    public UserMgmtBitSet(Consumer<UserMgmtBitSet> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserMgmtBitSet}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserMgmtBitSet(Consumer)} instead.
     * @param empty empty
     */
    @ApiStatus.Internal
    public UserMgmtBitSet(Boolean empty) {
        this.empty = empty;
    }
}
