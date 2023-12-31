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

package io.cloudshiftdev.awscdkdsl.services.signer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.signer.SigningProfileAttributes

/**
 * A reference to a Signing Profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.signer.*;
 * SigningProfileAttributes signingProfileAttributes = SigningProfileAttributes.builder()
 * .signingProfileName("signingProfileName")
 * .signingProfileVersion("signingProfileVersion")
 * .build();
 * ```
 */
@CdkDslMarker
public class SigningProfileAttributesDsl {
    private val cdkBuilder: SigningProfileAttributes.Builder = SigningProfileAttributes.builder()

    /** @param signingProfileName The name of signing profile. */
    public fun signingProfileName(signingProfileName: String) {
        cdkBuilder.signingProfileName(signingProfileName)
    }

    /** @param signingProfileVersion The version of signing profile. */
    public fun signingProfileVersion(signingProfileVersion: String) {
        cdkBuilder.signingProfileVersion(signingProfileVersion)
    }

    public fun build(): SigningProfileAttributes = cdkBuilder.build()
}
