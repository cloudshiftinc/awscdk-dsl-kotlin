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
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper
import software.amazon.awscdk.services.lambda.AdotLayerVersion

@CdkDslMarker
public class AdotInstrumentationConfigDsl {
    private val cdkBuilder: AdotInstrumentationConfig.Builder = AdotInstrumentationConfig.builder()

    public fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
        cdkBuilder.execWrapper(execWrapper)
    }

    public fun layerVersion(layerVersion: AdotLayerVersion) {
        cdkBuilder.layerVersion(layerVersion)
    }

    public fun build(): AdotInstrumentationConfig = cdkBuilder.build()
}
