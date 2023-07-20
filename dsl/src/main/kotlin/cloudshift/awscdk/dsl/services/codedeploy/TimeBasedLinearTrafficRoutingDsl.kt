@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting
import kotlin.Number

@CdkDslMarker
public class TimeBasedLinearTrafficRoutingDsl {
    private val cdkBuilder: TimeBasedLinearTrafficRouting.Builder =
        TimeBasedLinearTrafficRouting.Builder.create()

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
    }

    public fun build(): TimeBasedLinearTrafficRouting = cdkBuilder.build()
}
