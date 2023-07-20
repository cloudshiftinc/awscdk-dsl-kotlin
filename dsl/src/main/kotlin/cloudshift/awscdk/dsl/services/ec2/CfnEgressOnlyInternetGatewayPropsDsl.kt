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
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
import kotlin.String

@CdkDslMarker
public class CfnEgressOnlyInternetGatewayPropsDsl {
    private val cdkBuilder: CfnEgressOnlyInternetGatewayProps.Builder =
        CfnEgressOnlyInternetGatewayProps.builder()

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnEgressOnlyInternetGatewayProps = cdkBuilder.build()
}
