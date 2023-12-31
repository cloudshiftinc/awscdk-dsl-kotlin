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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a local file certificate.
 *
 * The certificate must meet specific requirements and you must have proxy authorization enabled.
 * For more information, see
 * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsFileCertificateProperty listenerTlsFileCertificateProperty =
 * ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html)
 */
@CdkDslMarker
public class CfnVirtualNodeListenerTlsFileCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder =
        CfnVirtualNode.ListenerTlsFileCertificateProperty.builder()

    /** @param certificateChain The certificate chain for the certificate. */
    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * @param privateKey The private key for a certificate stored on the file system of the virtual
     *   node that the proxy is running on.
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    public fun build(): CfnVirtualNode.ListenerTlsFileCertificateProperty = cdkBuilder.build()
}
