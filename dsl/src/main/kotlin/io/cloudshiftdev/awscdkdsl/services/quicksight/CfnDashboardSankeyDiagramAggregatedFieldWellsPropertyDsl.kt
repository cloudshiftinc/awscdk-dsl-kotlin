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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field well configuration of a sankey diagram.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sankeydiagramaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardSankeyDiagramAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty.Builder =
        CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty.builder()

    private val _destination: MutableList<Any> = mutableListOf()

    private val _source: MutableList<Any> = mutableListOf()

    private val _weight: MutableList<Any> = mutableListOf()

    /** @param destination The destination field wells of a sankey diagram. */
    public fun destination(vararg destination: Any) {
        _destination.addAll(listOf(*destination))
    }

    /** @param destination The destination field wells of a sankey diagram. */
    public fun destination(destination: Collection<Any>) {
        _destination.addAll(destination)
    }

    /** @param destination The destination field wells of a sankey diagram. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param source The source field wells of a sankey diagram. */
    public fun source(vararg source: Any) {
        _source.addAll(listOf(*source))
    }

    /** @param source The source field wells of a sankey diagram. */
    public fun source(source: Collection<Any>) {
        _source.addAll(source)
    }

    /** @param source The source field wells of a sankey diagram. */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /** @param weight The weight field wells of a sankey diagram. */
    public fun weight(vararg weight: Any) {
        _weight.addAll(listOf(*weight))
    }

    /** @param weight The weight field wells of a sankey diagram. */
    public fun weight(weight: Collection<Any>) {
        _weight.addAll(weight)
    }

    /** @param weight The weight field wells of a sankey diagram. */
    public fun weight(weight: IResolvable) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty {
        if (_destination.isNotEmpty()) cdkBuilder.destination(_destination)
        if (_source.isNotEmpty()) cdkBuilder.source(_source)
        if (_weight.isNotEmpty()) cdkBuilder.weight(_weight)
        return cdkBuilder.build()
    }
}
