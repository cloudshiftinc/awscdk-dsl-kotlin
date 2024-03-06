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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * A weekly schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * WeeklyScheduleProperty weeklyScheduleProperty = WeeklyScheduleProperty.builder()
 * .days(List.of("days"))
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationWeeklySchedulePropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.WeeklyScheduleProperty.Builder =
        CfnCisScanConfiguration.WeeklyScheduleProperty.builder()

    private val _days: MutableList<String> = mutableListOf()

    /** @param days The weekly schedule's days. */
    public fun days(vararg days: String) {
        _days.addAll(listOf(*days))
    }

    /** @param days The weekly schedule's days. */
    public fun days(days: Collection<String>) {
        _days.addAll(days)
    }

    /** @param startTime The weekly schedule's start time. */
    public fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime)
    }

    /** @param startTime The weekly schedule's start time. */
    public fun startTime(startTime: CfnCisScanConfiguration.TimeProperty) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnCisScanConfiguration.WeeklyScheduleProperty {
        if (_days.isNotEmpty()) cdkBuilder.days(_days)
        return cdkBuilder.build()
    }
}
