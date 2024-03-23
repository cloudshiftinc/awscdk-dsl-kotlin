@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Common options across all generations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * AmazonLinuxImageSsmParameterCommonOptions amazonLinuxImageSsmParameterCommonOptions =
 * AmazonLinuxImageSsmParameterCommonOptions.builder()
 * .cachedInContext(false)
 * .cpuType(AmazonLinuxCpuType.ARM_64)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .userData(userData)
 * .build();
 * ```
 */
public interface AmazonLinuxImageSsmParameterCommonOptions : AmazonLinuxImageSsmParameterBaseOptions
    {
  /**
   * CPU Type.
   *
   * Default: AmazonLinuxCpuType.X86_64
   */
  public fun cpuType(): AmazonLinuxCpuType? =
      unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

  /**
   * What edition of Amazon Linux to use.
   *
   * Default: AmazonLinuxEdition.Standard
   */
  public fun edition(): AmazonLinuxEdition? =
      unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

  /**
   * A builder for [AmazonLinuxImageSsmParameterCommonOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * @param cpuType CPU Type.
     */
    public fun cpuType(cpuType: AmazonLinuxCpuType)

    /**
     * @param edition What edition of Amazon Linux to use.
     */
    public fun edition(edition: AmazonLinuxEdition)

    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions.builder()

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * @param cpuType CPU Type.
     */
    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    /**
     * @param edition What edition of Amazon Linux to use.
     */
    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions,
  ) : CdkObject(cdkObject), AmazonLinuxImageSsmParameterCommonOptions {
    /**
     * Whether the AMI ID is cached to be stable between deployments.
     *
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     *
     * Default: false
     */
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    /**
     * CPU Type.
     *
     * Default: AmazonLinuxCpuType.X86_64
     */
    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: AmazonLinuxEdition.Standard
     */
    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinuxImageSsmParameterCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions):
        AmazonLinuxImageSsmParameterCommonOptions = CdkObjectWrappers.wrap(cdkObject) as?
        AmazonLinuxImageSsmParameterCommonOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterCommonOptions):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions
  }
}
