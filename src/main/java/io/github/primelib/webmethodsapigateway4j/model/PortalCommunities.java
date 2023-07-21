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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalCommunities
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
    "description",
    "id",
    "name",
    "status"
})
@JsonTypeName("PortalCommunities")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalCommunities {

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
     * Constructs a validated instance of {@link PortalCommunities}.
     *
     * @param spec the specification to process
     */
    public PortalCommunities(Consumer<PortalCommunities> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortalCommunities}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortalCommunities(Consumer)} instead.
     * @param description Description of API Portal community.
     * @param id ID of API Portal community.
     * @param name API Portal community name.
     * @param status Staus of the API Portal community.
     */
    @ApiStatus.Internal
    public PortalCommunities(String description, String id, String name, StatusEnum status) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.status = status;
    }

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
