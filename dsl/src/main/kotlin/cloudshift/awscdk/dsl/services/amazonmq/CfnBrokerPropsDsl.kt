@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps

/**
 * Properties for defining a `CfnBroker`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnBrokerProps cfnBrokerProps = CfnBrokerProps.builder()
 * .autoMinorVersionUpgrade(false)
 * .brokerName("brokerName")
 * .deploymentMode("deploymentMode")
 * .engineType("engineType")
 * .engineVersion("engineVersion")
 * .hostInstanceType("hostInstanceType")
 * .publiclyAccessible(false)
 * .users(List.of(UserProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .consoleAccess(false)
 * .groups(List.of("groups"))
 * .build()))
 * // the properties below are optional
 * .authenticationStrategy("authenticationStrategy")
 * .configuration(ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build())
 * .encryptionOptions(EncryptionOptionsProperty.builder()
 * .useAwsOwnedKey(false)
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .ldapServerMetadata(LdapServerMetadataProperty.builder()
 * .hosts(List.of("hosts"))
 * .roleBase("roleBase")
 * .roleSearchMatching("roleSearchMatching")
 * .serviceAccountPassword("serviceAccountPassword")
 * .serviceAccountUsername("serviceAccountUsername")
 * .userBase("userBase")
 * .userSearchMatching("userSearchMatching")
 * // the properties below are optional
 * .roleName("roleName")
 * .roleSearchSubtree(false)
 * .userRoleName("userRoleName")
 * .userSearchSubtree(false)
 * .build())
 * .logs(LogListProperty.builder()
 * .audit(false)
 * .general(false)
 * .build())
 * .maintenanceWindowStartTime(MaintenanceWindowProperty.builder()
 * .dayOfWeek("dayOfWeek")
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .storageType("storageType")
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html)
 */
@CdkDslMarker
public class CfnBrokerPropsDsl {
  private val cdkBuilder: CfnBrokerProps.Builder = CfnBrokerProps.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnBroker.TagsEntryProperty> = mutableListOf()

  private val _users: MutableList<Any> = mutableListOf()

  /**
   * @param authenticationStrategy Optional.
   * The authentication strategy used to secure the broker. The default is `SIMPLE` .
   */
  public fun authenticationStrategy(authenticationStrategy: String) {
    cdkBuilder.authenticationStrategy(authenticationStrategy)
  }

  /**
   * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers, as
   * new broker engine versions are released and supported by Amazon MQ. 
   * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
   * manual broker reboot.
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers, as
   * new broker engine versions are released and supported by Amazon MQ. 
   * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
   * manual broker reboot.
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * @param brokerName The name of the broker. 
   * This value must be unique in your AWS account , 1-50 characters long, must contain only
   * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
   * characters, or special characters.
   *
   *
   * Do not add personally identifiable information (PII) or other confidential or sensitive
   * information in broker names. Broker names are accessible to other AWS services, including C
   * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
   */
  public fun brokerName(brokerName: String) {
    cdkBuilder.brokerName(brokerName)
  }

  /**
   * @param configuration A list of information about the configuration.
   * Does not apply to RabbitMQ brokers.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration A list of information about the configuration.
   * Does not apply to RabbitMQ brokers.
   */
  public fun configuration(configuration: CfnBroker.ConfigurationIdProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param deploymentMode The deployment mode of the broker. Available values:. 
   * * `SINGLE_INSTANCE`
   * * `ACTIVE_STANDBY_MULTI_AZ`
   * * `CLUSTER_MULTI_AZ`
   */
  public fun deploymentMode(deploymentMode: String) {
    cdkBuilder.deploymentMode(deploymentMode)
  }

  /**
   * @param encryptionOptions Encryption options for the broker.
   * Does not apply to RabbitMQ brokers.
   */
  public fun encryptionOptions(encryptionOptions: IResolvable) {
    cdkBuilder.encryptionOptions(encryptionOptions)
  }

  /**
   * @param encryptionOptions Encryption options for the broker.
   * Does not apply to RabbitMQ brokers.
   */
  public fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty) {
    cdkBuilder.encryptionOptions(encryptionOptions)
  }

