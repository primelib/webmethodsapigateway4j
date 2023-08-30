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
 * Version
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
    "apiId",
    "versionNumber"
})
@JsonTypeName("Version")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Version {

    @JsonProperty("apiId")
    protected String apiId;

    @JsonProperty("versionNumber")
    protected String versionNumber;

    /**
     * Constructs a validated instance of {@link Version}.
     *
     * @param spec the specification to process
     */
    public Version(Consumer<Version> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Version}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Version(Consumer)} instead.
     * @param apiId apiId
     * @param versionNumber versionNumber
     */
    @ApiStatus.Internal
    public Version(String apiId, String versionNumber) {
        this.apiId = apiId;
        this.versionNumber = versionNumber;
    }

}
