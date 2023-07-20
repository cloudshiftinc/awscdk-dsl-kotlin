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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import kotlin.Number

@CdkDslMarker
public class CfnConnectPeerBgpOptionsPropertyDsl {
    private val cdkBuilder: CfnConnectPeer.BgpOptionsProperty.Builder =
        CfnConnectPeer.BgpOptionsProperty.builder()

    public fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
    }

    public fun build(): CfnConnectPeer.BgpOptionsProperty = cdkBuilder.build()
}
