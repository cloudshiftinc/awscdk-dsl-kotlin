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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnStack
import software.constructs.Construct

/**
 * Creates a new stack. For more information, see
 * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html)
 * .
 *
 * *Required Permissions* : To use this action, an IAM user must have an attached policy that
 * explicitly grants permissions. For more information about user permissions, see
 * [Managing User Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
 * .defaultInstanceProfileArn("defaultInstanceProfileArn")
 * .name("name")
 * .serviceRoleArn("serviceRoleArn")
 * // the properties below are optional
 * .agentVersion("agentVersion")
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .chefConfiguration(ChefConfigurationProperty.builder()
 * .berkshelfVersion("berkshelfVersion")
 * .manageBerkshelf(false)
 * .build())
 * .cloneAppIds(List.of("cloneAppIds"))
 * .clonePermissions(false)
 * .configurationManager(StackConfigurationManagerProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .customCookbooksSource(SourceProperty.builder()
 * .password("password")
 * .revision("revision")
 * .sshKey("sshKey")
 * .type("type")
 * .url("url")
 * .username("username")
 * .build())
 * .customJson(customJson)
 * .defaultAvailabilityZone("defaultAvailabilityZone")
 * .defaultOs("defaultOs")
 * .defaultRootDeviceType("defaultRootDeviceType")
 * .defaultSshKeyName("defaultSshKeyName")
 * .defaultSubnetId("defaultSubnetId")
 * .ecsClusterArn("ecsClusterArn")
 * .elasticIps(List.of(ElasticIpProperty.builder()
 * .ip("ip")
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .hostnameTheme("hostnameTheme")
 * .rdsDbInstances(List.of(RdsDbInstanceProperty.builder()
 * .dbPassword("dbPassword")
 * .dbUser("dbUser")
 * .rdsDbInstanceArn("rdsDbInstanceArn")
 * .build()))
 * .sourceStackId("sourceStackId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useCustomCookbooks(false)
 * .useOpsworksSecurityGroups(false)
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
 */
