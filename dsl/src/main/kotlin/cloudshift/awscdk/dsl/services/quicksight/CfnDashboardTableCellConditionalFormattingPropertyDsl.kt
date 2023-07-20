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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardTableCellConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableCellConditionalFormattingProperty.Builder =
        CfnDashboard.TableCellConditionalFormattingProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun textFormat(textFormat: IResolvable) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun textFormat(textFormat: CfnDashboard.TextConditionalFormatProperty) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun build(): CfnDashboard.TableCellConditionalFormattingProperty = cdkBuilder.build()
}
