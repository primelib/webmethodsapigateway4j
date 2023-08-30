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
 * PlanGetAllResponse
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
    "planResponse"
})
@JsonTypeName("PlanGetAllResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PlanGetAllResponse {

    @JsonProperty("planResponse")
    protected List<Plan> planResponse;

    /**
     * Constructs a validated instance of {@link PlanGetAllResponse}.
     *
     * @param spec the specification to process
     */
    public PlanGetAllResponse(Consumer<PlanGetAllResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PlanGetAllResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PlanGetAllResponse(Consumer)} instead.
     * @param planResponse planResponse
     */
    @ApiStatus.Internal
    public PlanGetAllResponse(List<Plan> planResponse) {
        this.planResponse = planResponse;
    }

}
