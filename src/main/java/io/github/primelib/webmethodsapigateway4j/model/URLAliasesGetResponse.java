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
 * URLAliasesGetResponse
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
    "urlAliases"
})
@JsonTypeName("URLAliasesGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class URLAliasesGetResponse {

    /**
     * Contains the list of available URL aliases or a single URL alias object.
     */
    @JsonProperty("urlAliases")
    protected List<URLAliasSettings> urlAliases;

    /**
     * Constructs a validated instance of {@link URLAliasesGetResponse}.
     *
     * @param spec the specification to process
     */
    public URLAliasesGetResponse(Consumer<URLAliasesGetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link URLAliasesGetResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #URLAliasesGetResponse(Consumer)} instead.
     * @param urlAliases Contains the list of available URL aliases or a single URL alias object.
     */
    @ApiStatus.Internal
    public URLAliasesGetResponse(List<URLAliasSettings> urlAliases) {
        this.urlAliases = urlAliases;
    }

}
