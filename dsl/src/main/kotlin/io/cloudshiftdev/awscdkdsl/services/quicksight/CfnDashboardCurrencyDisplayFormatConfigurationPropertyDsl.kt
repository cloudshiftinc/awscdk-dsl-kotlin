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
 * The options that determine the currency display format configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CurrencyDisplayFormatConfigurationProperty currencyDisplayFormatConfigurationProperty =
 * CurrencyDisplayFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-currencydisplayformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardCurrencyDisplayFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CurrencyDisplayFormatConfigurationProperty.Builder =
        CfnDashboard.CurrencyDisplayFormatConfigurationProperty.builder()

    /**
     * @param decimalPlacesConfiguration The option that determines the decimal places
     *   configuration.
     */
    public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    /**
     * @param decimalPlacesConfiguration The option that determines the decimal places
     *   configuration.
     */
    public fun decimalPlacesConfiguration(
        decimalPlacesConfiguration: CfnDashboard.DecimalPlacesConfigurationProperty
    ) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    /**
     * @param negativeValueConfiguration The options that determine the negative value
     *   configuration.
     */
    public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    /**
     * @param negativeValueConfiguration The options that determine the negative value
     *   configuration.
     */
    public fun negativeValueConfiguration(
        negativeValueConfiguration: CfnDashboard.NegativeValueConfigurationProperty
    ) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    /**
     * @param nullValueFormatConfiguration The options that determine the null value format
     *   configuration.
     */
    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    /**
     * @param nullValueFormatConfiguration The options that determine the null value format
     *   configuration.
     */
    public fun nullValueFormatConfiguration(
        nullValueFormatConfiguration: CfnDashboard.NullValueFormatConfigurationProperty
    ) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    /** @param numberScale Determines the number scale value for the currency format. */
    public fun numberScale(numberScale: String) {
        cdkBuilder.numberScale(numberScale)
    }

    /** @param prefix Determines the prefix value of the currency format. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /**
     * @param separatorConfiguration The options that determine the numeric separator configuration.
     */
    public fun separatorConfiguration(separatorConfiguration: IResolvable) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    /**
     * @param separatorConfiguration The options that determine the numeric separator configuration.
     */
    public fun separatorConfiguration(
        separatorConfiguration: CfnDashboard.NumericSeparatorConfigurationProperty
    ) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    /** @param suffix Determines the suffix value of the currency format. */
    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    /** @param symbol Determines the symbol for the currency format. */
    public fun symbol(symbol: String) {
        cdkBuilder.symbol(symbol)
    }

    public fun build(): CfnDashboard.CurrencyDisplayFormatConfigurationProperty = cdkBuilder.build()
}
