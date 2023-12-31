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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information system user and group that the AWS IoT Greengrass Core software uses to run
 * component processes on the core device.
 *
 * For more information, see
 * [Configure the user and group that run components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
 * in the *AWS IoT Greengrass V2 Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * ComponentRunWithProperty componentRunWithProperty = ComponentRunWithProperty.builder()
 * .posixUser("posixUser")
 * .systemResourceLimits(SystemResourceLimitsProperty.builder()
 * .cpus(123)
 * .memory(123)
 * .build())
 * .windowsUser("windowsUser")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html)
 */
@CdkDslMarker
public class CfnDeploymentComponentRunWithPropertyDsl {
    private val cdkBuilder: CfnDeployment.ComponentRunWithProperty.Builder =
        CfnDeployment.ComponentRunWithProperty.builder()

    /**
     * @param posixUser The POSIX system user and (optional) group to use to run this component.
     *   Specify the user and group separated by a colon ( `:` ) in the following format:
     *   `user:group` . The group is optional. If you don't specify a group, the AWS IoT Greengrass
     *   Core software uses the primary user for the group.
     */
    public fun posixUser(posixUser: String) {
        cdkBuilder.posixUser(posixUser)
    }

    /**
     * @param systemResourceLimits The system resource limits to apply to this component's process
     *   on the core device. AWS IoT Greengrass supports this feature only on Linux core devices.
     *
     * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
     * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
     * information, see
     * [Configure system resource limits for components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
     * .
     */
    public fun systemResourceLimits(systemResourceLimits: IResolvable) {
        cdkBuilder.systemResourceLimits(systemResourceLimits)
    }

    /**
     * @param systemResourceLimits The system resource limits to apply to this component's process
     *   on the core device. AWS IoT Greengrass supports this feature only on Linux core devices.
     *
     * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
     * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
     * information, see
     * [Configure system resource limits for components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
     * .
     */
    public fun systemResourceLimits(
        systemResourceLimits: CfnDeployment.SystemResourceLimitsProperty
    ) {
        cdkBuilder.systemResourceLimits(systemResourceLimits)
    }

    /**
     * @param windowsUser The Windows user to use to run this component on Windows core devices. The
     *   user must exist on each Windows core device, and its name and password must be in the
     *   LocalSystem account's Credentials Manager instance.
     *
     * If you omit this parameter, the AWS IoT Greengrass Core software uses the default Windows
     * user that you configure on the AWS IoT Greengrass nucleus component. For more information,
     * see
     * [Configure the user and group that run components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     * .
     */
    public fun windowsUser(windowsUser: String) {
        cdkBuilder.windowsUser(windowsUser)
    }

    public fun build(): CfnDeployment.ComponentRunWithProperty = cdkBuilder.build()
}
