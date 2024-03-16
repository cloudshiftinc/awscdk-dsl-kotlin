@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties of an EC2 Instance.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // instance to add as the target for load balancer.
 * Instance instance = Instance.Builder.create(this, "targetInstance")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
 * .build();
 * lb.addTarget(new InstanceTarget(instance));
 * ```
 */
public interface InstanceProps {
  /**
   * Whether the instance could initiate IPv6 connections to anywhere by default.
   *
   * This property is only used when you do not provide a security group.
   *
   * Default: false
   */
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  /**
   * Whether the instance could initiate connections to anywhere by default.
   *
   * This property is only used when you do not provide a security group.
   *
   * Default: true
   */
  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  /**
   * Whether to associate a public IP address to the primary network interface attached to this
   * instance.
   *
   * Default: - public IP address is automatically assigned based on default behavior
   */
  public fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

  /**
   * In which AZ to place the instance within the VPC.
   *
   * Default: - Random zone.
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * Specifies how block devices are exposed to the instance. You can specify virtual devices and
   * EBS volumes.
   *
   * Each instance that is launched has an associated root device volume,
   * either an Amazon EBS volume or an instance store volume.
   * You can use block device mappings to specify additional EBS volumes or
   * instance store volumes to attach to an instance when it is launched.
   *
   * Default: - Uses the block device mapping of the AMI
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
   */
  public fun blockDevices(): List<BlockDevice> =
      unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

  /**
   * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
   *
   * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
   *
   * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
   */
  public fun creditSpecification(): CpuCredits? =
      unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

  /**
   * Whether "Detailed Monitoring" is enabled for this instance Keep in mind that Detailed
   * Monitoring results in extra charges.
   *
   * Default: - false
   *
   * [Documentation](http://aws.amazon.com/cloudwatch/pricing/)
   */
  public fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

  /**
   * Apply the given CloudFormation Init configuration to the instance at startup.
   *
   * Default: - no CloudFormation init
   */
  public fun `init`(): CloudFormationInit? = unwrap(this).getInit()?.let(CloudFormationInit::wrap)

  /**
   * Use the given options for applying CloudFormation Init.
   *
   * Describes the configsets to use and the timeout to wait
   *
   * Default: - default options
   */
  public fun initOptions(): ApplyCloudFormationInitOptions? =
      unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

  /**
   * The name of the instance.
   *
   * Default: - CDK generated name
   */
  public fun instanceName(): String? = unwrap(this).getInstanceName()

  /**
   * Type of instance to launch.
   */
  public fun instanceType(): InstanceType

  /**
   * (deprecated) Name of SSH keypair to grant access to instance.
   *
   * Default: - No SSH access will be possible.
   *
   * * Use `keyPair` instead -
   * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
   */
  @Deprecated(message = "deprecated in CDK")
  public fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The SSH keypair to grant access to the instance.
   *
   * Default: - No SSH access will be possible.
   */
  public fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

  /**
   * AMI to launch.
   */
  public fun machineImage(): IMachineImage

  /**
   * Defines a private IP address to associate with an instance.
   *
   * Private IP should be available within the VPC that the instance is build within.
   *
   * Default: - no association
   */
  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * Propagate the EC2 instance tags to the EBS volumes.
   *
   * Default: - false
   */
  public fun propagateTagsToVolumeOnCreation(): Boolean? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

  /**
   * Whether IMDSv2 should be required on this instance.
   *
   * Default: - false
   */
  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  /**
   * The length of time to wait for the resourceSignalCount.
   *
   * The maximum value is 43200 (12 hours).
   *
   * Default: Duration.minutes(5)
   */
  public fun resourceSignalTimeout(): Duration? =
      unwrap(this).getResourceSignalTimeout()?.let(Duration::wrap)

  /**
   * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
   *
   * The role must be assumable by the service principal `ec2.amazonaws.com`:
   *
   * Default: - A role will automatically be created, it can be accessed via the `role` property
   *
   * Example:
   *
   * ```
   * Role role = Role.Builder.create(this, "MyRole")
   * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
   * .build();
   * ```
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security Group to assign to this instance.
   *
   * Default: - create new security group
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Specifies whether to enable an instance launched in a VPC to perform NAT.
   *
   * This controls whether source/destination checking is enabled on the instance.
   * A value of true means that checking is enabled, and false means that checking is disabled.
   * The value must be false for the instance to perform NAT.
   *
   * Default: true
   */
  public fun sourceDestCheck(): Boolean? = unwrap(this).getSourceDestCheck()

  /**
   * Add SSM session permissions to the instance role.
   *
   * Setting this to `true` adds the necessary permissions to connect
   * to the instance using SSM Session Manager. You can do this
   * from the AWS Console.
   *
   * NOTE: Setting this flag to `true` may not be enough by itself.
   * You must also use an AMI that comes with the SSM Agent, or install
   * the SSM Agent yourself. See
   * [Working with SSM
   * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
   * in the SSM Developer Guide.
   *
   * Default: false
   */
  public fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

  /**
   * Specific UserData to use.
   *
   * The UserData may still be mutated after creation.
   *
   * Default: - A UserData object appropriate for the MachineImage's
   * Operating System is created.
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * Changes to the UserData force replacement.
   *
   * Depending the EC2 instance type, changing UserData either
   * restarts the instance or replaces the instance.
   *
   * * Instance store-backed instances are replaced.
   * * EBS-backed instances are restarted.
   *
   * By default, restarting does not execute the new UserData so you
   * will need a different mechanism to ensure the instance is restarted.
   *
   * Setting this to `true` will make the instance's Logical ID depend on the
   * UserData, which will cause CloudFormation to replace it if the UserData
   * changes.
   *
   * Default: - true iff `initOptions` is specified, false otherwise.
   */
  public fun userDataCausesReplacement(): Boolean? = unwrap(this).getUserDataCausesReplacement()

  /**
   * VPC to launch the instance in.
   */
  public fun vpc(): IVpc

  /**
   * Where to place the instance within the VPC.
   *
   * Default: - Private subnets.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [InstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllIpv6Outbound Whether the instance could initiate IPv6 connections to anywhere
     * by default.
     * This property is only used when you do not provide a security group.
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    /**
     * @param allowAllOutbound Whether the instance could initiate connections to anywhere by
     * default.
     * This property is only used when you do not provide a security group.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param associatePublicIpAddress Whether to associate a public IP address to the primary
     * network interface attached to this instance.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * @param availabilityZone In which AZ to place the instance within the VPC.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    public fun blockDevices(blockDevices: List<BlockDevice>)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    public fun blockDevices(vararg blockDevices: BlockDevice)

    /**
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc).
     * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
     */
    public fun creditSpecification(creditSpecification: CpuCredits)

    /**
     * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
     * mind that Detailed Monitoring results in extra charges.
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean)

    /**
     * @param init Apply the given CloudFormation Init configuration to the instance at startup.
     */
    public fun `init`(`init`: CloudFormationInit)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ef9f027b11af4d08b697f78b8080ddc971b57648604223a8f564ca3a53ac30")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    /**
     * @param instanceName The name of the instance.
     */
    public fun instanceName(instanceName: String)

    /**
     * @param instanceType Type of instance to launch. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param keyName Name of SSH keypair to grant access to instance.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     */
    public fun keyPair(keyPair: IKeyPair)

    /**
     * @param machineImage AMI to launch. 
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * @param privateIpAddress Defines a private IP address to associate with an instance.
     * Private IP should be available within the VPC that the instance is build within.
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount.
     * The maximum value is 43200 (12 hours).
     */
    public fun resourceSignalTimeout(resourceSignalTimeout: Duration)

    /**
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     */
    public fun role(role: IRole)

    /**
     * @param securityGroup Security Group to assign to this instance.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     * NAT.
     * This controls whether source/destination checking is enabled on the instance.
     * A value of true means that checking is enabled, and false means that checking is disabled.
     * The value must be false for the instance to perform NAT.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * @param ssmSessionPermissions Add SSM session permissions to the instance role.
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    /**
     * @param userData Specific UserData to use.
     * The UserData may still be mutated after creation.
     */
    public fun userData(userData: UserData)

    /**
     * @param userDataCausesReplacement Changes to the UserData force replacement.
     * Depending the EC2 instance type, changing UserData either
     * restarts the instance or replaces the instance.
     *
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you
     * will need a different mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the
     * UserData, which will cause CloudFormation to replace it if the UserData
     * changes.
     */
    public fun userDataCausesReplacement(userDataCausesReplacement: Boolean)

    /**
     * @param vpc VPC to launch the instance in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a080d6d88d0a0b22011c07701fb2a79d2e580884701d8362c7550488be2cdd70")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InstanceProps.Builder =
        software.amazon.awscdk.services.ec2.InstanceProps.builder()

    /**
     * @param allowAllIpv6Outbound Whether the instance could initiate IPv6 connections to anywhere
     * by default.
     * This property is only used when you do not provide a security group.
     */
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * @param allowAllOutbound Whether the instance could initiate connections to anywhere by
     * default.
     * This property is only used when you do not provide a security group.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param associatePublicIpAddress Whether to associate a public IP address to the primary
     * network interface attached to this instance.
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param availabilityZone In which AZ to place the instance within the VPC.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    /**
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc).
     * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
     */
    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    /**
     * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
     * mind that Detailed Monitoring results in extra charges.
     */
    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    /**
     * @param init Apply the given CloudFormation Init configuration to the instance at startup.
     */
    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ef9f027b11af4d08b697f78b8080ddc971b57648604223a8f564ca3a53ac30")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    /**
     * @param instanceName The name of the instance.
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * @param instanceType Type of instance to launch. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instance.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     */
    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    /**
     * @param machineImage AMI to launch. 
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    /**
     * @param privateIpAddress Defines a private IP address to associate with an instance.
     * Private IP should be available within the VPC that the instance is build within.
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes.
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
     */
    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount.
     * The maximum value is 43200 (12 hours).
     */
    override fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
      cdkBuilder.resourceSignalTimeout(resourceSignalTimeout.let(Duration::unwrap))
    }

    /**
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param securityGroup Security Group to assign to this instance.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     * NAT.
     * This controls whether source/destination checking is enabled on the instance.
     * A value of true means that checking is enabled, and false means that checking is disabled.
     * The value must be false for the instance to perform NAT.
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * @param ssmSessionPermissions Add SSM session permissions to the instance role.
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     */
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * @param userData Specific UserData to use.
     * The UserData may still be mutated after creation.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    /**
     * @param userDataCausesReplacement Changes to the UserData force replacement.
     * Depending the EC2 instance type, changing UserData either
     * restarts the instance or replaces the instance.
     *
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you
     * will need a different mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the
     * UserData, which will cause CloudFormation to replace it if the UserData
     * changes.
     */
    override fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
      cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
    }

    /**
     * @param vpc VPC to launch the instance in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a080d6d88d0a0b22011c07701fb2a79d2e580884701d8362c7550488be2cdd70")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.InstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InstanceProps,
  ) : CdkObject(cdkObject), InstanceProps {
    /**
     * Whether the instance could initiate IPv6 connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: false
     */
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    /**
     * Whether the instance could initiate connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: true
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * Whether to associate a public IP address to the primary network interface attached to this
     * instance.
     *
     * Default: - public IP address is automatically assigned based on default behavior
     */
    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * In which AZ to place the instance within the VPC.
     *
     * Default: - Random zone.
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     */
    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     */
    override fun creditSpecification(): CpuCredits? =
        unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

    /**
     * Whether "Detailed Monitoring" is enabled for this instance Keep in mind that Detailed
     * Monitoring results in extra charges.
     *
     * Default: - false
     *
     * [Documentation](http://aws.amazon.com/cloudwatch/pricing/)
     */
    override fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

    /**
     * Apply the given CloudFormation Init configuration to the instance at startup.
     *
     * Default: - no CloudFormation init
     */
    override fun `init`(): CloudFormationInit? =
        unwrap(this).getInit()?.let(CloudFormationInit::wrap)

    /**
     * Use the given options for applying CloudFormation Init.
     *
     * Describes the configsets to use and the timeout to wait
     *
     * Default: - default options
     */
    override fun initOptions(): ApplyCloudFormationInitOptions? =
        unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

    /**
     * The name of the instance.
     *
     * Default: - CDK generated name
     */
    override fun instanceName(): String? = unwrap(this).getInstanceName()

    /**
     * Type of instance to launch.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * (deprecated) Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * * Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The SSH keypair to grant access to the instance.
     *
     * Default: - No SSH access will be possible.
     */
    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    /**
     * AMI to launch.
     */
    override fun machineImage(): IMachineImage =
        unwrap(this).getMachineImage().let(IMachineImage::wrap)

    /**
     * Defines a private IP address to associate with an instance.
     *
     * Private IP should be available within the VPC that the instance is build within.
     *
     * Default: - no association
     */
    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * Propagate the EC2 instance tags to the EBS volumes.
     *
     * Default: - false
     */
    override fun propagateTagsToVolumeOnCreation(): Boolean? =
        unwrap(this).getPropagateTagsToVolumeOnCreation()

    /**
     * Whether IMDSv2 should be required on this instance.
     *
     * Default: - false
     */
    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    /**
     * The length of time to wait for the resourceSignalCount.
     *
     * The maximum value is 43200 (12 hours).
     *
     * Default: Duration.minutes(5)
     */
    override fun resourceSignalTimeout(): Duration? =
        unwrap(this).getResourceSignalTimeout()?.let(Duration::wrap)

    /**
     * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * Default: - A role will automatically be created, it can be accessed via the `role` property
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     *
     * This controls whether source/destination checking is enabled on the instance.
     * A value of true means that checking is enabled, and false means that checking is disabled.
     * The value must be false for the instance to perform NAT.
     *
     * Default: true
     */
    override fun sourceDestCheck(): Boolean? = unwrap(this).getSourceDestCheck()

    /**
     * Add SSM session permissions to the instance role.
     *
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     *
     * Default: false
     */
    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    /**
     * Specific UserData to use.
     *
     * The UserData may still be mutated after creation.
     *
     * Default: - A UserData object appropriate for the MachineImage's
     * Operating System is created.
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    /**
     * Changes to the UserData force replacement.
     *
     * Depending the EC2 instance type, changing UserData either
     * restarts the instance or replaces the instance.
     *
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you
     * will need a different mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the
     * UserData, which will cause CloudFormation to replace it if the UserData
     * changes.
     *
     * Default: - true iff `initOptions` is specified, false otherwise.
     */
    override fun userDataCausesReplacement(): Boolean? = unwrap(this).getUserDataCausesReplacement()

    /**
     * VPC to launch the instance in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceProps): InstanceProps =
        CdkObjectWrappers.wrap(cdkObject) as InstanceProps

    internal fun unwrap(wrapped: InstanceProps): software.amazon.awscdk.services.ec2.InstanceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InstanceProps
  }
}
