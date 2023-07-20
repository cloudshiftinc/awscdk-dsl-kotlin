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
import software.amazon.awscdk.CfnWaitConditionProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWaitConditionPropsDsl {
    private val cdkBuilder: CfnWaitConditionProps.Builder = CfnWaitConditionProps.builder()

    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun handle(handle: String) {
        cdkBuilder.handle(handle)
    }

    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnWaitConditionProps = cdkBuilder.build()
}