@CdkDslMarker
public class CfnStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

    private val _cloneAppIds: MutableList<String> = mutableListOf()

    private val _elasticIps: MutableList<Any> = mutableListOf()

    private val _rdsDbInstances: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The default AWS OpsWorks Stacks agent version. You have the following options:.
     * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs
     *   new agent versions on the stack's instances as soon as they are available.
     * * Fixed version - Set this parameter to your preferred agent version. To update the agent
     *   version, you must edit the stack configuration and specify a new version. AWS OpsWorks
     *   Stacks installs that version on the stack's instances.
     *
     * The default setting is the most recent release of the agent. To specify an agent version, you
     * must use the complete version number, not the abbreviated number shown on the console. For a
     * list of available agent version numbers, call
     * [DescribeAgentVersions](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions)
     * . AgentVersion cannot be set to Chef 12.2.
     *
     * You can also specify an agent version when you create or update an instance, which overrides
     * the stack's default setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
     *
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     *   options:.
     */
    public fun agentVersion(agentVersion: String) {
        cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     *
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     *
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     *
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     *   Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see
     *   [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     *   .
     */
    public fun chefConfiguration(chefConfiguration: IResolvable) {
        cdkBuilder.chefConfiguration(chefConfiguration)
    }

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     *
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     *   Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see
     *   [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     *   .
     */
    public fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty) {
        cdkBuilder.chefConfiguration(chefConfiguration)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     *
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     *   application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(vararg cloneAppIds: String) {
        _cloneAppIds.addAll(listOf(*cloneAppIds))
    }

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     *
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     *   application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(cloneAppIds: Collection<String>) {
        _cloneAppIds.addAll(cloneAppIds)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     *
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     *   the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: Boolean) {
        cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     *
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     *   the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: IResolvable) {
        cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     * value for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     *
     * @param configurationManager The configuration manager.
     */
    public fun configurationManager(configurationManager: IResolvable) {
        cdkBuilder.configurationManager(configurationManager)
    }

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     * value for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     *
     * @param configurationManager The configuration manager.
     */
    public fun configurationManager(
        configurationManager: CfnStack.StackConfigurationManagerProperty
    ) {
        cdkBuilder.configurationManager(configurationManager)
    }

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see
     * [Adding Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html)
     * or
     * [Cookbooks and Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     *   from a repository.
     */
    public fun customCookbooksSource(customCookbooksSource: IResolvable) {
        cdkBuilder.customCookbooksSource(customCookbooksSource)
    }

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see
     * [Adding Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html)
     * or
     * [Cookbooks and Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     *   from a repository.
     */
    public fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty) {
        cdkBuilder.customCookbooksSource(customCookbooksSource)
    }

    /**
     * A string that contains user-defined, custom JSON.
     *
     * It can be used to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see
     * [Use Custom JSON to Modify the Stack Configuration Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customjson)
     *
     * @param customJson A string that contains user-defined, custom JSON.
     */
    public fun customJson(customJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customJson)
        cdkBuilder.customJson(builder.map)
    }

    /**
     * A string that contains user-defined, custom JSON.
     *
     * It can be used to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see
     * [Use Custom JSON to Modify the Stack Configuration Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customjson)
     *
     * @param customJson A string that contains user-defined, custom JSON.
     */
    public fun customJson(customJson: Any) {
        cdkBuilder.customJson(customJson)
    }

    /**
     * The stack's default Availability Zone, which must be in the specified region.
     *
     * For more information, see
     * [Regions and Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you
     * also specify a value for `DefaultSubnetId` , the subnet must be in the same zone. For more
     * information, see the `VpcId` parameter description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultavailabilityzone)
     *
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     *   specified region.
     */
    public fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
        cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
     * stack's EC2 instances.
     *
     * For more information about IAM ARNs, see
     * [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprofilearn)
     *
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     *   default profile for all of the stack's EC2 instances.
     */
    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
        cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

    /**
     * The stack's default operating system, which is installed on every instance unless you specify
     * a different operating system when you create the instance.
     *
     * You can specify one of the following.
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     *   `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     *   2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     *   `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     *   `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012
     *   R2 with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
     *   instances. For more information, see
     *   [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
     *   .
     *
     * The default option is the current Amazon Linux version. Not all operating systems are
     * supported with all versions of Chef. For more information about supported operating systems,
     * see
     * [AWS OpsWorks Stacks Operating Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
     *
     * @param defaultOs The stack's default operating system, which is installed on every instance
     *   unless you specify a different operating system when you create the instance.
     */
    public fun defaultOs(defaultOs: String) {
        cdkBuilder.defaultOs(defaultOs)
    }

    /**
     * The default root device type.
     *
     * This value is the default for all instances in the stack, but you can override it when you
     * create an instance. The default option is `instance-store` . For more information, see
     * [Storage for the Root Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
     *
     * @param defaultRootDeviceType The default root device type.
     */
    public fun defaultRootDeviceType(defaultRootDeviceType: String) {
        cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

    /**
     * A default Amazon EC2 key pair name.
     *
     * The default value is none. If you specify a key pair name, AWS OpsWorks installs the public
     * key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see
     * [Using SSH to Communicate with an Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html)
     * and
     * [Managing SSH Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html)
     * . You can override this setting by specifying a different key pair, or no key pair, when you
     * [create an instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
     *
     * @param defaultSshKeyName A default Amazon EC2 key pair name.
     */
    public fun defaultSshKeyName(defaultSshKeyName: String) {
        cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    /**
     * The stack's default subnet ID.
     *
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsubnetid)
     *
     * @param defaultSubnetId The stack's default subnet ID.
     */
    public fun defaultSubnetId(defaultSubnetId: String) {
        cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service ( Amazon ECS ) cluster
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
     *
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     *   Amazon ECS ) cluster to register with the AWS OpsWorks stack.
     */
    public fun ecsClusterArn(ecsClusterArn: String) {
        cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     *
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     */
    public fun elasticIps(vararg elasticIps: Any) {
        _elasticIps.addAll(listOf(*elasticIps))
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     *
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     */
    public fun elasticIps(elasticIps: Collection<Any>) {
        _elasticIps.addAll(elasticIps)
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     *
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     */
    public fun elasticIps(elasticIps: IResolvable) {
        cdkBuilder.elasticIps(elasticIps)
    }

    /**
     * The stack's host name theme, with spaces replaced by underscores.
     *
     * The theme is used to generate host names for the stack's instances. By default,
     * `HostnameTheme` is set to `Layer_Dependent` , which creates host names by appending integers
     * to the layer's short name. The other themes are:
     * * `Baked_Goods`
     * * `Clouds`
     * * `Europe_Cities`
     * * `Fruits`
     * * `Greek_Deities_and_Titans`
     * * `Legendary_creatures_from_Japan`
     * * `Planets_and_Moons`
     * * `Roman_Deities`
     * * `Scottish_Islands`
     * * `US_Cities`
     * * `Wild_Cats`
     *
     * To obtain a generated host name, call `GetHostNameSuggestion` , which returns a host name
     * based on the current theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
     *
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores.
     */
    public fun hostnameTheme(hostnameTheme: String) {
        cdkBuilder.hostnameTheme(hostnameTheme)
    }

    /**
     * The stack name.
     *
     * Stack names can be a maximum of 64 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
     *
     * @param name The stack name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
     * AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
     *
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     */
    public fun rdsDbInstances(vararg rdsDbInstances: Any) {
        _rdsDbInstances.addAll(listOf(*rdsDbInstances))
    }

    /**
     * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
     * AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
     *
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     */
    public fun rdsDbInstances(rdsDbInstances: Collection<Any>) {
        _rdsDbInstances.addAll(rdsDbInstances)
    }

    /**
     * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
     * AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
     *
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     */
    public fun rdsDbInstances(rdsDbInstances: IResolvable) {
        cdkBuilder.rdsDbInstances(rdsDbInstances)
    }

    /**
     * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
     * behalf.
     *
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see
     * [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
     *
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     *   resources on your behalf.
     */
    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
     * clone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
     *
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     *   OpsWorks stack to clone.
     */
    public fun sourceStackId(sourceStackId: String) {
        cdkBuilder.sourceStackId(sourceStackId)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     *   or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     *   separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     *   layer.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     *   or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     *   separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     *   layer.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public fun useCustomCookbooks(useCustomCookbooks: Boolean) {
        cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
        cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /**
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     *
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following
     * settings:
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     *   with each layer (default setting). You can associate additional security groups with a
     *   layer after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     *   must create appropriate EC2 security groups and associate a security group with each layer
     *   that you create. However, you can still manually associate a built-in security group with a
     *   layer on creation; custom security groups are required only for those layers that need
     *   custom settings.
     *
     * For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
     *
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     *   security groups with the stack's layers.
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
        cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    /**
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     *
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following
     * settings:
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     *   with each layer (default setting). You can associate additional security groups with a
     *   layer after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     *   must create appropriate EC2 security groups and associate a security group with each layer
     *   that you create. However, you can still manually associate a built-in security group with a
     *   layer on creation; custom security groups are required only for those layers that need
     *   custom settings.
     *
     * For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
     *
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     *   security groups with the stack's layers.
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
        cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    /**
     * The ID of the VPC that the stack is to be launched into.
     *
     * The VPC must be in the stack's region. All instances are launched into this VPC. You cannot
     * change the ID later.
     * * If your account supports EC2-Classic, the default value is `no VPC` .
     * * If your account does not support EC2-Classic, the default value is the default VPC for the
     *   specified region.
     *
     * If the VPC ID corresponds to a default VPC and you have specified either the
     * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers
     * the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets
     * these parameters to the first valid Availability Zone for the specified region and the
     * corresponding default VPC subnet ID, respectively.
     *
     * If you specify a nondefault VPC ID, note the following:
     * * It must belong to a VPC in your account that is in the specified region.
     * * You must specify a value for `DefaultSubnetId` .
     *
     * For more information about how to use AWS OpsWorks Stacks with a VPC, see
     * [Running a Stack in a VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html)
     * . For more information about default VPC and EC2-Classic, see
     * [Supported Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
     *
     * @param vpcId The ID of the VPC that the stack is to be launched into.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnStack {
        if (_cloneAppIds.isNotEmpty()) cdkBuilder.cloneAppIds(_cloneAppIds)
        if (_elasticIps.isNotEmpty()) cdkBuilder.elasticIps(_elasticIps)
        if (_rdsDbInstances.isNotEmpty()) cdkBuilder.rdsDbInstances(_rdsDbInstances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
