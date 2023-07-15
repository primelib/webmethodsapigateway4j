package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Xml
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attribute",
    "name",
    "namespace",
    "prefix",
    "vendorExtensions",
    "wrapped"
})
@JsonTypeName("Xml")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Xml {

    /**
     * Constructs a validated implementation of {@link Xml}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Xml(Consumer<Xml> spec) {
        spec.accept(this);
    }

    /**
     * Declares whether the property definition translates to an attribute instead of an element. Default value is false
     */
    @JsonProperty("attribute")
    protected Boolean attribute;

    /**
     * Replaces the name of the element/attribute used for the described schema property. When defined within items, it will affect the name of the individual XML elements within the list. When defined alongside type being array (outside the items), it will affect the wrapping element and only if wrapped is true. If wrapped is false, it will be ignored
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URI of the namespace definition
     */
    @JsonProperty("namespace")
    protected String namespace;

    /**
     * The prefix to be used for the name
     */
    @JsonProperty("prefix")
    protected String prefix;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();

    /**
     * MAY be used only for an array definition. Signifies whether the array is wrapped (for example, &amp;lt;books&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;/books&amp;gt;) or unwrapped (&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;). Default value is false
     */
    @JsonProperty("wrapped")
    protected Boolean wrapped;


}
