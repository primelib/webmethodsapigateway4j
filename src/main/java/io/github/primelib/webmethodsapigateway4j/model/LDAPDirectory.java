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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LDAPDirectory
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
    "Distinguished Name (DN) method",
    "dnPrefix",
    "dnSuffix",
    "group",
    "groupIdProperty",
    "groupRootDN",
    "index",
    "memberAttribute",
    "password",
    "poolMax",
    "poolMin",
    "principal",
    "timeout",
    "uidProp",
    "url",
    "userEmailAttribute",
    "userRootDn"
})
@JsonTypeName("LDAPDirectory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LDAPDirectory {

    /**
     * Specifies the DN method used for building the DN. Possible values are 'true' and 'false'.Select 'true' if the DN should be synthesized from the configured prefix and suffix values (Synthesize DN Method). These values are prefixed and suffixed to the username to build the DN. Select 'false' if the DN should be queried from a specified root directory (Query DN Method). The Synthesize DN method can be faster than the Query DN method because it does not perform a query against the LDAP directory. However, if your LDAP system does not contain all users in a single flat structure, use the Query DN method instead.
     */
    @JsonProperty("Distinguished Name (DN) method")
    protected Boolean distinguishedNameDNMethod;

    /**
     * A string that specifies the beginning of a DN you want to pass to the LDAP server. This field is applicable when 'useaf' is configured as 'true'. i.e, Synthesize DN Method is chosen.For example, if the prefix is 'cn=' and the suffix is ',ou=Users' and a user logs in specifying 'bob', API Gateway builds the DN 'cn=bob,ou=Users' and sends it to the LDAP server for authentication.
     */
    @JsonProperty("dnPrefix")
    protected String dnPrefix;

    /**
     * A string that specifies the end of a DN you want to pass to the LDAP server. This field is applicable when 'useaf' is configured as 'true'. i.e, Synthesize DN Method is chosen.For example, if the prefix is 'cn=' and the suffix is ',ou=Users' and a user logs in specifying 'bob', API Gateway builds the DN 'cn=bob,ou=Users' and sends it to the LDAP server for authentication.
     */
    @JsonProperty("dnSuffix")
    protected String dnSuffix;

    /**
     * An API Gateway group with which the user is associated. The user is allowed to access services that members of this API Gateway group can access. This access is controlled by the teams with which the group is associated. If you also specify a value in the 'memberAttribute' field, the user has the same access as members of the API Gateway group and members of LDAP groups that have been mapped to an API Gateway team.
     */
    @JsonProperty("group")
    protected String group;

    /**
     * A property that identifies an LDAP group, such as CN. This field is required.
     */
    @JsonProperty("groupIdProperty")
    protected String groupIdProperty;

    /**
     * The full distinguished name. For example, if you specify 'ou=groups,webMethods,dc=com', API Gateway will issue a query that will display all the LDAP groups. This field is required.
     */
    @JsonProperty("groupRootDN")
    protected String groupRootDN;

    /**
     * Index of the current LDAP directory. Priority of the LDAP directory among other directories is calculated using the index. The starting value of index for the LDAP directory with first priority is 0 and is incremented by 1 for subsequent LDAP directories.
     */
    @JsonProperty("index")
    protected Integer index;

    /**
     * The name of the attribute in a group's directory entry that identifies each member of the group. This value is usually 'member' or 'uniqueMember', but can vary depending on the schema of the LDAP directory. API Gateway uses this information during team checking to see if the user attempting to log in belongs to an LDAP group that has been mapped to a team. If no value is specified here, API Gateway does not check for membership in an LDAP group. As a result, the user's access is controlled by the API Gateway group specified in the 'group' field.
     */
    @JsonProperty("memberAttribute")
    protected String memberAttribute;

    /**
     * The base 64 encoded password used by API Gateway to connect to the LDAP server.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The maximum number of connections allowed in the pool that API Gateway maintains for connecting to the LDAP server. When API Gateway starts, the connection pool initially contains a minimum number of connections, which are specified in the Minimum Connection Pool field. API Gateway adds connections to the pool as needed until it reaches the maximum allowed. The default is 10.
     */
    @JsonProperty("poolMax")
    protected String poolMax;

    /**
     * The minimum number of connections allowed in the pool that API Gateway maintains for connecting to the LDAP server. When API Gateway starts, the connection pool initially contains this minimum number of connections. API Gateway adds connections to the pool as needed until it reaches the maximum allowed, which is specified in the Maximum Connection Pool field. The default is 0.
     */
    @JsonProperty("poolMin")
    protected String poolMin;

    /**
     * The user ID the Integration Server should supply to connect to the LDAP server, for example, o=webm.com or dc=webm,dc=com.
     * This user should not be the Administrator account, but a user that has permission to query groups and group membership. If your LDAP server allows anonymous access, leave this field blank.
     */
    @JsonProperty("principal")
    protected String principal;

    /**
     * The number of seconds the API Gateway will wait while trying to connect to the LDAP server. After this time has passed, the API Gateway will try the next configured LDAP server on the list. The default is 5 seconds.
     */
    @JsonProperty("timeout")
    protected String timeout;

    /**
     * A property that identifies an LDAP userid, such as 'cn' or 'uid'. 
     */
    @JsonProperty("uidProp")
    protected String uidProp;

    /**
     * The complete URL of the LDAP server. The URL has the format protocol://hostname:portnumber. Possible values of 'protocol' is 'ldap' for standard connections or 'ldaps' for secure connections. For example, ldaps://ldaphost1:700
     */
    @JsonProperty("url")
    protected String url;

    /**
     * A property that identifies an LDAP user Email Address, such as 'mail' or 'email'. 
     */
    @JsonProperty("userEmailAttribute")
    protected String userEmailAttribute;

    /**
     * Enter the full distinguished name. For example, configure this value as 'ou=users,dc=webMethods,dc=com', API Gateway will issue a query that starts searching in the root directory ou=users for a common name that matches the name the user logged in with.
     */
    @JsonProperty("userRootDn")
    protected String userRootDn;

    /**
     * Constructs a validated instance of {@link LDAPDirectory}.
     *
     * @param spec the specification to process
     */
    public LDAPDirectory(Consumer<LDAPDirectory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LDAPDirectory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LDAPDirectory(Consumer)} instead.
     * @param distinguishedNameDNMethod Specifies the DN method used for building the DN. Possible values are 'true' and 'false'.Select 'true' if the DN should be synthesized from the configured prefix and suffix values (Synthesize DN Method). These values are prefixed and suffixed to the username to build the DN. Select 'false' if the DN should be queried from a specified root directory (Query DN Method). The Synthesize DN method can be faster than the Query DN method because it does not perform a query against the LDAP directory. However, if your LDAP system does not contain all users in a single flat structure, use the Query DN method instead.
     * @param dnPrefix A string that specifies the beginning of a DN you want to pass to the LDAP server. This field is applicable when 'useaf' is configured as 'true'. i.e, Synthesize DN Method is chosen.For example, if the prefix is 'cn=' and the suffix is ',ou=Users' and a user logs in specifying 'bob', API Gateway builds the DN 'cn=bob,ou=Users' and sends it to the LDAP server for authentication.
     * @param dnSuffix A string that specifies the end of a DN you want to pass to the LDAP server. This field is applicable when 'useaf' is configured as 'true'. i.e, Synthesize DN Method is chosen.For example, if the prefix is 'cn=' and the suffix is ',ou=Users' and a user logs in specifying 'bob', API Gateway builds the DN 'cn=bob,ou=Users' and sends it to the LDAP server for authentication.
     * @param group An API Gateway group with which the user is associated. The user is allowed to access services that members of this API Gateway group can access. This access is controlled by the teams with which the group is associated. If you also specify a value in the 'memberAttribute' field, the user has the same access as members of the API Gateway group and members of LDAP groups that have been mapped to an API Gateway team.
     * @param groupIdProperty A property that identifies an LDAP group, such as CN. This field is required.
     * @param groupRootDN The full distinguished name. For example, if you specify 'ou=groups,webMethods,dc=com', API Gateway will issue a query that will display all the LDAP groups. This field is required.
     * @param index Index of the current LDAP directory. Priority of the LDAP directory among other directories is calculated using the index. The starting value of index for the LDAP directory with first priority is 0 and is incremented by 1 for subsequent LDAP directories.
     * @param memberAttribute The name of the attribute in a group's directory entry that identifies each member of the group. This value is usually 'member' or 'uniqueMember', but can vary depending on the schema of the LDAP directory. API Gateway uses this information during team checking to see if the user attempting to log in belongs to an LDAP group that has been mapped to a team. If no value is specified here, API Gateway does not check for membership in an LDAP group. As a result, the user's access is controlled by the API Gateway group specified in the 'group' field.
     * @param password The base 64 encoded password used by API Gateway to connect to the LDAP server.
     * @param poolMax The maximum number of connections allowed in the pool that API Gateway maintains for connecting to the LDAP server. When API Gateway starts, the connection pool initially contains a minimum number of connections, which are specified in the Minimum Connection Pool field. API Gateway adds connections to the pool as needed until it reaches the maximum allowed. The default is 10.
     * @param poolMin The minimum number of connections allowed in the pool that API Gateway maintains for connecting to the LDAP server. When API Gateway starts, the connection pool initially contains this minimum number of connections. API Gateway adds connections to the pool as needed until it reaches the maximum allowed, which is specified in the Maximum Connection Pool field. The default is 0.
     * @param principal The user ID the Integration Server should supply to connect to the LDAP server, for example, o=webm.com or dc=webm,dc=com.  This user should not be the Administrator account, but a user that has permission to query groups and group membership. If your LDAP server allows anonymous access, leave this field blank.
     * @param timeout The number of seconds the API Gateway will wait while trying to connect to the LDAP server. After this time has passed, the API Gateway will try the next configured LDAP server on the list. The default is 5 seconds.
     * @param uidProp A property that identifies an LDAP userid, such as 'cn' or 'uid'. 
     * @param url The complete URL of the LDAP server. The URL has the format protocol://hostname:portnumber. Possible values of 'protocol' is 'ldap' for standard connections or 'ldaps' for secure connections. For example, ldaps://ldaphost1:700
     * @param userEmailAttribute A property that identifies an LDAP user Email Address, such as 'mail' or 'email'. 
     * @param userRootDn Enter the full distinguished name. For example, configure this value as 'ou=users,dc=webMethods,dc=com', API Gateway will issue a query that starts searching in the root directory ou=users for a common name that matches the name the user logged in with.
     */
    @ApiStatus.Internal
    public LDAPDirectory(Boolean distinguishedNameDNMethod, String dnPrefix, String dnSuffix, String group, String groupIdProperty, String groupRootDN, Integer index, String memberAttribute, String password, String poolMax, String poolMin, String principal, String timeout, String uidProp, String url, String userEmailAttribute, String userRootDn) {
        this.distinguishedNameDNMethod = distinguishedNameDNMethod;
        this.dnPrefix = dnPrefix;
        this.dnSuffix = dnSuffix;
        this.group = group;
        this.groupIdProperty = groupIdProperty;
        this.groupRootDN = groupRootDN;
        this.index = index;
        this.memberAttribute = memberAttribute;
        this.password = password;
        this.poolMax = poolMax;
        this.poolMin = poolMin;
        this.principal = principal;
        this.timeout = timeout;
        this.uidProp = uidProp;
        this.url = url;
        this.userEmailAttribute = userEmailAttribute;
        this.userRootDn = userRootDn;
    }

}
