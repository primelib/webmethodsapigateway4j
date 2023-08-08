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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ApprovalRequest
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
     * Constructs a validated instance of {@link ApprovalRequest}.
     *
     * @param spec the specification to process
     */
    public ApprovalRequest(Consumer<ApprovalRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApprovalRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApprovalRequest(Consumer)} instead.
     * @param approvalEvent Type of the approval event
     * @param approvers approvers
     * @param approversGroupId Approvers Accessprofile Identifier. Whoever belongs to the selected team will be considered as Approvers
     * @param created Approval last updated time
     * @param id id
     * @param mode Mode of the request approval and 'anyone' is the only allowed value
     * @param requesterComment Comment added by the requestor
     * @param requestorFirstName First name of the requestor user name
     * @param requestorId User name of the requestor
     * @param requestorLastName Last name of the requestor user name
     * @param requestorMail Mail id of the requestor
     * @param requestorName User name of the requestor
     * @param status Current status of the request
     */
    @ApiStatus.Internal
    public ApprovalRequest(ApprovalEventEnum approvalEvent, List<Approver> approvers, String approversGroupId, String created, String id, String mode, String requesterComment, String requestorFirstName, String requestorId, String requestorLastName, String requestorMail, String requestorName, StatusEnum status) {
        this.approvalEvent = approvalEvent;
        this.approvers = approvers;
        this.approversGroupId = approversGroupId;
        this.created = created;
        this.id = id;
        this.mode = mode;
        this.requesterComment = requesterComment;
        this.requestorFirstName = requestorFirstName;
        this.requestorId = requestorId;
        this.requestorLastName = requestorLastName;
        this.requestorMail = requestorMail;
        this.requestorName = requestorName;
        this.status = status;
    }

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

        private static final ApprovalEventEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ApprovalEventEnum of(String input) {
            if (input != null) {
                for (ApprovalEventEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * Current status of the request
     */
    @AllArgsConstructor
    public enum StatusEnum {
        PENDING("pending"),
        APPROVED("approved"),
        REJECTED("rejected");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
