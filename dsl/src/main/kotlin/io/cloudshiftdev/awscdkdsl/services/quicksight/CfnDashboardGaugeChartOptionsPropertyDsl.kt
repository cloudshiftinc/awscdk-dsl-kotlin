@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the presentation of the `GaugeChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GaugeChartOptionsProperty gaugeChartOptionsProperty = GaugeChartOptionsProperty.builder()
 * .arc(ArcConfigurationProperty.builder()
 * .arcAngle(123)
 * .arcThickness("arcThickness")
 * .build())
 * .arcAxis(ArcAxisConfigurationProperty.builder()
 * .range(ArcAxisDisplayRangeProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .reserveRange(123)
 * .build())
 * .comparison(ComparisonConfigurationProperty.builder()
 * .comparisonFormat(ComparisonFormatConfigurationProperty.builder()
 * .numberDisplayFormatConfiguration(NumberDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numberScale("numberScale")
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .percentageDisplayFormatConfiguration(PercentageDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .build())
 * .comparisonMethod("comparisonMethod")
 * .build())
 * .primaryValueDisplayType("primaryValueDisplayType")
 * .primaryValueFontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-gaugechartoptions.html)
 */
@CdkDslMarker
public class CfnDashboardGaugeChartOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GaugeChartOptionsProperty.Builder =
        CfnDashboard.GaugeChartOptionsProperty.builder()

    /** @param arc The arc configuration of a `GaugeChartVisual` . */
    public fun arc(arc: IResolvable) {
        cdkBuilder.arc(arc)
    }

    /** @param arc The arc configuration of a `GaugeChartVisual` . */
    public fun arc(arc: CfnDashboard.ArcConfigurationProperty) {
        cdkBuilder.arc(arc)
    }

    /** @param arcAxis The arc axis configuration of a `GaugeChartVisual` . */
    public fun arcAxis(arcAxis: IResolvable) {
        cdkBuilder.arcAxis(arcAxis)
    }

    /** @param arcAxis The arc axis configuration of a `GaugeChartVisual` . */
    public fun arcAxis(arcAxis: CfnDashboard.ArcAxisConfigurationProperty) {
        cdkBuilder.arcAxis(arcAxis)
    }

    /** @param comparison The comparison configuration of a `GaugeChartVisual` . */
    public fun comparison(comparison: IResolvable) {
        cdkBuilder.comparison(comparison)
    }

    /** @param comparison The comparison configuration of a `GaugeChartVisual` . */
    public fun comparison(comparison: CfnDashboard.ComparisonConfigurationProperty) {
        cdkBuilder.comparison(comparison)
    }

    /** @param primaryValueDisplayType The options that determine the primary value display type. */
    public fun primaryValueDisplayType(primaryValueDisplayType: String) {
        cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
    }

    /**
     * @param primaryValueFontConfiguration The options that determine the primary value font
     *   configuration.
     */
    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    /**
     * @param primaryValueFontConfiguration The options that determine the primary value font
     *   configuration.
     */
    public fun primaryValueFontConfiguration(
        primaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty
    ) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    public fun build(): CfnDashboard.GaugeChartOptionsProperty = cdkBuilder.build()
}
