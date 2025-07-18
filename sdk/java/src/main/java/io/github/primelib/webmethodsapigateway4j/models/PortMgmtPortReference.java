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
 * PortMgmtPortReference
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("PortMgmtPortReference")
@JsonPropertyOrder({
    "listenerKey",
    "pkg"
})
@Generated(value = "io.github.primelib.primecodegen")
public class PortMgmtPortReference {

    @JsonProperty("listenerKey")
    protected String listenerKey;

    @JsonProperty("pkg")
    protected String pkg;

    /**
     * Constructs a validated instance of {@link PortMgmtPortReference}.
     *
     * @param spec the specification to process
     */
    public PortMgmtPortReference(Consumer<PortMgmtPortReference> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortMgmtPortReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortMgmtPortReference(Consumer)} instead.
     * @param listenerKey listenerKey
     * @param pkg pkg
     */
    @ApiStatus.Internal
    public PortMgmtPortReference(String listenerKey, String pkg) {
        this.listenerKey = listenerKey;
        this.pkg = pkg;
    }
}
