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
 * ChangeOwnerRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ChangeOwnerRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeOwnerRequest(Consumer<ChangeOwnerRequest> spec) {
        spec.accept(this);
    }

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
     * Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
     */
    @AllArgsConstructor
    public enum OwnerTypeEnum {
        USER("user"),
        TEAM("team");

        private final String value;
    }

}
