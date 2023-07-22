@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnDatasetProps

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .input(InputProperty.builder()
 * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
 * .glueConnectionName("glueConnectionName")
 * // the properties below are optional
 * .databaseTableName("databaseTableName")
 * .queryString("queryString")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .metadata(MetadataProperty.builder()
 * .sourceArn("sourceArn")
 * .build())
 * .s3InputDefinition(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .format("format")
 * .formatOptions(FormatOptionsProperty.builder()
 * .csv(CsvOptionsProperty.builder()
 * .delimiter("delimiter")
 * .headerRow(false)
 * .build())
 * .excel(ExcelOptionsProperty.builder()
 * .headerRow(false)
 * .sheetIndexes(List.of(123))
 * .sheetNames(List.of("sheetNames"))
 * .build())
 * .json(JsonOptionsProperty.builder()
 * .multiLine(false)
 * .build())
 * .build())
 * .pathOptions(PathOptionsProperty.builder()
 * .filesLimit(FilesLimitProperty.builder()
 * .maxFiles(123)
 * // the properties below are optional
 * .order("order")
 * .orderedBy("orderedBy")
 * .build())
 * .lastModifiedDateCondition(FilterExpressionProperty.builder()
 * .expression("expression")
 * .valuesMap(List.of(FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .build())
 * .parameters(List.of(PathParameterProperty.builder()
 * .datasetParameter(DatasetParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .createColumn(false)
 * .datetimeOptions(DatetimeOptionsProperty.builder()
 * .format("format")
 * // the properties below are optional
 * .localeCode("localeCode")
 * .timezoneOffset("timezoneOffset")
 * .build())
 * .filter(FilterExpressionProperty.builder()
 * .expression("expression")
 * .valuesMap(List.of(FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .build())
 * .build())
 * .pathParameterName("pathParameterName")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html)
 */
@CdkDslMarker
public class CfnDatasetPropsDsl {
  private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param format The file format of a dataset that is created from an Amazon S3 file or folder.
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  /**
   * @param formatOptions A set of options that define how DataBrew interprets the data in the
   * dataset.
   */
  public fun formatOptions(formatOptions: IResolvable) {
    cdkBuilder.formatOptions(formatOptions)
  }

  /**
   * @param formatOptions A set of options that define how DataBrew interprets the data in the
   * dataset.
   */
  public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
    cdkBuilder.formatOptions(formatOptions)
  }

  /**
   * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
   * Catalog or Amazon S3 . 
   */
  public fun input(input: IResolvable) {
    cdkBuilder.input(input)
  }

  /**
   * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
   * Catalog or Amazon S3 . 
   */
  public fun input(input: CfnDataset.InputProperty) {
    cdkBuilder.input(input)
  }

  /**
   * @param name The unique name of the dataset. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
   * the dataset.
   */
  public fun pathOptions(pathOptions: IResolvable) {
    cdkBuilder.pathOptions(pathOptions)
  }

  /**
   * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
   * the dataset.
   */
  public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
    cdkBuilder.pathOptions(pathOptions)
  }

  /**
   * @param tags Metadata tags that have been applied to the dataset.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata tags that have been applied to the dataset.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatasetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
