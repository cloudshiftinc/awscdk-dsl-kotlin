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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateVisualSubtitleLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.VisualSubtitleLabelOptionsProperty.Builder =
        CfnTemplate.VisualSubtitleLabelOptionsProperty.builder()

    public fun formatText(formatText: IResolvable) {
        cdkBuilder.formatText(formatText)
    }

    public fun formatText(formatText: CfnTemplate.LongFormatTextProperty) {
        cdkBuilder.formatText(formatText)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.VisualSubtitleLabelOptionsProperty = cdkBuilder.build()
}
