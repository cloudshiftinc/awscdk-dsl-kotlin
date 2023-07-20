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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.athena.CfnWorkGroup
import kotlin.String

@CdkDslMarker
public class CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder =
        CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder()

    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty =
        cdkBuilder.build()
}
