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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnCustomResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomResource.Builder = CfnCustomResource.Builder.create(scope, id)

    public fun serviceToken(serviceToken: String) {
        cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): CfnCustomResource = cdkBuilder.build()
}
