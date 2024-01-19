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
 * Listeners
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
    "listeners"
})
@JsonTypeName("Listeners")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Listeners {

    @JsonProperty("listeners")
    protected List<Port> listeners;

    /**
     * Constructs a validated instance of {@link Listeners}.
     *
     * @param spec the specification to process
     */
    public Listeners(Consumer<Listeners> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Listeners}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Listeners(Consumer)} instead.
     * @param listeners listeners
     */
    @ApiStatus.Internal
    public Listeners(List<Port> listeners) {
        this.listeners = listeners;
    }

}
