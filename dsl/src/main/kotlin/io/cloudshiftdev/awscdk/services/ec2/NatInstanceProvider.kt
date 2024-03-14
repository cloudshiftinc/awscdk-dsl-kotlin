package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class NatInstanceProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProvider,
) : NatProvider(cdkObject), IConnectable {
  @Deprecated(message = "deprecated in CDK")
  public override fun configureNat(options: ConfigureNatOptions) {
    unwrap(this).configureNat(options.let(ConfigureNatOptions::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd4e1c7dc445ecccb0628de1d2dc0402a07b93c21145f259b74eb40763acacfd")
  public override fun configureNat(options: ConfigureNatOptions.Builder.() -> Unit): Unit =
      configureNat(ConfigureNatOptions(options))

  @Deprecated(message = "deprecated in CDK")
  public override fun configureSubnet(subnet: PrivateSubnet) {
    unwrap(this).configureSubnet(subnet.let(PrivateSubnet::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public override fun configuredGateways(): List<GatewayConfig> =
      unwrap(this).getConfiguredGateways().map(GatewayConfig::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun securityGroup(): ISecurityGroup =
      unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    public fun creditSpecification(creditSpecification: CpuCredits) {
    }

    public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String) {
    }

    public fun keyPair(keyPair: IKeyPair) {
    }

    public fun machineImage(machineImage: IMachineImage) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatInstanceProvider.Builder =
        software.amazon.awscdk.services.ec2.NatInstanceProvider.Builder.create()

    public override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    public override fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
      cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic.let(NatTrafficDirection::unwrap))
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

    public override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProvider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProvider {
      val builderImpl = BuilderImpl()
      return NatInstanceProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProvider):
        NatInstanceProvider = NatInstanceProvider(cdkObject)

    internal fun unwrap(wrapped: NatInstanceProvider):
        software.amazon.awscdk.services.ec2.NatInstanceProvider = wrapped.cdkObject
  }
}
