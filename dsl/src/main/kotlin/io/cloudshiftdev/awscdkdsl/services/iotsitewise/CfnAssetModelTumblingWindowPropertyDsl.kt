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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous
 * time window.
 *
 * You can use this window in metrics to aggregate data from properties and other assets.
 *
 * You can use `m` , `h` , `d` , and `w` when you specify an interval or offset. Note that `m`
 * represents minutes, `h` represents hours, `d` represents days, and `w` represents weeks. You can
 * also use `s` to represent seconds in `offset` .
 *
 * The `interval` and `offset` parameters support the
 * [ISO 8601 format](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_8601) . For
 * example, `PT5S` represents 5 seconds, `PT5M` represents 5 minutes, and `PT5H` represents 5 hours.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * TumblingWindowProperty tumblingWindowProperty = TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html)
 */
@CdkDslMarker
public class CfnAssetModelTumblingWindowPropertyDsl {
    private val cdkBuilder: CfnAssetModel.TumblingWindowProperty.Builder =
        CfnAssetModel.TumblingWindowProperty.builder()

    /**
     * @param interval The time interval for the tumbling window. The interval time must be between
     *   1 minute and 1 week. AWS IoT SiteWise computes the `1w` interval the end of Sunday at
     *   midnight each week (UTC), the `1d` interval at the end of each day at midnight (UTC), the
     *   `1h` interval at the end of each hour, and so on.
     *
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each
     * interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the
     * computed data point at the end of the interval.
     */
    public fun interval(interval: String) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param offset The offset for the tumbling window. The `offset` parameter accepts the
     *   following:.
     * * The offset time.
     *
     * For example, if you specify `18h` for `offset` and `1d` for `interval` , AWS IoT SiteWise
     * aggregates data in one of the following ways:
     * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6
     *   PM (UTC) on the day when you create the metric.
     * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
     *   (UTC) the next day.
     * * The ISO 8601 format.
     *
     * For example, if you specify `PT18H` for `offset` and `1d` for `interval` , AWS IoT SiteWise
     * aggregates data in one of the following ways:
     * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6
     *   PM (UTC) on the day when you create the metric.
     * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
     *   (UTC) the next day.
     * * The 24-hour clock.
     *
     * For example, if you specify `00:03:00` for `offset` , `5m` for `interval` , and you create
     * the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the
     * second aggregation result at 2:08 PM (UTC).
     * * The offset time zone.
     *
     * For example, if you specify `2021-07-23T18:00-08` for `offset` and `1d` for `interval` , AWS
     * IoT SiteWise aggregates data in one of the following ways:
     * * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6
     *   PM (PST) on the day when you create the metric.
     * * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM
     *   (PST) the next day.
     */
    public fun offset(offset: String) {
        cdkBuilder.offset(offset)
    }

    public fun build(): CfnAssetModel.TumblingWindowProperty = cdkBuilder.build()
}
