@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number
import kotlin.String

/**
 * The options that determine the presentation of histogram bins.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * HistogramBinOptionsProperty histogramBinOptionsProperty = HistogramBinOptionsProperty.builder()
 * .binCount(BinCountOptionsProperty.builder()
 * .value(123)
 * .build())
 * .binWidth(BinWidthOptionsProperty.builder()
 * .binCountLimit(123)
 * .value(123)
 * .build())
 * .selectedBinType("selectedBinType")
 * .startValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-histogrambinoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisHistogramBinOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HistogramBinOptionsProperty.Builder =
        CfnAnalysis.HistogramBinOptionsProperty.builder()

    /**
     * @param binCount The options that determine the bin count of a histogram.
     */
    public fun binCount(binCount: IResolvable) {
        cdkBuilder.binCount(binCount)
    }

    /**
     * @param binCount The options that determine the bin count of a histogram.
     */
    public fun binCount(binCount: CfnAnalysis.BinCountOptionsProperty) {
        cdkBuilder.binCount(binCount)
    }

    /**
     * @param binWidth The options that determine the bin width of a histogram.
     */
    public fun binWidth(binWidth: IResolvable) {
        cdkBuilder.binWidth(binWidth)
    }

    /**
     * @param binWidth The options that determine the bin width of a histogram.
     */
    public fun binWidth(binWidth: CfnAnalysis.BinWidthOptionsProperty) {
        cdkBuilder.binWidth(binWidth)
    }

    /**
     * @param selectedBinType The options that determine the selected bin type.
     */
    public fun selectedBinType(selectedBinType: String) {
        cdkBuilder.selectedBinType(selectedBinType)
    }

    /**
     * @param startValue The options that determine the bin start value.
     */
    public fun startValue(startValue: Number) {
        cdkBuilder.startValue(startValue)
    }

    public fun build(): CfnAnalysis.HistogramBinOptionsProperty = cdkBuilder.build()
}
