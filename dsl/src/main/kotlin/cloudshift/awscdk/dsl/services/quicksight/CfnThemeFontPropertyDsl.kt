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
import software.amazon.awscdk.services.quicksight.CfnTheme
import kotlin.String

@CdkDslMarker
public class CfnThemeFontPropertyDsl {
    private val cdkBuilder: CfnTheme.FontProperty.Builder = CfnTheme.FontProperty.builder()

    public fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
    }

    public fun build(): CfnTheme.FontProperty = cdkBuilder.build()
}
