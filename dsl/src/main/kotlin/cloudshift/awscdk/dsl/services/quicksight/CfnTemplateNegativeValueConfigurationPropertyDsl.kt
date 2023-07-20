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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateNegativeValueConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.NegativeValueConfigurationProperty.Builder =
        CfnTemplate.NegativeValueConfigurationProperty.builder()

    public fun displayMode(displayMode: String) {
        cdkBuilder.displayMode(displayMode)
    }

    public fun build(): CfnTemplate.NegativeValueConfigurationProperty = cdkBuilder.build()
}
