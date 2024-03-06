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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.BillingMode
import software.amazon.awscdk.services.dynamodb.ImportSourceSpecification
import software.amazon.awscdk.services.dynamodb.StreamViewType
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.dynamodb.TableEncryption
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * Provides a DynamoDB table.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.csv(CsvOptions.builder()
 * .delimiter(",")
 * .headerList(List.of("id", "name"))
 * .build()))
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class TableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Table.Builder = Table.Builder.create(scope, id)

    private val _replicationRegions: MutableList<String> = mutableListOf()

    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Default: PROVISIONED if `replicationRegions` is not specified, PAY_PER_REQUEST otherwise
     *
     * @param billingMode Specify how you are charged for read and write throughput and how you
     *   manage capacity.
     */
    public fun billingMode(billingMode: BillingMode) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled.
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
        cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * Enables deletion protection for the table.
     *
     * Default: false
     *
     * @param deletionProtection Enables deletion protection for the table.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Whether server-side encryption with an AWS managed customer master key is enabled.
     *
     * This property cannot be set if `serverSideEncryption` is set.
     *
     * **NOTE**: if you set this to `CUSTOMER_MANAGED` and `encryptionKey` is not specified, the key
     * that the Tablet generates for you will be created with default permissions. If you are using
     * CDKv2, these permissions will be sufficient to enable the key for use with DynamoDB tables.
     * If you are using CDKv1, make sure the feature flag `&#64;aws-cdk/aws-kms:defaultKeyPolicies`
     * is set to `true` in your `cdk.json`.
     *
     * Default: - The table is encrypted with an encryption key managed by DynamoDB, and you are not
     * charged any fee for using it.
     *
     * @param encryption Whether server-side encryption with an AWS managed customer master key is
     *   enabled.
     */
    public fun encryption(encryption: TableEncryption) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * External KMS key to use for table encryption.
     *
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     *
     * Default: - If `encryption` is set to `TableEncryption.CUSTOMER_MANAGED` and this property is
     * undefined, a new KMS key will be created and associated with this table. If `encryption` and
     * this property are both undefined, then the table is encrypted with an encryption key managed
     * by DynamoDB, and you are not charged any fee for using it.
     *
     * @param encryptionKey External KMS key to use for table encryption.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     *   table.
     */
    public fun importSource(importSource: ImportSourceSpecificationDsl.() -> Unit = {}) {
        val builder = ImportSourceSpecificationDsl()
        builder.apply(importSource)
        cdkBuilder.importSource(builder.build())
    }

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     *   table.
     */
    public fun importSource(importSource: ImportSourceSpecification) {
        cdkBuilder.importSource(importSource)
    }

    /**
     * Kinesis Data Stream to capture item-level changes for the table.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item-level changes for the table.
     */
    public fun kinesisStream(kinesisStream: IStream) {
        cdkBuilder.kinesisStream(kinesisStream)
    }

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition.
     */
    public fun partitionKey(partitionKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(partitionKey)
        cdkBuilder.partitionKey(builder.build())
    }

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition.
     */
    public fun partitionKey(partitionKey: Attribute) {
        cdkBuilder.partitionKey(partitionKey)
    }

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: - point-in-time recovery is disabled
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
        cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * The read capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as those will share the table's provisioned
     * throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param readCapacity The read capacity for the table.
     */
    public fun readCapacity(readCapacity: Number) {
        cdkBuilder.readCapacity(readCapacity)
    }

    /**
     * The removal policy to apply to the DynamoDB Table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the DynamoDB Table.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created.
     */
    public fun replicationRegions(vararg replicationRegions: String) {
        _replicationRegions.addAll(listOf(*replicationRegions))
    }

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created.
     */
    public fun replicationRegions(replicationRegions: Collection<String>) {
        _replicationRegions.addAll(replicationRegions)
    }

    /**
     * The timeout for a table replication operation in a single region.
     *
     * Default: Duration.minutes(30)
     *
     * @param replicationTimeout The timeout for a table replication operation in a single region.
     */
    public fun replicationTimeout(replicationTimeout: Duration) {
        cdkBuilder.replicationTimeout(replicationTimeout)
    }

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(sortKey)
        cdkBuilder.sortKey(builder.build())
    }

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream for this table.
     *
     * Default: - streams are disabled unless `replicationRegions` is specified
     *
     * @param stream When an item in the table is modified, StreamViewType determines what
     *   information is written to the stream for this table.
     */
    public fun stream(stream: StreamViewType) {
        cdkBuilder.stream(stream)
    }

    /**
     * Specify the table class.
     *
     * Default: STANDARD
     *
     * @param tableClass Specify the table class.
     */
    public fun tableClass(tableClass: TableClass) {
        cdkBuilder.tableClass(tableClass)
    }

    /**
     * Enforces a particular physical table name.
     *
     * Default: <generated>
     *
     * @param tableName Enforces a particular physical table name.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * The name of TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of TTL attribute.
     */
    public fun timeToLiveAttribute(timeToLiveAttribute: String) {
        cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    /**
     * Indicates whether CloudFormation stack waits for replication to finish.
     *
     * If set to false, the CloudFormation resource will mark the resource as created and
     * replication will be completed asynchronously. This property is ignored if replicationRegions
     * property is not set.
     *
     * WARNING: DO NOT UNSET this property if adding/removing multiple replicationRegions in one
     * deployment, as CloudFormation only supports one region replication at a time. CDK overcomes
     * this limitation by waiting for replication to finish before starting new replicationRegion.
     *
     * If the custom resource which handles replication has a physical resource ID with the format
     * `region` instead of `tablename-region` (this would happen if the custom resource hasn't
     * received an event since v1.91.0), DO NOT SET this property to false without making a change
     * to the table name. This will cause the existing replicas to be deleted.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     *
     * @param waitForReplicationToFinish Indicates whether CloudFormation stack waits for
     *   replication to finish.
     */
    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
        cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
    }

    /**
     * The write capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as those will share the table's provisioned
     * throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param writeCapacity The write capacity for the table.
     */
    public fun writeCapacity(writeCapacity: Number) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): Table {
        if (_replicationRegions.isNotEmpty()) cdkBuilder.replicationRegions(_replicationRegions)
        return cdkBuilder.build()
    }
}
