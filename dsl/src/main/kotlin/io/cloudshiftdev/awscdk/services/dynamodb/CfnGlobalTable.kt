package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGlobalTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the DynamoDB table, such as
   * `arn:aws:dynamodb:us-east-2:123456789012:table/myDynamoDBTable` .
   *
   * The ARN returned is that of the replica in the region the stack is deployed to.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of the DynamoDB stream, such as
   * `arn:aws:dynamodb:us-east-1:123456789012:table/testddbstack-myDynamoDBTable-012A1SL7SMP5Q/stream/2015-11-30T20:10:00.000`
   * . The `StreamArn` returned is that of the replica in the region the stack is deployed to.
   *
   *
   * You must specify the `StreamSpecification` property to use this attribute.
   */
  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  /**
   * Unique identifier for the table, such as `a123b456-01ab-23cd-123a-111222aaabbb` .
   *
   * The `TableId` returned is that of the replica in the region the stack is deployed to.
   */
  public open fun attrTableId(): String = unwrap(this).getAttrTableId()

  /**
   * A list of attributes that describe the key schema for the global table and indexes.
   */
  public open fun attributeDefinitions(): Any = unwrap(this).getAttributeDefinitions()

  /**
   * A list of attributes that describe the key schema for the global table and indexes.
   */
  public open fun attributeDefinitions(`value`: IResolvable) {
    unwrap(this).setAttributeDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of attributes that describe the key schema for the global table and indexes.
   */
  public open fun attributeDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttributeDefinitions(__idx_ac66f0)
  }

  /**
   * A list of attributes that describe the key schema for the global table and indexes.
   */
  public open fun attributeDefinitions(vararg __idx_ac66f0: Any): Unit =
      attributeDefinitions(__idx_ac66f0.toList())

  /**
   * Specifies how you are charged for read and write throughput and how you manage capacity.
   *
   * Valid values are:.
   */
  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * Specifies how you are charged for read and write throughput and how you manage capacity.
   *
   * Valid values are:.
   */
  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  /**
   * Global secondary indexes to be created on the global table.
   */
  public open fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  /**
   * Global secondary indexes to be created on the global table.
   */
  public open fun globalSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setGlobalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Global secondary indexes to be created on the global table.
   */
  public open fun globalSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setGlobalSecondaryIndexes(__idx_ac66f0)
  }

  /**
   * Global secondary indexes to be created on the global table.
   */
  public open fun globalSecondaryIndexes(vararg __idx_ac66f0: Any): Unit =
      globalSecondaryIndexes(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(): Any = unwrap(this).getKeySchema()

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(`value`: IResolvable) {
    unwrap(this).setKeySchema(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(__idx_ac66f0: List<Any>) {
    unwrap(this).setKeySchema(__idx_ac66f0)
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(vararg __idx_ac66f0: Any): Unit = keySchema(__idx_ac66f0.toList())

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setLocalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocalSecondaryIndexes(__idx_ac66f0)
  }

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(vararg __idx_ac66f0: Any): Unit =
      localSecondaryIndexes(__idx_ac66f0.toList())

  /**
   * Specifies the list of replicas for your global table.
   */
  public open fun replicas(): Any = unwrap(this).getReplicas()

  /**
   * Specifies the list of replicas for your global table.
   */
  public open fun replicas(`value`: IResolvable) {
    unwrap(this).setReplicas(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the list of replicas for your global table.
   */
  public open fun replicas(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicas(__idx_ac66f0)
  }

  /**
   * Specifies the list of replicas for your global table.
   */
  public open fun replicas(vararg __idx_ac66f0: Any): Unit = replicas(__idx_ac66f0.toList())

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  /**
   * Specifies the settings to enable server-side encryption.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("009850ebf2cb40dfdc8e55915be65d846868fd39caf3420728817ce04bc8df4e")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  /**
   * Specifies the streams settings on your global table.
   */
  public open fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  /**
   * Specifies the streams settings on your global table.
   */
  public open fun streamSpecification(`value`: IResolvable) {
    unwrap(this).setStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the streams settings on your global table.
   */
  public open fun streamSpecification(`value`: StreamSpecificationProperty) {
    unwrap(this).setStreamSpecification(`value`.let(StreamSpecificationProperty::unwrap))
  }

  /**
   * Specifies the streams settings on your global table.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("127acd550a3bd4febf8e25734b8753d6b81e97499c8517a08d593a921d108d2e")
  public open fun streamSpecification(`value`: StreamSpecificationProperty.Builder.() -> Unit): Unit
      = streamSpecification(StreamSpecificationProperty(`value`))

  /**
   * A name for the global table.
   */
  public open fun tableName(): String? = unwrap(this).getTableName()

  /**
   * A name for the global table.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Specifies the time to live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  /**
   * Specifies the time to live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(`value`: IResolvable) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the time to live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(TimeToLiveSpecificationProperty::unwrap))
  }

  /**
   * Specifies the time to live (TTL) settings for the table.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e0d141a1a82665304a3e8c5b6a1c8076cffe3aa870ce7b93244d0485db3f9474")
  public open
      fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty.Builder.() -> Unit): Unit
      = timeToLiveSpecification(TimeToLiveSpecificationProperty(`value`))

  /**
   * Specifies an auto scaling policy for write capacity.
   */
  public open fun writeProvisionedThroughputSettings(): Any? =
      unwrap(this).getWriteProvisionedThroughputSettings()

  /**
   * Specifies an auto scaling policy for write capacity.
   */
  public open fun writeProvisionedThroughputSettings(`value`: IResolvable) {
    unwrap(this).setWriteProvisionedThroughputSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies an auto scaling policy for write capacity.
   */
  public open
      fun writeProvisionedThroughputSettings(`value`: WriteProvisionedThroughputSettingsProperty) {
    unwrap(this).setWriteProvisionedThroughputSettings(`value`.let(WriteProvisionedThroughputSettingsProperty::unwrap))
  }

  /**
   * Specifies an auto scaling policy for write capacity.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ee7a98323f2bbc7c944a24648f6ececf5a9a5afeec9f4d7f15ef97fa8c786b6")
  public open
      fun writeProvisionedThroughputSettings(`value`: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
      Unit = writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dynamodb.CfnGlobalTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    /**
     * Specifies how you are charged for read and write throughput and how you manage capacity.
     * Valid values are:.
     *
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-billingmode)
     * @param billingMode Specifies how you are charged for read and write throughput and how you
     * manage capacity. Valid values are:. 
     */
    public fun billingMode(billingMode: String)

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(keySchema: IResolvable)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(keySchema: List<Any>)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(vararg keySchema: Any)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    public fun replicas(replicas: IResolvable)

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    public fun replicas(replicas: List<Any>)

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    public fun replicas(vararg replicas: Any)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3c60a5a5edef59c4aa4f7708c0e3623743921725f05f2842958316e110b799")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    public fun streamSpecification(streamSpecification: IResolvable)

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    public fun streamSpecification(streamSpecification: StreamSpecificationProperty)

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf76fd13563ee3ad08063f4ca6555e20c9c41a98390d54479d39d86db66f0d08")
    public
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit)

    /**
     * A name for the global table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-tablename)
     * @param tableName A name for the global table. 
     */
    public fun tableName(tableName: String)

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty)

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("553d4a95a52b82e6cecb813ae356cc9b60f0baf86543b023322ca814aebdc244")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit)

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty)

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcd27e79c267566886db3ae75fe52c318618fb4fef3740f98057e7fb925594f8")
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.Builder =
        software.amazon.awscdk.services.dynamodb.CfnGlobalTable.Builder.create(scope, id)

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

    /**
     * Specifies how you are charged for read and write throughput and how you manage capacity.
     * Valid values are:.
     *
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-billingmode)
     * @param billingMode Specifies how you are charged for read and write throughput and how you
     * manage capacity. Valid values are:. 
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table. 
     */
    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema)
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    override fun replicas(replicas: IResolvable) {
      cdkBuilder.replicas(replicas.let(IResolvable::unwrap))
    }

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    override fun replicas(replicas: List<Any>) {
      cdkBuilder.replicas(replicas)
    }

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param replicas Specifies the list of replicas for your global table. 
     */
    override fun replicas(vararg replicas: Any): Unit = replicas(replicas.toList())

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3c60a5a5edef59c4aa4f7708c0e3623743921725f05f2842958316e110b799")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    override fun streamSpecification(streamSpecification: StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(StreamSpecificationProperty::unwrap))
    }

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     * @param streamSpecification Specifies the streams settings on your global table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf76fd13563ee3ad08063f4ca6555e20c9c41a98390d54479d39d86db66f0d08")
    override
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(StreamSpecificationProperty(streamSpecification))

    /**
     * A name for the global table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-tablename)
     * @param tableName A name for the global table. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(TimeToLiveSpecificationProperty::unwrap))
    }

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("553d4a95a52b82e6cecb813ae356cc9b60f0baf86543b023322ca814aebdc244")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit = timeToLiveSpecification(TimeToLiveSpecificationProperty(timeToLiveSpecification))

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
    }

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(WriteProvisionedThroughputSettingsProperty::unwrap))
    }

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcd27e79c267566886db3ae75fe52c318618fb4fef3740f98057e7fb925594f8")
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
        Unit =
        writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable):
        CfnGlobalTable = CfnGlobalTable(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalTable):
        software.amazon.awscdk.services.dynamodb.CfnGlobalTable = wrapped.cdkObject
  }

  public interface TargetTrackingScalingPolicyConfigurationProperty {
    /**
     * Indicates whether scale in by the target tracking scaling policy is disabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-disablescalein)
     */
    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    /**
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in
     * activity can start.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-scaleincooldown)
     */
    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    /**
     * The amount of time, in seconds, after a scale-out activity completes before another scale-out
     * activity can start.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
     */
    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    /**
     * Defines a target value for the scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetTrackingScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * The default value is `false` .
       */
      public fun disableScaleIn(disableScaleIn: Boolean)

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * The default value is `false` .
       */
      public fun disableScaleIn(disableScaleIn: IResolvable)

      /**
       * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
       * before another scale-in activity can start.
       */
      public fun scaleInCooldown(scaleInCooldown: Number)

      /**
       * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity
       * completes before another scale-out activity can start.
       */
      public fun scaleOutCooldown(scaleOutCooldown: Number)

      /**
       * @param targetValue Defines a target value for the scaling policy. 
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * The default value is `false` .
       */
      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * The default value is `false` .
       */
      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
      }

      /**
       * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
       * before another scale-in activity can start.
       */
      override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      /**
       * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity
       * completes before another scale-out activity can start.
       */
      override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      /**
       * @param targetValue Defines a target value for the scaling policy. 
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), TargetTrackingScalingPolicyConfigurationProperty {
      /**
       * Indicates whether scale in by the target tracking scaling policy is disabled.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-disablescalein)
       */
      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      /**
       * The amount of time, in seconds, after a scale-in activity completes before another scale-in
       * activity can start.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-scaleincooldown)
       */
      override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      /**
       * The amount of time, in seconds, after a scale-out activity completes before another
       * scale-out activity can start.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
       */
      override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      /**
       * Defines a target value for the scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html#cfn-dynamodb-globaltable-targettrackingscalingpolicyconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
    }
  }

  public interface TimeToLiveSpecificationProperty {
    /**
     * The name of the attribute used to store the expiration time for items in the table.
     *
     * Currently, you cannot directly change the attribute name used to evaluate time to live. In
     * order to do so, you must first disable time to live, and then re-enable it with the new
     * attribute name. It can take up to one hour for changes to time to live to take effect. If you
     * attempt to modify time to live within that time window, your stack operation might be delayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html#cfn-dynamodb-globaltable-timetolivespecification-attributename)
     */
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    /**
     * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html#cfn-dynamodb-globaltable-timetolivespecification-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [TimeToLiveSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of the attribute used to store the expiration time for items
       * in the table.
       * Currently, you cannot directly change the attribute name used to evaluate time to live. In
       * order to do so, you must first disable time to live, and then re-enable it with the new
       * attribute name. It can take up to one hour for changes to time to live to take effect. If you
       * attempt to modify time to live within that time window, your stack operation might be delayed.
       */
      public fun attributeName(attributeName: String)

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty.builder()

      /**
       * @param attributeName The name of the attribute used to store the expiration time for items
       * in the table.
       * Currently, you cannot directly change the attribute name used to evaluate time to live. In
       * order to do so, you must first disable time to live, and then re-enable it with the new
       * attribute name. It can take up to one hour for changes to time to live to take effect. If you
       * attempt to modify time to live within that time window, your stack operation might be delayed.
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty,
    ) : CdkObject(cdkObject), TimeToLiveSpecificationProperty {
      /**
       * The name of the attribute used to store the expiration time for items in the table.
       *
       * Currently, you cannot directly change the attribute name used to evaluate time to live. In
       * order to do so, you must first disable time to live, and then re-enable it with the new
       * attribute name. It can take up to one hour for changes to time to live to take effect. If you
       * attempt to modify time to live within that time window, your stack operation might be delayed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html#cfn-dynamodb-globaltable-timetolivespecification-attributename)
       */
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      /**
       * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html#cfn-dynamodb-globaltable-timetolivespecification-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeToLiveSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty):
          TimeToLiveSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeToLiveSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty
    }
  }

  public interface ProjectionProperty {
    /**
     * Represents the non-key attribute names which will be projected into the index.
     *
     * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
     * local secondary indexes, must not exceed 100. If you project the same attribute into two
     * different indexes, this counts as two distinct attributes when determining the total.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-projection.html#cfn-dynamodb-globaltable-projection-nonkeyattributes)
     */
    public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

    /**
     * The set of attributes that are projected into the index:.
     *
     * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
     * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
     * will include other non-key attributes that you specify.
     * * `ALL` - All of the table attributes are projected into the index.
     *
     * When using the DynamoDB console, `ALL` is selected by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-projection.html#cfn-dynamodb-globaltable-projection-projectiontype)
     */
    public fun projectionType(): String? = unwrap(this).getProjectionType()

    /**
     * A builder for [ProjectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      public fun nonKeyAttributes(nonKeyAttributes: List<String>)

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      public fun nonKeyAttributes(vararg nonKeyAttributes: String)

      /**
       * @param projectionType The set of attributes that are projected into the index:.
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       */
      public fun projectionType(projectionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty.builder()

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
        cdkBuilder.nonKeyAttributes(nonKeyAttributes)
      }

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
          nonKeyAttributes(nonKeyAttributes.toList())

      /**
       * @param projectionType The set of attributes that are projected into the index:.
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       */
      override fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty,
    ) : CdkObject(cdkObject), ProjectionProperty {
      /**
       * Represents the non-key attribute names which will be projected into the index.
       *
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-projection.html#cfn-dynamodb-globaltable-projection-nonkeyattributes)
       */
      override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
          emptyList()

      /**
       * The set of attributes that are projected into the index:.
       *
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-projection.html#cfn-dynamodb-globaltable-projection-projectiontype)
       */
      override fun projectionType(): String? = unwrap(this).getProjectionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty):
          ProjectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectionProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty
    }
  }

  public interface StreamSpecificationProperty {
    /**
     * When an item in the table is modified, `StreamViewType` determines what information is
     * written to the stream for this table.
     *
     * Valid values for `StreamViewType` are:
     *
     * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
     * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
     * stream.
     * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
     * stream.
     * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to the
     * stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-streamspecification.html#cfn-dynamodb-globaltable-streamspecification-streamviewtype)
     */
    public fun streamViewType(): String

    /**
     * A builder for [StreamSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamViewType When an item in the table is modified, `StreamViewType` determines
       * what information is written to the stream for this table. 
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       */
      public fun streamViewType(streamViewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.builder()

      /**
       * @param streamViewType When an item in the table is modified, `StreamViewType` determines
       * what information is written to the stream for this table. 
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       */
      override fun streamViewType(streamViewType: String) {
        cdkBuilder.streamViewType(streamViewType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty,
    ) : CdkObject(cdkObject), StreamSpecificationProperty {
      /**
       * When an item in the table is modified, `StreamViewType` determines what information is
       * written to the stream for this table.
       *
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-streamspecification.html#cfn-dynamodb-globaltable-streamspecification-streamviewtype)
       */
      override fun streamViewType(): String = unwrap(this).getStreamViewType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty):
          StreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty
    }
  }

  public interface CapacityAutoScalingSettingsProperty {
    /**
     * The maximum provisioned capacity units for the global table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-maxcapacity)
     */
    public fun maxCapacity(): Number

    /**
     * The minimum provisioned capacity units for the global table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-mincapacity)
     */
    public fun minCapacity(): Number

    /**
     * When switching billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , DynamoDB requires you
     * to specify read and write capacity unit values for the table and for each global secondary
     * index.
     *
     * These values will be applied to all replicas. The table will use these provisioned values
     * until CloudFormation creates the autoscaling policies you configured in your template.
     * CloudFormation cannot determine what capacity the table and its global secondary indexes will
     * require in this time period, since they are application-dependent.
     *
     * If you want to switch a table's billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , you
     * must specify a value for this property for each autoscaled resource. If you specify different
     * values for the same resource in different regions, CloudFormation will use the highest value
     * found in either the `SeedCapacity` or `ReadCapacityUnits` properties. For example, if your
     * global secondary index `myGSI` has a `SeedCapacity` of 10 in us-east-1 and a fixed
     * `ReadCapacityUnits` of 20 in eu-west-1, CloudFormation will initially set the read capacity for
     * `myGSI` to 20. Note that if you disable `ScaleIn` for `myGSI` in us-east-1, its read capacity
     * units might not be set back to 10.
     *
     * You must also specify a value for `SeedCapacity` when you plan to switch a table's billing
     * mode from `PROVISIONED` to `PAY_PER_REQUEST` , because CloudFormation might need to roll back
     * the operation (reverting the billing mode to `PROVISIONED` ) and this cannot succeed without
     * specifying a value for `SeedCapacity` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-seedcapacity)
     */
    public fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

    /**
     * Defines a target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-targettrackingscalingpolicyconfiguration)
     */
    public fun targetTrackingScalingPolicyConfiguration(): Any

    /**
     * A builder for [CapacityAutoScalingSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The maximum provisioned capacity units for the global table. 
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The minimum provisioned capacity units for the global table. 
       */
      public fun minCapacity(minCapacity: Number)

      /**
       * @param seedCapacity When switching billing mode from `PAY_PER_REQUEST` to `PROVISIONED` ,
       * DynamoDB requires you to specify read and write capacity unit values for the table and for
       * each global secondary index.
       * These values will be applied to all replicas. The table will use these provisioned values
       * until CloudFormation creates the autoscaling policies you configured in your template.
       * CloudFormation cannot determine what capacity the table and its global secondary indexes will
       * require in this time period, since they are application-dependent.
       *
       * If you want to switch a table's billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , you
       * must specify a value for this property for each autoscaled resource. If you specify different
       * values for the same resource in different regions, CloudFormation will use the highest value
       * found in either the `SeedCapacity` or `ReadCapacityUnits` properties. For example, if your
       * global secondary index `myGSI` has a `SeedCapacity` of 10 in us-east-1 and a fixed
       * `ReadCapacityUnits` of 20 in eu-west-1, CloudFormation will initially set the read capacity
       * for `myGSI` to 20. Note that if you disable `ScaleIn` for `myGSI` in us-east-1, its read
       * capacity units might not be set back to 10.
       *
       * You must also specify a value for `SeedCapacity` when you plan to switch a table's billing
       * mode from `PROVISIONED` to `PAY_PER_REQUEST` , because CloudFormation might need to roll back
       * the operation (reverting the billing mode to `PROVISIONED` ) and this cannot succeed without
       * specifying a value for `SeedCapacity` .
       */
      public fun seedCapacity(seedCapacity: Number)

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f7ea4f6856b22021951baf99d4ce0f93304688be99d2346a741288c2c10da04")
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.builder()

      /**
       * @param maxCapacity The maximum provisioned capacity units for the global table. 
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The minimum provisioned capacity units for the global table. 
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      /**
       * @param seedCapacity When switching billing mode from `PAY_PER_REQUEST` to `PROVISIONED` ,
       * DynamoDB requires you to specify read and write capacity unit values for the table and for
       * each global secondary index.
       * These values will be applied to all replicas. The table will use these provisioned values
       * until CloudFormation creates the autoscaling policies you configured in your template.
       * CloudFormation cannot determine what capacity the table and its global secondary indexes will
       * require in this time period, since they are application-dependent.
       *
       * If you want to switch a table's billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , you
       * must specify a value for this property for each autoscaled resource. If you specify different
       * values for the same resource in different regions, CloudFormation will use the highest value
       * found in either the `SeedCapacity` or `ReadCapacityUnits` properties. For example, if your
       * global secondary index `myGSI` has a `SeedCapacity` of 10 in us-east-1 and a fixed
       * `ReadCapacityUnits` of 20 in eu-west-1, CloudFormation will initially set the read capacity
       * for `myGSI` to 20. Note that if you disable `ScaleIn` for `myGSI` in us-east-1, its read
       * capacity units might not be set back to 10.
       *
       * You must also specify a value for `SeedCapacity` when you plan to switch a table's billing
       * mode from `PROVISIONED` to `PAY_PER_REQUEST` , because CloudFormation might need to roll back
       * the operation (reverting the billing mode to `PROVISIONED` ) and this cannot succeed without
       * specifying a value for `SeedCapacity` .
       */
      override fun seedCapacity(seedCapacity: Number) {
        cdkBuilder.seedCapacity(seedCapacity)
      }

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty::unwrap))
      }

      /**
       * @param targetTrackingScalingPolicyConfiguration Defines a target tracking scaling policy. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f7ea4f6856b22021951baf99d4ce0f93304688be99d2346a741288c2c10da04")
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty,
    ) : CdkObject(cdkObject), CapacityAutoScalingSettingsProperty {
      /**
       * The maximum provisioned capacity units for the global table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-maxcapacity)
       */
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      /**
       * The minimum provisioned capacity units for the global table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-mincapacity)
       */
      override fun minCapacity(): Number = unwrap(this).getMinCapacity()

      /**
       * When switching billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , DynamoDB requires you
       * to specify read and write capacity unit values for the table and for each global secondary
       * index.
       *
       * These values will be applied to all replicas. The table will use these provisioned values
       * until CloudFormation creates the autoscaling policies you configured in your template.
       * CloudFormation cannot determine what capacity the table and its global secondary indexes will
       * require in this time period, since they are application-dependent.
       *
       * If you want to switch a table's billing mode from `PAY_PER_REQUEST` to `PROVISIONED` , you
       * must specify a value for this property for each autoscaled resource. If you specify different
       * values for the same resource in different regions, CloudFormation will use the highest value
       * found in either the `SeedCapacity` or `ReadCapacityUnits` properties. For example, if your
       * global secondary index `myGSI` has a `SeedCapacity` of 10 in us-east-1 and a fixed
       * `ReadCapacityUnits` of 20 in eu-west-1, CloudFormation will initially set the read capacity
       * for `myGSI` to 20. Note that if you disable `ScaleIn` for `myGSI` in us-east-1, its read
       * capacity units might not be set back to 10.
       *
       * You must also specify a value for `SeedCapacity` when you plan to switch a table's billing
       * mode from `PROVISIONED` to `PAY_PER_REQUEST` , because CloudFormation might need to roll back
       * the operation (reverting the billing mode to `PROVISIONED` ) and this cannot succeed without
       * specifying a value for `SeedCapacity` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-seedcapacity)
       */
      override fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

      /**
       * Defines a target tracking scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html#cfn-dynamodb-globaltable-capacityautoscalingsettings-targettrackingscalingpolicyconfiguration)
       */
      override fun targetTrackingScalingPolicyConfiguration(): Any =
          unwrap(this).getTargetTrackingScalingPolicyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityAutoScalingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty):
          CapacityAutoScalingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAutoScalingSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty
    }
  }

  public interface ReplicaSpecificationProperty {
    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * replica.
     *
     * When not specified, defaults to contributor insights disabled for the replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-contributorinsightsspecification)
     */
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    /**
     * Determines if a replica is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-deletionprotectionenabled)
     */
    public fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

    /**
     * Defines additional settings for the global secondary indexes of this replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-globalsecondaryindexes)
     */
    public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    /**
     * Defines the Kinesis Data Streams configuration for the specified replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-kinesisstreamspecification)
     */
    public fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

    /**
     * The settings used to enable point in time recovery.
     *
     * When not specified, defaults to point in time recovery disabled for the replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-pointintimerecoveryspecification)
     */
    public fun pointInTimeRecoverySpecification(): Any? =
        unwrap(this).getPointInTimeRecoverySpecification()

    /**
     * Defines read capacity settings for the replica table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-readprovisionedthroughputsettings)
     */
    public fun readProvisionedThroughputSettings(): Any? =
        unwrap(this).getReadProvisionedThroughputSettings()

    /**
     * The region in which this replica exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-region)
     */
    public fun region(): String

    /**
     * Allows you to specify a customer-managed key for the replica.
     *
     * When using customer-managed keys for server-side encryption, this property must have a value
     * in all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-ssespecification)
     */
    public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The table class of the specified table.
     *
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-tableclass)
     */
    public fun tableClass(): String? = unwrap(this).getTableClass()

    /**
     * An array of key-value pairs to apply to this replica.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [ReplicaSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71eddb50b4ca206239d442b398ce7d5b94bef6a90f535461aa5e307c663646a5")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      /**
       * @param deletionProtectionEnabled Determines if a replica is protected from deletion.
       * When enabled, the table cannot be deleted by any user or process. This setting is disabled
       * by default. For more information, see [Using deletion
       * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
       * in the *Amazon DynamoDB Developer Guide* .
       */
      public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

      /**
       * @param deletionProtectionEnabled Determines if a replica is protected from deletion.
       * When enabled, the table cannot be deleted by any user or process. This setting is disabled
       * by default. For more information, see [Using deletion
       * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
       * in the *Amazon DynamoDB Developer Guide* .
       */
      public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      public
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty)

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfe666492aef08b9bfb79830c2e86567773fefbf4421b67635d60d734cb7a30d")
      public
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit)

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      public
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty)

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6fbca7246bf04731ce2a3668cac30a7b66ce67cf84ef6014c3e35e0d159c98f")
      public
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable)

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty)

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbd18a4232bd36618354d67c1805df58eec0f2b06c96d65883bdccc0fe3ed12")
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit)

      /**
       * @param region The region in which this replica exists. 
       */
      public fun region(region: String)

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      public fun sseSpecification(sseSpecification: IResolvable)

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      public fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty)

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f77a65d920d46118eae66c2871a010c6cc389d9e38c8bbc4ed3970d089d3a40")
      public
          fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty.Builder.() -> Unit)

      /**
       * @param tableClass The table class of the specified table.
       * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
       */
      public fun tableClass(tableClass: String)

      /**
       * @param tags An array of key-value pairs to apply to this replica.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags An array of key-value pairs to apply to this replica.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.builder()

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified replica.
       * When not specified, defaults to contributor insights disabled for the replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71eddb50b4ca206239d442b398ce7d5b94bef6a90f535461aa5e307c663646a5")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      /**
       * @param deletionProtectionEnabled Determines if a replica is protected from deletion.
       * When enabled, the table cannot be deleted by any user or process. This setting is disabled
       * by default. For more information, see [Using deletion
       * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
       * in the *Amazon DynamoDB Developer Guide* .
       */
      override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
      }

      /**
       * @param deletionProtectionEnabled Determines if a replica is protected from deletion.
       * When enabled, the table cannot be deleted by any user or process. This setting is disabled
       * by default. For more information, see [Using deletion
       * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
       * in the *Amazon DynamoDB Developer Guide* .
       */
      override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
      }

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
      }

      /**
       * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes
       * of this replica.
       */
      override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
          globalSecondaryIndexes(globalSecondaryIndexes.toList())

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      override fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      override
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(KinesisStreamSpecificationProperty::unwrap))
      }

      /**
       * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
       * specified replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfe666492aef08b9bfb79830c2e86567773fefbf4421b67635d60d734cb7a30d")
      override
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamSpecification(KinesisStreamSpecificationProperty(kinesisStreamSpecification))

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      override fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(IResolvable::unwrap))
      }

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      override
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(PointInTimeRecoverySpecificationProperty::unwrap))
      }

      /**
       * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
       * When not specified, defaults to point in time recovery disabled for the replica.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6fbca7246bf04731ce2a3668cac30a7b66ce67cf84ef6014c3e35e0d159c98f")
      override
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
          Unit =
          pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(ReadProvisionedThroughputSettingsProperty::unwrap))
      }

      /**
       * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
       * table.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbd18a4232bd36618354d67c1805df58eec0f2b06c96d65883bdccc0fe3ed12")
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty(readProvisionedThroughputSettings))

      /**
       * @param region The region in which this replica exists. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      override fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      override fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification.let(ReplicaSSESpecificationProperty::unwrap))
      }

      /**
       * @param sseSpecification Allows you to specify a customer-managed key for the replica.
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f77a65d920d46118eae66c2871a010c6cc389d9e38c8bbc4ed3970d089d3a40")
      override
          fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty.Builder.() -> Unit):
          Unit = sseSpecification(ReplicaSSESpecificationProperty(sseSpecification))

      /**
       * @param tableClass The table class of the specified table.
       * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
       */
      override fun tableClass(tableClass: String) {
        cdkBuilder.tableClass(tableClass)
      }

      /**
       * @param tags An array of key-value pairs to apply to this replica.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags An array of key-value pairs to apply to this replica.
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty,
    ) : CdkObject(cdkObject), ReplicaSpecificationProperty {
      /**
       * The settings used to enable or disable CloudWatch Contributor Insights for the specified
       * replica.
       *
       * When not specified, defaults to contributor insights disabled for the replica.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-contributorinsightsspecification)
       */
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      /**
       * Determines if a replica is protected from deletion.
       *
       * When enabled, the table cannot be deleted by any user or process. This setting is disabled
       * by default. For more information, see [Using deletion
       * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-deletionprotectionenabled)
       */
      override fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

      /**
       * Defines additional settings for the global secondary indexes of this replica.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-globalsecondaryindexes)
       */
      override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

      /**
       * Defines the Kinesis Data Streams configuration for the specified replica.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-kinesisstreamspecification)
       */
      override fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

      /**
       * The settings used to enable point in time recovery.
       *
       * When not specified, defaults to point in time recovery disabled for the replica.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-pointintimerecoveryspecification)
       */
      override fun pointInTimeRecoverySpecification(): Any? =
          unwrap(this).getPointInTimeRecoverySpecification()

      /**
       * Defines read capacity settings for the replica table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-readprovisionedthroughputsettings)
       */
      override fun readProvisionedThroughputSettings(): Any? =
          unwrap(this).getReadProvisionedThroughputSettings()

      /**
       * The region in which this replica exists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-region)
       */
      override fun region(): String = unwrap(this).getRegion()

      /**
       * Allows you to specify a customer-managed key for the replica.
       *
       * When using customer-managed keys for server-side encryption, this property must have a
       * value in all replicas.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-ssespecification)
       */
      override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

      /**
       * The table class of the specified table.
       *
       * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-tableclass)
       */
      override fun tableClass(): String? = unwrap(this).getTableClass()

      /**
       * An array of key-value pairs to apply to this replica.
       *
       * For more information, see
       * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty):
          ReplicaSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty
    }
  }

  public interface ContributorInsightsSpecificationProperty {
    /**
     * Indicates whether CloudWatch Contributor Insights are to be enabled (true) or disabled
     * (false).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-contributorinsightsspecification.html#cfn-dynamodb-globaltable-contributorinsightsspecification-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ContributorInsightsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty.builder()

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty,
    ) : CdkObject(cdkObject), ContributorInsightsSpecificationProperty {
      /**
       * Indicates whether CloudWatch Contributor Insights are to be enabled (true) or disabled
       * (false).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-contributorinsightsspecification.html#cfn-dynamodb-globaltable-contributorinsightsspecification-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContributorInsightsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty):
          ContributorInsightsSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContributorInsightsSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty
    }
  }

  public interface GlobalSecondaryIndexProperty {
    /**
     * The name of the global secondary index.
     *
     * The name must be unique among all other indexes on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-indexname)
     */
    public fun indexName(): String

    /**
     * The complete key schema for a global secondary index, which consists of one or more pairs of
     * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
     * partition key of an item is also known as its *hash attribute* .
     *
     * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
     * evenly distribute data items across partitions, based on their partition key values.
     *
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-keyschema)
     */
    public fun keySchema(): Any

    /**
     * Represents attributes that are copied (projected) from the table into the global secondary
     * index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-projection)
     */
    public fun projection(): Any

    /**
     * Defines write capacity settings for the global secondary index.
     *
     * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
     * All replicas will have the same write capacity settings for this global secondary index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-writeprovisionedthroughputsettings)
     */
    public fun writeProvisionedThroughputSettings(): Any? =
        unwrap(this).getWriteProvisionedThroughputSettings()

    /**
     * A builder for [GlobalSecondaryIndexProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      public fun indexName(indexName: String)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: IResolvable)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: List<Any>)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(vararg keySchema: Any)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: IResolvable)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: ProjectionProperty)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58d5331a2b6e0e2a944808861029f8d5207b9bfe0b220f19868469cc21f4955")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      public
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty)

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0a9a3e1aa0c2088ddba833b9a25dc013a4c95a011c4e48781b132398f502f21")
      public
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.builder()

      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58d5331a2b6e0e2a944808861029f8d5207b9bfe0b220f19868469cc21f4955")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(WriteProvisionedThroughputSettingsProperty::unwrap))
      }

      /**
       * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
       * secondary index.
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0a9a3e1aa0c2088ddba833b9a25dc013a4c95a011c4e48781b132398f502f21")
      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty,
    ) : CdkObject(cdkObject), GlobalSecondaryIndexProperty {
      /**
       * The name of the global secondary index.
       *
       * The name must be unique among all other indexes on this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The complete key schema for a global secondary index, which consists of one or more pairs
       * of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
       * partition key of an item is also known as its *hash attribute* .
       *
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-keyschema)
       */
      override fun keySchema(): Any = unwrap(this).getKeySchema()

      /**
       * Represents attributes that are copied (projected) from the table into the global secondary
       * index.
       *
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-projection)
       */
      override fun projection(): Any = unwrap(this).getProjection()

      /**
       * Defines write capacity settings for the global secondary index.
       *
       * You must specify a value for this property if the table's `BillingMode` is `PROVISIONED` .
       * All replicas will have the same write capacity settings for this global secondary index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html#cfn-dynamodb-globaltable-globalsecondaryindex-writeprovisionedthroughputsettings)
       */
      override fun writeProvisionedThroughputSettings(): Any? =
          unwrap(this).getWriteProvisionedThroughputSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty):
          GlobalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty
    }
  }

  public interface ReplicaGlobalSecondaryIndexSpecificationProperty {
    /**
     * Updates the status for contributor insights for a specific table or index.
     *
     * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
     * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
     * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition key
     * and sort key data with an AWS managed key or customer managed key, you should not enable
     * CloudWatch Contributor Insights for DynamoDB for this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-contributorinsightsspecification)
     */
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    /**
     * The name of the global secondary index.
     *
     * The name must be unique among all other indexes on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-indexname)
     */
    public fun indexName(): String

    /**
     * Allows you to specify the read capacity settings for a replica global secondary index when
     * the `BillingMode` is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-readprovisionedthroughputsettings)
     */
    public fun readProvisionedThroughputSettings(): Any? =
        unwrap(this).getReadProvisionedThroughputSettings()

    /**
     * A builder for [ReplicaGlobalSecondaryIndexSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3afc9fdd202c3b1cd2eae6dba9b04577a438b37b5627db7f818ecda8d67c8d11")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      public fun indexName(indexName: String)

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable)

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty)

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84995732399c653ddcc401adfea203e3db5a793d859860bd38d504b20c54e3ce")
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder()

      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      /**
       * @param contributorInsightsSpecification Updates the status for contributor insights for a
       * specific table or index.
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3afc9fdd202c3b1cd2eae6dba9b04577a438b37b5627db7f818ecda8d67c8d11")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(ReadProvisionedThroughputSettingsProperty::unwrap))
      }

      /**
       * @param readProvisionedThroughputSettings Allows you to specify the read capacity settings
       * for a replica global secondary index when the `BillingMode` is set to `PROVISIONED` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84995732399c653ddcc401adfea203e3db5a793d859860bd38d504b20c54e3ce")
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty(readProvisionedThroughputSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty,
    ) : CdkObject(cdkObject), ReplicaGlobalSecondaryIndexSpecificationProperty {
      /**
       * Updates the status for contributor insights for a specific table or index.
       *
       * CloudWatch Contributor Insights for DynamoDB graphs display the partition key and (if
       * applicable) sort key of frequently accessed items and frequently throttled items in plaintext.
       * If you require the use of AWS Key Management Service (KMS) to encrypt this table’s partition
       * key and sort key data with an AWS managed key or customer managed key, you should not enable
       * CloudWatch Contributor Insights for DynamoDB for this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-contributorinsightsspecification)
       */
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      /**
       * The name of the global secondary index.
       *
       * The name must be unique among all other indexes on this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * Allows you to specify the read capacity settings for a replica global secondary index when
       * the `BillingMode` is set to `PROVISIONED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html#cfn-dynamodb-globaltable-replicaglobalsecondaryindexspecification-readprovisionedthroughputsettings)
       */
      override fun readProvisionedThroughputSettings(): Any? =
          unwrap(this).getReadProvisionedThroughputSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplicaGlobalSecondaryIndexSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty):
          ReplicaGlobalSecondaryIndexSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaGlobalSecondaryIndexSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty
    }
  }

  public interface AttributeDefinitionProperty {
    /**
     * A name for the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html#cfn-dynamodb-globaltable-attributedefinition-attributename)
     */
    public fun attributeName(): String

    /**
     * The data type for the attribute, where:.
     *
     * * `S` - the attribute is of type String
     * * `N` - the attribute is of type Number
     * * `B` - the attribute is of type Binary
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html#cfn-dynamodb-globaltable-attributedefinition-attributetype)
     */
    public fun attributeType(): String

    /**
     * A builder for [AttributeDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName A name for the attribute. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param attributeType The data type for the attribute, where:. 
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       */
      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty.builder()

      /**
       * @param attributeName A name for the attribute. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param attributeType The data type for the attribute, where:. 
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       */
      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty,
    ) : CdkObject(cdkObject), AttributeDefinitionProperty {
      /**
       * A name for the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html#cfn-dynamodb-globaltable-attributedefinition-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The data type for the attribute, where:.
       *
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html#cfn-dynamodb-globaltable-attributedefinition-attributetype)
       */
      override fun attributeType(): String = unwrap(this).getAttributeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty):
          AttributeDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDefinitionProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty
    }
  }

  public interface ReplicaSSESpecificationProperty {
    /**
     * The AWS KMS key that should be used for the AWS KMS encryption.
     *
     * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     * that you should only provide this parameter if the key is different from the default DynamoDB
     * key `alias/aws/dynamodb` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicassespecification.html#cfn-dynamodb-globaltable-replicassespecification-kmsmasterkeyid)
     */
    public fun kmsMasterKeyId(): String

    /**
     * A builder for [ReplicaSSESpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption. 
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       */
      public fun kmsMasterKeyId(kmsMasterKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty.builder()

      /**
       * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption. 
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       */
      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty,
    ) : CdkObject(cdkObject), ReplicaSSESpecificationProperty {
      /**
       * The AWS KMS key that should be used for the AWS KMS encryption.
       *
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicassespecification.html#cfn-dynamodb-globaltable-replicassespecification-kmsmasterkeyid)
       */
      override fun kmsMasterKeyId(): String = unwrap(this).getKmsMasterKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty):
          ReplicaSSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty
    }
  }

  public interface SSESpecificationProperty {
    /**
     * Indicates whether server-side encryption is performed using an AWS managed key or an AWS
     * owned key.
     *
     * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used (
     * AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set to an
     * AWS owned key. If you choose to use KMS encryption, you can also use customer managed KMS keys
     * by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot mix AWS
     * managed and customer managed KMS keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html#cfn-dynamodb-globaltable-ssespecification-sseenabled)
     */
    public fun sseEnabled(): Any

    /**
     * Server-side encryption type. The only supported value is:.
     *
     * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored in
     * your account and is managed by AWS KMS ( AWS KMS charges apply).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html#cfn-dynamodb-globaltable-ssespecification-ssetype)
     */
    public fun sseType(): String? = unwrap(this).getSseType()

    /**
     * A builder for [SSESpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sseEnabled Indicates whether server-side encryption is performed using an AWS
       * managed key or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used
       * ( AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set
       * to an AWS owned key. If you choose to use KMS encryption, you can also use customer managed
       * KMS keys by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot
       * mix AWS managed and customer managed KMS keys.
       */
      public fun sseEnabled(sseEnabled: Boolean)

      /**
       * @param sseEnabled Indicates whether server-side encryption is performed using an AWS
       * managed key or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used
       * ( AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set
       * to an AWS owned key. If you choose to use KMS encryption, you can also use customer managed
       * KMS keys by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot
       * mix AWS managed and customer managed KMS keys.
       */
      public fun sseEnabled(sseEnabled: IResolvable)

      /**
       * @param sseType Server-side encryption type. The only supported value is:.
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       */
      public fun sseType(sseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.builder()

      /**
       * @param sseEnabled Indicates whether server-side encryption is performed using an AWS
       * managed key or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used
       * ( AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set
       * to an AWS owned key. If you choose to use KMS encryption, you can also use customer managed
       * KMS keys by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot
       * mix AWS managed and customer managed KMS keys.
       */
      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      /**
       * @param sseEnabled Indicates whether server-side encryption is performed using an AWS
       * managed key or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used
       * ( AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set
       * to an AWS owned key. If you choose to use KMS encryption, you can also use customer managed
       * KMS keys by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot
       * mix AWS managed and customer managed KMS keys.
       */
      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param sseType Server-side encryption type. The only supported value is:.
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       */
      override fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty,
    ) : CdkObject(cdkObject), SSESpecificationProperty {
      /**
       * Indicates whether server-side encryption is performed using an AWS managed key or an AWS
       * owned key.
       *
       * If enabled (true), server-side encryption type is set to KMS and an AWS managed key is used
       * ( AWS KMS charges apply). If disabled (false) or not specified,server-side encryption is set
       * to an AWS owned key. If you choose to use KMS encryption, you can also use customer managed
       * KMS keys by specifying them in the `ReplicaSpecification.SSESpecification` object. You cannot
       * mix AWS managed and customer managed KMS keys.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html#cfn-dynamodb-globaltable-ssespecification-sseenabled)
       */
      override fun sseEnabled(): Any = unwrap(this).getSseEnabled()

      /**
       * Server-side encryption type. The only supported value is:.
       *
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html#cfn-dynamodb-globaltable-ssespecification-ssetype)
       */
      override fun sseType(): String? = unwrap(this).getSseType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty):
          SSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty
    }
  }

  public interface KeySchemaProperty {
    /**
     * The name of a key attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-keyschema.html#cfn-dynamodb-globaltable-keyschema-attributename)
     */
    public fun attributeName(): String

    /**
     * The role that this key attribute will assume:.
     *
     * * `HASH` - partition key
     * * `RANGE` - sort key
     *
     *
     * The partition key of an item is also known as its *hash attribute* . The term "hash
     * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data
     * items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-keyschema.html#cfn-dynamodb-globaltable-keyschema-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [KeySchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of a key attribute. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param keyType The role that this key attribute will assume:. 
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.builder()

      /**
       * @param attributeName The name of a key attribute. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param keyType The role that this key attribute will assume:. 
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty,
    ) : CdkObject(cdkObject), KeySchemaProperty {
      /**
       * The name of a key attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-keyschema.html#cfn-dynamodb-globaltable-keyschema-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The role that this key attribute will assume:.
       *
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-keyschema.html#cfn-dynamodb-globaltable-keyschema-keytype)
       */
      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeySchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty):
          KeySchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySchemaProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty
    }
  }

  public interface WriteProvisionedThroughputSettingsProperty {
    /**
     * Specifies auto scaling settings for the replica table or global secondary index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-writeprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings-writecapacityautoscalingsettings)
     */
    public fun writeCapacityAutoScalingSettings(): Any? =
        unwrap(this).getWriteCapacityAutoScalingSettings()

    /**
     * A builder for [WriteProvisionedThroughputSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      public fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: IResolvable)

      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      public
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty)

      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c030867d57291db5318e89e23ab5635491b7190a76bb37354a0ec87057c22946")
      public
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.builder()

      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      override fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: IResolvable) {
        cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings.let(IResolvable::unwrap))
      }

      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      override
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty) {
        cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings.let(CapacityAutoScalingSettingsProperty::unwrap))
      }

      /**
       * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c030867d57291db5318e89e23ab5635491b7190a76bb37354a0ec87057c22946")
      override
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit):
          Unit =
          writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty(writeCapacityAutoScalingSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty,
    ) : CdkObject(cdkObject), WriteProvisionedThroughputSettingsProperty {
      /**
       * Specifies auto scaling settings for the replica table or global secondary index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-writeprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings-writecapacityautoscalingsettings)
       */
      override fun writeCapacityAutoScalingSettings(): Any? =
          unwrap(this).getWriteCapacityAutoScalingSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WriteProvisionedThroughputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty):
          WriteProvisionedThroughputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WriteProvisionedThroughputSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
    }
  }

  public interface LocalSecondaryIndexProperty {
    /**
     * The name of the local secondary index.
     *
     * The name must be unique among all other indexes on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-indexname)
     */
    public fun indexName(): String

    /**
     * The complete key schema for the local secondary index, consisting of one or more pairs of
     * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
     * partition key of an item is also known as its *hash attribute* .
     *
     * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
     * evenly distribute data items across partitions, based on their partition key values.
     *
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-keyschema)
     */
    public fun keySchema(): Any

    /**
     * Represents attributes that are copied (projected) from the table into the local secondary
     * index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-projection)
     */
    public fun projection(): Any

    /**
     * A builder for [LocalSecondaryIndexProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexName The name of the local secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      public fun indexName(indexName: String)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: IResolvable)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: List<Any>)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(vararg keySchema: Any)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: IResolvable)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: ProjectionProperty)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e4589d72bff11e2c15ac41559d1db3d78d20953e627958ae218cee61bd0aea9")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty.builder()

      /**
       * @param indexName The name of the local secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e4589d72bff11e2c15ac41559d1db3d78d20953e627958ae218cee61bd0aea9")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty,
    ) : CdkObject(cdkObject), LocalSecondaryIndexProperty {
      /**
       * The name of the local secondary index.
       *
       * The name must be unique among all other indexes on this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The complete key schema for the local secondary index, consisting of one or more pairs of
       * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
       * partition key of an item is also known as its *hash attribute* .
       *
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-keyschema)
       */
      override fun keySchema(): Any = unwrap(this).getKeySchema()

      /**
       * Represents attributes that are copied (projected) from the table into the local secondary
       * index.
       *
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html#cfn-dynamodb-globaltable-localsecondaryindex-projection)
       */
      override fun projection(): Any = unwrap(this).getProjection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty):
          LocalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty
    }
  }

  public interface PointInTimeRecoverySpecificationProperty {
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-pointintimerecoveryspecification.html#cfn-dynamodb-globaltable-pointintimerecoveryspecification-pointintimerecoveryenabled)
     */
    public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    /**
     * A builder for [PointInTimeRecoverySpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty.builder()

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
      }

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty,
    ) : CdkObject(cdkObject), PointInTimeRecoverySpecificationProperty {
      /**
       * Indicates whether point in time recovery is enabled (true) or disabled (false) on the
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-pointintimerecoveryspecification.html#cfn-dynamodb-globaltable-pointintimerecoveryspecification-pointintimerecoveryenabled)
       */
      override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PointInTimeRecoverySpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty):
          PointInTimeRecoverySpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PointInTimeRecoverySpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty
    }
  }

  public interface ReadProvisionedThroughputSettingsProperty {
    /**
     * Specifies auto scaling settings for the replica table or global secondary index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-readprovisionedthroughputsettings-readcapacityautoscalingsettings)
     */
    public fun readCapacityAutoScalingSettings(): Any? =
        unwrap(this).getReadCapacityAutoScalingSettings()

    /**
     * Specifies a fixed read capacity for the replica table or global secondary index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-readprovisionedthroughputsettings-readcapacityunits)
     */
    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    /**
     * A builder for [ReadProvisionedThroughputSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      public fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable)

      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      public
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty)

      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0af043491dcca202df6a740240dcabcc4cda2a11fa346d48efb3a2c47230a26")
      public
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit)

      /**
       * @param readCapacityUnits Specifies a fixed read capacity for the replica table or global
       * secondary index.
       */
      public fun readCapacityUnits(readCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder()

      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      override fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings.let(IResolvable::unwrap))
      }

      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      override
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings.let(CapacityAutoScalingSettingsProperty::unwrap))
      }

      /**
       * @param readCapacityAutoScalingSettings Specifies auto scaling settings for the replica
       * table or global secondary index.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0af043491dcca202df6a740240dcabcc4cda2a11fa346d48efb3a2c47230a26")
      override
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit):
          Unit =
          readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty(readCapacityAutoScalingSettings))

      /**
       * @param readCapacityUnits Specifies a fixed read capacity for the replica table or global
       * secondary index.
       */
      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty,
    ) : CdkObject(cdkObject), ReadProvisionedThroughputSettingsProperty {
      /**
       * Specifies auto scaling settings for the replica table or global secondary index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-readprovisionedthroughputsettings-readcapacityautoscalingsettings)
       */
      override fun readCapacityAutoScalingSettings(): Any? =
          unwrap(this).getReadCapacityAutoScalingSettings()

      /**
       * Specifies a fixed read capacity for the replica table or global secondary index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html#cfn-dynamodb-globaltable-readprovisionedthroughputsettings-readcapacityunits)
       */
      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReadProvisionedThroughputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty):
          ReadProvisionedThroughputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadProvisionedThroughputSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
    }
  }

  public interface KinesisStreamSpecificationProperty {
    /**
     * The precision for the time and date that the stream was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html#cfn-dynamodb-globaltable-kinesisstreamspecification-approximatecreationdatetimeprecision)
     */
    public fun approximateCreationDateTimePrecision(): String? =
        unwrap(this).getApproximateCreationDateTimePrecision()

    /**
     * The ARN for a specific Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html#cfn-dynamodb-globaltable-kinesisstreamspecification-streamarn)
     */
    public fun streamArn(): String

    /**
     * A builder for [KinesisStreamSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approximateCreationDateTimePrecision The precision for the time and date that the
       * stream was created.
       */
      public fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String)

      /**
       * @param streamArn The ARN for a specific Kinesis data stream. 
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty.builder()

      /**
       * @param approximateCreationDateTimePrecision The precision for the time and date that the
       * stream was created.
       */
      override
          fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String) {
        cdkBuilder.approximateCreationDateTimePrecision(approximateCreationDateTimePrecision)
      }

      /**
       * @param streamArn The ARN for a specific Kinesis data stream. 
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty,
    ) : CdkObject(cdkObject), KinesisStreamSpecificationProperty {
      /**
       * The precision for the time and date that the stream was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html#cfn-dynamodb-globaltable-kinesisstreamspecification-approximatecreationdatetimeprecision)
       */
      override fun approximateCreationDateTimePrecision(): String? =
          unwrap(this).getApproximateCreationDateTimePrecision()

      /**
       * The ARN for a specific Kinesis data stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html#cfn-dynamodb-globaltable-kinesisstreamspecification-streamarn)
       */
      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty):
          KinesisStreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty
    }
  }
}
