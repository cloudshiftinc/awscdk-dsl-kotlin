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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable
import software.amazon.awscdk.services.timestream.CfnTableProps

/**
 * Properties for defining a `CfnTable`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * Object magneticStoreWriteProperties;
 * Object retentionProperties;
 * CfnTableProps cfnTableProps = CfnTableProps.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .magneticStoreWriteProperties(magneticStoreWriteProperties)
 * .retentionProperties(retentionProperties)
 * .schema(SchemaProperty.builder()
 * .compositePartitionKey(List.of(PartitionKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .enforcementInRecord("enforcementInRecord")
 * .name("name")
 * .build()))
 * .build())
 * .tableName("tableName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html)
 */
@CdkDslMarker
public class CfnTablePropsDsl {
    private val cdkBuilder: CfnTableProps.Builder = CfnTableProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param databaseName The name of the Timestream database that contains this table. *Length
     *   Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     *   magnetic store writes. This object has the following attributes:
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     *   allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     *   server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS`
     *   ).
     * * *KmsKeyId* : The AWS KMS key ID to use when encrypting with an AWS managed key.
     * * *ObjectKeyPrefix* : The prefix to use option for the objects stored in S3.
     *
     * Both `BucketName` and `EncryptionOption` are *required* when `S3Configuration` is specified.
     * If you specify `SSE_KMS` as your `EncryptionOption` then `KmsKeyId` is *required* .
     *
     * `EnableMagneticStoreWrites` attribute is *required* when `MagneticStoreWriteProperties` is
     * specified. `MagneticStoreRejectedDataLocation` attribute is *required* when
     * `EnableMagneticStoreWrites` is set to `true` .
     *
     * See the following examples:
     *
     * *JSON*
     *
     * ```
     * { "Type" : AWS::Timestream::Table", "Properties":{ "DatabaseName":"TestDatabase",
     * "TableName":"TestTable", "MagneticStoreWriteProperties":{ "EnableMagneticStoreWrites":true,
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":"testbucket",
     * "EncryptionOption":"SSE_KMS", "KmsKeyId":"1234abcd-12ab-34cd-56ef-1234567890ab",
     * "ObjectKeyPrefix":"prefix" } } } }
     * }
     * ```
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" MagneticStoreWriteProperties:
     * EnableMagneticStoreWrites: true MagneticStoreRejectedDataLocation: S3Configuration: BucketName:
     * "testbucket" EncryptionOption: "SSE_KMS" KmsKeyId: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * ObjectKeyPrefix: "prefix"
     * ```
     */
    public fun magneticStoreWriteProperties(
        magneticStoreWriteProperties: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(magneticStoreWriteProperties)
        cdkBuilder.magneticStoreWriteProperties(builder.map)
    }

    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     *   magnetic store writes. This object has the following attributes:
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     *   allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     *   server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS`
     *   ).
     * * *KmsKeyId* : The AWS KMS key ID to use when encrypting with an AWS managed key.
     * * *ObjectKeyPrefix* : The prefix to use option for the objects stored in S3.
     *
     * Both `BucketName` and `EncryptionOption` are *required* when `S3Configuration` is specified.
     * If you specify `SSE_KMS` as your `EncryptionOption` then `KmsKeyId` is *required* .
     *
     * `EnableMagneticStoreWrites` attribute is *required* when `MagneticStoreWriteProperties` is
     * specified. `MagneticStoreRejectedDataLocation` attribute is *required* when
     * `EnableMagneticStoreWrites` is set to `true` .
     *
     * See the following examples:
     *
     * *JSON*
     *
     * ```
     * { "Type" : AWS::Timestream::Table", "Properties":{ "DatabaseName":"TestDatabase",
     * "TableName":"TestTable", "MagneticStoreWriteProperties":{ "EnableMagneticStoreWrites":true,
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":"testbucket",
     * "EncryptionOption":"SSE_KMS", "KmsKeyId":"1234abcd-12ab-34cd-56ef-1234567890ab",
     * "ObjectKeyPrefix":"prefix" } } } }
     * }
     * ```
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" MagneticStoreWriteProperties:
     * EnableMagneticStoreWrites: true MagneticStoreRejectedDataLocation: S3Configuration: BucketName:
     * "testbucket" EncryptionOption: "SSE_KMS" KmsKeyId: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * ObjectKeyPrefix: "prefix"
     * ```
     */
    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
        cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     *   This object has the following attributes:.
     * * *MemoryStoreRetentionPeriodInHours* : Retention duration for memory store, in hours.
     * * *MagneticStoreRetentionPeriodInDays* : Retention duration for magnetic store, in days.
     *
     * Both attributes are of type `string` . Both attributes are *required* when
     * `RetentionProperties` is specified.
     *
     * See the following examples:
     *
     * *JSON*
     *
     * `{ "Type" : AWS::Timestream::Table", "Properties" : { "DatabaseName" : "TestDatabase",
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours":
     * "24", "MagneticStoreRetentionPeriodInDays": "7" } } }`
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" RetentionProperties:
     * MemoryStoreRetentionPeriodInHours: "24" MagneticStoreRetentionPeriodInDays: "7"
     * ```
     */
    public fun retentionProperties(retentionProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(retentionProperties)
        cdkBuilder.retentionProperties(builder.map)
    }

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     *   This object has the following attributes:.
     * * *MemoryStoreRetentionPeriodInHours* : Retention duration for memory store, in hours.
     * * *MagneticStoreRetentionPeriodInDays* : Retention duration for magnetic store, in days.
     *
     * Both attributes are of type `string` . Both attributes are *required* when
     * `RetentionProperties` is specified.
     *
     * See the following examples:
     *
     * *JSON*
     *
     * `{ "Type" : AWS::Timestream::Table", "Properties" : { "DatabaseName" : "TestDatabase",
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours":
     * "24", "MagneticStoreRetentionPeriodInDays": "7" } } }`
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" RetentionProperties:
     * MemoryStoreRetentionPeriodInHours: "24" MagneticStoreRetentionPeriodInDays: "7"
     * ```
     */
    public fun retentionProperties(retentionProperties: Any) {
        cdkBuilder.retentionProperties(retentionProperties)
    }

    /** @param schema The schema of the table. */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /** @param schema The schema of the table. */
    public fun schema(schema: CfnTable.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    /**
     * @param tableName The name of the Timestream table. *Length Constraints* : Minimum length of 3
     *   bytes. Maximum length of 256 bytes.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /** @param tags The tags to add to the table. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the table. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTableProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
