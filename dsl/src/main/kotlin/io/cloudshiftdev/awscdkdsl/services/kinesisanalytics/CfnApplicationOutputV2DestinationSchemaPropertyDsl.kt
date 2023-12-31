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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

/**
 * Describes the data format when records are written to the destination in a SQL-based Kinesis Data
 * Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html)
 */
@CdkDslMarker
public class CfnApplicationOutputV2DestinationSchemaPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.DestinationSchemaProperty.Builder =
        CfnApplicationOutputV2.DestinationSchemaProperty.builder()

    /** @param recordFormatType Specifies the format of the records on the output stream. */
    public fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
    }

    public fun build(): CfnApplicationOutputV2.DestinationSchemaProperty = cdkBuilder.build()
}
