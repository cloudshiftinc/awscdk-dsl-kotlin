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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainMasterUserOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.MasterUserOptionsProperty.Builder =
        CfnDomain.MasterUserOptionsProperty.builder()

    public fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
    }

    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    public fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public fun build(): CfnDomain.MasterUserOptionsProperty = cdkBuilder.build()
}
