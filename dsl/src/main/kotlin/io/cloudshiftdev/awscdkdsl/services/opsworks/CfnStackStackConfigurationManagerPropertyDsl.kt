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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

/**
 * Describes the configuration manager.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * StackConfigurationManagerProperty stackConfigurationManagerProperty =
 * StackConfigurationManagerProperty.builder()
 * .name("name")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html)
 */
@CdkDslMarker
public class CfnStackStackConfigurationManagerPropertyDsl {
    private val cdkBuilder: CfnStack.StackConfigurationManagerProperty.Builder =
        CfnStack.StackConfigurationManagerProperty.builder()

    /** @param name The name. This parameter must be set to `Chef` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param version The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux
     *   stacks, and to 12.2 for Windows stacks. The default value for Linux stacks is 12.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnStack.StackConfigurationManagerProperty = cdkBuilder.build()
}
