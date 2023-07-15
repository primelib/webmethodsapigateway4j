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
 * ApprovalResponsePayload
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "approvalRequests"
})
@JsonTypeName("ApprovalResponsePayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalResponsePayload {

    /**
     * Constructs a validated implementation of {@link ApprovalResponsePayload}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApprovalResponsePayload(Consumer<ApprovalResponsePayload> spec) {
        spec.accept(this);
    }

    @JsonProperty("approvalRequests")
    protected List<ApprovalRequest> approvalRequests;


}
