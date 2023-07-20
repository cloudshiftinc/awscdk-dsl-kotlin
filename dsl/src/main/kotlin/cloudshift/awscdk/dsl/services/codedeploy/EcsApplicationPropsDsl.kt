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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import kotlin.String

@CdkDslMarker
public class EcsApplicationPropsDsl {
    private val cdkBuilder: EcsApplicationProps.Builder = EcsApplicationProps.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): EcsApplicationProps = cdkBuilder.build()
}
