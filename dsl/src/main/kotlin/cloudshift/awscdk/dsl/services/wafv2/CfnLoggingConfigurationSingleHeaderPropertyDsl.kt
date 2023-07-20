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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationSingleHeaderPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.SingleHeaderProperty.Builder =
        CfnLoggingConfiguration.SingleHeaderProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnLoggingConfiguration.SingleHeaderProperty = cdkBuilder.build()
}
