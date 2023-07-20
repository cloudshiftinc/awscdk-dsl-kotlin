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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.LazyAnyValueOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class LazyAnyValueOptionsDsl {
    private val cdkBuilder: LazyAnyValueOptions.Builder = LazyAnyValueOptions.builder()

    public fun displayHint(displayHint: String) {
        cdkBuilder.displayHint(displayHint)
    }

    public fun omitEmptyArray(omitEmptyArray: Boolean) {
        cdkBuilder.omitEmptyArray(omitEmptyArray)
    }

    public fun build(): LazyAnyValueOptions = cdkBuilder.build()
}
