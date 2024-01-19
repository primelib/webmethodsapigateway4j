package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * SimpleAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("SimpleAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleAlias extends Alias {

    /**
     * value of the simple alias
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link SimpleAlias}.
     *
     * @param spec the specification to process
     */
    public SimpleAlias(Consumer<SimpleAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleAlias(Consumer)} instead.
     * @param value value of the simple alias
     */
    @ApiStatus.Internal
    public SimpleAlias(String value) {
        this.value = value;
    }

}
