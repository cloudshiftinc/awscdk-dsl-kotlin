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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The period over period computation configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PeriodOverPeriodComputationProperty periodOverPeriodComputationProperty =
 * PeriodOverPeriodComputationProperty.builder()
 * .computationId("computationId")
 * .time(DimensionFieldProperty.builder()
 * .categoricalDimensionField(CategoricalDimensionFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
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
 * .hierarchyId("hierarchyId")
 * .build())
 * .dateDimensionField(DateDimensionFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
 * .dateGranularity("dateGranularity")
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
 * .hierarchyId("hierarchyId")
 * .build())
 * .numericalDimensionField(NumericalDimensionFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
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
 * .hierarchyId("hierarchyId")
 * .build())
 * .build())
 * // the properties below are optional
 * .name("name")
 * .value(MeasureFieldProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-periodoverperiodcomputation.html)
 */
@CdkDslMarker
public class CfnTemplatePeriodOverPeriodComputationPropertyDsl {
    private val cdkBuilder: CfnTemplate.PeriodOverPeriodComputationProperty.Builder =
        CfnTemplate.PeriodOverPeriodComputationProperty.builder()

    /** @param computationId The ID for a computation. */
    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    /** @param name The name of a computation. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param time The time field that is used in a computation. */
    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    /** @param time The time field that is used in a computation. */
    public fun time(time: CfnTemplate.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: CfnTemplate.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.PeriodOverPeriodComputationProperty = cdkBuilder.build()
}
