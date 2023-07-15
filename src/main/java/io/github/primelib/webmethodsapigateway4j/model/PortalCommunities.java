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
 * PortalCommunities
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "status"
})
@JsonTypeName("PortalCommunities")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalCommunities {

    /**
     * Constructs a validated implementation of {@link PortalCommunities}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PortalCommunities(Consumer<PortalCommunities> spec) {
        spec.accept(this);
    }

    /**
     * Description of API Portal community.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * ID of API Portal community.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * API Portal community name.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Staus of the API Portal community.
     */
    @JsonProperty("status")
    protected StatusEnum status;


    /**
     * Staus of the API Portal community.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        PUBLISHED_PACKAGE("PUBLISHED_PACKAGE"),
        OBSELETE("OBSELETE");

        private final String value;
    }

}
