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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.events.OnEventOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.ClusterEngineConfig
import software.amazon.awscdk.services.rds.ClusterInstance
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterBase
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceBase
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.IAuroraClusterInstance
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IClusterInstance
import software.amazon.awscdk.services.rds.IDatabaseCluster
import software.amazon.awscdk.services.rds.IDatabaseInstance
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.InstanceEngineConfig
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.constructs.Construct

/** The secret managed by RDS in AWS Secrets Manager for the master user password. */
public inline fun CfnDBCluster.setMasterUserSecret(
    block: CfnDBClusterMasterUserSecretPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBClusterMasterUserSecretPropertyDsl()
    builder.apply(block)
    return setMasterUserSecret(builder.build())
}

/**
 * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
 * Serverless DB cluster.
 */
public inline fun CfnDBCluster.setScalingConfiguration(
    block: CfnDBClusterScalingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBClusterScalingConfigurationPropertyDsl()
    builder.apply(block)
    return setScalingConfiguration(builder.build())
}

/**
 * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of an
 * Aurora Serverless V2 DB cluster.
 */
public inline fun CfnDBCluster.setServerlessV2ScalingConfiguration(
    block: CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl()
    builder.apply(block)
    return setServerlessV2ScalingConfiguration(builder.build())
}

/** The details of the DB instance's server certificate. */
public inline fun CfnDBInstance.setCertificateDetails(
    block: CfnDBInstanceCertificateDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBInstanceCertificateDetailsPropertyDsl()
    builder.apply(block)
    return setCertificateDetails(builder.build())
}

/** The connection endpoint for the DB instance. */
public inline fun CfnDBInstance.setEndpoint(
    block: CfnDBInstanceEndpointPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBInstanceEndpointPropertyDsl()
    builder.apply(block)
    return setEndpoint(builder.build())
}

/** The secret managed by RDS in AWS Secrets Manager for the master user password. */
public inline fun CfnDBInstance.setMasterUserSecret(
    block: CfnDBInstanceMasterUserSecretPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBInstanceMasterUserSecretPropertyDsl()
    builder.apply(block)
    return setMasterUserSecret(builder.build())
}

/**
 * Settings that control the size and behavior of the connection pool associated with a
 * `DBProxyTargetGroup` .
 */
public inline fun CfnDBProxyTargetGroup.setConnectionPoolConfigurationInfo(
    block: CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl()
    builder.apply(block)
    return setConnectionPoolConfigurationInfo(builder.build())
}

/**
 * Add the ClusterInstance to the cluster.
 *
 * @param scope
 * @param cluster
 * @param props
 */
public inline fun ClusterInstance.bind(
    scope: Construct,
    cluster: IDatabaseCluster,
    block: ClusterInstanceBindOptionsDsl.() -> Unit = {},
): IAuroraClusterInstance {
    val builder = ClusterInstanceBindOptionsDsl()
    builder.apply(block)
    return bind(scope, cluster, builder.build())
}

/**
 * Adds the multi user rotation to this cluster.
 *
 * See
 * [Alternating users rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
 *
 * @param id
 * @param options
 */
public inline fun DatabaseCluster.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

/**
 * Adds the single user rotation of the master password to this cluster.
 *
 * See
 * [Single user rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-one-user-one-password)
 *
 * @param options
 */
public inline fun DatabaseCluster.addRotationSingleUser(
    block: RotationSingleUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationSingleUserOptionsDsl()
    builder.apply(block)
    return addRotationSingleUser(builder.build())
}

/**
 * This value is represented as a percentage.
 *
 * It's calculated as the value of the ServerlessDatabaseCapacity metric divided by the maximum ACU
 * value of the DB cluster.
 *
 * If this metric approaches a value of 100.0, the DB instance has scaled up as high as it can.
 * Consider increasing the maximum ACU setting for the cluster.
 *
 * @param props
 */
public inline fun DatabaseCluster.metricACUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricACUUtilization(builder.build())
}

/**
 * As a cluster-level metric, it represents the average of the ServerlessDatabaseCapacity values of
 * all the Aurora Serverless v2 DB instances in the cluster.
 *
 * @param props
 */
public inline fun DatabaseCluster.metricServerlessDatabaseCapacity(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerlessDatabaseCapacity(builder.build())
}

