package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GroupingAggregation
 *
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("GroupingAggregation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupingAggregation extends IAggregation {

    /**
     * Constructs a validated implementation of {@link GroupingAggregation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GroupingAggregation(Consumer<GroupingAggregation> spec) {
        spec.accept(this);
    }


}
