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
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxStorage
import software.amazon.awscdk.services.ec2.AmazonLinuxVirt
import software.amazon.awscdk.services.ec2.UserData

/**
 * Properties specific to amzn2 images.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * // Amazon Linux 2
 * // Amazon Linux 2
 * Instance.Builder.create(this, "Instance2")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .build();
 * // Amazon Linux 2 with kernel 5.x
 * // Amazon Linux 2 with kernel 5.x
 * Instance.Builder.create(this, "Instance3")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2(AmazonLinux2ImageSsmParameterProps.builder()
 * .kernel(AmazonLinux2Kernel.KERNEL_5_10)
 * .build()))
 * .build();
 * // Amazon Linux 2023
 * // Amazon Linux 2023
 * Instance.Builder.create(this, "Instance4")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .build();
 * // Graviton 3 Processor
 * // Graviton 3 Processor
 * Instance.Builder.create(this, "Instance5")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
 * .cpuType(AmazonLinuxCpuType.ARM_64)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class AmazonLinux2ImageSsmParameterPropsDsl {
    private val cdkBuilder: AmazonLinux2ImageSsmParameterProps.Builder =
        AmazonLinux2ImageSsmParameterProps.builder()

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. By
     *   default, the newest image is used on each deployment. This will cause instances to be
     *   replaced whenever a new version is released, and may cause downtime if there aren't enough
     *   running instances in the AutoScalingGroup to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the same value will be
     * used on future runs. Your instances will not be replaced but your AMI version will grow old
     * over time. To refresh the AMI lookup, you will have to evict the value from the cache using
     * the `cdk context` command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    /** @param cpuType CPU Type. */
    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    /** @param edition What edition of Amazon Linux to use. */
    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    /** @param kernel What kernel version of Amazon Linux to use. */
    public fun kernel(kernel: AmazonLinux2Kernel) {
        cdkBuilder.kernel(kernel)
    }

    /** @param storage What storage backed image to use. */
    public fun storage(storage: AmazonLinuxStorage) {
        cdkBuilder.storage(storage)
    }

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /** @param virtualization Virtualization type. */
    public fun virtualization(virtualization: AmazonLinuxVirt) {
        cdkBuilder.virtualization(virtualization)
    }

    public fun build(): AmazonLinux2ImageSsmParameterProps = cdkBuilder.build()
}
