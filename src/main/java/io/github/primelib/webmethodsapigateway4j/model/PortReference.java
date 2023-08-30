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
 * PortReference
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
    "listenerKey",
    "pkg"
})
@JsonTypeName("PortReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortReference {

    @JsonProperty("listenerKey")
    protected String listenerKey;

    @JsonProperty("pkg")
    protected String pkg;

    /**
     * Constructs a validated instance of {@link PortReference}.
     *
     * @param spec the specification to process
     */
    public PortReference(Consumer<PortReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortReference(Consumer)} instead.
     * @param listenerKey listenerKey
     * @param pkg pkg
     */
    @ApiStatus.Internal
    public PortReference(String listenerKey, String pkg) {
        this.listenerKey = listenerKey;
        this.pkg = pkg;
    }

}
