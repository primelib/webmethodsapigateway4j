// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type AdminChangeOwnerRequest struct {
	AssetIDS     []*string `json:"assetIds" form:"name=assetIds,json"`         // List of APIGateway assets for which change owner/team is requested.
	AssetType    *string   `json:"assetType" form:"name=assetType"`            // APIGateway asset type.
	CurrentOwner *string   `json:"currentOwner" form:"name=currentOwner"`      // Current owner of the APIGateway asset.
	CurrentTeams []*string `json:"currentTeams" form:"name=currentTeams,json"` // New teams of the APIGateway asset.
	NewOwner     *string   `json:"newOwner" form:"name=newOwner"`              // New owner of the APIGateway asset.
	NewTeams     []*string `json:"newTeams" form:"name=newTeams,json"`         // Current teams of the APIGateway asset.
	OwnerType    *string   `json:"ownerType" form:"name=ownerType"`            // Type of the new owner of the APIGateway asset. By default, it is user. Possible values are user and team.
}
