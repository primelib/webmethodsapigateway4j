package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "versionNumber"
})
@JsonTypeName("Version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Version {

    /**
     * Constructs a validated implementation of {@link Version}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Version(Consumer<Version> spec) {
        spec.accept(this);
    }

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("versionNumber")
    protected String versionNumber;


}
