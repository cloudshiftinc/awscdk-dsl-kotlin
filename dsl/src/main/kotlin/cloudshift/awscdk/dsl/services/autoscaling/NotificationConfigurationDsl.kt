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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.ScalingEvents
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class NotificationConfigurationDsl {
    private val cdkBuilder: NotificationConfiguration.Builder = NotificationConfiguration.builder()

    public fun scalingEvents(scalingEvents: ScalingEvents) {
        cdkBuilder.scalingEvents(scalingEvents)
    }

    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): NotificationConfiguration = cdkBuilder.build()
}
