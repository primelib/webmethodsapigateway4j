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
 * AccessMode
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
    "accessModeSevices",
    "accessModeType"
})
@JsonTypeName("AccessMode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessMode {

    @JsonProperty("accessModeSevices")
    protected AccessModeServices accessModeSevices;

    @JsonProperty("accessModeType")
    protected AccessModeType accessModeType;

    /**
     * Constructs a validated instance of {@link AccessMode}.
     *
     * @param spec the specification to process
     */
    public AccessMode(Consumer<AccessMode> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccessMode}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccessMode(Consumer)} instead.
     * @param accessModeSevices accessModeSevices
     * @param accessModeType accessModeType
     */
    @ApiStatus.Internal
    public AccessMode(AccessModeServices accessModeSevices, AccessModeType accessModeType) {
        this.accessModeSevices = accessModeSevices;
        this.accessModeType = accessModeType;
    }

}
