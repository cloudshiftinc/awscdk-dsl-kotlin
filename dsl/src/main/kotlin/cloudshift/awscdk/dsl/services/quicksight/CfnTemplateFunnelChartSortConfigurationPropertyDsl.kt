@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The sort configuration of a `FunnelChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FunnelChartSortConfigurationProperty funnelChartSortConfigurationProperty =
 * FunnelChartSortConfigurationProperty.builder()
 * .categoryItemsLimit(ItemsLimitConfigurationProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-funnelchartsortconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateFunnelChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.FunnelChartSortConfigurationProperty.Builder =
        CfnTemplate.FunnelChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    /**
     * @param categoryItemsLimit The limit on the number of categories displayed.
     */
    public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    /**
     * @param categoryItemsLimit The limit on the number of categories displayed.
     */
    public fun categoryItemsLimit(categoryItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
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

    public fun build(): CfnTemplate.FunnelChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
