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
 * Team
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name",
    "source"
})
@JsonTypeName("Team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Team {

    /**
     * Constructs a validated implementation of {@link Team}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Team(Consumer<Team> spec) {
        spec.accept(this);
    }

    /**
     * Team id
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Team name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The value is to identify whether the team is created from global team assignment or from user or by system
     */
    @JsonProperty("source")
    protected SourceEnum source;


    /**
     * The value is to identify whether the team is created from global team assignment or from user or by system
     */
    @AllArgsConstructor
    public enum SourceEnum {
        USER("USER"),
        GLOBAL_ASSIGNMENT("GLOBAL_ASSIGNMENT"),
        SYSTEM("SYSTEM");

        private final String value;
    }

}
