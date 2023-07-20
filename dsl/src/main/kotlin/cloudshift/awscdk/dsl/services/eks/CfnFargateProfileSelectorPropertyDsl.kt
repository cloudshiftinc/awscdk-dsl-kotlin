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
import software.amazon.awscdk.services.eks.CfnFargateProfile
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFargateProfileSelectorPropertyDsl {
    private val cdkBuilder: CfnFargateProfile.SelectorProperty.Builder =
        CfnFargateProfile.SelectorProperty.builder()

    private val _labels: MutableList<Any> = mutableListOf()

    public fun labels(vararg labels: Any) {
        _labels.addAll(listOf(*labels))
    }

    public fun labels(labels: Collection<Any>) {
        _labels.addAll(labels)
    }

    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnFargateProfile.SelectorProperty {
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
