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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.ResourceBindOptions
import kotlin.String

@CdkDslMarker
public class ResourceBindOptionsDsl {
    private val cdkBuilder: ResourceBindOptions.Builder = ResourceBindOptions.builder()

    public fun resourceProperty(resourceProperty: String) {
        cdkBuilder.resourceProperty(resourceProperty)
    }

    public fun build(): ResourceBindOptions = cdkBuilder.build()
}
