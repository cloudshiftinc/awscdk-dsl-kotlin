@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

/**
 * For a SQL-based Kinesis Data Analytics application, provides additional mapping information when
 * JSON is the record format on the streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * JSONMappingParametersProperty jSONMappingParametersProperty =
 * JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl {
    private val cdkBuilder:
        CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.builder()

    /** @param recordRowPath The path to the top-level parent that contains the records. */
    public fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty =
        cdkBuilder.build()
}
