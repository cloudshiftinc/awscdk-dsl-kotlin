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
public class CfnTemplateConditionalFormattingIconDisplayConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.Builder =
        CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.builder()

    public fun iconDisplayOption(iconDisplayOption: String) {
        cdkBuilder.iconDisplayOption(iconDisplayOption)
    }

    public fun build(): CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty =
        cdkBuilder.build()
}
