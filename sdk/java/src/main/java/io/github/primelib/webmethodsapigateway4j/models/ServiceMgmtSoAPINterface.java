// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtSoAPINterface
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtSoAPINterface")
@JsonPropertyOrder({
    "name",
    "operations"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtSoAPINterface {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("operations")
    protected List<ServiceMgmtSoapoperation> operations;

    /**
     * Constructs a validated instance of {@link ServiceMgmtSoAPINterface}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtSoAPINterface(Consumer<ServiceMgmtSoAPINterface> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtSoAPINterface}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtSoAPINterface(Consumer)} instead.
     * @param name name
     * @param operations operations
     */
    @ApiStatus.Internal
    public ServiceMgmtSoAPINterface(String name, List<ServiceMgmtSoapoperation> operations) {
        this.name = name;
        this.operations = operations;
    }
}
