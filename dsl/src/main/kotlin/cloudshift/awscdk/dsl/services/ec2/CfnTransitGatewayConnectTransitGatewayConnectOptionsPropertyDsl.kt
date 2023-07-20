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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayConnectTransitGatewayConnectOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder =
        CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.builder()

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty =
        cdkBuilder.build()
}