/**
 * Add a new db proxy to this cluster.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseClusterBase.addProxy(
    id: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}
): DatabaseProxy {
    val builder = DatabaseProxyOptionsDsl()
    builder.apply(block)
    return addProxy(id, builder.build())
}

/**
 * Return the given named metric for this DBCluster.
 *
 * @param metricName
 * @param props
 */
public inline fun DatabaseClusterBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * The percentage of CPU utilization.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * The number of database connections in use.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricDatabaseConnections(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDatabaseConnections(builder.build())
}

/**
 * The average number of deadlocks in the database per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricDeadlocks(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDeadlocks(builder.build())
}

/**
 * The amount of time that the instance has been running, in seconds.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricEngineUptime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricEngineUptime(builder.build())
}

/**
 * The amount of local storage available, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricFreeLocalStorage(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeLocalStorage(builder.build())
}

/**
 * The amount of available random access memory, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricFreeableMemory(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeableMemory(builder.build())
}

/**
 * The amount of network throughput received from clients by each instance, in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricNetworkReceiveThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkReceiveThroughput(builder.build())
}

/**
 * The amount of network throughput both received from and transmitted to clients by each instance,
 * in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricNetworkThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkThroughput(builder.build())
}

/**
 * The amount of network throughput sent to clients by each instance, in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricNetworkTransmitThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkTransmitThroughput(builder.build())
}

/**
 * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
 * retention window.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricSnapshotStorageUsed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSnapshotStorageUsed(builder.build())
}

/**
 * The total amount of backup storage in bytes for which you are billed.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricTotalBackupStorageBilled(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTotalBackupStorageBilled(builder.build())
}

/**
 * The amount of storage used by your Aurora DB instance, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricVolumeBytesUsed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeBytesUsed(builder.build())
}

/**
 * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricVolumeReadIOPs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeReadIOPs(builder.build())
}

/**
 * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseClusterBase.metricVolumeWriteIOPs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeWriteIOPs(builder.build())
}

/**
 * Adds the multi user rotation to this cluster.
 *
 * See
 * [Alternating users rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
 *
 * @param id
 * @param options
 */
public inline fun DatabaseClusterFromSnapshot.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

/**
 * Adds the single user rotation of the master password to this cluster.
 *
 * See
 * [Single user rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-one-user-one-password)
 *
 * @param options
 */
public inline fun DatabaseClusterFromSnapshot.addRotationSingleUser(
    block: RotationSingleUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationSingleUserOptionsDsl()
    builder.apply(block)
    return addRotationSingleUser(builder.build())
}

/**
 * This value is represented as a percentage.
 *
 * It's calculated as the value of the ServerlessDatabaseCapacity metric divided by the maximum ACU
 * value of the DB cluster.
 *
 * If this metric approaches a value of 100.0, the DB instance has scaled up as high as it can.
 * Consider increasing the maximum ACU setting for the cluster.
 *
 * @param props
 */
public inline fun DatabaseClusterFromSnapshot.metricACUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricACUUtilization(builder.build())
}

/**
 * As a cluster-level metric, it represents the average of the ServerlessDatabaseCapacity values of
 * all the Aurora Serverless v2 DB instances in the cluster.
 *
 * @param props
 */
public inline fun DatabaseClusterFromSnapshot.metricServerlessDatabaseCapacity(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricServerlessDatabaseCapacity(builder.build())
}

/**
 * Adds the multi user rotation to this instance.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseInstance.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

/**
 * Adds the single user rotation of the master password to this instance.
 *
 * @param options the options for the rotation, if you want to override the defaults.
 */
public inline fun DatabaseInstance.addRotationSingleUser(
    block: RotationSingleUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationSingleUserOptionsDsl()
    builder.apply(block)
    return addRotationSingleUser(builder.build())
}

/**
 * Add a new db proxy to this instance.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseInstanceBase.addProxy(
    id: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}
): DatabaseProxy {
    val builder = DatabaseProxyOptionsDsl()
    builder.apply(block)
    return addProxy(id, builder.build())
}

/**
 * Return the given named metric for this DBInstance.
 *
 * @param metricName
 * @param props
 */
