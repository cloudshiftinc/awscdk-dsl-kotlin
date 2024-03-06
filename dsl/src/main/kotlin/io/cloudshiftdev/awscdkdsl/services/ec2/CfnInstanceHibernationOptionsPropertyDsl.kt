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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the hibernation options for the instance.
 *
 * `HibernationOptions` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
 * .configured(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html)
 */
@CdkDslMarker
public class CfnInstanceHibernationOptionsPropertyDsl {
    private val cdkBuilder: CfnInstance.HibernationOptionsProperty.Builder =
        CfnInstance.HibernationOptionsProperty.builder()

    /**
     * @param configured Set to `true` to enable your instance for hibernation. For Spot Instances,
     *   if you set `Configured` to `true` , either omit the `InstanceInterruptionBehavior`
     *   parameter (for
     *   [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
     *   ), or set it to `hibernate` . When `Configured` is true:
     * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
     * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get an
     *   error.
     *
     * Default: `false`
     */
    public fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
    }

    /**
     * @param configured Set to `true` to enable your instance for hibernation. For Spot Instances,
     *   if you set `Configured` to `true` , either omit the `InstanceInterruptionBehavior`
     *   parameter (for
     *   [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
     *   ), or set it to `hibernate` . When `Configured` is true:
     * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
     * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get an
     *   error.
     *
     * Default: `false`
     */
    public fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured)
    }

    public fun build(): CfnInstance.HibernationOptionsProperty = cdkBuilder.build()
}
