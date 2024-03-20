@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Unmanaged ComputeEnvironments do not provision or manage EC2 instances on your behalf.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * UnmanagedComputeEnvironment unmanagedComputeEnvironment =
 * UnmanagedComputeEnvironment.Builder.create(this, "MyUnmanagedComputeEnvironment")
 * .computeEnvironmentName("computeEnvironmentName")
 * .enabled(false)
 * .serviceRole(role)
 * .unmanagedvCpus(123)
 * .build();
 * ```
 */
public open class UnmanagedComputeEnvironment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment,
) : Resource(cdkObject), IUnmanagedComputeEnvironment, IComputeEnvironment {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UnmanagedComputeEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(UnmanagedComputeEnvironmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UnmanagedComputeEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, UnmanagedComputeEnvironmentProps(props)
  )

  /**
   * The ARN of this compute environment.
   */
  public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

  /**
   * The name of the ComputeEnvironment.
   */
  public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

  /**
   * Whether or not this ComputeEnvironment can accept jobs from a Queue.
   *
   * Enabled ComputeEnvironments can accept jobs from a Queue and
   * can scale instances up or down.
   * Disabled ComputeEnvironments cannot accept jobs from a Queue or
   * scale instances up or down.
   *
   * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs,
   * Jobs in the `STARTED` or `RUNNING` states will not
   * be interrupted. As jobs complete, the ComputeEnvironment will scale instances down to
   * `minvCpus`.
   *
   * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
   */
  public override fun enabled(): Boolean = unwrap(this).getEnabled()

  /**
   * The role Batch uses to perform actions on your behalf in your account, such as provision
   * instances to run your jobs.
   */
  public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  /**
   * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
   * `Queue`s that use `FairshareSchedulingPolicy`s.
   *
   * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
   * that is, the `FairshareSchedulingPolicy` is ignored.
   */
  public override fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.UnmanagedComputeEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment. 
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

    /**
     * Whether or not this ComputeEnvironment can accept jobs from a Queue.
     *
     * Enabled ComputeEnvironments can accept jobs from a Queue and
     * can scale instances up or down.
     * Disabled ComputeEnvironments cannot accept jobs from a Queue or
     * scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs,
     * Jobs in the `STARTED` or `RUNNING` states will not
     * be interrupted. As jobs complete, the ComputeEnvironment will scale instances down to
     * `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     *
     * Default: true
     *
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     *
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs. 
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
     * `Queue`s that use `FairshareSchedulingPolicy`s.
     *
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     *
     * Default: 0
     *
     * @param unmanagedvCpus The vCPUs this Compute Environment provides. Used only by the scheduler
     * to schedule jobs in `Queue`s that use `FairshareSchedulingPolicy`s. 
     */
    public fun unmanagedvCpus(unmanagedvCpus: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.Builder.create(scope, id)

    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment. 
     */
    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * Whether or not this ComputeEnvironment can accept jobs from a Queue.
     *
     * Enabled ComputeEnvironments can accept jobs from a Queue and
     * can scale instances up or down.
     * Disabled ComputeEnvironments cannot accept jobs from a Queue or
     * scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs,
     * Jobs in the `STARTED` or `RUNNING` states will not
     * be interrupted. As jobs complete, the ComputeEnvironment will scale instances down to
     * `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     *
     * Default: true
     *
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     *
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
     * `Queue`s that use `FairshareSchedulingPolicy`s.
     *
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     *
     * Default: 0
     *
     * @param unmanagedvCpus The vCPUs this Compute Environment provides. Used only by the scheduler
     * to schedule jobs in `Queue`s that use `FairshareSchedulingPolicy`s. 
     */
    override fun unmanagedvCpus(unmanagedvCpus: Number) {
      cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    public fun build(): software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromUnmanagedComputeEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      unmanagedComputeEnvironmentArn: String,
    ): IUnmanagedComputeEnvironment =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment.fromUnmanagedComputeEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, unmanagedComputeEnvironmentArn).let(IUnmanagedComputeEnvironment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UnmanagedComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UnmanagedComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment):
        UnmanagedComputeEnvironment = UnmanagedComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: UnmanagedComputeEnvironment):
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment = wrapped.cdkObject
  }
}
