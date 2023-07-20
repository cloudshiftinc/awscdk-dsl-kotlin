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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.JSONMappingParametersProperty.builder()

    public fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
    }

    public fun build(): CfnApplicationReferenceDataSource.JSONMappingParametersProperty =
        cdkBuilder.build()
}
