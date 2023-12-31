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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex data type for the status codes that you specify that, when returned by a primary
 * origin, trigger CloudFront to failover to a second origin.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * StatusCodesProperty statusCodesProperty = StatusCodesProperty.builder()
 * .items(List.of(123))
 * .quantity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html)
 */
@CdkDslMarker
public class CfnDistributionStatusCodesPropertyDsl {
    private val cdkBuilder: CfnDistribution.StatusCodesProperty.Builder =
        CfnDistribution.StatusCodesProperty.builder()

    private val _items: MutableList<Number> = mutableListOf()

    /** @param items The items (status codes) for an origin group. */
    public fun items(vararg items: Number) {
        _items.addAll(listOf(*items))
    }

    /** @param items The items (status codes) for an origin group. */
    public fun items(items: Collection<Number>) {
        _items.addAll(items)
    }

    /** @param items The items (status codes) for an origin group. */
    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    /** @param quantity The number of status codes. */
    public fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
    }

    public fun build(): CfnDistribution.StatusCodesProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
