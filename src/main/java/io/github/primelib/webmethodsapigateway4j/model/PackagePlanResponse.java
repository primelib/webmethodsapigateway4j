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
 * PackagePlanResponse
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
    "status"
})
@JsonTypeName("PackagePlanResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackagePlanResponse {

    /**
     * Description of action performed on package
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Id of the package
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Status of action performed on package
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Constructs a validated instance of {@link PackagePlanResponse}.
     *
     * @param spec the specification to process
     */
    public PackagePlanResponse(Consumer<PackagePlanResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackagePlanResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackagePlanResponse(Consumer)} instead.
     * @param description Description of action performed on package
     * @param id Id of the package
     * @param status Status of action performed on package
     */
    @ApiStatus.Internal
    public PackagePlanResponse(String description, String id, StatusEnum status) {
        this.description = description;
        this.id = id;
        this.status = status;
    }

    /**
     * Status of action performed on package
     */
    @AllArgsConstructor
    public enum StatusEnum {
        CREATED("CREATED"),
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        UNEXPECTED_ERROR("UNEXPECTED_ERROR"),
        NOT_FOUND("NOT_FOUND"),
        NO_CONTENT("NO_CONTENT"),
        LOCKED("LOCKED"),
        UPDATED("UPDATED"),
        ACTIVATED("ACTIVATED"),
        DEACTIVATED("DEACTIVATED"),
        PUBLISHED("PUBLISHED"),
        UNPUBLISHED("UNPUBLISHED");

        private final String value;
    }

}
