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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterClusterLoggingPropertyDsl {
    private val cdkBuilder: CfnCluster.ClusterLoggingProperty.Builder =
        CfnCluster.ClusterLoggingProperty.builder()

    private val _enabledTypes: MutableList<Any> = mutableListOf()

    public fun enabledTypes(vararg enabledTypes: Any) {
        _enabledTypes.addAll(listOf(*enabledTypes))
    }

    public fun enabledTypes(enabledTypes: Collection<Any>) {
        _enabledTypes.addAll(enabledTypes)
    }

    public fun enabledTypes(enabledTypes: IResolvable) {
        cdkBuilder.enabledTypes(enabledTypes)
    }

    public fun build(): CfnCluster.ClusterLoggingProperty {
        if (_enabledTypes.isNotEmpty()) cdkBuilder.enabledTypes(_enabledTypes)
        return cdkBuilder.build()
    }
}
