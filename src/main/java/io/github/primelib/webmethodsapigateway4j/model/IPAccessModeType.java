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
 * IPAccessModeType
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
    "ipAccessType"
})
@JsonTypeName("IPAccessModeType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessModeType {

    @JsonProperty("ipAccessType")
    protected String ipAccessType;

    /**
     * Constructs a validated instance of {@link IPAccessModeType}.
     *
     * @param spec the specification to process
     */
    public IPAccessModeType(Consumer<IPAccessModeType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IPAccessModeType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IPAccessModeType(Consumer)} instead.
     * @param ipAccessType ipAccessType
     */
    @ApiStatus.Internal
    public IPAccessModeType(String ipAccessType) {
        this.ipAccessType = ipAccessType;
    }

}
