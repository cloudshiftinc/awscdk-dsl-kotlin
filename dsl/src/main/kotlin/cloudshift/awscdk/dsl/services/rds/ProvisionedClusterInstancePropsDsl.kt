@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.PerformanceInsightRetention
import software.amazon.awscdk.services.rds.ProvisionedClusterInstanceProps

/**
 * Options for creating a provisioned instance.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class ProvisionedClusterInstancePropsDsl {
  private val cdkBuilder: ProvisionedClusterInstanceProps.Builder =
      ProvisionedClusterInstanceProps.builder()

  /**
   * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB instance.
   */
  public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
  }

  /**
   * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the DB
   * instance.
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
   */
  public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
  }

  /**
   * @param instanceIdentifier The identifier for the database instance.
   */
  public fun instanceIdentifier(instanceIdentifier: String) {
    cdkBuilder.instanceIdentifier(instanceIdentifier)
  }

  /**
   * @param instanceType The cluster instance type.
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
   * `instanceProps` to `writer` and `readers`.
   */
  public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
    cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
  }

  /**
   * @param parameterGroup The DB parameter group to associate with the instance.
   * This is only needed if you need to configure different parameter
   * groups for each individual instance, otherwise you should not
   * provide this and just use the cluster parameter group
   */
  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * @param parameters The parameters in the DBParameterGroup to create automatically.
   * You can only specify parameterGroup or parameters but not both.
   * You need to use a versioned engine to auto-generate a DBParameterGroup.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
   * data.
   */
  public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
    cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
  }

  /**
   * @param performanceInsightRetention The amount of time, in days, to retain Performance Insights
   * data.
   */
  public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
    cdkBuilder.performanceInsightRetention(performanceInsightRetention)
  }

  /**
   * @param promotionTier The promotion tier of the cluster instance.
   * Can be between 0-15
   *
   * For provisioned instances this just determines the failover priority.
   * If multiple instances have the same priority then one will be picked at random
   */
  public fun promotionTier(promotionTier: Number) {
    cdkBuilder.promotionTier(promotionTier)
  }

  /**
   * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun build(): ProvisionedClusterInstanceProps = cdkBuilder.build()
}
