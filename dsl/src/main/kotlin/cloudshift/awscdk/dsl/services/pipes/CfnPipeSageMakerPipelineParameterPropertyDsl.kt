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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeSageMakerPipelineParameterPropertyDsl {
    private val cdkBuilder: CfnPipe.SageMakerPipelineParameterProperty.Builder =
        CfnPipe.SageMakerPipelineParameterProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPipe.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
