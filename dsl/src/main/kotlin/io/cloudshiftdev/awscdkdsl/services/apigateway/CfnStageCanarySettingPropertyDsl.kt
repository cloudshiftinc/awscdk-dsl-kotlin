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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnStage

/**
 * Configuration settings of a canary deployment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
 * .deploymentId("deploymentId")
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html)
 */
@CdkDslMarker
public class CfnStageCanarySettingPropertyDsl {
    private val cdkBuilder: CfnStage.CanarySettingProperty.Builder =
        CfnStage.CanarySettingProperty.builder()

    /** @param deploymentId The ID of the canary deployment. */
    public fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
    }

    /** @param percentTraffic The percent (0-100) of traffic diverted to a canary deployment. */
    public fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
    }

    /**
     * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
     *   including new stage variables introduced in the canary. These stage variables are
     *   represented as a string-to-string map between stage variable names and their values.
     */
    public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    /**
     * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
     *   including new stage variables introduced in the canary. These stage variables are
     *   represented as a string-to-string map between stage variable names and their values.
     */
    public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    /**
     * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the stage
     *   cache or not.
     */
    public fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
    }

    /**
     * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the stage
     *   cache or not.
     */
    public fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache)
    }

    public fun build(): CfnStage.CanarySettingProperty = cdkBuilder.build()
}
