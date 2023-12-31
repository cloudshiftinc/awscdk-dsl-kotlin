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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field well configuration of a pie chart.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-piechartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisPieChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PieChartAggregatedFieldWellsProperty.Builder =
        CfnAnalysis.PieChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _smallMultiples: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param category The category (group/color) field wells of a pie chart. */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /** @param category The category (group/color) field wells of a pie chart. */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /** @param category The category (group/color) field wells of a pie chart. */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /** @param smallMultiples The small multiples field well of a pie chart. */
    public fun smallMultiples(vararg smallMultiples: Any) {
        _smallMultiples.addAll(listOf(*smallMultiples))
    }

    /** @param smallMultiples The small multiples field well of a pie chart. */
    public fun smallMultiples(smallMultiples: Collection<Any>) {
        _smallMultiples.addAll(smallMultiples)
    }

    /** @param smallMultiples The small multiples field well of a pie chart. */
    public fun smallMultiples(smallMultiples: IResolvable) {
        cdkBuilder.smallMultiples(smallMultiples)
    }

    /**
     * @param values The value field wells of a pie chart. Values are aggregated based on
     *   categories.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The value field wells of a pie chart. Values are aggregated based on
     *   categories.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The value field wells of a pie chart. Values are aggregated based on
     *   categories.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnAnalysis.PieChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_smallMultiples.isNotEmpty()) cdkBuilder.smallMultiples(_smallMultiples)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
