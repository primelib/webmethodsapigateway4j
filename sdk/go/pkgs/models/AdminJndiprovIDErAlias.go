// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

// AdminJndiprovIDErAlias This model contains JNDI configuration details

type AdminJndiprovIDErAlias struct {
	Description             *string `json:"description" form:"name=description"`                         // The description of the JNDIProviderAlias configuration
	InitialContextFactory   *string `json:"initialContextFactory" form:"name=initialContextFactory"`     // The IntialContextFactoryName for JNDI lookup
	IsSsl                   *string `json:"isSSL" form:"name=isSSL"`                                     // Secure communication between Integration Server and the JNDI provider
	JndiAliasName           *string `json:"jndiAliasName" form:"name=jndiAliasName"`                     // The name of the JNDIProviderAlias configuration
	JndiProvIDErAliasId     *string `json:"jndiProviderAliasId" form:"name=jndiProviderAliasId"`         // A unique ID for the jndiProviderAlias
	KeyAlias                *string `json:"keyAlias" form:"name=keyAlias"`                               // The alias to the key that contains the private key for connecting to the JNDI provider.
	KeyStoreAlias           *string `json:"keyStoreAlias" form:"name=keyStoreAlias"`                     // The alias for the keystore that contains the client certificates for Integration Server to use when connecting to the JNDI provider.
	KeyStoreFormatProp      *string `json:"keyStoreFormatProp" form:"name=keyStoreFormatProp"`           // The JNDI property name for storing the keystore format.
	KeyStoreProp            *string `json:"keyStoreProp" form:"name=keyStoreProp"`                       // The JNDI property name for storing the keystore location.
	KeyStorePwdProp         *string `json:"keyStorePwdProp" form:"name=keyStorePwdProp"`                 // The JNDI property name for storing the keystore password.
	OtherProps              *string `json:"otherProps" form:"name=otherProps"`                           // Any other properties you would like to mention, Provide the values as comma separated
	PrivateKeyProp          *string `json:"privateKeyProp" form:"name=privateKeyProp"`                   // The JNDI property name for storing the private key name.
	ProvIDErUrl             *string `json:"providerURL" form:"name=providerURL"`                         // Message broker details
	ProvIDErUrlfailoverList *string `json:"providerURLFailoverList" form:"name=providerURLFailoverList"` // Fall backs URL's of providerURL
	SecurityCredentials     *string `json:"securityCredentials" form:"name=securityCredentials"`         // securityCredentials in case of SSL connection
	SecurityPrincipal       *string `json:"securityPrincipal" form:"name=securityPrincipal"`             // SecurityPrincipal in case of SSL connection
	TrustStoreAlias         *string `json:"trustStoreAlias" form:"name=trustStoreAlias"`                 // The alias for the truststore that contains the certificates of the Certificate Authority (CA) for the JNDI provider.
	TrustStoreProp          *string `json:"trustStoreProp" form:"name=trustStoreProp"`                   // The JNDI property name for storing the truststore location.
	TrustStorePwdProp       *string `json:"trustStorePwdProp" form:"name=trustStorePwdProp"`             // The JNDI property name for storing the truststore password.
}
