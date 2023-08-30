package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GroupingAggregation
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@JsonTypeName("GroupingAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupingAggregation extends IAggregation {

    /**
     * Constructs a validated instance of {@link GroupingAggregation}.
     *
     * @param spec the specification to process
     */
    public GroupingAggregation(Consumer<GroupingAggregation> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GroupingAggregation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GroupingAggregation(Consumer)} instead.
     */
    @ApiStatus.Internal
    public GroupingAggregation() {
    }

}
