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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps

/**
 * Properties for defining a `CfnDatastore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * Object jsonConfiguration;
 * Object serviceManagedS3;
 * CfnDatastoreProps cfnDatastoreProps = CfnDatastoreProps.builder()
 * .datastoreName("datastoreName")
 * .datastorePartitions(DatastorePartitionsProperty.builder()
 * .partitions(List.of(DatastorePartitionProperty.builder()
 * .partition(PartitionProperty.builder()
 * .attributeName("attributeName")
 * .build())
 * .timestampPartition(TimestampPartitionProperty.builder()
 * .attributeName("attributeName")
 * // the properties below are optional
 * .timestampFormat("timestampFormat")
 * .build())
 * .build()))
 * .build())
 * .datastoreStorage(DatastoreStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
 * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .fileFormatConfiguration(FileFormatConfigurationProperty.builder()
 * .jsonConfiguration(jsonConfiguration)
 * .parquetConfiguration(ParquetConfigurationProperty.builder()
 * .schemaDefinition(SchemaDefinitionProperty.builder()
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html)
 */
@CdkDslMarker
public class CfnDatastorePropsDsl {
    private val cdkBuilder: CfnDatastoreProps.Builder = CfnDatastoreProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param datastoreName The name of the data store. */
    public fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
    }

    /** @param datastorePartitions Information about the partition dimensions in a data store. */
    public fun datastorePartitions(datastorePartitions: IResolvable) {
        cdkBuilder.datastorePartitions(datastorePartitions)
    }

    /** @param datastorePartitions Information about the partition dimensions in a data store. */
    public fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty) {
        cdkBuilder.datastorePartitions(datastorePartitions)
    }

    /** @param datastoreStorage Where data store data is stored. */
    public fun datastoreStorage(datastoreStorage: IResolvable) {
        cdkBuilder.datastoreStorage(datastoreStorage)
    }

    /** @param datastoreStorage Where data store data is stored. */
    public fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty) {
        cdkBuilder.datastoreStorage(datastoreStorage)
    }

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     *   IoT Analytics data stores support JSON and
     *   [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . The default file
     *   format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
        cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
    }

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     *   IoT Analytics data stores support JSON and
     *   [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . The default file
     *   format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    public fun fileFormatConfiguration(
        fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty
    ) {
        cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store. When
     *   `customerManagedS3` storage is selected, this parameter is ignored.
     */
    public fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store. When
     *   `customerManagedS3` storage is selected, this parameter is ignored.
     */
    public fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param tags Metadata which can be used to manage the data store. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata which can be used to manage the data store. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDatastoreProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
