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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.VdmAttributes
import software.constructs.Construct

/**
 * Virtual Deliverablity Manager (VDM) attributes.
 *
 * Example:
 * ```
 * // Enables engagement tracking and optimized shared delivery by default
 * // Enables engagement tracking and optimized shared delivery by default
 * new VdmAttributes(this, "Vdm");
 * ```
 */
@CdkDslMarker
public class VdmAttributesDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VdmAttributes.Builder = VdmAttributes.Builder.create(scope, id)

    /**
     * Whether engagement metrics are enabled for your account.
     *
     * Default: true
     *
     * @param engagementMetrics Whether engagement metrics are enabled for your account.
     */
    public fun engagementMetrics(engagementMetrics: Boolean) {
        cdkBuilder.engagementMetrics(engagementMetrics)
    }

    /**
     * Whether optimized shared delivery is enabled for your account.
     *
     * Default: true
     *
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): VdmAttributes = cdkBuilder.build()
}
