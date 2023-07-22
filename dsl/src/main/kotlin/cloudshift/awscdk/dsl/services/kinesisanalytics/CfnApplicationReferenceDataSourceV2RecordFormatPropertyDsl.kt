@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

/**
 * For a SQL-based Kinesis Data Analytics application, describes the record format and relevant
 * mapping information that should be applied to schematize the records on the stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder =
      CfnApplicationReferenceDataSourceV2.RecordFormatProperty.builder()

  /**
   * @param mappingParameters When you configure application input at the time of creating or
   * updating an application, provides additional mapping information specific to the record format
   * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public fun mappingParameters(mappingParameters: IResolvable) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param mappingParameters When you configure application input at the time of creating or
   * updating an application, provides additional mapping information specific to the record format
   * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public
      fun mappingParameters(mappingParameters: CfnApplicationReferenceDataSourceV2.MappingParametersProperty) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param recordFormatType The type of record format. 
   */
  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2.RecordFormatProperty = cdkBuilder.build()
}
