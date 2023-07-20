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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateParameterSliderControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.ParameterSliderControlProperty.Builder =
        CfnTemplate.ParameterSliderControlProperty.builder()

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnTemplate.SliderControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun maximumValue(maximumValue: Number) {
        cdkBuilder.maximumValue(maximumValue)
    }

    public fun minimumValue(minimumValue: Number) {
        cdkBuilder.minimumValue(minimumValue)
    }

    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun stepSize(stepSize: Number) {
        cdkBuilder.stepSize(stepSize)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnTemplate.ParameterSliderControlProperty = cdkBuilder.build()
}
