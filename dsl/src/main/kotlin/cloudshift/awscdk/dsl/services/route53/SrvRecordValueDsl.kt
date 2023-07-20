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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53.SrvRecordValue
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class SrvRecordValueDsl {
    private val cdkBuilder: SrvRecordValue.Builder = SrvRecordValue.builder()

    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): SrvRecordValue = cdkBuilder.build()
}
