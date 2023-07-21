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
 * ApprovalPutRequest
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
    "approverComment"
})
@JsonTypeName("ApprovalPutRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalPutRequest {

    /**
     * Comment added by the approver
     */
    @JsonProperty("approverComment")
    protected String approverComment;

    /**
     * Constructs a validated instance of {@link ApprovalPutRequest}.
     *
     * @param spec the specification to process
     */
    public ApprovalPutRequest(Consumer<ApprovalPutRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApprovalPutRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApprovalPutRequest(Consumer)} instead.
     * @param approverComment Comment added by the approver
     */
    @ApiStatus.Internal
    public ApprovalPutRequest(String approverComment) {
        this.approverComment = approverComment;
    }

}
