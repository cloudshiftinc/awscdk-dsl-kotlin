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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

/**
 * When you configure a SQL-based Kinesis Data Analytics application's input at the time of creating
 * or updating an application, provides additional mapping information specific to the record format
 * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.MappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.MappingParametersProperty.builder()

    /**
     * @param csvMappingParameters Provides additional mapping information when the record format
     *   uses delimiters (for example, CSV).
     */
    public fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    /**
     * @param csvMappingParameters Provides additional mapping information when the record format
     *   uses delimiters (for example, CSV).
     */
    public fun csvMappingParameters(
        csvMappingParameters: CfnApplicationReferenceDataSource.CSVMappingParametersProperty
    ) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    /**
     * @param jsonMappingParameters Provides additional mapping information when JSON is the record
     *   format on the streaming source.
     */
    public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    /**
     * @param jsonMappingParameters Provides additional mapping information when JSON is the record
     *   format on the streaming source.
     */
    public fun jsonMappingParameters(
        jsonMappingParameters: CfnApplicationReferenceDataSource.JSONMappingParametersProperty
    ) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun build(): CfnApplicationReferenceDataSource.MappingParametersProperty =
        cdkBuilder.build()
}
