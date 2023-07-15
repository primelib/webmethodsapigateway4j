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
 * APIResponseGetGlobalPolicies
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "globalPolicies"
})
@JsonTypeName("APIResponseGetGlobalPolicies")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseGetGlobalPolicies {

    /**
     * Constructs a validated implementation of {@link APIResponseGetGlobalPolicies}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponseGetGlobalPolicies(Consumer<APIResponseGetGlobalPolicies> spec) {
        spec.accept(this);
    }

    @JsonProperty("globalPolicies")
    protected List<String> globalPolicies;


}
