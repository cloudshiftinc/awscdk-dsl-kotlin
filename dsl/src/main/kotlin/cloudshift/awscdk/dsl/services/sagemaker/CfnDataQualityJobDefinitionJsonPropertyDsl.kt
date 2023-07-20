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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnDataQualityJobDefinitionJsonPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.JsonProperty.Builder =
        CfnDataQualityJobDefinition.JsonProperty.builder()

    public fun line(line: Boolean) {
        cdkBuilder.line(line)
    }

    public fun line(line: IResolvable) {
        cdkBuilder.line(line)
    }

    public fun build(): CfnDataQualityJobDefinition.JsonProperty = cdkBuilder.build()
}
