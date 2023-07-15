package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private List<String> assetIds;

    /**
     * APIGateway asset type.
     */
    @JsonProperty("assetType")
    private String assetType;

    /**
     * Current owner of the APIGateway asset.
     */
    @JsonProperty("currentOwner")
    private String currentOwner;

    /**
     * New teams of the APIGateway asset.
     */
    @JsonProperty("currentTeams")
    private List<String> currentTeams;

    /**
     * New owner of the APIGateway asset.
     */
    @JsonProperty("newOwner")
    private String newOwner;

    /**
     * Current teams of the APIGateway asset.
     */
    @JsonProperty("newTeams")
    private List<String> newTeams;

    /**
     * Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
     */
    @JsonProperty("ownerType")
    private OwnerTypeEnum ownerType;


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
