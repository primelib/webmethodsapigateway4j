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
 * APIResponsesModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiResponse"
})
@JsonTypeName("APIResponsesModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponsesModel {

    /**
     * Constructs a validated implementation of {@link APIResponsesModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponsesModel(Consumer<APIResponsesModel> spec) {
        spec.accept(this);
    }

    /**
     * API Response
     */
    @JsonProperty("apiResponse")
    protected List<APIResponseModel> _apiResponse;


}
