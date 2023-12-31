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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

/**
 * Contains settings for the Systems Manager agent on your build instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * SystemsManagerAgentProperty systemsManagerAgentProperty = SystemsManagerAgentProperty.builder()
 * .uninstallAfterBuild(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-systemsmanageragent.html)
 */
@CdkDslMarker
public class CfnImageRecipeSystemsManagerAgentPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.SystemsManagerAgentProperty.Builder =
        CfnImageRecipe.SystemsManagerAgentProperty.builder()

    /**
     * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
     *   final build image, prior to creating the new AMI. If this is set to true, then the agent is
     *   removed from the final image. If it's set to false, then the agent is left in, so that it
     *   is included in the new AMI. The default value is false.
     */
    public fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
    }

    /**
     * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
     *   final build image, prior to creating the new AMI. If this is set to true, then the agent is
     *   removed from the final image. If it's set to false, then the agent is left in, so that it
     *   is included in the new AMI. The default value is false.
     */
    public fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
    }

    public fun build(): CfnImageRecipe.SystemsManagerAgentProperty = cdkBuilder.build()
}
