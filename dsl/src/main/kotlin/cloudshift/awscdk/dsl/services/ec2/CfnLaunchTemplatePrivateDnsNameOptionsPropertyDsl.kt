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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplatePrivateDnsNameOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.PrivateDnsNameOptionsProperty.Builder =
        CfnLaunchTemplate.PrivateDnsNameOptionsProperty.builder()

    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    public fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
    }

    public fun build(): CfnLaunchTemplate.PrivateDnsNameOptionsProperty = cdkBuilder.build()
}
