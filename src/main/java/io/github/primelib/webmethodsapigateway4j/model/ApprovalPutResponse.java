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
 * ApprovalPutResponse
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
    "status"
})
@JsonTypeName("ApprovalPutResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalPutResponse {

    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link ApprovalPutResponse}.
     *
     * @param spec the specification to process
     */
    public ApprovalPutResponse(Consumer<ApprovalPutResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApprovalPutResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApprovalPutResponse(Consumer)} instead.
     * @param status var.name
     */
    @ApiStatus.Internal
    public ApprovalPutResponse(String status) {
        this.status = status;
    }

}
