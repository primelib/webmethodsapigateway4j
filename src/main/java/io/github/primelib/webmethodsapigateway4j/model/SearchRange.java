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
 * SearchRange
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "from",
    "since",
    "to"
})
@JsonTypeName("SearchRange")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchRange {

    /**
     * Constructs a validated implementation of {@link SearchRange}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchRange(Consumer<SearchRange> spec) {
        spec.accept(this);
    }

    /**
     * from value is used to set the minimum value in the request criteria and it can be integer, date or datetime
     */
    @JsonProperty("from")
    protected Object from;

    /**
     * This field is to search the data for the last few duration in units like seconds, minutes, hours, days and weeks. Possible units are [smhdw]
     */
    @JsonProperty("since")
    protected String since;

    /**
     * to value is used to set the maximum value in the request criteria and it can be integer, date or datetime
     */
    @JsonProperty("to")
    protected Object to;


}
