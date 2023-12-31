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

package io.cloudshiftdev.awscdkdsl.services.directoryservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD

/**
 * Contains VPC information for the
 * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
 * or
 * [CreateMicrosoftAD](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateMicrosoftAD.html)
 * operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.directoryservice.*;
 * VpcSettingsProperty vpcSettingsProperty = VpcSettingsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html)
 */
@CdkDslMarker
public class CfnMicrosoftADVpcSettingsPropertyDsl {
    private val cdkBuilder: CfnMicrosoftAD.VpcSettingsProperty.Builder =
        CfnMicrosoftAD.VpcSettingsProperty.builder()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param subnetIds The identifiers of the subnets for the directory servers. The two subnets
     *   must be in different Availability Zones. AWS Directory Service specifies a directory server
     *   and a DNS server in each of these subnets.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The identifiers of the subnets for the directory servers. The two subnets
     *   must be in different Availability Zones. AWS Directory Service specifies a directory server
     *   and a DNS server in each of these subnets.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param vpcId The identifier of the VPC in which to create the directory. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnMicrosoftAD.VpcSettingsProperty {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
