@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilterProps

/**
 * Properties for a SubscriptionFilter.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.logs.destinations.*;
 * Function fn;
 * LogGroup logGroup;
 * SubscriptionFilter.Builder.create(this, "Subscription")
 * .logGroup(logGroup)
 * .destination(new LambdaDestination(fn))
 * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
 * .filterName("ErrorInMainThread")
 * .build();
 * ```
 */
@CdkDslMarker
public class SubscriptionFilterPropsDsl {
    private val cdkBuilder: SubscriptionFilterProps.Builder = SubscriptionFilterProps.builder()

    /**
     * @param destination The destination to send the filtered events to. For example, a Kinesis
     *   stream or a Lambda function.
     */
    public fun destination(destination: ILogSubscriptionDestination) {
        cdkBuilder.destination(destination)
    }

    /** @param filterName The name of the subscription filter. */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /** @param filterPattern Log events matching this pattern will be sent to the destination. */
    public fun filterPattern(filterPattern: IFilterPattern) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /** @param logGroup The log group to create the subscription on. */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): SubscriptionFilterProps = cdkBuilder.build()
}
