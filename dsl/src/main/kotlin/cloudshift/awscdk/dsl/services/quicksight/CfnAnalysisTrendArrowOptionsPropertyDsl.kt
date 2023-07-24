@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The options that determine the presentation of trend arrows in a KPI visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TrendArrowOptionsProperty trendArrowOptionsProperty = TrendArrowOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-trendarrowoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTrendArrowOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TrendArrowOptionsProperty.Builder =
        CfnAnalysis.TrendArrowOptionsProperty.builder()

    /**
     * @param visibility The visibility of the trend arrows.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.TrendArrowOptionsProperty = cdkBuilder.build()
}
