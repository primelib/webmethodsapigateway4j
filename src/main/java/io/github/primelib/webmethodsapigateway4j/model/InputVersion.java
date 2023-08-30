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
 * InputVersion
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
    "newApiVersion",
    "retainApplications"
})
@JsonTypeName("InputVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputVersion {

    @JsonProperty("newApiVersion")
    protected String newApiVersion;

    @JsonProperty("retainApplications")
    protected Boolean retainApplications;

    /**
     * Constructs a validated instance of {@link InputVersion}.
     *
     * @param spec the specification to process
     */
    public InputVersion(Consumer<InputVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputVersion(Consumer)} instead.
     * @param newApiVersion newApiVersion
     * @param retainApplications retainApplications
     */
    @ApiStatus.Internal
    public InputVersion(String newApiVersion, Boolean retainApplications) {
        this.newApiVersion = newApiVersion;
        this.retainApplications = retainApplications;
    }

}
