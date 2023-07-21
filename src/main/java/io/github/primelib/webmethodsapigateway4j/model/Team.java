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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Team
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
    "id",
    "name",
    "source"
})
@JsonTypeName("Team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Team {

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
     * Constructs a validated instance of {@link Team}.
     *
     * @param spec the specification to process
     */
    public Team(Consumer<Team> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Team}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Team(Consumer)} instead.
     * @param id Team id
     * @param name Team name
     * @param source The value is to identify whether the team is created from global team assignment or from user or by system
     */
    @ApiStatus.Internal
    public Team(String id, String name, SourceEnum source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

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
