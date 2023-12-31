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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DeploymentPreferenceProperty deploymentPreferenceProperty =
 * DeploymentPreferenceProperty.builder()
 * .alarms(List.of("alarms"))
 * .enabled(false)
 * .hooks(HooksProperty.builder()
 * .postTraffic("postTraffic")
 * .preTraffic("preTraffic")
 * .build())
 * .role("role")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deploymentpreference.html)
 */
@CdkDslMarker
public class CfnFunctionDeploymentPreferencePropertyDsl {
    private val cdkBuilder: CfnFunction.DeploymentPreferenceProperty.Builder =
        CfnFunction.DeploymentPreferenceProperty.builder()

    private val _alarms: MutableList<String> = mutableListOf()

    /** @param alarms the value to be set. */
    public fun alarms(vararg alarms: String) {
        _alarms.addAll(listOf(*alarms))
    }

    /** @param alarms the value to be set. */
    public fun alarms(alarms: Collection<String>) {
        _alarms.addAll(alarms)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param hooks the value to be set. */
    public fun hooks(hooks: IResolvable) {
        cdkBuilder.hooks(hooks)
    }

    /** @param hooks the value to be set. */
    public fun hooks(hooks: CfnFunction.HooksProperty) {
        cdkBuilder.hooks(hooks)
    }

    /** @param role the value to be set. */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFunction.DeploymentPreferenceProperty {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        return cdkBuilder.build()
    }
}
