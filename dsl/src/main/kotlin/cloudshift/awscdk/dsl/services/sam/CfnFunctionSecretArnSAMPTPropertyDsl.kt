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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionSecretArnSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.SecretArnSAMPTProperty.Builder =
        CfnFunction.SecretArnSAMPTProperty.builder()

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnFunction.SecretArnSAMPTProperty = cdkBuilder.build()
}
