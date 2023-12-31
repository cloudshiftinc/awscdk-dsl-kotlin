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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.DkimIdentityConfig
import software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength

/**
 * Configuration for DKIM identity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DkimIdentityConfig dkimIdentityConfig = DkimIdentityConfig.builder()
 * .domainSigningPrivateKey("domainSigningPrivateKey")
 * .domainSigningSelector("domainSigningSelector")
 * .nextSigningKeyLength(EasyDkimSigningKeyLength.RSA_1024_BIT)
 * .build();
 * ```
 */
@CdkDslMarker
public class DkimIdentityConfigDsl {
    private val cdkBuilder: DkimIdentityConfig.Builder = DkimIdentityConfig.builder()

    /** @param domainSigningPrivateKey A private key that's used to generate a DKIM signature. */
    public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    /**
     * @param domainSigningSelector A string that's used to identify a public key in the DNS
     *   configuration for a domain.
     */
    public fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    /**
     * @param nextSigningKeyLength The key length of the future DKIM key pair to be generated. This
     *   can be changed at most once per day.
     */
    public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
    }

    public fun build(): DkimIdentityConfig = cdkBuilder.build()
}
