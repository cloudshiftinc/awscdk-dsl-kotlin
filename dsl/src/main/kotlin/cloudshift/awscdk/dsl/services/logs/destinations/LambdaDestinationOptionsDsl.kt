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

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions
import kotlin.Boolean

@CdkDslMarker
public class LambdaDestinationOptionsDsl {
    private val cdkBuilder: LambdaDestinationOptions.Builder = LambdaDestinationOptions.builder()

    public fun addPermissions(addPermissions: Boolean) {
        cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): LambdaDestinationOptions = cdkBuilder.build()
}
