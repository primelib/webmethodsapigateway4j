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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchRange
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
    "from",
    "since",
    "to"
})
@JsonTypeName("SearchRange")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchRange {

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

    /**
     * Constructs a validated instance of {@link SearchRange}.
     *
     * @param spec the specification to process
     */
    public SearchRange(Consumer<SearchRange> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchRange}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchRange(Consumer)} instead.
     * @param from from value is used to set the minimum value in the request criteria and it can be integer, date or datetime
     * @param since This field is to search the data for the last few duration in units like seconds, minutes, hours, days and weeks. Possible units are [smhdw]
     * @param to to value is used to set the maximum value in the request criteria and it can be integer, date or datetime
     */
    @ApiStatus.Internal
    public SearchRange(Object from, String since, Object to) {
        this.from = from;
        this.since = since;
        this.to = to;
    }

}
