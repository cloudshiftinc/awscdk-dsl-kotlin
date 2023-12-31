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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Specifies the configuration details of a schedule-triggered flow as defined by the user.
 *
 * Currently, these settings only apply to the `Scheduled` trigger type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
 * ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .flowErrorDeactivationThreshold(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html)
 */
@CdkDslMarker
public class CfnFlowScheduledTriggerPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.ScheduledTriggerPropertiesProperty.Builder =
        CfnFlow.ScheduledTriggerPropertiesProperty.builder()

    /**
     * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or a
     *   complete data transfer for each flow run.
     */
    public fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
    }

    /**
     * @param firstExecutionFrom Specifies the date range for the records to import from the
     *   connector in the first flow run.
     */
    public fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
    }

    /** @param flowErrorDeactivationThreshold the value to be set. */
    public fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number) {
        cdkBuilder.flowErrorDeactivationThreshold(flowErrorDeactivationThreshold)
    }

    /**
     * @param scheduleEndTime The time at which the scheduled flow ends. The time is formatted as a
     *   timestamp that follows the ISO 8601 standard, such as `2022-04-27T13:00:00-07:00` .
     */
    public fun scheduleEndTime(scheduleEndTime: Number) {
        cdkBuilder.scheduleEndTime(scheduleEndTime)
    }

    /**
     * @param scheduleExpression The scheduling expression that determines the rate at which the
     *   schedule will run, for example `rate(5minutes)` .
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleOffset Specifies the optional offset that is added to the time interval for a
     *   schedule-triggered flow.
     */
    public fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
    }

    /**
     * @param scheduleStartTime The time at which the scheduled flow starts. The time is formatted
     *   as a timestamp that follows the ISO 8601 standard, such as `2022-04-26T13:00:00-07:00` .
     */
    public fun scheduleStartTime(scheduleStartTime: Number) {
        cdkBuilder.scheduleStartTime(scheduleStartTime)
    }

    /**
     * @param timeZone Specifies the time zone used when referring to the dates and times of a
     *   scheduled flow, such as `America/New_York` . This time zone is only a descriptive label. It
     *   doesn't affect how Amazon AppFlow interprets the timestamps that you specify to schedule
     *   the flow.
     *
     * If you want to schedule a flow by using times in a particular time zone, indicate the time
     * zone as a UTC offset in your timestamps. For example, the UTC offsets for the
     * `America/New_York` timezone are `-04:00` EDT and `-05:00 EST` .
     */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnFlow.ScheduledTriggerPropertiesProperty = cdkBuilder.build()
}
