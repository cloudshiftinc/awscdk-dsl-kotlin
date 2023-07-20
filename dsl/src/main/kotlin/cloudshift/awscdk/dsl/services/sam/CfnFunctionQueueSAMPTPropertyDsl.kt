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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionQueueSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.QueueSAMPTProperty.Builder =
        CfnFunction.QueueSAMPTProperty.builder()

    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    public fun build(): CfnFunction.QueueSAMPTProperty = cdkBuilder.build()
}