public inline fun DatabaseInstanceBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * The percentage of CPU utilization.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * The number of database connections in use.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricDatabaseConnections(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDatabaseConnections(builder.build())
}

/**
 * The amount of available storage space.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricFreeStorageSpace(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeStorageSpace(builder.build())
}

/**
 * The amount of available random access memory.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricFreeableMemory(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeableMemory(builder.build())
}

/**
 * The average number of disk write I/O operations per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricReadIOPS(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricReadIOPS(builder.build())
}

/**
 * The average number of disk read I/O operations per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun DatabaseInstanceBase.metricWriteIOPS(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricWriteIOPS(builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for instance events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseInstanceBase.onEvent(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Adds the multi user rotation to this instance.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseInstanceFromSnapshot.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

/**
 * Adds the single user rotation of the master password to this instance.
 *
 * @param options the options for the rotation, if you want to override the defaults.
 */
public inline fun DatabaseInstanceFromSnapshot.addRotationSingleUser(
    block: RotationSingleUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationSingleUserOptionsDsl()
    builder.apply(block)
    return addRotationSingleUser(builder.build())
}

/**
 * Method called when the engine is used to create a new cluster.
 *
 * @param scope
 * @param options
 */
public inline fun IClusterEngine.bindToCluster(
    arg0: Construct,
    block: ClusterEngineBindOptionsDsl.() -> Unit = {}
): ClusterEngineConfig {
    val builder = ClusterEngineBindOptionsDsl()
    builder.apply(block)
    return bindToCluster(arg0, builder.build())
}

/**
 * Create the database instance within the provided cluster.
 *
 * @param scope
 * @param cluster
 * @param options
 */
public inline fun IClusterInstance.bind(
    arg0: Construct,
    arg1: IDatabaseCluster,
    block: ClusterInstanceBindOptionsDsl.() -> Unit = {},
): IAuroraClusterInstance {
    val builder = ClusterInstanceBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, arg1, builder.build())
}

/**
 * Add a new db proxy to this cluster.
 *
 * @param id
 * @param options
 */
public inline fun IDatabaseCluster.addProxy(
    arg0: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}
): DatabaseProxy {
    val builder = DatabaseProxyOptionsDsl()
    builder.apply(block)
    return addProxy(arg0, builder.build())
}

/**
 * Return the given named metric for this DBCluster.
 *
 * @param metricName
 * @param props
 */
public inline fun IDatabaseCluster.metric(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * The percentage of CPU utilization.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * The number of database connections in use.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricDatabaseConnections(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDatabaseConnections(builder.build())
}

/**
 * The average number of deadlocks in the database per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricDeadlocks(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDeadlocks(builder.build())
}

/**
 * The amount of time that the instance has been running, in seconds.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricEngineUptime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricEngineUptime(builder.build())
}

/**
 * The amount of local storage available, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricFreeLocalStorage(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeLocalStorage(builder.build())
}

/**
 * The amount of available random access memory, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricFreeableMemory(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeableMemory(builder.build())
}

/**
 * The amount of network throughput received from clients by each instance, in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricNetworkReceiveThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkReceiveThroughput(builder.build())
}

/**
 * The amount of network throughput both received from and transmitted to clients by each instance,
 * in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricNetworkThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkThroughput(builder.build())
}

/**
 * The amount of network throughput sent to clients by each instance, in bytes per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricNetworkTransmitThroughput(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNetworkTransmitThroughput(builder.build())
}

/**
 * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
 * retention window.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricSnapshotStorageUsed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSnapshotStorageUsed(builder.build())
}

/**
 * The total amount of backup storage in bytes for which you are billed.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricTotalBackupStorageBilled(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTotalBackupStorageBilled(builder.build())
}

/**
 * The amount of storage used by your Aurora DB instance, in bytes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricVolumeBytesUsed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeBytesUsed(builder.build())
}

/**
 * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricVolumeReadIOPs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeReadIOPs(builder.build())
}

/**
 * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseCluster.metricVolumeWriteIOPs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricVolumeWriteIOPs(builder.build())
}

/**
 * Add a new db proxy to this instance.
 *
 * @param id
 * @param options
 */
public inline fun IDatabaseInstance.addProxy(
    arg0: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}
): DatabaseProxy {
    val builder = DatabaseProxyOptionsDsl()
    builder.apply(block)
    return addProxy(arg0, builder.build())
}

