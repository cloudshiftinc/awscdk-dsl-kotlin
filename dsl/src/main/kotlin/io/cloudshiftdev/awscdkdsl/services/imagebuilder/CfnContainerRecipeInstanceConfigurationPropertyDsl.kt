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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

/**
 * Defines a custom base AMI and block device mapping configurations of an instance used for
 * building and testing container images.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * InstanceConfigurationProperty instanceConfigurationProperty =
 * InstanceConfigurationProperty.builder()
 * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build()))
 * .image("image")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html)
 */
@CdkDslMarker
public class CfnContainerRecipeInstanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnContainerRecipe.InstanceConfigurationProperty.Builder =
        CfnContainerRecipe.InstanceConfigurationProperty.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    /**
     * @param blockDeviceMappings Defines the block devices to attach for building an instance from
     *   this Image Builder AMI.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * @param blockDeviceMappings Defines the block devices to attach for building an instance from
     *   this Image Builder AMI.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings Defines the block devices to attach for building an instance from
     *   this Image Builder AMI.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * @param image The AMI ID to use as the base image for a container build and test instance. If
     *   not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun build(): CfnContainerRecipe.InstanceConfigurationProperty {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        return cdkBuilder.build()
    }
}
