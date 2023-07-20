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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import kotlin.String

@CdkDslMarker
public class CfnIdentityProviderConfigRequiredClaimPropertyDsl {
    private val cdkBuilder: CfnIdentityProviderConfig.RequiredClaimProperty.Builder =
        CfnIdentityProviderConfig.RequiredClaimProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIdentityProviderConfig.RequiredClaimProperty = cdkBuilder.build()
}
