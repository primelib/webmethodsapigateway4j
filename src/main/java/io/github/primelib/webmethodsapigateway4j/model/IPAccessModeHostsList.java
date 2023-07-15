package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IPAccessModeHostsList
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hostsList"
})
@JsonTypeName("IPAccessModeHostsList")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IPAccessModeHostsList {

    /**
     * Constructs a validated implementation of {@link IPAccessModeHostsList}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IPAccessModeHostsList(Consumer<IPAccessModeHostsList> spec) {
        spec.accept(this);
    }

    @JsonProperty("hostsList")
    protected List<String> hostsList;


}
