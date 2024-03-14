package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IInstanceProfile
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LaunchTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplate,
) : Resource(cdkObject), ILaunchTemplate, IGrantable, IConnectable {
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun defaultVersionNumber(): String = unwrap(this).getDefaultVersionNumber()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun imageId(): String? = unwrap(this).getImageId()

  public open fun instanceType(): InstanceType? =
      unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public open fun latestVersionNumber(): String = unwrap(this).getLatestVersionNumber()

  public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  public override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public open fun osType(): OperatingSystemType? =
      unwrap(this).getOsType()?.let(OperatingSystemType::wrap)

  public open fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public open fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  public override fun versionNumber(): String = unwrap(this).getVersionNumber()

  public interface Builder {
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    }

    public fun blockDevices(blockDevices: List<BlockDevice>) {
    }

    public fun cpuCredits(cpuCredits: CpuCredits) {
    }

    public fun detailedMonitoring(detailedMonitoring: Boolean) {
    }

    public fun disableApiTermination(disableApiTermination: Boolean) {
    }

    public fun ebsOptimized(ebsOptimized: Boolean) {
    }

    public fun hibernationConfigured(hibernationConfigured: Boolean) {
    }

    public fun httpEndpoint(httpEndpoint: Boolean) {
    }

    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
    }

    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
    }

    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
    }

    public
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
    }

    public fun instanceMetadataTags(instanceMetadataTags: Boolean) {
    }

    public fun instanceProfile(instanceProfile: IInstanceProfile) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String) {
    }

    public fun keyPair(keyPair: IKeyPair) {
    }

    public fun launchTemplateName(launchTemplateName: String) {
    }

    public fun machineImage(machineImage: IMachineImage) {
    }

    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
    }

    public fun requireImdsv2(requireImdsv2: Boolean) {
    }

    public fun role(role: IRole) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ce905ff67a4ffc05d319d73c1977f1338e37b312b69e262901226d015543042")
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit) {
    }

    public fun userData(userData: UserData) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplate.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplate.Builder.create(scope, id)

    public override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    public override fun cpuCredits(cpuCredits: CpuCredits) {
      cdkBuilder.cpuCredits(cpuCredits.let(CpuCredits::unwrap))
    }

    public override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    public override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    public override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public override fun hibernationConfigured(hibernationConfigured: Boolean) {
      cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    public override fun httpEndpoint(httpEndpoint: Boolean) {
      cdkBuilder.httpEndpoint(httpEndpoint)
    }

    public override fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
      cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    public override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
      cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    public override fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
      cdkBuilder.httpTokens(httpTokens.let(LaunchTemplateHttpTokens::unwrap))
    }

    public override
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.let(InstanceInitiatedShutdownBehavior::unwrap))
    }

    public override fun instanceMetadataTags(instanceMetadataTags: Boolean) {
      cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    public override fun instanceProfile(instanceProfile: IInstanceProfile) {
      cdkBuilder.instanceProfile(instanceProfile.let(IInstanceProfile::unwrap))
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    public override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    public override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    public override fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
      cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
    }

    public override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
      cdkBuilder.spotOptions(spotOptions.let(LaunchTemplateSpotOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ce905ff67a4ffc05d319d73c1977f1338e37b312b69e262901226d015543042")
    public override fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit): Unit
        = spotOptions(LaunchTemplateSpotOptions(spotOptions))

    public override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplate = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLaunchTemplateAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LaunchTemplateAttributes,
    ): ILaunchTemplate =
        software.amazon.awscdk.services.ec2.LaunchTemplate.fromLaunchTemplateAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(LaunchTemplateAttributes::unwrap)).let(ILaunchTemplate::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("057cd63217e551e0bd19d10f532f79a21856bfe1557c66c09debaa22e75ea62c")
    public open fun fromLaunchTemplateAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LaunchTemplateAttributes.Builder.() -> Unit,
    ): ILaunchTemplate = fromLaunchTemplateAttributes(scope, id, LaunchTemplateAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LaunchTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LaunchTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplate): LaunchTemplate
        = LaunchTemplate(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplate): software.amazon.awscdk.services.ec2.LaunchTemplate
        = wrapped.cdkObject
  }
}
