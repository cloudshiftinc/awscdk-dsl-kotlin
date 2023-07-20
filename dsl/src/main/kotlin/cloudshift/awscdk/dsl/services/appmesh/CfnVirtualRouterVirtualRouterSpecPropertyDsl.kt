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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualRouterVirtualRouterSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.VirtualRouterSpecProperty.Builder =
        CfnVirtualRouter.VirtualRouterSpecProperty.builder()

    private val _listeners: MutableList<Any> = mutableListOf()

    public fun listeners(vararg listeners: Any) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<Any>) {
        _listeners.addAll(listeners)
    }

    public fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners)
    }

    public fun build(): CfnVirtualRouter.VirtualRouterSpecProperty {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
