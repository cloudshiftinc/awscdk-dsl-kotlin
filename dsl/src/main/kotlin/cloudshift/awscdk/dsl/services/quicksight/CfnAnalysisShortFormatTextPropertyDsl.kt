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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisShortFormatTextPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ShortFormatTextProperty.Builder =
        CfnAnalysis.ShortFormatTextProperty.builder()

    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnAnalysis.ShortFormatTextProperty = cdkBuilder.build()
}
