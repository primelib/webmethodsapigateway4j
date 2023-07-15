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
 * PackagePlanResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "status"
})
@JsonTypeName("PackagePlanResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackagePlanResponse {

    /**
     * Constructs a validated implementation of {@link PackagePlanResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PackagePlanResponse(Consumer<PackagePlanResponse> spec) {
        spec.accept(this);
    }

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