/**
 * Return the given named metric for this DBInstance.
 *
 * @param metricName
 * @param props
 */
public inline fun IDatabaseInstance.metric(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * The percentage of CPU utilization.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * The number of database connections in use.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricDatabaseConnections(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDatabaseConnections(builder.build())
}

/**
 * The amount of available storage space.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricFreeStorageSpace(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeStorageSpace(builder.build())
}

/**
 * The amount of available random access memory.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricFreeableMemory(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeableMemory(builder.build())
}

/**
 * The average number of disk write I/O operations per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricReadIOPS(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricReadIOPS(builder.build())
}

/**
 * The average number of disk read I/O operations per second.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IDatabaseInstance.metricWriteIOPS(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricWriteIOPS(builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for instance events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun IDatabaseInstance.onEvent(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Method called when the engine is used to create a new instance.
 *
 * @param scope
 * @param options
 */
public inline fun IInstanceEngine.bindToInstance(
    arg0: Construct,
    block: InstanceEngineBindOptionsDsl.() -> Unit = {}
): InstanceEngineConfig {
    val builder = InstanceEngineBindOptionsDsl()
    builder.apply(block)
    return bindToInstance(arg0, builder.build())
}

/**
 * Adds a configuration to this OptionGroup.
 *
 * This method is a no-op for an imported OptionGroup.
 *
 * @param configuration
 * @return true if the OptionConfiguration was successfully added.
 */
public inline fun IOptionGroup.addConfiguration(
    block: OptionConfigurationDsl.() -> Unit = {}
): Boolean {
    val builder = OptionConfigurationDsl()
    builder.apply(block)
    return addConfiguration(builder.build())
}

/**
 * Method called when this Parameter Group is used when defining a database cluster.
 *
 * @param options
 */
public inline fun IParameterGroup.bindToCluster(
    block: ParameterGroupClusterBindOptionsDsl.() -> Unit = {}
): ParameterGroupClusterConfig {
    val builder = ParameterGroupClusterBindOptionsDsl()
    builder.apply(block)
    return bindToCluster(builder.build())
}

/**
 * Method called when this Parameter Group is used when defining a database instance.
 *
 * @param options
 */
public inline fun IParameterGroup.bindToInstance(
    block: ParameterGroupInstanceBindOptionsDsl.() -> Unit = {}
): ParameterGroupInstanceConfig {
    val builder = ParameterGroupInstanceBindOptionsDsl()
    builder.apply(block)
    return bindToInstance(builder.build())
}

/**
 * Adds a configuration to this OptionGroup.
 *
 * This method is a no-op for an imported OptionGroup.
 *
 * @param configuration
 */
public inline fun OptionGroup.addConfiguration(
    block: OptionConfigurationDsl.() -> Unit = {}
): Boolean {
    val builder = OptionConfigurationDsl()
    builder.apply(block)
    return addConfiguration(builder.build())
}

/**
 * Method called when this Parameter Group is used when defining a database cluster.
 *
 * @param _options
 */
public inline fun ParameterGroup.bindToCluster(
    block: ParameterGroupClusterBindOptionsDsl.() -> Unit = {}
): ParameterGroupClusterConfig {
    val builder = ParameterGroupClusterBindOptionsDsl()
    builder.apply(block)
    return bindToCluster(builder.build())
}

/**
 * Method called when this Parameter Group is used when defining a database instance.
 *
 * @param _options
 */
public inline fun ParameterGroup.bindToInstance(
    block: ParameterGroupInstanceBindOptionsDsl.() -> Unit = {}
): ParameterGroupInstanceConfig {
    val builder = ParameterGroupInstanceBindOptionsDsl()
    builder.apply(block)
    return bindToInstance(builder.build())
}

/**
 * Adds the multi user rotation to this cluster.
 *
 * @param id
 * @param options
 */
public inline fun ServerlessCluster.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

/**
 * Adds the single user rotation of the master password to this cluster.
 *
 * @param options
 */
public inline fun ServerlessCluster.addRotationSingleUser(
    block: RotationSingleUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationSingleUserOptionsDsl()
    builder.apply(block)
    return addRotationSingleUser(builder.build())
}
