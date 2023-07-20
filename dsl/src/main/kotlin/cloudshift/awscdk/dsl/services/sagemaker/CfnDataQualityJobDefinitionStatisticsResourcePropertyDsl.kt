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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.StatisticsResourceProperty.Builder =
        CfnDataQualityJobDefinition.StatisticsResourceProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnDataQualityJobDefinition.StatisticsResourceProperty = cdkBuilder.build()
}
