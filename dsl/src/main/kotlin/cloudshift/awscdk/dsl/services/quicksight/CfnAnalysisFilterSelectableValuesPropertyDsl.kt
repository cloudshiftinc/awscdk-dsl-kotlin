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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisFilterSelectableValuesPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterSelectableValuesProperty.Builder =
        CfnAnalysis.FilterSelectableValuesProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnAnalysis.FilterSelectableValuesProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
