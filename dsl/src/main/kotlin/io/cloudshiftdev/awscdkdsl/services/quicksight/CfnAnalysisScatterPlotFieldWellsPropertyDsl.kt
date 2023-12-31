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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field well configuration of a scatter plot.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-scatterplotfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisScatterPlotFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ScatterPlotFieldWellsProperty.Builder =
        CfnAnalysis.ScatterPlotFieldWellsProperty.builder()

    /**
     * @param scatterPlotCategoricallyAggregatedFieldWells The aggregated field wells of a scatter
     *   plot. The x and y-axes of scatter plots with aggregated field wells are aggregated by
     *   category, label, or both.
     */
    public fun scatterPlotCategoricallyAggregatedFieldWells(
        scatterPlotCategoricallyAggregatedFieldWells: IResolvable
    ) {
        cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(
            scatterPlotCategoricallyAggregatedFieldWells
        )
    }

    /**
     * @param scatterPlotCategoricallyAggregatedFieldWells The aggregated field wells of a scatter
     *   plot. The x and y-axes of scatter plots with aggregated field wells are aggregated by
     *   category, label, or both.
     */
    public fun scatterPlotCategoricallyAggregatedFieldWells(
        scatterPlotCategoricallyAggregatedFieldWells:
            CfnAnalysis.ScatterPlotCategoricallyAggregatedFieldWellsProperty
    ) {
        cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(
            scatterPlotCategoricallyAggregatedFieldWells
        )
    }

    /**
     * @param scatterPlotUnaggregatedFieldWells The unaggregated field wells of a scatter plot. The
     *   x and y-axes of these scatter plots are unaggregated.
     */
    public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: IResolvable) {
        cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
    }

    /**
     * @param scatterPlotUnaggregatedFieldWells The unaggregated field wells of a scatter plot. The
     *   x and y-axes of these scatter plots are unaggregated.
     */
    public fun scatterPlotUnaggregatedFieldWells(
        scatterPlotUnaggregatedFieldWells: CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty
    ) {
        cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.ScatterPlotFieldWellsProperty = cdkBuilder.build()
}
