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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Xpath
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
    "namespaces",
    "xpath"
})
@JsonTypeName("Xpath")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Xpath {

    @JsonProperty("namespaces")
    protected List<Namespaces> namespaces;

    @JsonProperty("xpath")
    protected String xpath;

    /**
     * Constructs a validated instance of {@link Xpath}.
     *
     * @param spec the specification to process
     */
    public Xpath(Consumer<Xpath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Xpath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Xpath(Consumer)} instead.
     * @param namespaces var.name
     * @param xpath var.name
     */
    @ApiStatus.Internal
    public Xpath(List<Namespaces> namespaces, String xpath) {
        this.namespaces = namespaces;
        this.xpath = xpath;
    }

}
