@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a sankey diagram.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sankeydiagramchartconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisSankeyDiagramChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SankeyDiagramChartConfigurationProperty.Builder =
      CfnAnalysis.SankeyDiagramChartConfigurationProperty.builder()

  /**
   * @param dataLabels The data label configuration of a sankey diagram.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The data label configuration of a sankey diagram.
   */
  public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param fieldWells The field well configuration of a sankey diagram.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a sankey diagram.
   */
  public fun fieldWells(fieldWells: CfnAnalysis.SankeyDiagramFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param sortConfiguration The sort configuration of a sankey diagram.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a sankey diagram.
   */
  public
      fun sortConfiguration(sortConfiguration: CfnAnalysis.SankeyDiagramSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnAnalysis.SankeyDiagramChartConfigurationProperty = cdkBuilder.build()
}
