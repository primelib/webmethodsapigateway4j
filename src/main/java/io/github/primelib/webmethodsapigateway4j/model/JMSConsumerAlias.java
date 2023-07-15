package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JMSConsumerAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link JMSConsumerAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JMSConsumerAlias(Consumer<JMSConsumerAlias> spec) {
        spec.accept(this);
    }

    /**
     * This property specifies the connection factory name
     */
    @JsonProperty("connFactoryName")
    protected String connFactoryName;

    /**
     * This property specifies the team name
     */
    @JsonProperty("executeACL")
    protected String executeACL;

    /**
     * This property specifies the jmsAliasType. Either it could be JMS or JNDI 
     */
    @JsonProperty("jmsAliasType")
    protected String jmsAliasType;

    /**
     * This property specifies the name of JMS connection
     */
    @JsonProperty("jmsConnAlias")
    protected String jmsConnAlias;

    /**
     * This property specifies the name of JNDI
     */
    @JsonProperty("jndiProvAlias")
    protected String jndiProvAlias;

    /**
     * This property specifies the password to create the JMS connection
     */
    @JsonProperty("password")
    protected String password;

    /**
     * This property specifies the name of the user to create the JMS connection
     */
    @JsonProperty("user")
    protected String user;


}
