@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.rds.ServerlessScalingOptions
import software.constructs.Construct

/**
 * Create an Aurora Serverless Cluster.
 *
 * Example:
 *
 * ```
 * // Build a data source for AppSync to access the database.
 * GraphqlApi api;
 * // Create username and password secret for DB Cluster
 * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
 * .username("clusteradmin")
 * .build();
 * // The VPC to place the cluster in
 * Vpc vpc = new Vpc(this, "AuroraVpc");
 * // Create the serverless cluster, provide all values needed to customise the database.
 * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
 * .engine(DatabaseClusterEngine.AURORA_MYSQL)
 * .vpc(vpc)
 * .credentials(Map.of("username", "clusteradmin"))
 * .clusterIdentifier("db-endpoint-test")
 * .defaultDatabaseName("demos")
 * .build();
 * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
 * // Set up a resolver for an RDS query.
 * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n     
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
@CdkDslMarker
public class ServerlessClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ServerlessCluster.Builder = ServerlessCluster.Builder.create(scope, id)

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * The number of days during which automatic DB snapshots are retained.
   *
   * Automatic backup retention cannot be disabled on serverless clusters.
   * Must be a value from 1 day to 35 days.
   *
   * Default: Duration.days(1)
   *
   * @param backupRetention The number of days during which automatic DB snapshots are retained. 
   */
  public fun backupRetention(backupRetention: Duration) {
    cdkBuilder.backupRetention(backupRetention)
  }

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   *
   * @param clusterIdentifier An optional identifier for the cluster. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - true
   *
   * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * Credentials for the administrative user.
   *
   * Default: - A username of 'admin' and SecretsManager-generated password
   *
   * @param credentials Credentials for the administrative user. 
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * Name of a database which is automatically created inside the cluster.
   *
   * Default: - Database is not created in cluster.
   *
   * @param defaultDatabaseName Name of a database which is automatically created inside the
   * cluster. 
   */
  public fun defaultDatabaseName(defaultDatabaseName: String) {
    cdkBuilder.defaultDatabaseName(defaultDatabaseName)
  }

  /**
   * Indicates whether the DB cluster should have deletion protection enabled.
   *
   * Default: - true if removalPolicy is RETAIN, false otherwise
   *
   * @param deletionProtection Indicates whether the DB cluster should have deletion protection
   * enabled. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Whether to enable the Data API.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html)
   * @param enableDataApi Whether to enable the Data API. 
   */
  public fun enableDataApi(enableDataApi: Boolean) {
    cdkBuilder.enableDataApi(enableDataApi)
  }

  /**
   * What kind of database to start.
   *
   * @param engine What kind of database to start. 
   */
  public fun engine(engine: IClusterEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * Additional parameters to pass to the database engine.
   *
   * Default: - no parameter group.
   *
   * @param parameterGroup Additional parameters to pass to the database engine. 
   */
  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * The removal policy to apply when the cluster and its instances are removed from the stack or
   * replaced during an update.
   *
   * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
   * the data)
   *
   * @param removalPolicy The removal policy to apply when the cluster and its instances are removed
   * from the stack or replaced during an update. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * Scaling configuration of an Aurora Serverless database cluster.
   *
   * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
   * minimum capacity: 2 ACU
   * maximum capacity: 16 ACU
   *
   * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
   */
  public fun scaling(scaling: ServerlessScalingOptionsDsl.() -> Unit = {}) {
    val builder = ServerlessScalingOptionsDsl()
    builder.apply(scaling)
    cdkBuilder.scaling(builder.build())
  }

  /**
   * Scaling configuration of an Aurora Serverless database cluster.
   *
   * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
   * minimum capacity: 2 ACU
   * maximum capacity: 16 ACU
   *
   * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
   */
  public fun scaling(scaling: ServerlessScalingOptions) {
    cdkBuilder.scaling(scaling)
  }

  /**
   * Security group.
   *
   * Default: - a new security group is created if `vpc` was provided.
   * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
   * cluster.
   *
   * @param securityGroups Security group. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * Security group.
   *
   * Default: - a new security group is created if `vpc` was provided.
   * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
   * cluster.
   *
   * @param securityGroups Security group. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * The KMS key for storage encryption.
   *
   * Default: - the default master key will be used for storage encryption
   *
   * @param storageEncryptionKey The KMS key for storage encryption. 
   */
  public fun storageEncryptionKey(storageEncryptionKey: IKey) {
    cdkBuilder.storageEncryptionKey(storageEncryptionKey)
  }

  /**
   * Existing subnet group for the cluster.
   *
   * Default: - a new subnet group is created if `vpc` was provided.
   * If the `vpc` property was not provided, no subnet group will be associated with the DB cluster
   *
   * @param subnetGroup Existing subnet group for the cluster. 
   */
  public fun subnetGroup(subnetGroup: ISubnetGroup) {
    cdkBuilder.subnetGroup(subnetGroup)
  }

  /**
   * The VPC that this Aurora Serverless cluster has been created in.
   *
   * Default: - the default VPC in the account and region will be used
   *
   * @param vpc The VPC that this Aurora Serverless cluster has been created in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Where to place the instances within the VPC.
   *
   * If provided, the `vpc` property must also be specified.
   *
   * Default: - the VPC default strategy if not specified.
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * Where to place the instances within the VPC.
   *
   * If provided, the `vpc` property must also be specified.
   *
   * Default: - the VPC default strategy if not specified.
   *
   * @param vpcSubnets Where to place the instances within the VPC. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): ServerlessCluster {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
