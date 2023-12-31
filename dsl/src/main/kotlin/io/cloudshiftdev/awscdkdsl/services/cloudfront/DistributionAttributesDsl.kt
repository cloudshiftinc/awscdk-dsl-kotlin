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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.DistributionAttributes

/**
 * Attributes used to import a Distribution.
 *
 * Example:
 * ```
 * // Using a reference to an imported Distribution
 * IDistribution distribution = Distribution.fromDistributionAttributes(this, "ImportedDist",
 * DistributionAttributes.builder()
 * .domainName("d111111abcdef8.cloudfront.net")
 * .distributionId("012345ABCDEF")
 * .build());
 * ```
 */
@CdkDslMarker
public class DistributionAttributesDsl {
    private val cdkBuilder: DistributionAttributes.Builder = DistributionAttributes.builder()

    /** @param distributionId The distribution ID for this distribution. */
    public fun distributionId(distributionId: String) {
        cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param domainName The generated domain name of the Distribution, such as
     *   d111111abcdef8.cloudfront.net.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): DistributionAttributes = cdkBuilder.build()
}
