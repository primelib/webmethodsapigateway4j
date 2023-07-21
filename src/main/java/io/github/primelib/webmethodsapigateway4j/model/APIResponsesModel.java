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
 * APIResponsesModel
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
    "apiResponse"
})
@JsonTypeName("APIResponsesModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponsesModel {

    /**
     * API Response
     */
    @JsonProperty("apiResponse")
    protected List<APIResponseModel> _apiResponse;

    /**
     * Constructs a validated instance of {@link APIResponsesModel}.
     *
     * @param spec the specification to process
     */
    public APIResponsesModel(Consumer<APIResponsesModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponsesModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponsesModel(Consumer)} instead.
     * @param _apiResponse API Response
     */
    @ApiStatus.Internal
    public APIResponsesModel(List<APIResponseModel> _apiResponse) {
        this._apiResponse = _apiResponse;
    }

}
