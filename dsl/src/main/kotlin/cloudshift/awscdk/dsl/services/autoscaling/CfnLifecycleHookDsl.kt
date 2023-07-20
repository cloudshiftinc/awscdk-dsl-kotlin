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
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLifecycleHookDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLifecycleHook.Builder = CfnLifecycleHook.Builder.create(scope, id)

    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    public fun defaultResult(defaultResult: String) {
        cdkBuilder.defaultResult(defaultResult)
    }

    public fun heartbeatTimeout(heartbeatTimeout: Number) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    public fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    public fun lifecycleTransition(lifecycleTransition: String) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    public fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
    }

    public fun notificationTargetArn(notificationTargetArn: String) {
        cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLifecycleHook = cdkBuilder.build()
}
