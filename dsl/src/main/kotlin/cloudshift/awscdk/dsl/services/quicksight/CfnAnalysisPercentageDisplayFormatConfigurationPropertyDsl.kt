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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisPercentageDisplayFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PercentageDisplayFormatConfigurationProperty.Builder =
        CfnAnalysis.PercentageDisplayFormatConfigurationProperty.builder()

    public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    public fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnAnalysis.DecimalPlacesConfigurationProperty) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    public fun negativeValueConfiguration(negativeValueConfiguration: CfnAnalysis.NegativeValueConfigurationProperty) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnAnalysis.NullValueFormatConfigurationProperty) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun separatorConfiguration(separatorConfiguration: IResolvable) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    public fun separatorConfiguration(separatorConfiguration: CfnAnalysis.NumericSeparatorConfigurationProperty) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun build(): CfnAnalysis.PercentageDisplayFormatConfigurationProperty = cdkBuilder.build()
}
