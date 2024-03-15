@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AddNetworkTargetsProps {
  public fun deregistrationDelay(): Duration? =
      unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun port(): Number

  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  public fun proxyProtocolV2(): Boolean? = unwrap(this).getProxyProtocolV2()

  public fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

  public fun targets(): List<INetworkLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deregistrationDelay(deregistrationDelay: Duration)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010fcd39b9643a438c847e391bcd3db988b02e2fbdbc00a9c959553c55f573d4")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public fun port(port: Number)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun protocol(protocol: Protocol)

    public fun proxyProtocolV2(proxyProtocolV2: Boolean)

    public fun targetGroupName(targetGroupName: String)

    public fun targets(targets: List<INetworkLoadBalancerTarget>)

    public fun targets(vararg targets: INetworkLoadBalancerTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps.builder()

    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010fcd39b9643a438c847e391bcd3db988b02e2fbdbc00a9c959553c55f573d4")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    override fun proxyProtocolV2(proxyProtocolV2: Boolean) {
      cdkBuilder.proxyProtocolV2(proxyProtocolV2)
    }

    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    override fun targets(targets: List<INetworkLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancerTarget::unwrap))
    }

    override fun targets(vararg targets: INetworkLoadBalancerTarget): Unit =
        targets(targets.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps,
  ) : CdkObject(cdkObject), AddNetworkTargetsProps {
    override fun deregistrationDelay(): Duration? =
        unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun port(): Number = unwrap(this).getPort()

    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    override fun proxyProtocolV2(): Boolean? = unwrap(this).getProxyProtocolV2()

    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    override fun targets(): List<INetworkLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(INetworkLoadBalancerTarget::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddNetworkTargetsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps):
        AddNetworkTargetsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddNetworkTargetsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
  }
}
