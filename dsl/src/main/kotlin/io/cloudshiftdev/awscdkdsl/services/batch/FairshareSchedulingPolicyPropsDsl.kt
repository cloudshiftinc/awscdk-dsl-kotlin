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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps
import software.amazon.awscdk.services.batch.Share

/**
 * Fairshare SchedulingPolicy configuration.
 *
 * Example:
 * ```
 * FairshareSchedulingPolicy fairsharePolicy = FairshareSchedulingPolicy.Builder.create(this,
 * "myFairsharePolicy")
 * .shareDecay(Duration.minutes(5))
 * .build();
 * ```
 */
@CdkDslMarker
public class FairshareSchedulingPolicyPropsDsl {
    private val cdkBuilder: FairshareSchedulingPolicyProps.Builder =
        FairshareSchedulingPolicyProps.builder()

    private val _shares: MutableList<Share> = mutableListOf()

    /**
     * @param computeReservation Used to calculate the percentage of the maximum available vCPU to
     *   reserve for share identifiers not present in the Queue. The percentage reserved is defined
     *   by the Scheduler as: `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares`
     *   is the number of active fair share identifiers.
     *
     * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
     * maximum available vCPU if there's only one fair share identifier. It reserves 25% if there
     * are two fair share identifiers. It reserves 12.5% if there are three fair share identifiers.
     *
     * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the maximum
     * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
     * identifiers, and 1.56% if there are three fair share identifiers.
     */
    public fun computeReservation(computeReservation: Number) {
        cdkBuilder.computeReservation(computeReservation)
    }

    /** @param schedulingPolicyName The name of this SchedulingPolicy. */
    public fun schedulingPolicyName(schedulingPolicyName: String) {
        cdkBuilder.schedulingPolicyName(schedulingPolicyName)
    }

    /**
     * @param shareDecay The amount of time to use to measure the usage of each job. The usage is
     *   used to calculate a fair share percentage for each fair share identifier currently in the
     *   Queue. A value of zero (0) indicates that only current usage is measured. The decay is
     *   linear and gives preference to newer jobs.
     *
     * The maximum supported value is 604800 seconds (1 week).
     */
    public fun shareDecay(shareDecay: Duration) {
        cdkBuilder.shareDecay(shareDecay)
    }

    /**
     * @param shares The shares that this Scheduling Policy applies to. *Note*: It is possible to
     *   submit Jobs to the queue with Share Identifiers that are not recognized by the Scheduling
     *   Policy.
     */
    public fun shares(shares: ShareDsl.() -> Unit) {
        _shares.add(ShareDsl().apply(shares).build())
    }

    /**
     * @param shares The shares that this Scheduling Policy applies to. *Note*: It is possible to
     *   submit Jobs to the queue with Share Identifiers that are not recognized by the Scheduling
     *   Policy.
     */
    public fun shares(shares: Collection<Share>) {
        _shares.addAll(shares)
    }

    public fun build(): FairshareSchedulingPolicyProps {
        if (_shares.isNotEmpty()) cdkBuilder.shares(_shares)
        return cdkBuilder.build()
    }
}
