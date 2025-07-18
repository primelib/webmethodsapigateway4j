// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type AdminGatewayCacheConfig struct {
	AutoScale          *bool               `json:"autoScale" form:"name=autoScale"` // Specifies whether to auto scale caching dynamically
	CacheName          *string             `json:"cacheName" form:"name=cacheName"`
	CacheSizeInPercent *int32              `json:"cacheSizeInPercent" form:"name=cacheSizeInPercent"` // Specifies the caching size in percentage
	CacheableType      *AdminCacheableType `json:"cacheableType" form:"name=cacheableType,json"`
	CollectStatistics  *bool               `json:"collectStatistics" form:"name=collectStatistics"` // Specifies whether to collect statistics for the caching
	RecordCount        *int32              `json:"recordCount" form:"name=recordCount"`
}
