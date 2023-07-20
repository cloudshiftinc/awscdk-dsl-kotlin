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
public class CfnTemplateTextFieldControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TextFieldControlDisplayOptionsProperty.Builder =
        CfnTemplate.TextFieldControlDisplayOptionsProperty.builder()

    public fun placeholderOptions(placeholderOptions: IResolvable) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun placeholderOptions(placeholderOptions: CfnTemplate.TextControlPlaceholderOptionsProperty) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnTemplate.TextFieldControlDisplayOptionsProperty = cdkBuilder.build()
}
