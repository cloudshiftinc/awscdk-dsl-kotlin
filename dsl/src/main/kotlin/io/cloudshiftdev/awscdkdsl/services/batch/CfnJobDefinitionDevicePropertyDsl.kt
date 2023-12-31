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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that represents a container instance host device.
 *
 * This object isn't applicable to jobs that are running on Fargate resources and shouldn't be
 * provided.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * DeviceProperty deviceProperty = DeviceProperty.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * .permissions(List.of("permissions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html)
 */
@CdkDslMarker
public class CfnJobDefinitionDevicePropertyDsl {
    private val cdkBuilder: CfnJobDefinition.DeviceProperty.Builder =
        CfnJobDefinition.DeviceProperty.builder()

    private val _permissions: MutableList<String> = mutableListOf()

    /**
     * @param containerPath The path inside the container that's used to expose the host device. By
     *   default, the `hostPath` value is used.
     */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /** @param hostPath The path for the device on the host container instance. */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device. By
     *   default, the container has permissions for `read` , `write` , and `mknod` for the device.
     */
    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device. By
     *   default, the container has permissions for `read` , `write` , and `mknod` for the device.
     */
    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    public fun build(): CfnJobDefinition.DeviceProperty {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
