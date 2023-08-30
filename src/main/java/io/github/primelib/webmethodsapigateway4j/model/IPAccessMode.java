package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * IPAccessMode
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
    "ipAccessModeHostsList",
    "ipAccessModeType"
})
@JsonTypeName("IPAccessMode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessMode {

    @JsonProperty("ipAccessModeHostsList")
    protected IPAccessModeHostsList ipAccessModeHostsList;

    @JsonProperty("ipAccessModeType")
    protected IPAccessModeType ipAccessModeType;

    /**
     * Constructs a validated instance of {@link IPAccessMode}.
     *
     * @param spec the specification to process
     */
    public IPAccessMode(Consumer<IPAccessMode> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IPAccessMode}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IPAccessMode(Consumer)} instead.
     * @param ipAccessModeHostsList ipAccessModeHostsList
     * @param ipAccessModeType ipAccessModeType
     */
    @ApiStatus.Internal
    public IPAccessMode(IPAccessModeHostsList ipAccessModeHostsList, IPAccessModeType ipAccessModeType) {
        this.ipAccessModeHostsList = ipAccessModeHostsList;
        this.ipAccessModeType = ipAccessModeType;
    }

}
