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

@CdkDslMarker
public class CfnTemplateShapeConditionalFormatPropertyDsl {
    private val cdkBuilder: CfnTemplate.ShapeConditionalFormatProperty.Builder =
        CfnTemplate.ShapeConditionalFormatProperty.builder()

    public fun backgroundColor(backgroundColor: IResolvable) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun backgroundColor(backgroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun build(): CfnTemplate.ShapeConditionalFormatProperty = cdkBuilder.build()
}
