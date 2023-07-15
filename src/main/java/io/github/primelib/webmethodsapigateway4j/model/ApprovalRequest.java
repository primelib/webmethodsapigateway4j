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
 * ApprovalRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "approvalEvent",
    "approvers",
    "approversGroupId",
    "created",
    "id",
    "mode",
    "requesterComment",
    "requestorFirstName",
    "requestorId",
    "requestorLastName",
    "requestorMail",
    "requestorName",
    "status"
})
@JsonTypeName("ApprovalRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApprovalRequest {

    /**
     * Constructs a validated implementation of {@link ApprovalRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApprovalRequest(Consumer<ApprovalRequest> spec) {
        spec.accept(this);
    }

    /**
     * Type of the approval event
     */
    @JsonProperty("approvalEvent")
    protected ApprovalEventEnum approvalEvent;

    @JsonProperty("approvers")
    protected List<Approver> approvers;

    /**
     * Approvers Accessprofile Identifier. Whoever belongs to the selected team will be considered as Approvers
     */
    @JsonProperty("approversGroupId")
    protected String approversGroupId;

    /**
     * Approval last updated time
     */
    @JsonProperty("created")
    protected String created;

    @JsonProperty("id")
    protected String id;

    /**
     * Mode of the request approval and 'anyone' is the only allowed value
     */
    @JsonProperty("mode")
    protected String mode;

    /**
     * Comment added by the requestor
     */
    @JsonProperty("requesterComment")
    protected String requesterComment;

    /**
     * First name of the requestor user name
     */
    @JsonProperty("requestorFirstName")
    protected String requestorFirstName;

    /**
     * User name of the requestor
     */
    @JsonProperty("requestorId")
    protected String requestorId;

    /**
     * Last name of the requestor user name
     */
    @JsonProperty("requestorLastName")
    protected String requestorLastName;

    /**
     * Mail id of the requestor
     */
    @JsonProperty("requestorMail")
    protected String requestorMail;

    /**
     * User name of the requestor
     */
    @JsonProperty("requestorName")
    protected String requestorName;

    /**
     * Current status of the request
     */
    @JsonProperty("status")
    protected StatusEnum status;


    /**
     * Type of the approval event
     */
    @AllArgsConstructor
    public enum ApprovalEventEnum {
        CREATEAPPLICATION("createApplication"),
        UPDATEAPPLICATION("updateApplication"),
        REGISTERAPPLICATION("registerApplication"),
        SUBSCRIBEPACKAGE("subscribePackage"),
        CHANGEOWNER("changeOwner");

        private final String value;
    }

    /**
     * Current status of the request
     */
    @AllArgsConstructor
    public enum StatusEnum {
        PENDING("pending"),
        APPROVED("approved"),
        REJECTED("rejected");

        private final String value;
    }

}
