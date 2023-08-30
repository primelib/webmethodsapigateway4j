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
 * Enforcement
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
    "enforcementObjectId",
    "order",
    "parentPolicyId"
})
@JsonTypeName("Enforcement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Enforcement {

    /**
     * Policy enforcement id
     */
    @JsonProperty("enforcementObjectId")
    protected String enforcementObjectId;

    /**
     * enforcement order
     */
    @JsonProperty("order")
    protected String order;

    @JsonProperty("parentPolicyId")
    protected String parentPolicyId;

    /**
     * Constructs a validated instance of {@link Enforcement}.
     *
     * @param spec the specification to process
     */
    public Enforcement(Consumer<Enforcement> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Enforcement}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Enforcement(Consumer)} instead.
     * @param enforcementObjectId Policy enforcement id
     * @param order enforcement order
     * @param parentPolicyId parentPolicyId
     */
    @ApiStatus.Internal
    public Enforcement(String enforcementObjectId, String order, String parentPolicyId) {
        this.enforcementObjectId = enforcementObjectId;
        this.order = order;
        this.parentPolicyId = parentPolicyId;
    }

}
