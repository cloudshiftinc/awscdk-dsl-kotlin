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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import software.constructs.Construct

/**
 * Specifies a new DataBrew dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
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
public class CfnDatasetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataset.Builder = CfnDataset.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
     *
     * @param format The file format of a dataset that is created from an Amazon S3 file or folder.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     *
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     *   dataset.
     */
    public fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions)
    }

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     *
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     *   dataset.
     */
    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions)
    }

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     *
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     *   Catalog or Amazon S3 .
     */
    public fun input(input: IResolvable) {
        cdkBuilder.input(input)
    }

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     *
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     *   Catalog or Amazon S3 .
     */
    public fun input(input: CfnDataset.InputProperty) {
        cdkBuilder.input(input)
    }

    /**
     * The unique name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
     *
     * @param name The unique name of the dataset.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     *
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     *   the dataset.
     */
    public fun pathOptions(pathOptions: IResolvable) {
        cdkBuilder.pathOptions(pathOptions)
    }

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     *
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     *   the dataset.
     */
    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
        cdkBuilder.pathOptions(pathOptions)
    }

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     *
     * @param tags Metadata tags that have been applied to the dataset.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     *
     * @param tags Metadata tags that have been applied to the dataset.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataset {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
