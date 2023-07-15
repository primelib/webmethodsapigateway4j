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
 * ApprovalPutRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "approverComment"
})
@JsonTypeName("ApprovalPutRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalPutRequest {

    /**
     * Constructs a validated implementation of {@link ApprovalPutRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApprovalPutRequest(Consumer<ApprovalPutRequest> spec) {
        spec.accept(this);
    }

    /**
     * Comment added by the approver
     */
    @JsonProperty("approverComment")
    protected String approverComment;


}
