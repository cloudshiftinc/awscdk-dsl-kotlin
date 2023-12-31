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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The aggregated field well configuration of a `RadarChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-radarchartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateRadarChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.RadarChartAggregatedFieldWellsProperty.Builder =
        CfnTemplate.RadarChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _color: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param category The aggregated field well categories of a radar chart. */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /** @param category The aggregated field well categories of a radar chart. */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /** @param category The aggregated field well categories of a radar chart. */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /** @param color The color that are assigned to the aggregated field wells of a radar chart. */
    public fun color(vararg color: Any) {
        _color.addAll(listOf(*color))
    }

    /** @param color The color that are assigned to the aggregated field wells of a radar chart. */
    public fun color(color: Collection<Any>) {
        _color.addAll(color)
    }

    /** @param color The color that are assigned to the aggregated field wells of a radar chart. */
    public fun color(color: IResolvable) {
        cdkBuilder.color(color)
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnTemplate.RadarChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_color.isNotEmpty()) cdkBuilder.color(_color)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
