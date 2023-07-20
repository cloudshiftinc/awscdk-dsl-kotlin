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
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import kotlin.String

@CdkDslMarker
public class CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.builder()

    public fun clientRootCertificateChainArn(clientRootCertificateChainArn: String) {
        cdkBuilder.clientRootCertificateChainArn(clientRootCertificateChainArn)
    }

    public fun build(): CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty =
        cdkBuilder.build()
}
