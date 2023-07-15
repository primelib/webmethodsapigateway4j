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
 * PlanGetResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "planResponse"
})
@JsonTypeName("PlanGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PlanGetResponse {

    /**
     * Constructs a validated implementation of {@link PlanGetResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PlanGetResponse(Consumer<PlanGetResponse> spec) {
        spec.accept(this);
    }

    @JsonProperty("planResponse")
    protected Plan planResponse;


}
