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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationMarketoSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.MarketoSourcePropertiesProperty.Builder =
        CfnIntegration.MarketoSourcePropertiesProperty.builder()

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnIntegration.MarketoSourcePropertiesProperty = cdkBuilder.build()
}
