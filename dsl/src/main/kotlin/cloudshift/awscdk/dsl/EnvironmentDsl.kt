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
import software.amazon.awscdk.Environment
import kotlin.String

@CdkDslMarker
public class EnvironmentDsl {
    private val cdkBuilder: Environment.Builder = Environment.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): Environment = cdkBuilder.build()
}
