@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field wells of the visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-combochartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisComboChartFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ComboChartFieldWellsProperty.Builder =
      CfnAnalysis.ComboChartFieldWellsProperty.builder()

  /**
   * @param comboChartAggregatedFieldWells The aggregated field wells of a combo chart.
   * Combo charts only have aggregated field wells. Columns in a combo chart are aggregated by
   * category.
   */
  public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: IResolvable) {
    cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
  }

  /**
   * @param comboChartAggregatedFieldWells The aggregated field wells of a combo chart.
   * Combo charts only have aggregated field wells. Columns in a combo chart are aggregated by
   * category.
   */
  public
      fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: CfnAnalysis.ComboChartAggregatedFieldWellsProperty) {
    cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.ComboChartFieldWellsProperty = cdkBuilder.build()
}