  /**
   * @param engineType The type of broker engine. 
   * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
   */
  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  /**
   * @param engineVersion The version of the broker engine. 
   * For a list of supported engine versions, see
   * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
   * *Amazon MQ Developer Guide* .
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param hostInstanceType The broker's instance type. 
   */
  public fun hostInstanceType(hostInstanceType: String) {
    cdkBuilder.hostInstanceType(hostInstanceType)
  }

  /**
   * @param ldapServerMetadata Optional.
   * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
   * Does not apply to RabbitMQ brokers.
   */
  public fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
    cdkBuilder.ldapServerMetadata(ldapServerMetadata)
  }

  /**
   * @param ldapServerMetadata Optional.
   * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
   * Does not apply to RabbitMQ brokers.
   */
  public fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty) {
    cdkBuilder.ldapServerMetadata(ldapServerMetadata)
  }

  /**
   * @param logs Enables Amazon CloudWatch logging for brokers.
   */
  public fun logs(logs: IResolvable) {
    cdkBuilder.logs(logs)
  }

  /**
   * @param logs Enables Amazon CloudWatch logging for brokers.
   */
  public fun logs(logs: CfnBroker.LogListProperty) {
    cdkBuilder.logs(logs)
  }

  /**
   * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which Amazon
   * MQ begins to apply pending updates or patches to the broker.
   */
  public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
    cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
  }

  /**
   * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which Amazon
   * MQ begins to apply pending updates or patches to the broker.
   */
  public
      fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty) {
    cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
  }

  /**
   * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
   * the broker's subnets. 
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
   * the broker's subnets. 
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections to
   * brokers.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections to
   * brokers.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param storageType The broker's storage type.
   */
  public fun storageType(storageType: String) {
    cdkBuilder.storageType(storageType)
  }

  /**
   * @param subnetIds The list of groups that define which subnets and IP ranges the broker can use
   * from different Availability Zones.
   * If you specify more than one subnet, the subnets must be in different Availability Zones.
   * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
   * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default
   * subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ
   * deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility,
   * deployment without public accessibility requires at least one subnet.
   *
   *
   * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
   * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to create
   * VPC enpoints in VPCs that are not owned by your AWS account .
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The list of groups that define which subnets and IP ranges the broker can use
   * from different Availability Zones.
   * If you specify more than one subnet, the subnets must be in different Availability Zones.
   * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
   * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default
   * subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ
   * deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility,
   * deployment without public accessibility requires at least one subnet.
   *
   *
   * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
   * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to create
   * VPC enpoints in VPCs that are not owned by your AWS account .
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param tags An array of key-value pairs.
   * For more information, see [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * *Billing and Cost Management User Guide* .
   */
  public fun tags(tags: CfnBrokerTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnBrokerTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs.
   * For more information, see [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * *Billing and Cost Management User Guide* .
   */
  public fun tags(tags: Collection<CfnBroker.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  /**
   * @param users The list of broker users (persons or applications) who can access queues and
   * topics. 
   * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
   * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
   * RabbitMQ web console or by using the RabbitMQ management API.
   */
  public fun users(vararg users: Any) {
    _users.addAll(listOf(*users))
  }

  /**
   * @param users The list of broker users (persons or applications) who can access queues and
   * topics. 
   * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
   * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
   * RabbitMQ web console or by using the RabbitMQ management API.
   */
  public fun users(users: Collection<Any>) {
    _users.addAll(users)
  }

  /**
   * @param users The list of broker users (persons or applications) who can access queues and
   * topics. 
   * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
   * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
   * RabbitMQ web console or by using the RabbitMQ management API.
   */
  public fun users(users: IResolvable) {
    cdkBuilder.users(users)
  }

  public fun build(): CfnBrokerProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
