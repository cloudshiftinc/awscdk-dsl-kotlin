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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.route53.CfnCidrCollection

/**
 * Specifies the list of CIDR blocks for a CIDR location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * LocationProperty locationProperty = LocationProperty.builder()
 * .cidrList(List.of("cidrList"))
 * .locationName("locationName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html)
 */
@CdkDslMarker
public class CfnCidrCollectionLocationPropertyDsl {
    private val cdkBuilder: CfnCidrCollection.LocationProperty.Builder =
        CfnCidrCollection.LocationProperty.builder()

    private val _cidrList: MutableList<String> = mutableListOf()

    /** @param cidrList List of CIDR blocks. */
    public fun cidrList(vararg cidrList: String) {
        _cidrList.addAll(listOf(*cidrList))
    }

    /** @param cidrList List of CIDR blocks. */
    public fun cidrList(cidrList: Collection<String>) {
        _cidrList.addAll(cidrList)
    }

    /** @param locationName The CIDR collection location name. */
    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    public fun build(): CfnCidrCollection.LocationProperty {
        if (_cidrList.isNotEmpty()) cdkBuilder.cidrList(_cidrList)
        return cdkBuilder.build()
    }
}
