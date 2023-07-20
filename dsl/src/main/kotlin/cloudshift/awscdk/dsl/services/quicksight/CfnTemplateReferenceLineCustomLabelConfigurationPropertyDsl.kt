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
public class CfnTemplateReferenceLineCustomLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineCustomLabelConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineCustomLabelConfigurationProperty.builder()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun build(): CfnTemplate.ReferenceLineCustomLabelConfigurationProperty = cdkBuilder.build()
}
