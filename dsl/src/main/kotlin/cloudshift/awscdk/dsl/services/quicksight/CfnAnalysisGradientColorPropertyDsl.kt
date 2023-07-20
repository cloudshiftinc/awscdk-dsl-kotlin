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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisGradientColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GradientColorProperty.Builder =
        CfnAnalysis.GradientColorProperty.builder()

    private val _stops: MutableList<Any> = mutableListOf()

    public fun stops(vararg stops: Any) {
        _stops.addAll(listOf(*stops))
    }

    public fun stops(stops: Collection<Any>) {
        _stops.addAll(stops)
    }

    public fun stops(stops: IResolvable) {
        cdkBuilder.stops(stops)
    }

    public fun build(): CfnAnalysis.GradientColorProperty {
        if (_stops.isNotEmpty()) cdkBuilder.stops(_stops)
        return cdkBuilder.build()
    }
}
