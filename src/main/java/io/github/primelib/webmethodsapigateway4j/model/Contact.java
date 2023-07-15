package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "email",
    "name",
    "url"
})
@JsonTypeName("Contact")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Contact {

    /**
     * Constructs a validated implementation of {@link Contact}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Contact(Consumer<Contact> spec) {
        spec.accept(this);
    }

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


}
