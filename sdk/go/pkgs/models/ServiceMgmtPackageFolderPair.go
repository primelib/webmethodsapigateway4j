// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ServiceMgmtPackageFolderPair struct {
	APIDEscriptorNsnameMap *APIDEscriptorNsnameMap `json:"apiDescriptorNSNameMap" form:"name=apiDescriptorNSNameMap,json"`
	FolderName             *string                 `json:"folderName" form:"name=folderName"`
	MarkedAsDeleted        *bool                   `json:"markedAsDeleted" form:"name=markedAsDeleted"`
	PackageName            *string                 `json:"packageName" form:"name=packageName"`
}
