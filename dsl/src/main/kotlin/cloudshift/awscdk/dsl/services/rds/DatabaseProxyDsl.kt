@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.ProxyTarget
import software.amazon.awscdk.services.rds.SessionPinningFilter
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

/**
 * RDS Database Proxy.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
 * .version(AuroraMysqlEngineVersion.VER_3_03_0)
 * .build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .build();
 * DatabaseProxy proxy = DatabaseProxy.Builder.create(this, "Proxy")
 * .proxyTarget(ProxyTarget.fromCluster(cluster))
 * .secrets(List.of(cluster.getSecret()))
 * .vpc(vpc)
 * .build();
 * Role role = Role.Builder.create(this, "DBProxyRole").assumedBy(new
 * AccountPrincipal(this.account)).build();
 * proxy.grantConnect(role, "admin");
 * ```
 */
@CdkDslMarker
public class DatabaseProxyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DatabaseProxy.Builder = DatabaseProxy.Builder.create(scope, id)

  private val _secrets: MutableList<ISecret> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _sessionPinningFilters: MutableList<SessionPinningFilter> = mutableListOf()

  /**
   * The duration for a proxy to wait for a connection to become available in the connection pool.
   *
   * Only applies when the proxy has opened its maximum number of connections and all connections
   * are busy with client
   * sessions.
   *
   * Value must be between 1 second and 1 hour, or `Duration.seconds(0)` to represent unlimited.
   *
   * Default: cdk.Duration.seconds(120)
   *
   * @param borrowTimeout The duration for a proxy to wait for a connection to become available in
   * the connection pool. 
   */
  public fun borrowTimeout(borrowTimeout: Duration) {
    cdkBuilder.borrowTimeout(borrowTimeout)
  }

  /**
   * The identifier for the proxy.
   *
   * This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
   * An identifier must begin with a letter and must contain only ASCII letters, digits, and
   * hyphens;
   * it can't end with a hyphen or contain two consecutive hyphens.
   *
   * Default: - Generated by CloudFormation (recommended)
   *
   * @param dbProxyName The identifier for the proxy. 
   */
  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  /**
   * Whether the proxy includes detailed information about SQL statements in its logs.
   *
   * This information helps you to debug issues involving SQL behavior or the performance and
   * scalability of the proxy connections.
   * The debug information includes the text of SQL statements that you submit through the proxy.
   * Thus, only enable this setting when needed for debugging, and only when you have security
   * measures in place to safeguard any sensitive
   * information that appears in the logs.
   *
   * Default: false
   *
   * @param debugLogging Whether the proxy includes detailed information about SQL statements in its
   * logs. 
   */
  public fun debugLogging(debugLogging: Boolean) {
    cdkBuilder.debugLogging(debugLogging)
  }

  /**
   * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for
   * connections to the proxy.
   *
   * Default: false
   *
   * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
   * authentication for connections to the proxy. 
   */
  public fun iamAuth(iamAuth: Boolean) {
    cdkBuilder.iamAuth(iamAuth)
  }

  /**
   * The number of seconds that a connection to the proxy can be inactive before the proxy
   * disconnects it.
   *
   * You can set this value higher or lower than the connection timeout limit for the associated
   * database.
   *
   * Default: cdk.Duration.minutes(30)
   *
   * @param idleClientTimeout The number of seconds that a connection to the proxy can be inactive
   * before the proxy disconnects it. 
   */
  public fun idleClientTimeout(idleClientTimeout: Duration) {
    cdkBuilder.idleClientTimeout(idleClientTimeout)
  }

  /**
   * One or more SQL statements for the proxy to run when opening each new database connection.
   *
   * Typically used with SET statements to make sure that each connection has identical settings
   * such as time zone
   * and character set.
   * For multiple statements, use semicolons as the separator.
   * You can also include multiple variables in a single SET statement, such as SET x=1, y=2.
   *
   * not currently supported for PostgreSQL.
   *
   * Default: - no initialization query
   *
   * @param initQuery One or more SQL statements for the proxy to run when opening each new database
   * connection. 
   */
  public fun initQuery(initQuery: String) {
    cdkBuilder.initQuery(initQuery)
  }

  /**
   * The maximum size of the connection pool for each target in a target group.
   *
   * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB
   * instance or Aurora DB
   * cluster used by the target group.
   *
   * 1-100
   *
   * Default: 100
   *
   * @param maxConnectionsPercent The maximum size of the connection pool for each target in a
   * target group. 
   */
  public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
    cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
  }

  /**
   * Controls how actively the proxy closes idle database connections in the connection pool.
   *
   * A high value enables the proxy to leave a high percentage of idle connections open.
   * A low value causes the proxy to close idle client connections and return the underlying
   * database connections
   * to the connection pool.
   * For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB
   * instance
   * or Aurora DB cluster used by the target group.
   *
   * between 0 and MaxConnectionsPercent
   *
   * Default: 50
   *
   * @param maxIdleConnectionsPercent Controls how actively the proxy closes idle database
   * connections in the connection pool. 
   */
  public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
    cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
  }

  /**
   * DB proxy target: Instance or Cluster.
   *
   * @param proxyTarget DB proxy target: Instance or Cluster. 
   */
  public fun proxyTarget(proxyTarget: ProxyTarget) {
    cdkBuilder.proxyTarget(proxyTarget)
  }

  /**
   * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is
   * required for connections to the proxy.
   *
   * By enabling this setting, you can enforce encrypted TLS connections to the proxy.
   *
   * Default: true
   *
   * @param requireTls A Boolean parameter that specifies whether Transport Layer Security (TLS)
   * encryption is required for connections to the proxy. 
   */
  public fun requireTls(requireTls: Boolean) {
    cdkBuilder.requireTls(requireTls)
  }

  /**
   * IAM role that the proxy uses to access secrets in AWS Secrets Manager.
   *
   * Default: - A role will automatically be created
   *
   * @param role IAM role that the proxy uses to access secrets in AWS Secrets Manager. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
   *
   * These secrets are stored within Amazon Secrets Manager.
   * One or more secrets are required.
   *
   * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or Aurora
   * DB cluster. 
   */
  public fun secrets(vararg secrets: ISecret) {
    _secrets.addAll(listOf(*secrets))
  }

  /**
   * The secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster.
   *
   * These secrets are stored within Amazon Secrets Manager.
   * One or more secrets are required.
   *
   * @param secrets The secret that the proxy uses to authenticate to the RDS DB instance or Aurora
   * DB cluster. 
   */
  public fun secrets(secrets: Collection<ISecret>) {
    _secrets.addAll(secrets)
  }

  /**
   * One or more VPC security groups to associate with the new proxy.
   *
   * Default: - No security groups
   *
   * @param securityGroups One or more VPC security groups to associate with the new proxy. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * One or more VPC security groups to associate with the new proxy.
   *
   * Default: - No security groups
   *
   * @param securityGroups One or more VPC security groups to associate with the new proxy. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * Each item in the list represents a class of SQL operations that normally cause all later
   * statements in a session using a proxy to be pinned to the same underlying database connection.
   *
   * Including an item in the list exempts that class of SQL operations from the pinning behavior.
   *
   * Default: - no session pinning filters
   *
   * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
   * normally cause all later statements in a session using a proxy to be pinned to the same underlying
   * database connection. 
   */
  public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter) {
    _sessionPinningFilters.addAll(listOf(*sessionPinningFilters))
  }

  /**
   * Each item in the list represents a class of SQL operations that normally cause all later
   * statements in a session using a proxy to be pinned to the same underlying database connection.
   *
   * Including an item in the list exempts that class of SQL operations from the pinning behavior.
   *
   * Default: - no session pinning filters
   *
   * @param sessionPinningFilters Each item in the list represents a class of SQL operations that
   * normally cause all later statements in a session using a proxy to be pinned to the same underlying
   * database connection. 
   */
  public fun sessionPinningFilters(sessionPinningFilters: Collection<SessionPinningFilter>) {
    _sessionPinningFilters.addAll(sessionPinningFilters)
  }

  /**
   * The VPC to associate with the new proxy.
   *
   * @param vpc The VPC to associate with the new proxy. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * The subnets used by the proxy.
   *
   * Default: - the VPC default strategy if not specified.
   *
   * @param vpcSubnets The subnets used by the proxy. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * The subnets used by the proxy.
   *
   * Default: - the VPC default strategy if not specified.
   *
   * @param vpcSubnets The subnets used by the proxy. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): DatabaseProxy {
    if(_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_sessionPinningFilters.isNotEmpty()) cdkBuilder.sessionPinningFilters(_sessionPinningFilters)
    return cdkBuilder.build()
  }
}
