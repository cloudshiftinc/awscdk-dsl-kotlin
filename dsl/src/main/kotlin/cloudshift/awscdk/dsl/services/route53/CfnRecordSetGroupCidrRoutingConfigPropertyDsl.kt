@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import kotlin.String

@CdkDslMarker
public class CfnRecordSetGroupCidrRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnRecordSetGroup.CidrRoutingConfigProperty.Builder =
        CfnRecordSetGroup.CidrRoutingConfigProperty.builder()

    public fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
    }

    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    public fun build(): CfnRecordSetGroup.CidrRoutingConfigProperty = cdkBuilder.build()
}
