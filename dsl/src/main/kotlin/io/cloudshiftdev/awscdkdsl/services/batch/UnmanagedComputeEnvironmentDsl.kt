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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Unmanaged ComputeEnvironments do not provision or manage EC2 instances on your behalf.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class UnmanagedComputeEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UnmanagedComputeEnvironment.Builder =
        UnmanagedComputeEnvironment.Builder.create(scope, id)

    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment.
     */
    public fun computeEnvironmentName(computeEnvironmentName: String) {
        cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * Whether or not this ComputeEnvironment can accept jobs from a Queue.
     *
     * Enabled ComputeEnvironments can accept jobs from a Queue and can scale instances up or down.
     * Disabled ComputeEnvironments cannot accept jobs from a Queue or scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs, Jobs
     * in the `STARTED` or `RUNNING` states will not be interrupted. As jobs complete, the
     * ComputeEnvironment will scale instances down to `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     *
     * Default: true
     *
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     *
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     *   such as provision instances to run your jobs.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
     * `Queue`s that use `FairshareSchedulingPolicy`s.
     *
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**; that is,
     * the `FairshareSchedulingPolicy` is ignored.
     *
     * Default: 0
     *
     * @param unmanagedvCpus The vCPUs this Compute Environment provides. Used only by the scheduler
     *   to schedule jobs in `Queue`s that use `FairshareSchedulingPolicy`s.
     */
    public fun unmanagedvCpus(unmanagedvCpus: Number) {
        cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    public fun build(): UnmanagedComputeEnvironment = cdkBuilder.build()
}