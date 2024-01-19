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
 * APIPortal
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("APIPortal")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIPortal extends ExternalPortal {

    /**
     * API Portal type.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link APIPortal}.
     *
     * @param spec the specification to process
     */
    public APIPortal(Consumer<APIPortal> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIPortal}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIPortal(Consumer)} instead.
     * @param type API Portal type.
     */
    @ApiStatus.Internal
    public APIPortal(String type) {
        this.type = type;
    }

}
