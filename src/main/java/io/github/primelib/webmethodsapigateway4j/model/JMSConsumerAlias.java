package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSConsumerAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "connFactoryName",
    "executeACL",
    "jmsAliasType",
    "jmsConnAlias",
    "jndiProvAlias",
    "password",
    "user"
})
@JsonTypeName("JMSConsumerAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JMSConsumerAlias extends WebserviceEndpointAlias {

    /**
     * This property specifies the connection factory name
     */
    @JsonProperty("connFactoryName")
    private String connFactoryName;

    /**
     * This property specifies the team name
     */
    @JsonProperty("executeACL")
    private String executeACL;

    /**
     * This property specifies the jmsAliasType. Either it could be JMS or JNDI 
     */
    @JsonProperty("jmsAliasType")
    private String jmsAliasType;

    /**
     * This property specifies the name of JMS connection
     */
    @JsonProperty("jmsConnAlias")
    private String jmsConnAlias;

    /**
     * This property specifies the name of JNDI
     */
    @JsonProperty("jndiProvAlias")
    private String jndiProvAlias;

    /**
     * This property specifies the password to create the JMS connection
     */
    @JsonProperty("password")
    private String password;

    /**
     * This property specifies the name of the user to create the JMS connection
     */
    @JsonProperty("user")
    private String user;


}
