package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalCommunities
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "status"
})
@JsonTypeName("PortalCommunities")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalCommunities {

    /**
     * Description of API Portal community.
     */
    @JsonProperty("description")
    private String description;

    /**
     * ID of API Portal community.
     */
    @JsonProperty("id")
    private String id;

    /**
     * API Portal community name.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Staus of the API Portal community.
     */
    @JsonProperty("status")
    private StatusEnum status;


    /**
     * Staus of the API Portal community.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        PUBLISHED_PACKAGE("PUBLISHED_PACKAGE"),
        OBSELETE("OBSELETE");

        private final String value;
    }

}
