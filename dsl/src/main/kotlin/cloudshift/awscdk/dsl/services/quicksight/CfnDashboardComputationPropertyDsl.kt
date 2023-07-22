@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The computation union that is used in an insight visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-computation.html)
 */
@CdkDslMarker
public class CfnDashboardComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComputationProperty.Builder =
      CfnDashboard.ComputationProperty.builder()

  /**
   * @param forecast The forecast computation configuration.
   */
  public fun forecast(forecast: IResolvable) {
    cdkBuilder.forecast(forecast)
  }

  /**
   * @param forecast The forecast computation configuration.
   */
  public fun forecast(forecast: CfnDashboard.ForecastComputationProperty) {
    cdkBuilder.forecast(forecast)
  }

  /**
   * @param growthRate The growth rate computation configuration.
   */
  public fun growthRate(growthRate: IResolvable) {
    cdkBuilder.growthRate(growthRate)
  }

  /**
   * @param growthRate The growth rate computation configuration.
   */
  public fun growthRate(growthRate: CfnDashboard.GrowthRateComputationProperty) {
    cdkBuilder.growthRate(growthRate)
  }

  /**
   * @param maximumMinimum The maximum and minimum computation configuration.
   */
  public fun maximumMinimum(maximumMinimum: IResolvable) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  /**
   * @param maximumMinimum The maximum and minimum computation configuration.
   */
  public fun maximumMinimum(maximumMinimum: CfnDashboard.MaximumMinimumComputationProperty) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  /**
   * @param metricComparison The metric comparison computation configuration.
   */
  public fun metricComparison(metricComparison: IResolvable) {
    cdkBuilder.metricComparison(metricComparison)
  }

  /**
   * @param metricComparison The metric comparison computation configuration.
   */
  public fun metricComparison(metricComparison: CfnDashboard.MetricComparisonComputationProperty) {
    cdkBuilder.metricComparison(metricComparison)
  }

  /**
   * @param periodOverPeriod The period over period computation configuration.
   */
  public fun periodOverPeriod(periodOverPeriod: IResolvable) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  /**
   * @param periodOverPeriod The period over period computation configuration.
   */
  public fun periodOverPeriod(periodOverPeriod: CfnDashboard.PeriodOverPeriodComputationProperty) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  /**
   * @param periodToDate The period to `DataSetIdentifier` computation configuration.
   */
  public fun periodToDate(periodToDate: IResolvable) {
    cdkBuilder.periodToDate(periodToDate)
  }

  /**
   * @param periodToDate The period to `DataSetIdentifier` computation configuration.
   */
  public fun periodToDate(periodToDate: CfnDashboard.PeriodToDateComputationProperty) {
    cdkBuilder.periodToDate(periodToDate)
  }

  /**
   * @param topBottomMovers The top movers and bottom movers computation configuration.
   */
  public fun topBottomMovers(topBottomMovers: IResolvable) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  /**
   * @param topBottomMovers The top movers and bottom movers computation configuration.
   */
  public fun topBottomMovers(topBottomMovers: CfnDashboard.TopBottomMoversComputationProperty) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  /**
   * @param topBottomRanked The top ranked and bottom ranked computation configuration.
   */
  public fun topBottomRanked(topBottomRanked: IResolvable) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  /**
   * @param topBottomRanked The top ranked and bottom ranked computation configuration.
   */
  public fun topBottomRanked(topBottomRanked: CfnDashboard.TopBottomRankedComputationProperty) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  /**
   * @param totalAggregation The total aggregation computation configuration.
   */
  public fun totalAggregation(totalAggregation: IResolvable) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  /**
   * @param totalAggregation The total aggregation computation configuration.
   */
  public fun totalAggregation(totalAggregation: CfnDashboard.TotalAggregationComputationProperty) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  /**
   * @param uniqueValues The unique values computation configuration.
   */
  public fun uniqueValues(uniqueValues: IResolvable) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  /**
   * @param uniqueValues The unique values computation configuration.
   */
  public fun uniqueValues(uniqueValues: CfnDashboard.UniqueValuesComputationProperty) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  public fun build(): CfnDashboard.ComputationProperty = cdkBuilder.build()
}
