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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * Configuration of requested EBS block device associated with the instance group with count of
 * volumes that are associated to every instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
 * EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder =
        CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder()

    /**
     * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
     *   and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
     *   instance in the cluster.
     */
    public fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    /**
     * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
     *   and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
     *   instance in the cluster.
     */
    public fun volumeSpecification(
        volumeSpecification: CfnInstanceGroupConfig.VolumeSpecificationProperty
    ) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    /**
     * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that are
     *   associated with every instance in the instance group.
     */
    public fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
    }

    public fun build(): CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
