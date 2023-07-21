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
 * BitSet
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
    "empty"
})
@JsonTypeName("BitSet")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BitSet {

    @JsonProperty("empty")
    protected Boolean empty;

    /**
     * Constructs a validated instance of {@link BitSet}.
     *
     * @param spec the specification to process
     */
    public BitSet(Consumer<BitSet> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BitSet}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BitSet(Consumer)} instead.
     * @param empty var.name
     */
    @ApiStatus.Internal
    public BitSet(Boolean empty) {
        this.empty = empty;
    }

}
