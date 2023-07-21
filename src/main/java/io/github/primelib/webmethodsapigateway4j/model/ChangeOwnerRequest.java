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

/**
 * ChangeOwnerRequest
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
    "assetIds",
    "assetType",
    "currentOwner",
    "currentTeams",
    "newOwner",
    "newTeams",
    "ownerType"
})
@JsonTypeName("ChangeOwnerRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeOwnerRequest {

    /**
     * List of APIGateway assets for which change owner/team is requested.
     */
    @JsonProperty("assetIds")
    protected List<String> assetIds;

    /**
     * APIGateway asset type.
     */
    @JsonProperty("assetType")
    protected String assetType;

    /**
     * Current owner of the APIGateway asset.
     */
    @JsonProperty("currentOwner")
    protected String currentOwner;

    /**
     * New teams of the APIGateway asset.
     */
    @JsonProperty("currentTeams")
    protected List<String> currentTeams;

    /**
     * New owner of the APIGateway asset.
     */
    @JsonProperty("newOwner")
    protected String newOwner;

    /**
     * Current teams of the APIGateway asset.
     */
    @JsonProperty("newTeams")
    protected List<String> newTeams;

    /**
     * Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
     */
    @JsonProperty("ownerType")
    protected OwnerTypeEnum ownerType;

    /**
     * Constructs a validated instance of {@link ChangeOwnerRequest}.
     *
     * @param spec the specification to process
     */
    public ChangeOwnerRequest(Consumer<ChangeOwnerRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeOwnerRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeOwnerRequest(Consumer)} instead.
     * @param assetIds List of APIGateway assets for which change owner/team is requested.
     * @param assetType APIGateway asset type.
     * @param currentOwner Current owner of the APIGateway asset.
     * @param currentTeams New teams of the APIGateway asset.
     * @param newOwner New owner of the APIGateway asset.
     * @param newTeams Current teams of the APIGateway asset.
     * @param ownerType Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
     */
    @ApiStatus.Internal
    public ChangeOwnerRequest(List<String> assetIds, String assetType, String currentOwner, List<String> currentTeams, String newOwner, List<String> newTeams, OwnerTypeEnum ownerType) {
        this.assetIds = assetIds;
        this.assetType = assetType;
        this.currentOwner = currentOwner;
        this.currentTeams = currentTeams;
        this.newOwner = newOwner;
        this.newTeams = newTeams;
        this.ownerType = ownerType;
    }

    /**
     * Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
     */
    @AllArgsConstructor
    public enum OwnerTypeEnum {
        USER("user"),
        TEAM("team");

        private final String value;
    }

}
