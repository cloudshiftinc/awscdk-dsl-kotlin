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
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import kotlin.String

@CdkDslMarker
public class CfnCustomResourcePropsDsl {
    private val cdkBuilder: CfnCustomResourceProps.Builder = CfnCustomResourceProps.builder()

    public fun serviceToken(serviceToken: String) {
        cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): CfnCustomResourceProps = cdkBuilder.build()
}
