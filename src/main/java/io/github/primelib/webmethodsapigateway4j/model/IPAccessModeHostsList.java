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
 * IPAccessModeHostsList
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
    "hostsList"
})
@JsonTypeName("IPAccessModeHostsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessModeHostsList {

    @JsonProperty("hostsList")
    protected List<String> hostsList;

    /**
     * Constructs a validated instance of {@link IPAccessModeHostsList}.
     *
     * @param spec the specification to process
     */
    public IPAccessModeHostsList(Consumer<IPAccessModeHostsList> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IPAccessModeHostsList}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IPAccessModeHostsList(Consumer)} instead.
     * @param hostsList hostsList
     */
    @ApiStatus.Internal
    public IPAccessModeHostsList(List<String> hostsList) {
        this.hostsList = hostsList;
    }

}
