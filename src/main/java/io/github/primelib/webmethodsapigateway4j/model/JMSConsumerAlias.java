package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * JMSConsumerAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated instance of {@link JMSConsumerAlias}.
     *
     * @param spec the specification to process
     */
    public JMSConsumerAlias(Consumer<JMSConsumerAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JMSConsumerAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JMSConsumerAlias(Consumer)} instead.
     * @param connFactoryName This property specifies the connection factory name
     * @param executeACL This property specifies the team name
     * @param jmsAliasType This property specifies the jmsAliasType. Either it could be JMS or JNDI 
     * @param jmsConnAlias This property specifies the name of JMS connection
     * @param jndiProvAlias This property specifies the name of JNDI
     * @param password This property specifies the password to create the JMS connection
     * @param user This property specifies the name of the user to create the JMS connection
     */
    @ApiStatus.Internal
    public JMSConsumerAlias(String connFactoryName, String executeACL, String jmsAliasType, String jmsConnAlias, String jndiProvAlias, String password, String user) {
        this.connFactoryName = connFactoryName;
        this.executeACL = executeACL;
        this.jmsAliasType = jmsAliasType;
        this.jmsConnAlias = jmsConnAlias;
        this.jndiProvAlias = jndiProvAlias;
        this.password = password;
        this.user = user;
    }

}
