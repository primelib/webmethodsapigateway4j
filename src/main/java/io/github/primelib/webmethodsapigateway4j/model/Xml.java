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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Xml
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
    protected Map<String, Object> vendorExtensions;

    /**
     * MAY be used only for an array definition. Signifies whether the array is wrapped (for example, &amp;lt;books&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;/books&amp;gt;) or unwrapped (&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;). Default value is false
     */
    @JsonProperty("wrapped")
    protected Boolean wrapped;

    /**
     * Constructs a validated instance of {@link Xml}.
     *
     * @param spec the specification to process
     */
    public Xml(Consumer<Xml> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Xml}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Xml(Consumer)} instead.
     * @param attribute Declares whether the property definition translates to an attribute instead of an element. Default value is false
     * @param name Replaces the name of the element/attribute used for the described schema property. When defined within items, it will affect the name of the individual XML elements within the list. When defined alongside type being array (outside the items), it will affect the wrapping element and only if wrapped is true. If wrapped is false, it will be ignored
     * @param namespace The URI of the namespace definition
     * @param prefix The prefix to be used for the name
     * @param vendorExtensions var.name
     * @param wrapped MAY be used only for an array definition. Signifies whether the array is wrapped (for example, &amp;lt;books&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;&amp;lt;/books&amp;gt;) or unwrapped (&amp;lt;book/&amp;gt;&amp;lt;book/&amp;gt;). Default value is false
     */
    @ApiStatus.Internal
    public Xml(Boolean attribute, String name, String namespace, String prefix, Map<String, Object> vendorExtensions, Boolean wrapped) {
        this.attribute = attribute;
        this.name = name;
        this.namespace = namespace;
        this.prefix = prefix;
        this.vendorExtensions = vendorExtensions;
        this.wrapped = wrapped;
    }

}
