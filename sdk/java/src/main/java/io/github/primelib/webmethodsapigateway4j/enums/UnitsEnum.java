// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.enums;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.processing.Generated;

/**
 * UnitsEnum
 *
 */
@JsonTypeName("UnitsEnum")
@Generated(value = "io.github.primelib.primecodegen")
public enum UnitsEnum {
    PER_DAY("per day"),
    PER_HOUR("per hour"),
    PER_MINUTE("per minute"),
    PER_MONTH("per month"),
    PER_SECOND("per second"),
    PER_WEEK("per week"),
    PER_YEAR("per year"),
    ;

    private final String value;

    UnitsEnum(String value) {
        this.value = value;
    }
}
