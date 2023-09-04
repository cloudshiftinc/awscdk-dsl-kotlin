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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration for a `HistogramVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * HistogramConfigurationProperty histogramConfigurationProperty =
 * HistogramConfigurationProperty.builder()
 * .binOptions(HistogramBinOptionsProperty.builder()
 * .binCount(BinCountOptionsProperty.builder()
 * .value(123)
 * .build())
 * .binWidth(BinWidthOptionsProperty.builder()
 * .binCountLimit(123)
 * .value(123)
 * .build())
 * .selectedBinType("selectedBinType")
 * .startValue(123)
 * .build())
 * .dataLabels(DataLabelOptionsProperty.builder()
 * .categoryLabelVisibility("categoryLabelVisibility")
 * .dataLabelTypes(List.of(DataLabelTypeProperty.builder()
 * .dataPathLabelType(DataPathLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .visibility("visibility")
 * .build())
 * .fieldLabelType(FieldLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .visibility("visibility")
 * .build())
 * .maximumLabelType(MaximumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .minimumLabelType(MinimumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .rangeEndsLabelType(RangeEndsLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .build()))
 * .labelColor("labelColor")
 * .labelContent("labelContent")
 * .labelFontConfiguration(FontConfigurationProperty.builder()
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
 * .measureLabelVisibility("measureLabelVisibility")
 * .overlap("overlap")
 * .position("position")
 * .totalsVisibility("totalsVisibility")
 * .visibility("visibility")
 * .build())
 * .fieldWells(HistogramFieldWellsProperty.builder()
 * .histogramAggregatedFieldWells(HistogramAggregatedFieldWellsProperty.builder()
 * .values(List.of(MeasureFieldProperty.builder()
 * .calculatedMeasureField(CalculatedMeasureFieldProperty.builder()
 * .expression("expression")
 * .fieldId("fieldId")
 * .build())
 * .categoricalMeasureField(CategoricalMeasureFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
 * .aggregationFunction("aggregationFunction")
 * .formatConfiguration(StringFormatConfigurationProperty.builder()
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numericFormatConfiguration(NumericFormatConfigurationProperty.builder()
 * .currencyDisplayFormatConfiguration(CurrencyDisplayFormatConfigurationProperty.builder()
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
 * .symbol("symbol")
 * .build())
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
 * .build())
 * .build())
 * .dateMeasureField(DateMeasureFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
 * .aggregationFunction("aggregationFunction")
 * .formatConfiguration(DateTimeFormatConfigurationProperty.builder()
 * .dateTimeFormat("dateTimeFormat")
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numericFormatConfiguration(NumericFormatConfigurationProperty.builder()
 * .currencyDisplayFormatConfiguration(CurrencyDisplayFormatConfigurationProperty.builder()
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
 * .symbol("symbol")
 * .build())
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
 * .build())
 * .build())
 * .numericalMeasureField(NumericalMeasureFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
 * .aggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .formatConfiguration(NumberFormatConfigurationProperty.builder()
 * .formatConfiguration(NumericFormatConfigurationProperty.builder()
 * .currencyDisplayFormatConfiguration(CurrencyDisplayFormatConfigurationProperty.builder()
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
 * .symbol("symbol")
 * .build())
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
 * .build())
 * .build())
 * .build()))
 * .build())
 * .build())
 * .tooltip(TooltipOptionsProperty.builder()
 * .fieldBasedTooltip(FieldBasedTooltipProperty.builder()
 * .aggregationVisibility("aggregationVisibility")
 * .tooltipFields(List.of(TooltipItemProperty.builder()
 * .columnTooltipItem(ColumnTooltipItemProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregation(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .fieldTooltipItem(FieldTooltipItemProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .build()))
 * .tooltipTitleType("tooltipTitleType")
 * .build())
 * .selectedTooltipType("selectedTooltipType")
 * .tooltipVisibility("tooltipVisibility")
 * .build())
 * .visualPalette(VisualPaletteProperty.builder()
 * .chartColor("chartColor")
 * .colorMap(List.of(DataPathColorProperty.builder()
 * .color("color")
 * .element(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build())
 * // the properties below are optional
 * .timeGranularity("timeGranularity")
 * .build()))
 * .build())
 * .xAxisDisplayOptions(AxisDisplayOptionsProperty.builder()
 * .axisLineVisibility("axisLineVisibility")
 * .axisOffset("axisOffset")
 * .dataOptions(AxisDataOptionsProperty.builder()
 * .dateAxisOptions(DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build())
 * .numericAxisOptions(NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .gridLineVisibility("gridLineVisibility")
 * .scrollbarOptions(ScrollBarOptionsProperty.builder()
 * .visibility("visibility")
 * .visibleRange(VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build())
 * .build())
 * .tickLabelOptions(AxisTickLabelOptionsProperty.builder()
 * .labelOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
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
 * .visibility("visibility")
 * .build())
 * .rotationAngle(123)
 * .build())
 * .build())
 * .xAxisLabelOptions(ChartAxisLabelOptionsProperty.builder()
 * .axisLabelOptions(List.of(AxisLabelOptionsProperty.builder()
 * .applyTo(AxisLabelReferenceOptionsProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * .build())
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
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
 * .build()))
 * .sortIconVisibility("sortIconVisibility")
 * .visibility("visibility")
 * .build())
 * .yAxisDisplayOptions(AxisDisplayOptionsProperty.builder()
 * .axisLineVisibility("axisLineVisibility")
 * .axisOffset("axisOffset")
 * .dataOptions(AxisDataOptionsProperty.builder()
 * .dateAxisOptions(DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build())
 * .numericAxisOptions(NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .gridLineVisibility("gridLineVisibility")
 * .scrollbarOptions(ScrollBarOptionsProperty.builder()
 * .visibility("visibility")
 * .visibleRange(VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build())
 * .build())
 * .tickLabelOptions(AxisTickLabelOptionsProperty.builder()
 * .labelOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
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
 * .visibility("visibility")
 * .build())
 * .rotationAngle(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-histogramconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardHistogramConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.HistogramConfigurationProperty.Builder =
        CfnDashboard.HistogramConfigurationProperty.builder()

    /** @param binOptions The options that determine the presentation of histogram bins. */
    public fun binOptions(binOptions: IResolvable) {
        cdkBuilder.binOptions(binOptions)
    }

    /** @param binOptions The options that determine the presentation of histogram bins. */
    public fun binOptions(binOptions: CfnDashboard.HistogramBinOptionsProperty) {
        cdkBuilder.binOptions(binOptions)
    }

    /** @param dataLabels The data label configuration of a histogram. */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param dataLabels The data label configuration of a histogram. */
    public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param fieldWells The field well configuration of a histogram. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a histogram. */
    public fun fieldWells(fieldWells: CfnDashboard.HistogramFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param tooltip The tooltip configuration of a histogram. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip configuration of a histogram. */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param visualPalette The visual palette configuration of a histogram. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a histogram. */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /** @param yAxisDisplayOptions The options that determine the presentation of the y-axis. */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    /** @param yAxisDisplayOptions The options that determine the presentation of the y-axis. */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    public fun build(): CfnDashboard.HistogramConfigurationProperty = cdkBuilder.build()
}