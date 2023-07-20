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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRouteTcpRouteActionPropertyDsl {
    private val cdkBuilder: CfnRoute.TcpRouteActionProperty.Builder =
        CfnRoute.TcpRouteActionProperty.builder()

    private val _weightedTargets: MutableList<Any> = mutableListOf()

    public fun weightedTargets(vararg weightedTargets: Any) {
        _weightedTargets.addAll(listOf(*weightedTargets))
    }

    public fun weightedTargets(weightedTargets: Collection<Any>) {
        _weightedTargets.addAll(weightedTargets)
    }

    public fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets)
    }

    public fun build(): CfnRoute.TcpRouteActionProperty {
        if (_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
        return cdkBuilder.build()
    }
}
