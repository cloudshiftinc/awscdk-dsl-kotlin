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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnLoggingProps
import kotlin.String

@CdkDslMarker
public class CfnLoggingPropsDsl {
    private val cdkBuilder: CfnLoggingProps.Builder = CfnLoggingProps.builder()

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun defaultLogLevel(defaultLogLevel: String) {
        cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLoggingProps = cdkBuilder.build()
}
