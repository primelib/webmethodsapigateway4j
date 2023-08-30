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
 * Contact
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
    "email",
    "name",
    "url"
})
@JsonTypeName("Contact")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Contact {

    /**
     * The email address of the contact person/organization
     */
    @JsonProperty("email")
    protected String email;

    /**
     * The identifying name of the contact person/organization
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL pointing to the contact information
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link Contact}.
     *
     * @param spec the specification to process
     */
    public Contact(Consumer<Contact> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Contact}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Contact(Consumer)} instead.
     * @param email The email address of the contact person/organization
     * @param name The identifying name of the contact person/organization
     * @param url The URL pointing to the contact information
     */
    @ApiStatus.Internal
    public Contact(String email, String name, String url) {
        this.email = email;
        this.name = name;
        this.url = url;
    }

}
