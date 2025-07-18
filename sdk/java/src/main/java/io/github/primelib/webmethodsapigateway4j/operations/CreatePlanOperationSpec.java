// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.operations;

import io.github.primelib.webmethodsapigateway4j.models.MonetizationPlan;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NonNull;

/**
 * CreatePlan
 * <p>
 * This request is used to create the plan. During the creation of plan we can specify meta data of the plans. The rate limit and quota needs to created using a separate rest call to /policyActions. Also they need to be associated to corresponding policies created during the plan.
 * 
 *  You can also enable notifications in quota to trigger some actions such as billing or any other custom actions based on the consumption of an user.
 * 
 *  The notification can be either email or a custom destination. To receive email notification you should configure Email destination. To enable custom destination you need to create custom destination in API gateway. The link https://github.com/SoftwareAG/webmethods-api-gateway/tree/master/docs/articles/features/Custom%20Destinations contains the details on how to configure and use it. If you want to block the consumer after consuming allocated quota you should create throttle policy action as mentioned in the below example associate that to quota policy created for plan. If you want to just notify the destination with blocking the customer then you need to create monitorSLA policy action and associate that to quota policy created for plan.
 * 
 *  If you enable block on breach (throttle policy) you can receive both the policy violation event and monitor event with eventSource field as Enforce-HardLimit in custom destination. Please make sure that custom destination is enabled to receive events for policy violations events. If you dont enable block on breach (monitorSLA) in quota then monitor event with eventSource field as MonitorPolicy is sent to destinations configured. 
 * 
 *  Below are the examples to create rate limit in API gateway using endpoint /policyActions and associate it to the policy created for the plan.
 * 
 *  curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Traffic Optimization","locale":"en"}],"templateKey":"throttle","parameters":[{"templateKey":"throttleRule","parameters":[{"templateKey":"throttleRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["10"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["2"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["10 requests in 2 minutes breached for rate limit"]},{"templateKey":"consumerIds","values":["AnyConsumers"]}],"active":false}}'. 
 * 
 *  The above command will create a throttling policy action and its id in the response which you need to associate to the policy using the below example.
 *  curl -X PUT -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policies/2429ece2-96c2-4bd6-b8dc-9c13eedac42f -d '{"policy":{"id":"2429ece2-96c2-4bd6-b8dc-9c13eedac42f","policyEnforcements":[{"enforcements":[{"enforcementObjectId":"f3753917-30ef-438c-99f5-adcc204ac7b6","order":null}],"stageKey":"throttle"}]}}'.
 * 
 *  To create throttle policy for quota use the below example.
 * 
 * curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Traffic Optimization","locale":"en"}],"templateKey":"throttle","parameters":[{"templateKey":"throttleRule","parameters":[{"templateKey":"throttleRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["150"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["30"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["150 requests breached in 30 minutes for quota"]},{"templateKey":"consumerIds","values":["AnyConsumers"]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["SMTP"]},{"templateKey":"emailTo","values":["abc@xyz.com"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["CUSTOM"]},{"templateKey":"ids","values":["customDestiantion1"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["DES"]}]}],"active":false}}'.
 * 
 *  To create monitorSLA policy action for quota use the below example.
 * 
 * curl -X POST -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policyActions -d '{"policyAction":{"names":[{"value":"Monitor SLA","locale":"en"}],"templateKey":"monitorSLA","parameters":[{"templateKey":"monitorRules","parameters":[{"templateKey":"monitorRuleName","values":["requestCount"]},{"templateKey":"monitorRuleOperator","values":["GT"]},{"templateKey":"value","values":["120.0"],"extendedProperties":[{"key":"quota","value":"150"},{"key":"notifyPercent","value":"80"}]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["GATEWAY"]}]},{"templateKey":"alertInterval","values":["30"]},{"templateKey":"alertIntervalUnit","values":["minutes"]},{"templateKey":"alertFrequency","values":["once"]},{"templateKey":"alertMessage","values":["80% vioalted for quota"]},{"templateKey":"consumerIds","values":["AnyConsumers"]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["SMTP"]},{"templateKey":"emailTo","values":["abc@xyz.com"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["CUSTOM"]},{"templateKey":"ids","values":["customDestiantion1"]}]},{"templateKey":"destination","parameters":[{"templateKey":"destinationType","values":["DES"]}]}],"active":false}}'.
 * 
 *  To associate create throttle and monitor policy to quota.
 * 
 *  curl -X PUT -u 'Administrator:manage' -H 'Accept: application/json' -H 'Content-Type: application/json' http://localhost:5555/rest/apigateway/policies/f6e80784-d82e-491c-abda-d492ee037c2c -d {"policy":{"id":"f6e80784-d82e-491c-abda-d492ee037c2c","policyEnforcements":[{"enforcements":[{"enforcementObjectId":"2083ce29-8f4a-4e5e-b8bc-cbaaf18e4780","order":null}],"stageKey":"throttle"},{"enforcements":[{"enforcementObjectId":"7d143518-1058-4f4c-8ee1-66dd75b4c08d","order":null}],"stageKey":"monitorSLA"}]}}
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class CreatePlanOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * payload
     *
     */
    @NonNull
    private MonetizationPlan payload;

    /**
     * Constructs a validated instance of {@link CreatePlanOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatePlanOperationSpec(Consumer<CreatePlanOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(payload, "payload is a required parameter!");
    }
}
