package io.github.primelib.webmethodsapigateway4j.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWebserviceEndpointSpec
 * <p>
 * Specification for the GetWebserviceEndpoint operation.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWebserviceEndpointOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This path parameter is used to specify the Webservice endpoint id which Webservice endpoint needs to be retrived.
     */
    @NotNull 
    private String webserviceEndpointId;

    /**
     * Constructs a validated instance of {@link GetWebserviceEndpointOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWebserviceEndpointOperationSpec(Consumer<GetWebserviceEndpointOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetWebserviceEndpointOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param webserviceEndpointId This path parameter is used to specify the Webservice endpoint id which Webservice endpoint needs to be retrived.
     */
    @ApiStatus.Internal
    public GetWebserviceEndpointOperationSpec(String webserviceEndpointId) {
        this.webserviceEndpointId = webserviceEndpointId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(webserviceEndpointId, "webserviceEndpointId is a required parameter!");
    }
}
