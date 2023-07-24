@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The sort configuration of a waterfall visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WaterfallChartSortConfigurationProperty waterfallChartSortConfigurationProperty =
 * WaterfallChartSortConfigurationProperty.builder()
 * .breakdownItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .categorySort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
 * .direction("direction")
 * .sortBy(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build())
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-waterfallchartsortconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardWaterfallChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.WaterfallChartSortConfigurationProperty.Builder =
        CfnDashboard.WaterfallChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    /**
     * @param breakdownItemsLimit The limit on the number of bar groups that are displayed.
     */
    public fun breakdownItemsLimit(breakdownItemsLimit: IResolvable) {
        cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
    }

    /**
     * @param breakdownItemsLimit The limit on the number of bar groups that are displayed.
     */
    public fun breakdownItemsLimit(breakdownItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
        cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
    }

    /**
     * @param categorySort The sort configuration of the category fields.
     */
    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    /**
     * @param categorySort The sort configuration of the category fields.
     */
    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    /**
     * @param categorySort The sort configuration of the category fields.
     */
    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    public fun build(): CfnDashboard.WaterfallChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
