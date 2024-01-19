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
 * AccessModeServices
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
    "services"
})
@JsonTypeName("AccessModeServices")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessModeServices {

    @JsonProperty("services")
    protected List<String> services;

    /**
     * Constructs a validated instance of {@link AccessModeServices}.
     *
     * @param spec the specification to process
     */
    public AccessModeServices(Consumer<AccessModeServices> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccessModeServices}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccessModeServices(Consumer)} instead.
     * @param services services
     */
    @ApiStatus.Internal
    public AccessModeServices(List<String> services) {
        this.services = services;
    }

}
