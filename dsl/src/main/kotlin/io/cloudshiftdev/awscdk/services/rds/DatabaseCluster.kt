package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.DatabaseCluster,
) : DatabaseClusterBase(cdkObject) {
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e3144e2981e2d54c29b77d092c09cc103c3d4bfbd9ad1ec5f454ad3e6812f0")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  public open fun addRotationSingleUser(options: RotationSingleUserOptions): SecretRotation =
      unwrap(this).addRotationSingleUser(options.let(RotationSingleUserOptions::unwrap)).let(SecretRotation::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dc3cae235dd1373fbafbfbb3e452e2b888653b3946f4b0e89a32adad5226775")
  public open fun addRotationSingleUser(options: RotationSingleUserOptions.Builder.() -> Unit):
      SecretRotation = addRotationSingleUser(RotationSingleUserOptions(options))

  public open fun cloudwatchLogGroups(): Map<String, ILogGroup> =
      unwrap(this).getCloudwatchLogGroups().mapValues{ILogGroup.wrap(it.value)} ?: emptyMap()

  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  public override fun clusterResourceIdentifier(): String =
      unwrap(this).getClusterResourceIdentifier()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun engine(): IClusterEngine? =
      unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  public override fun instanceEndpoints(): List<Endpoint> =
      unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

  public override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
      emptyList()

  public open fun metricAcuUtilization(): Metric =
      unwrap(this).metricACUUtilization().let(Metric::wrap)

  public open fun metricAcuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricACUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f3662f4563df3003c54025065edc6881211474bc66d259be936d026eb80d439")
  public open fun metricAcuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricAcuUtilization(MetricOptions(props))

  public open fun metricServerlessDatabaseCapacity(): Metric =
      unwrap(this).metricServerlessDatabaseCapacity().let(Metric::wrap)

  public open fun metricServerlessDatabaseCapacity(props: MetricOptions): Metric =
      unwrap(this).metricServerlessDatabaseCapacity(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e244f29bc74eb44ea8910600161af0e2f6bc79ddfc1a0c701993bd2e6c0c0aa8")
  public open fun metricServerlessDatabaseCapacity(props: MetricOptions.Builder.() -> Unit): Metric
      = metricServerlessDatabaseCapacity(MetricOptions(props))

  public open fun multiUserRotationApplication(): SecretRotationApplication =
      unwrap(this).getMultiUserRotationApplication().let(SecretRotationApplication::wrap)

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public open fun singleUserRotationApplication(): SecretRotationApplication =
      unwrap(this).getSingleUserRotationApplication().let(SecretRotationApplication::wrap)

  public open fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public open fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun backtrackWindow(backtrackWindow: Duration)

    public fun backup(backup: BackupProps)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cee7557ed785b49c87628ade06b72db76c47ee1d8237518ad9f5dd52722d93a")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    public fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>)

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays)

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun credentials(credentials: Credentials)

    public fun defaultDatabaseName(defaultDatabaseName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun domain(domain: String)

    public fun domainRole(domainRole: IRole)

    public fun enableDataApi(enableDataApi: Boolean)

    public fun engine(engine: IClusterEngine)

    public fun iamAuthentication(iamAuthentication: Boolean)

    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dd910df40feb307d211064ba8673999be7cc6c7fb33e48cb4ca656dfa0ce806")
    public fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit)

    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour)

    @Deprecated(message = "deprecated in CDK")
    public fun instances(instances: Number)

    public fun monitoringInterval(monitoringInterval: Duration)

    public fun monitoringRole(monitoringRole: IRole)

    public fun networkType(networkType: NetworkType)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun parameters(parameters: Map<String, String>)

    public fun port(port: Number)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun readers(readers: List<IClusterInstance>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun s3ExportBuckets(s3ExportBuckets: List<IBucket>)

    public fun s3ExportRole(s3ExportRole: IRole)

    public fun s3ImportBuckets(s3ImportBuckets: List<IBucket>)

    public fun s3ImportRole(s3ImportRole: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number)

    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncryptionKey(storageEncryptionKey: IKey)

    public fun storageType(storageType: DBClusterStorageType)

    public fun subnetGroup(subnetGroup: ISubnetGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b9ff5a4a6be79f0742b62aabf6923aee9c87109daa57c5d640464a95960aab3")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    public fun writer(writer: IClusterInstance)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseCluster.Builder =
        software.amazon.awscdk.services.rds.DatabaseCluster.Builder.create(scope, id)

    override fun backtrackWindow(backtrackWindow: Duration) {
      cdkBuilder.backtrackWindow(backtrackWindow.let(Duration::unwrap))
    }

    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cee7557ed785b49c87628ade06b72db76c47ee1d8237518ad9f5dd52722d93a")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    override fun cloudwatchLogsExports(cloudwatchLogsExports: List<String>) {
      cdkBuilder.cloudwatchLogsExports(cloudwatchLogsExports)
    }

    override fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.let(IRole::unwrap))
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun domainRole(domainRole: IRole) {
      cdkBuilder.domainRole(domainRole.let(IRole::unwrap))
    }

    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    override fun iamAuthentication(iamAuthentication: Boolean) {
      cdkBuilder.iamAuthentication(iamAuthentication)
    }

    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun instanceProps(instanceProps: InstanceProps) {
      cdkBuilder.instanceProps(instanceProps.let(InstanceProps::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dd910df40feb307d211064ba8673999be7cc6c7fb33e48cb4ca656dfa0ce806")
    override fun instanceProps(instanceProps: InstanceProps.Builder.() -> Unit): Unit =
        instanceProps(InstanceProps(instanceProps))

    override fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
      cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour.let(InstanceUpdateBehaviour::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    override fun monitoringInterval(monitoringInterval: Duration) {
      cdkBuilder.monitoringInterval(monitoringInterval.let(Duration::unwrap))
    }

    override fun monitoringRole(monitoringRole: IRole) {
      cdkBuilder.monitoringRole(monitoringRole.let(IRole::unwrap))
    }

    override fun networkType(networkType: NetworkType) {
      cdkBuilder.networkType(networkType.let(NetworkType::unwrap))
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun readers(readers: List<IClusterInstance>) {
      cdkBuilder.readers(readers.map(IClusterInstance::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun s3ExportBuckets(s3ExportBuckets: List<IBucket>) {
      cdkBuilder.s3ExportBuckets(s3ExportBuckets.map(IBucket::unwrap))
    }

    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    override fun s3ImportBuckets(s3ImportBuckets: List<IBucket>) {
      cdkBuilder.s3ImportBuckets(s3ImportBuckets.map(IBucket::unwrap))
    }

    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
      cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

    override fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
      cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
    }

    override fun storageType(storageType: DBClusterStorageType) {
      cdkBuilder.storageType(storageType.let(DBClusterStorageType::unwrap))
    }

    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b9ff5a4a6be79f0742b62aabf6923aee9c87109daa57c5d640464a95960aab3")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    override fun writer(writer: IClusterInstance) {
      cdkBuilder.writer(writer.let(IClusterInstance::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseCluster = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes,
    ): IDatabaseCluster =
        software.amazon.awscdk.services.rds.DatabaseCluster.fromDatabaseClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DatabaseClusterAttributes::unwrap)).let(IDatabaseCluster::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2468a7dfbcae4e10b5b8acc2d69102604d71bdbc433551e1bb4c7e17788a73f")
    public open fun fromDatabaseClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseClusterAttributes.Builder.() -> Unit,
    ): IDatabaseCluster = fromDatabaseClusterAttributes(scope, id, DatabaseClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseCluster):
        DatabaseCluster = DatabaseCluster(cdkObject)

    internal fun unwrap(wrapped: DatabaseCluster):
        software.amazon.awscdk.services.rds.DatabaseCluster = wrapped.cdkObject
  }
}
