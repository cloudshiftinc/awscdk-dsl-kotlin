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
 * The configuration of an insight visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-insightconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateInsightConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.InsightConfigurationProperty.Builder =
        CfnTemplate.InsightConfigurationProperty.builder()

    private val _computations: MutableList<Any> = mutableListOf()

    /** @param computations The computations configurations of the insight visual. */
    public fun computations(vararg computations: Any) {
        _computations.addAll(listOf(*computations))
    }

    /** @param computations The computations configurations of the insight visual. */
    public fun computations(computations: Collection<Any>) {
        _computations.addAll(computations)
    }

    /** @param computations The computations configurations of the insight visual. */
    public fun computations(computations: IResolvable) {
        cdkBuilder.computations(computations)
    }

    /** @param customNarrative The custom narrative of the insight visual. */
    public fun customNarrative(customNarrative: IResolvable) {
        cdkBuilder.customNarrative(customNarrative)
    }

    /** @param customNarrative The custom narrative of the insight visual. */
    public fun customNarrative(customNarrative: CfnTemplate.CustomNarrativeOptionsProperty) {
        cdkBuilder.customNarrative(customNarrative)
    }

    public fun build(): CfnTemplate.InsightConfigurationProperty {
        if (_computations.isNotEmpty()) cdkBuilder.computations(_computations)
        return cdkBuilder.build()
    }
}
