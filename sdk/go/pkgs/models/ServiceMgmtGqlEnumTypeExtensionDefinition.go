// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtGqlEnumTypeExtensionDefinition struct {
	Comments             []*ServiceMgmtGqlComment             `json:"comments" form:"name=comments,json"` // List of comments
	Description          *ServiceMgmtGqlDescription           `json:"description" form:"name=description,json"`
	Directives           []*ServiceMgmtGqlDirective           `json:"directives" form:"name=directives,json"` // List of directives
	DirectivesByName     *DirectivesByName                    `json:"directivesByName" form:"name=directivesByName,json"`
	EnumValueDefinitions []*ServiceMgmtGqlEnumValueDefinition `json:"enumValueDefinitions" form:"name=enumValueDefinitions,json"` // List of enum value definition
	Name                 *string                              `json:"name" form:"name=name"`                                      // Name of the enum type definition
}
