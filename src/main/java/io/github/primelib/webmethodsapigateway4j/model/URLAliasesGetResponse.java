package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * URLAliasesGetResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "urlAliases"
})
@JsonTypeName("URLAliasesGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class URLAliasesGetResponse {

    /**
     * Constructs a validated implementation of {@link URLAliasesGetResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public URLAliasesGetResponse(Consumer<URLAliasesGetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Contains the list of available URL aliases or a single URL alias object.
     */
    @JsonProperty("urlAliases")
    protected List<URLAliasSettings> urlAliases;


}
