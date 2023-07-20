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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateInsightConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.InsightConfigurationProperty.Builder =
        CfnTemplate.InsightConfigurationProperty.builder()

    private val _computations: MutableList<Any> = mutableListOf()

    public fun computations(vararg computations: Any) {
        _computations.addAll(listOf(*computations))
    }

    public fun computations(computations: Collection<Any>) {
        _computations.addAll(computations)
    }

    public fun computations(computations: IResolvable) {
        cdkBuilder.computations(computations)
    }

    public fun customNarrative(customNarrative: IResolvable) {
        cdkBuilder.customNarrative(customNarrative)
    }

    public fun customNarrative(customNarrative: CfnTemplate.CustomNarrativeOptionsProperty) {
        cdkBuilder.customNarrative(customNarrative)
    }

    public fun build(): CfnTemplate.InsightConfigurationProperty {
        if (_computations.isNotEmpty()) cdkBuilder.computations(_computations)
        return cdkBuilder.build()
    }
}
