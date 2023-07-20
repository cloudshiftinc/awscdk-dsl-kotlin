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
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelQualityJobDefinitionConstraintsResourcePropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.ConstraintsResourceProperty.Builder =
        CfnModelQualityJobDefinition.ConstraintsResourceProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelQualityJobDefinition.ConstraintsResourceProperty = cdkBuilder.build()
}
