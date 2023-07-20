@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardGeospatialMapAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialMapAggregatedFieldWellsProperty.Builder =
        CfnDashboard.GeospatialMapAggregatedFieldWellsProperty.builder()

    private val _colors: MutableList<Any> = mutableListOf()

    private val _geospatial: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    public fun colors(vararg colors: Any) {
        _colors.addAll(listOf(*colors))
    }

    public fun colors(colors: Collection<Any>) {
        _colors.addAll(colors)
    }

    public fun colors(colors: IResolvable) {
        cdkBuilder.colors(colors)
    }

    public fun geospatial(vararg geospatial: Any) {
        _geospatial.addAll(listOf(*geospatial))
    }

    public fun geospatial(geospatial: Collection<Any>) {
        _geospatial.addAll(geospatial)
    }

    public fun geospatial(geospatial: IResolvable) {
        cdkBuilder.geospatial(geospatial)
    }

    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.GeospatialMapAggregatedFieldWellsProperty {
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        if (_geospatial.isNotEmpty()) cdkBuilder.geospatial(_geospatial)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
