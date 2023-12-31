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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.BlockDeviceVolume

/**
 * Block device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * BlockDeviceVolume blockDeviceVolume;
 * BlockDevice blockDevice = BlockDevice.builder()
 * .deviceName("deviceName")
 * .volume(blockDeviceVolume)
 * // the properties below are optional
 * .mappingEnabled(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class BlockDeviceDsl {
    private val cdkBuilder: BlockDevice.Builder = BlockDevice.builder()

    /**
     * @param deviceName The device name exposed to the EC2 instance. For example, a value like
     *   `/dev/sdh`, `xvdh`.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param mappingEnabled If false, the device mapping will be suppressed. If set to false for
     *   the root device, the instance might fail the Amazon EC2 health check. Amazon EC2 Auto
     *   Scaling launches a replacement instance if the instance fails the health check.
     */
    public fun mappingEnabled(mappingEnabled: Boolean) {
        cdkBuilder.mappingEnabled(mappingEnabled)
    }

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     *   ephemeral instance store volume. For example, a value like `BlockDeviceVolume.ebs(15)`,
     *   `BlockDeviceVolume.ephemeral(0)`.
     */
    public fun volume(volume: BlockDeviceVolume) {
        cdkBuilder.volume(volume)
    }

    public fun build(): BlockDevice = cdkBuilder.build()
}
