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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceDefinitionResourceDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder =
        CfnResourceDefinition.ResourceDefinitionVersionProperty.builder()

    private val _resources: MutableList<Any> = mutableListOf()

    public fun resources(vararg resources: Any) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<Any>) {
        _resources.addAll(resources)
    }

    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    public fun build(): CfnResourceDefinition.ResourceDefinitionVersionProperty {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
